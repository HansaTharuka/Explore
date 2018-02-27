package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.c.j;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class cp
  implements o.e
{
  private String aqI;
  private final String aqm;
  private bg<c.j> asC;
  private r asD;
  private final ScheduledExecutorService asF;
  private final a asG;
  private ScheduledFuture<?> asH;
  private boolean mClosed;
  private final Context mContext;

  public cp(Context paramContext, String paramString, r paramr)
  {
    this(paramContext, paramString, paramr, null, null);
  }

  cp(Context paramContext, String paramString, r paramr, b paramb, a parama)
  {
    this.asD = paramr;
    this.mContext = paramContext;
    this.aqm = paramString;
    if (paramb == null)
      paramb = new b()
      {
        public ScheduledExecutorService qh()
        {
          return Executors.newSingleThreadScheduledExecutor();
        }
      };
    this.asF = paramb.qh();
    if (parama == null)
    {
      this.asG = new a()
      {
        public co a(r paramr)
        {
          return new co(cp.a(cp.this), cp.b(cp.this), paramr);
        }
      };
      return;
    }
    this.asG = parama;
  }

  private co cM(String paramString)
  {
    co localco = this.asG.a(this.asD);
    localco.a(this.asC);
    localco.cw(this.aqI);
    localco.cL(paramString);
    return localco;
  }

  private void qg()
  {
    monitorenter;
    try
    {
      if (this.mClosed)
        throw new IllegalStateException("called method after closed");
    }
    finally
    {
      monitorexit;
    }
    monitorexit;
  }

  public void a(bg<c.j> parambg)
  {
    monitorenter;
    try
    {
      qg();
      this.asC = parambg;
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

  public void cw(String paramString)
  {
    monitorenter;
    try
    {
      qg();
      this.aqI = paramString;
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

  public void e(long paramLong, String paramString)
  {
    monitorenter;
    try
    {
      bh.V("loadAfterDelay: containerId=" + this.aqm + " delay=" + paramLong);
      qg();
      if (this.asC == null)
        throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
    }
    finally
    {
      monitorexit;
    }
    if (this.asH != null)
      this.asH.cancel(false);
    this.asH = this.asF.schedule(cM(paramString), paramLong, TimeUnit.MILLISECONDS);
    monitorexit;
  }

  public void release()
  {
    monitorenter;
    try
    {
      qg();
      if (this.asH != null)
        this.asH.cancel(false);
      this.asF.shutdown();
      this.mClosed = true;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static abstract interface a
  {
    public abstract co a(r paramr);
  }

  static abstract interface b
  {
    public abstract ScheduledExecutorService qh();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cp
 * JD-Core Version:    0.6.0
 */