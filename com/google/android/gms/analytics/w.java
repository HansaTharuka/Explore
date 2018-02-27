package com.google.android.gms.analytics;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ha;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

class w
  implements ak, c.b, c.c
{
  private final Context mContext;
  private ld wb;
  private d yU;
  private final f yV;
  private boolean yX;
  private volatile long zh;
  private volatile a zi;
  private volatile b zj;
  private d zk;
  private final GoogleAnalytics zl;
  private final Queue<d> zm = new ConcurrentLinkedQueue();
  private volatile int zn;
  private volatile Timer zo;
  private volatile Timer zp;
  private volatile Timer zq;
  private boolean zr;
  private boolean zs;
  private boolean zt;
  private long zu = 300000L;

  w(Context paramContext, f paramf)
  {
    this(paramContext, paramf, null, GoogleAnalytics.getInstance(paramContext));
  }

  w(Context paramContext, f paramf, d paramd, GoogleAnalytics paramGoogleAnalytics)
  {
    this.zk = paramd;
    this.mContext = paramContext;
    this.yV = paramf;
    this.zl = paramGoogleAnalytics;
    this.wb = lf.jdMethod_if();
    this.zn = 0;
    this.zi = a.zD;
  }

  private Timer a(Timer paramTimer)
  {
    if (paramTimer != null)
      paramTimer.cancel();
    return null;
  }

  private void cJ()
  {
    monitorenter;
    try
    {
      if ((this.zj != null) && (this.zi == a.zy))
      {
        this.zi = a.zC;
        this.zj.disconnect();
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  private void eA()
  {
    this.zo = a(this.zo);
    this.zp = a(this.zp);
    this.zq = a(this.zq);
  }

  private void eC()
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (Thread.currentThread().equals(this.yV.getThread()))
          continue;
        this.yV.dX().add(new Runnable()
        {
          public void run()
          {
            w.a(w.this);
          }
        });
        return;
        if (!this.zr)
          continue;
        dQ();
        switch (2.zw[this.zi.ordinal()])
        {
        case 1:
          if (this.zm.isEmpty())
            break label211;
          d locald2 = (d)this.zm.poll();
          ae.V("Sending hit to store  " + locald2);
          this.yU.a(locald2.eH(), locald2.eI(), locald2.getPath(), locald2.eJ());
          continue;
        case 7:
        case 2:
        case 6:
        case 3:
        case 4:
        case 5:
        }
      }
      finally
      {
        monitorexit;
      }
      ae.V("Blocked. Dropping hits.");
      this.zm.clear();
      continue;
      label211: if (!this.yX)
        continue;
      eD();
      continue;
      if (!this.zm.isEmpty())
      {
        d locald1 = (d)this.zm.peek();
        ae.V("Sending hit to service   " + locald1);
        if (!this.zl.isDryRunEnabled())
          this.zj.a(locald1.eH(), locald1.eI(), locald1.getPath(), locald1.eJ());
        while (true)
        {
          this.zm.poll();
          break;
          ae.V("Dry run enabled. Hit not actually sent to service.");
        }
      }
      this.zh = this.wb.elapsedRealtime();
      continue;
      ae.V("Need to reconnect");
      if (this.zm.isEmpty())
        continue;
      eF();
      continue;
    }
  }

  private void eD()
  {
    this.yU.dispatch();
    this.yX = false;
  }

  private void eE()
  {
    monitorenter;
    try
    {
      a locala1 = this.zi;
      a locala2 = a.zz;
      if (locala1 == locala2);
      while (true)
      {
        return;
        if ((this.mContext == null) || (!"com.google.android.gms".equals(this.mContext.getPackageName())))
          break;
        this.zi = a.zA;
        this.zj.disconnect();
        ae.W("Attempted to fall back to local store from service.");
      }
    }
    finally
    {
      monitorexit;
    }
    eA();
    ae.V("falling back to local store");
    if (this.zk != null);
    v localv;
    for (this.yU = this.zk; ; this.yU = localv.ex())
    {
      this.zi = a.zz;
      eC();
      break;
      localv = v.eu();
      localv.a(this.mContext, this.yV);
    }
  }

  private void eF()
  {
    monitorenter;
    while (true)
    {
      try
      {
        if ((!this.zt) && (this.zj != null))
        {
          a locala1 = this.zi;
          a locala2 = a.zz;
          if (locala1 != locala2)
            try
            {
              this.zn = (1 + this.zn);
              a(this.zp);
              this.zi = a.zx;
              this.zp = new Timer("Failed Connect");
              this.zp.schedule(new c(null), 3000L);
              ae.V("connecting to Analytics service");
              this.zj.connect();
              monitorexit;
              return;
            }
            catch (SecurityException localSecurityException)
            {
              ae.W("security exception on connectToService");
              eE();
              continue;
            }
        }
      }
      finally
      {
        monitorexit;
      }
      ae.W("client not initialized.");
      eE();
    }
  }

  private void eG()
  {
    this.zo = a(this.zo);
    this.zo = new Timer("Service Reconnect");
    this.zo.schedule(new e(null), 5000L);
  }

  public void a(int paramInt, Intent paramIntent)
  {
    monitorenter;
    try
    {
      this.zi = a.zB;
      if (this.zn < 2)
      {
        ae.W("Service unavailable (code=" + paramInt + "), will retry.");
        eG();
      }
      while (true)
      {
        return;
        ae.W("Service unavailable (code=" + paramInt + "), using local store.");
        eE();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void b(Map<String, String> paramMap, long paramLong, String paramString, List<ha> paramList)
  {
    ae.V("putHit called");
    this.zm.add(new d(paramMap, paramLong, paramString, paramList));
    eC();
  }

  public void dQ()
  {
    ae.V("clearHits called");
    this.zm.clear();
    switch (2.zw[this.zi.ordinal()])
    {
    default:
      this.zr = true;
      return;
    case 1:
      this.yU.l(0L);
      this.zr = false;
      return;
    case 2:
    }
    this.zj.dQ();
    this.zr = false;
  }

  public void dW()
  {
    monitorenter;
    while (true)
    {
      try
      {
        boolean bool = this.zt;
        if (bool)
          return;
        ae.V("setForceLocalDispatch called.");
        this.zt = true;
        switch (2.zw[this.zi.ordinal()])
        {
        case 1:
        case 4:
        case 5:
        case 6:
        case 2:
          cJ();
          continue;
        case 3:
        }
      }
      finally
      {
        monitorexit;
      }
      this.zs = true;
      continue;
    }
  }

  public void dispatch()
  {
    switch (2.zw[this.zi.ordinal()])
    {
    default:
      this.yX = true;
    case 2:
      return;
    case 1:
    }
    eD();
  }

  public void eB()
  {
    if (this.zj != null)
      return;
    this.zj = new c(this.mContext, this, this);
    eF();
  }

  public void onConnected()
  {
    monitorenter;
    try
    {
      this.zp = a(this.zp);
      this.zn = 0;
      ae.V("Connected to service");
      this.zi = a.zy;
      if (this.zs)
      {
        cJ();
        this.zs = false;
      }
      while (true)
      {
        return;
        eC();
        this.zq = a(this.zq);
        this.zq = new Timer("disconnect check");
        this.zq.schedule(new b(null), this.zu);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void onDisconnected()
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.zi != a.zA)
          continue;
        ae.V("Service blocked.");
        eA();
        return;
        if (this.zi == a.zC)
        {
          ae.V("Disconnected from service");
          eA();
          this.zi = a.zD;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      ae.V("Unexpected disconnect.");
      this.zi = a.zB;
      if (this.zn < 2)
      {
        eG();
        continue;
      }
      eE();
    }
  }

  private static enum a
  {
    static
    {
      zA = new a("BLOCKED", 3);
      zB = new a("PENDING_CONNECTION", 4);
      zC = new a("PENDING_DISCONNECT", 5);
      zD = new a("DISCONNECTED", 6);
      a[] arrayOfa = new a[7];
      arrayOfa[0] = zx;
      arrayOfa[1] = zy;
      arrayOfa[2] = zz;
      arrayOfa[3] = zA;
      arrayOfa[4] = zB;
      arrayOfa[5] = zC;
      arrayOfa[6] = zD;
      zE = arrayOfa;
    }
  }

  private class b extends TimerTask
  {
    private b()
    {
    }

    public void run()
    {
      if ((w.b(w.this) == w.a.zy) && (w.e(w.this).isEmpty()) && (w.f(w.this) + w.g(w.this) < w.h(w.this).elapsedRealtime()))
      {
        ae.V("Disconnecting due to inactivity");
        w.i(w.this);
        return;
      }
      w.j(w.this).schedule(new b(w.this), w.g(w.this));
    }
  }

  private class c extends TimerTask
  {
    private c()
    {
    }

    public void run()
    {
      if (w.b(w.this) == w.a.zx)
        w.c(w.this);
    }
  }

  private static class d
  {
    private final Map<String, String> zF;
    private final long zG;
    private final String zH;
    private final List<ha> zI;

    public d(Map<String, String> paramMap, long paramLong, String paramString, List<ha> paramList)
    {
      this.zF = paramMap;
      this.zG = paramLong;
      this.zH = paramString;
      this.zI = paramList;
    }

    public Map<String, String> eH()
    {
      return this.zF;
    }

    public long eI()
    {
      return this.zG;
    }

    public List<ha> eJ()
    {
      return this.zI;
    }

    public String getPath()
    {
      return this.zH;
    }

    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("PATH: ");
      localStringBuilder.append(this.zH);
      if (this.zF != null)
      {
        localStringBuilder.append("  PARAMS: ");
        Iterator localIterator = this.zF.entrySet().iterator();
        while (localIterator.hasNext())
        {
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          localStringBuilder.append((String)localEntry.getKey());
          localStringBuilder.append("=");
          localStringBuilder.append((String)localEntry.getValue());
          localStringBuilder.append(",  ");
        }
      }
      return localStringBuilder.toString();
    }
  }

  private class e extends TimerTask
  {
    private e()
    {
    }

    public void run()
    {
      w.d(w.this);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.w
 * JD-Core Version:    0.6.0
 */