package com.google.android.gms.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class v extends aj
{
  private static final Object yT = new Object();
  private static v zf;
  private Context mContext;
  private Handler mHandler;
  private d yU;
  private volatile f yV;
  private int yW = 1800;
  private boolean yX = true;
  private boolean yY;
  private String yZ;
  private boolean yt = false;
  private boolean za = true;
  private boolean zb = true;
  private e zc = new e()
  {
    public void B(boolean paramBoolean)
    {
      v.this.a(paramBoolean, v.a(v.this));
    }
  };
  private u zd;
  private boolean ze = false;

  public static v eu()
  {
    if (zf == null)
      zf = new v();
    return zf;
  }

  private void ev()
  {
    this.zd = new u(this);
    this.zd.z(this.mContext);
  }

  private void ew()
  {
    this.mHandler = new Handler(this.mContext.getMainLooper(), new Handler.Callback()
    {
      public boolean handleMessage(Message paramMessage)
      {
        if ((1 == paramMessage.what) && (v.ez().equals(paramMessage.obj)))
        {
          y.eK().D(true);
          v.this.dispatchLocalHits();
          y.eK().D(false);
          if ((v.b(v.this) > 0) && (!v.c(v.this)))
            v.d(v.this).sendMessageDelayed(v.d(v.this).obtainMessage(1, v.ez()), 1000 * v.b(v.this));
        }
        return true;
      }
    });
    if (this.yW > 0)
      this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, yT), 1000 * this.yW);
  }

  void C(boolean paramBoolean)
  {
    monitorenter;
    try
    {
      a(this.ze, paramBoolean);
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

  void a(Context paramContext, f paramf)
  {
    monitorenter;
    try
    {
      Context localContext = this.mContext;
      if (localContext != null);
      while (true)
      {
        return;
        this.mContext = paramContext.getApplicationContext();
        if (this.yV != null)
          continue;
        this.yV = paramf;
        if (this.yX)
        {
          dispatchLocalHits();
          this.yX = false;
        }
        if (!this.yY)
          continue;
        dW();
        this.yY = false;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.ze != paramBoolean1)
          continue;
        boolean bool = this.za;
        if (bool == paramBoolean2)
          return;
        if (((!paramBoolean1) && (paramBoolean2)) || (this.yW <= 0))
          continue;
        this.mHandler.removeMessages(1, yT);
        if ((paramBoolean1) || (!paramBoolean2) || (this.yW <= 0))
          continue;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, yT), 1000 * this.yW);
        StringBuilder localStringBuilder = new StringBuilder().append("PowerSaveMode ");
        if (paramBoolean1)
          break label157;
        if (!paramBoolean2)
        {
          break label157;
          ae.V(str);
          this.ze = paramBoolean1;
          this.za = paramBoolean2;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str = "terminated.";
      continue;
      label157: str = "initiated.";
    }
  }

  void dW()
  {
    if (this.yV == null)
    {
      ae.V("setForceLocalDispatch() queued. It will be called once initialization is complete.");
      this.yY = true;
      return;
    }
    y.eK().a(y.a.Bb);
    this.yV.dW();
  }

  void dispatchLocalHits()
  {
    monitorenter;
    try
    {
      if (this.yV == null)
      {
        ae.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        this.yX = true;
      }
      while (true)
      {
        return;
        y.eK().a(y.a.AO);
        this.yV.dispatch();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  d ex()
  {
    monitorenter;
    try
    {
      if (this.yU != null)
        break label100;
      if (this.mContext == null)
        throw new IllegalStateException("Cant get a store unless we have a context");
    }
    finally
    {
      monitorexit;
    }
    this.yU = new ag(this.zc, this.mContext, new j());
    this.yU.setDryRun(this.yt);
    if (this.yZ != null)
    {
      this.yU.dV().ad(this.yZ);
      this.yZ = null;
    }
    label100: if (this.mHandler == null)
      ew();
    if ((this.zd == null) && (this.zb))
      ev();
    d locald = this.yU;
    monitorexit;
    return locald;
  }

  void ey()
  {
    monitorenter;
    try
    {
      if ((!this.ze) && (this.za) && (this.yW > 0))
      {
        this.mHandler.removeMessages(1, yT);
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, yT));
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

  void setLocalDispatchPeriod(int paramInt)
  {
    monitorenter;
    try
    {
      if (this.mHandler == null)
      {
        ae.V("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
        this.yW = paramInt;
      }
      while (true)
      {
        return;
        y.eK().a(y.a.AP);
        if ((!this.ze) && (this.za) && (this.yW > 0))
          this.mHandler.removeMessages(1, yT);
        this.yW = paramInt;
        if ((paramInt <= 0) || (this.ze) || (!this.za))
          continue;
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(1, yT), paramInt * 1000);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.v
 * JD-Core Version:    0.6.0
 */