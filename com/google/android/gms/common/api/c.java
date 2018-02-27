package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jm;
import com.google.android.gms.internal.jm.b;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.kc;
import com.google.android.gms.internal.kd;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c
  implements GoogleApiClient
{
  private final Looper JF;
  private final Condition JR = this.zO.newCondition();
  private final jm JS;
  private final int JT;
  final Queue<d<?>> JU = new LinkedList();
  private ConnectionResult JV;
  private int JW;
  private volatile int JX = 4;
  private volatile boolean JY;
  private boolean JZ = false;
  private final b Jy = new b()
  {
    public void b(c.d<?> paramd)
    {
      c.this.Kk.remove(paramd);
    }
  };
  private int Ka;
  private long Kb = 120000L;
  private long Kc = 5000L;
  final Handler Kd;
  BroadcastReceiver Ke;
  private final Bundle Kf = new Bundle();
  private final Map<Api.c<?>, Api.a> Kg = new HashMap();
  private final List<String> Kh;
  private boolean Ki;
  private final Set<d<?>> Kj = Collections.newSetFromMap(new WeakHashMap());
  final Set<d<?>> Kk = Collections.newSetFromMap(new ConcurrentHashMap());
  private final GoogleApiClient.ConnectionCallbacks Kl = new GoogleApiClient.ConnectionCallbacks()
  {
    public void onConnected(Bundle paramBundle)
    {
      c.a(c.this).lock();
      try
      {
        if (c.b(c.this) == 1)
        {
          if (paramBundle != null)
            c.c(c.this).putAll(paramBundle);
          c.d(c.this);
        }
        return;
      }
      finally
      {
        c.a(c.this).unlock();
      }
      throw localObject;
    }

    public void onConnectionSuspended(int paramInt)
    {
      c.a(c.this).lock();
      switch (paramInt)
      {
      default:
      case 2:
      case 1:
      }
      while (true)
      {
        c.a(c.this).unlock();
        return;
        try
        {
          c.a(c.this, paramInt);
          c.this.connect();
          continue;
        }
        finally
        {
          c.a(c.this).unlock();
        }
        boolean bool = c.this.gL();
        if (bool)
        {
          c.a(c.this).unlock();
          return;
        }
        c.a(c.this, true);
        c.this.Ke = new c.a(c.this);
        IntentFilter localIntentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        localIntentFilter.addDataScheme("package");
        c.e(c.this).registerReceiver(c.this.Ke, localIntentFilter);
        c.this.Kd.sendMessageDelayed(c.this.Kd.obtainMessage(1), c.f(c.this));
        c.this.Kd.sendMessageDelayed(c.this.Kd.obtainMessage(2), c.g(c.this));
        c.a(c.this, paramInt);
      }
    }
  };
  private final jm.b Km = new jm.b()
  {
    public Bundle fX()
    {
      return null;
    }

    public boolean gN()
    {
      return c.h(c.this);
    }

    public boolean isConnected()
    {
      return c.this.isConnected();
    }
  };
  private final Context mContext;
  private final Lock zO = new ReentrantLock();

  public c(Context paramContext, Looper paramLooper, jg paramjg, Map<Api<?>, Api.ApiOptions> paramMap, Set<GoogleApiClient.ConnectionCallbacks> paramSet, Set<GoogleApiClient.OnConnectionFailedListener> paramSet1, int paramInt)
  {
    this.mContext = paramContext;
    this.JS = new jm(paramContext, paramLooper, this.Km);
    this.JF = paramLooper;
    this.Kd = new c(paramLooper);
    this.JT = paramInt;
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      GoogleApiClient.ConnectionCallbacks localConnectionCallbacks = (GoogleApiClient.ConnectionCallbacks)localIterator1.next();
      this.JS.registerConnectionCallbacks(localConnectionCallbacks);
    }
    Iterator localIterator2 = paramSet1.iterator();
    while (localIterator2.hasNext())
    {
      GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = (GoogleApiClient.OnConnectionFailedListener)localIterator2.next();
      this.JS.registerConnectionFailedListener(localOnConnectionFailedListener);
    }
    Iterator localIterator3 = paramMap.keySet().iterator();
    while (localIterator3.hasNext())
    {
      Api localApi = (Api)localIterator3.next();
      Api.b localb = localApi.gx();
      Object localObject = paramMap.get(localApi);
      this.Kg.put(localApi.gz(), a(localb, localObject, paramContext, paramLooper, paramjg, this.Kl, new GoogleApiClient.OnConnectionFailedListener(localb)
      {
        public void onConnectionFailed(ConnectionResult paramConnectionResult)
        {
          c.a(c.this).lock();
          try
          {
            if ((c.k(c.this) == null) || (this.Ko.getPriority() < c.l(c.this)))
            {
              c.a(c.this, paramConnectionResult);
              c.b(c.this, this.Ko.getPriority());
            }
            c.d(c.this);
            return;
          }
          finally
          {
            c.a(c.this).unlock();
          }
          throw localObject;
        }
      }));
    }
    this.Kh = Collections.unmodifiableList(paramjg.ho());
  }

  private static <C extends Api.a, O> C a(Api.b<C, O> paramb, Object paramObject, Context paramContext, Looper paramLooper, jg paramjg, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return paramb.a(paramContext, paramLooper, paramjg, paramObject, paramConnectionCallbacks, paramOnConnectionFailedListener);
  }

  private void a(GoogleApiClient paramGoogleApiClient, f paramf, boolean paramBoolean)
  {
    kc.Nu.c(paramGoogleApiClient).setResultCallback(new ResultCallback(paramf, paramBoolean, paramGoogleApiClient)
    {
      public void j(Status paramStatus)
      {
        if ((paramStatus.isSuccess()) && (c.this.isConnected()))
          c.this.reconnect();
        this.Kq.b(paramStatus);
        if (this.Kr)
          this.GB.disconnect();
      }
    });
  }

  private <A extends Api.a> void a(d<A> paramd)
    throws DeadObjectException
  {
    this.zO.lock();
    try
    {
      if (paramd.gz() != null);
      for (boolean bool = true; ; bool = false)
      {
        jx.b(bool, "This task can not be executed or enqueued (it's probably a Batch or malformed)");
        this.Kk.add(paramd);
        paramd.a(this.Jy);
        if (!gL())
          break;
        paramd.l(new Status(8));
        return;
      }
      paramd.b(a(paramd.gz()));
      return;
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  private void al(int paramInt)
  {
    this.zO.lock();
    try
    {
      if (this.JX == 3)
        break label373;
      if (paramInt != -1)
        break label236;
      if (isConnecting())
      {
        Iterator localIterator4 = this.JU.iterator();
        while (localIterator4.hasNext())
        {
          d locald = (d)localIterator4.next();
          if (locald.gF() == 1)
            continue;
          locald.cancel();
          localIterator4.remove();
        }
      }
    }
    finally
    {
      this.zO.unlock();
    }
    this.JU.clear();
    Iterator localIterator1 = this.Kk.iterator();
    while (localIterator1.hasNext())
      ((d)localIterator1.next()).cancel();
    this.Kk.clear();
    Iterator localIterator2 = this.Kj.iterator();
    while (localIterator2.hasNext())
      ((d)localIterator2.next()).clear();
    this.Kj.clear();
    if ((this.JV == null) && (!this.JU.isEmpty()))
    {
      this.JZ = true;
      this.zO.unlock();
      return;
    }
    label236: boolean bool1 = isConnecting();
    boolean bool2 = isConnected();
    this.JX = 3;
    if (bool1)
    {
      if (paramInt == -1)
        this.JV = null;
      this.JR.signalAll();
    }
    this.Ki = false;
    Iterator localIterator3 = this.Kg.values().iterator();
    while (localIterator3.hasNext())
    {
      Api.a locala = (Api.a)localIterator3.next();
      if (!locala.isConnected())
        continue;
      locala.disconnect();
    }
    this.Ki = true;
    this.JX = 4;
    if (bool2)
    {
      if (paramInt != -1)
        this.JS.aE(paramInt);
      this.Ki = false;
    }
    label373: this.zO.unlock();
  }

  private void gJ()
  {
    this.Ka = (-1 + this.Ka);
    if (this.Ka == 0)
    {
      if (this.JV != null)
      {
        this.JZ = false;
        al(3);
        if ((!gL()) || (!GooglePlayServicesUtil.e(this.mContext, this.JV.getErrorCode())))
        {
          gM();
          this.JS.b(this.JV);
        }
        this.Ki = false;
      }
    }
    else
      return;
    this.JX = 2;
    gM();
    this.JR.signalAll();
    gK();
    if (this.JZ)
    {
      this.JZ = false;
      al(-1);
      return;
    }
    if (this.Kf.isEmpty());
    for (Bundle localBundle = null; ; localBundle = this.Kf)
    {
      this.JS.f(localBundle);
      return;
    }
  }

  private void gK()
  {
    this.zO.lock();
    while (true)
    {
      try
      {
        if (isConnected())
          break label110;
        if (gL())
        {
          break label110;
          jx.a(bool1, "GoogleApiClient is not connected yet.");
          boolean bool2 = this.JU.isEmpty();
          if (bool2)
            break label100;
          try
          {
            a((d)this.JU.remove());
          }
          catch (DeadObjectException localDeadObjectException)
          {
            Log.w("GoogleApiClientImpl", "Service died while flushing queue", localDeadObjectException);
          }
          continue;
        }
      }
      finally
      {
        this.zO.unlock();
      }
      boolean bool1 = false;
      continue;
      label100: this.zO.unlock();
      return;
      label110: bool1 = true;
    }
  }

  private void gM()
  {
    this.zO.lock();
    try
    {
      boolean bool = this.JY;
      if (!bool)
        return;
      this.JY = false;
      this.Kd.removeMessages(2);
      this.Kd.removeMessages(1);
      this.mContext.unregisterReceiver(this.Ke);
      return;
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  private void resume()
  {
    this.zO.lock();
    try
    {
      if (gL())
        connect();
      return;
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  public <C extends Api.a> C a(Api.c<C> paramc)
  {
    Api.a locala = (Api.a)this.Kg.get(paramc);
    jx.b(locala, "Appropriate Api was not requested.");
    return locala;
  }

  public <A extends Api.a, R extends Result, T extends BaseImplementation.a<R, A>> T a(T paramT)
  {
    this.zO.lock();
    try
    {
      if (isConnected())
        b(paramT);
      while (true)
      {
        return paramT;
        this.JU.add(paramT);
      }
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  public boolean a(Scope paramScope)
  {
    return this.Kh.contains(paramScope.gO());
  }

  public <A extends Api.a, T extends BaseImplementation.a<? extends Result, A>> T b(T paramT)
  {
    boolean bool;
    if ((isConnected()) || (gL()))
      bool = true;
    while (true)
    {
      jx.a(bool, "GoogleApiClient is not connected yet.");
      gK();
      try
      {
        a(paramT);
        return paramT;
        bool = false;
      }
      catch (DeadObjectException localDeadObjectException)
      {
        al(1);
      }
    }
    return paramT;
  }

  public ConnectionResult blockingConnect()
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper())
      bool1 = true;
    while (true)
    {
      jx.a(bool1, "blockingConnect must not be called on the UI thread");
      this.zO.lock();
      try
      {
        connect();
        while (true)
        {
          boolean bool2 = isConnecting();
          if (!bool2)
            break label89;
          try
          {
            this.JR.await();
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            this.zO.unlock();
            return localConnectionResult4;
          }
        }
        bool1 = false;
        continue;
        label89: if (isConnected())
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.Iu;
          return localConnectionResult3;
        }
        if (this.JV != null)
        {
          ConnectionResult localConnectionResult2 = this.JV;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.zO.unlock();
      }
    }
    throw localObject;
  }

  public ConnectionResult blockingConnect(long paramLong, TimeUnit paramTimeUnit)
  {
    boolean bool1;
    if (Looper.myLooper() != Looper.getMainLooper())
      bool1 = true;
    while (true)
    {
      jx.a(bool1, "blockingConnect must not be called on the UI thread");
      this.zO.lock();
      try
      {
        connect();
        long l = paramTimeUnit.toNanos(paramLong);
        label40: boolean bool2 = isConnecting();
        if (bool2)
          try
          {
            l = this.JR.awaitNanos(l);
            if (l > 0L)
              break label40;
            ConnectionResult localConnectionResult5 = new ConnectionResult(14, null);
            this.zO.unlock();
            return localConnectionResult5;
            bool1 = false;
          }
          catch (InterruptedException localInterruptedException)
          {
            Thread.currentThread().interrupt();
            ConnectionResult localConnectionResult4 = new ConnectionResult(15, null);
            this.zO.unlock();
            return localConnectionResult4;
          }
        if (isConnected())
        {
          ConnectionResult localConnectionResult3 = ConnectionResult.Iu;
          return localConnectionResult3;
        }
        if (this.JV != null)
        {
          ConnectionResult localConnectionResult2 = this.JV;
          return localConnectionResult2;
        }
        ConnectionResult localConnectionResult1 = new ConnectionResult(13, null);
        return localConnectionResult1;
      }
      finally
      {
        this.zO.unlock();
      }
    }
    throw localObject;
  }

  public PendingResult<Status> clearDefaultAccountAndReconnect()
  {
    jx.a(isConnected(), "GoogleApiClient is not connected yet.");
    f localf = new f(this.JF);
    if (this.Kg.containsKey(kc.DQ))
    {
      a(this, localf, false);
      return localf;
    }
    AtomicReference localAtomicReference = new AtomicReference();
    5 local5 = new GoogleApiClient.ConnectionCallbacks(localAtomicReference, localf)
    {
      public void onConnected(Bundle paramBundle)
      {
        c.a(c.this, (GoogleApiClient)this.Kp.get(), this.Kq, true);
      }

      public void onConnectionSuspended(int paramInt)
      {
      }
    };
    6 local6 = new GoogleApiClient.OnConnectionFailedListener(localf)
    {
      public void onConnectionFailed(ConnectionResult paramConnectionResult)
      {
        this.Kq.b(new Status(8));
      }
    };
    GoogleApiClient localGoogleApiClient = new GoogleApiClient.Builder(this.mContext).addApi(kc.API).addConnectionCallbacks(local5).addOnConnectionFailedListener(local6).setHandler(this.Kd).build();
    localAtomicReference.set(localGoogleApiClient);
    localGoogleApiClient.connect();
    return localf;
  }

  public void connect()
  {
    this.zO.lock();
    try
    {
      this.JZ = false;
      if (!isConnected())
      {
        boolean bool = isConnecting();
        if (!bool);
      }
      else
      {
        return;
      }
      this.Ki = true;
      this.JV = null;
      this.JX = 1;
      this.Kf.clear();
      this.Ka = this.Kg.size();
      Iterator localIterator = this.Kg.values().iterator();
      while (localIterator.hasNext())
        ((Api.a)localIterator.next()).connect();
    }
    finally
    {
      this.zO.unlock();
    }
    this.zO.unlock();
  }

  public <L> d<L> d(L paramL)
  {
    jx.b(paramL, "Listener must not be null");
    this.zO.lock();
    try
    {
      d locald = new d(this.JF, paramL);
      this.Kj.add(locald);
      return locald;
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  public void disconnect()
  {
    gM();
    al(-1);
  }

  boolean gL()
  {
    return this.JY;
  }

  public Looper getLooper()
  {
    return this.JF;
  }

  public boolean isConnected()
  {
    return this.JX == 2;
  }

  public boolean isConnecting()
  {
    return this.JX == 1;
  }

  public boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.JS.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  public boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.JS.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  public void reconnect()
  {
    disconnect();
    connect();
  }

  public void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.JS.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  public void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.JS.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public void stopAutoManage(FragmentActivity paramFragmentActivity)
  {
    if (this.JT >= 0);
    for (boolean bool = true; ; bool = false)
    {
      jx.a(bool, "Called stopAutoManage but automatic lifecycle management is not enabled.");
      g.a(paramFragmentActivity).ao(this.JT);
      return;
    }
  }

  public void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.JS.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  public void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.JS.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }

  private static class a extends BroadcastReceiver
  {
    private WeakReference<c> Ks;

    a(c paramc)
    {
      this.Ks = new WeakReference(paramc);
    }

    public void onReceive(Context paramContext, Intent paramIntent)
    {
      Uri localUri = paramIntent.getData();
      String str = null;
      if (localUri != null)
        str = localUri.getSchemeSpecificPart();
      if ((str == null) || (!str.equals("com.google.android.gms")));
      c localc;
      do
      {
        return;
        localc = (c)this.Ks.get();
      }
      while ((localc == null) || (localc.isConnected()) || (localc.isConnecting()) || (!localc.gL()));
      localc.connect();
    }
  }

  static abstract interface b
  {
    public abstract void b(c.d<?> paramd);
  }

  private class c extends Handler
  {
    c(Looper arg2)
    {
      super();
    }

    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        Log.w("GoogleApiClientImpl", "Unknown message id: " + paramMessage.what);
        return;
      case 1:
        c.i(c.this);
        return;
      case 2:
      }
      c.j(c.this);
    }
  }

  static abstract interface d<A extends Api.a>
  {
    public abstract void a(c.b paramb);

    public abstract void b(A paramA)
      throws DeadObjectException;

    public abstract void cancel();

    public abstract int gF();

    public abstract Api.c<A> gz();

    public abstract void l(Status paramStatus);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.c
 * JD-Core Version:    0.6.0
 */