package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.BaseImplementation.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.c.f;
import com.google.android.gms.internal.c.j;
import com.google.android.gms.internal.ld;
import com.google.android.gms.internal.lf;
import com.google.android.gms.internal.pu.a;

class o extends BaseImplementation.AbstractPendingResult<ContainerHolder>
{
  private final Looper JF;
  private final d aqB;
  private final cg aqC;
  private final int aqD;
  private f aqE;
  private volatile n aqF;
  private volatile boolean aqG;
  private c.j aqH;
  private String aqI;
  private e aqJ;
  private a aqK;
  private final String aqm;
  private long aqr;
  private final TagManager aqy;
  private final Context mContext;
  private final ld wb;

  o(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, f paramf, e parame, ld paramld, cg paramcg)
  {
  }

  public o(Context paramContext, TagManager paramTagManager, Looper paramLooper, String paramString, int paramInt, r paramr)
  {
    this(paramContext, paramTagManager, paramLooper, paramString, paramInt, new cq(paramContext, paramString), new cp(paramContext, paramString, paramr), lf.jdMethod_if(), new bf(30, 900000L, 5000L, "refreshing", lf.jdMethod_if()));
  }

  private void V(boolean paramBoolean)
  {
    this.aqE.a(new b(null));
    this.aqJ.a(new c(null));
    cr.c localc = this.aqE.fH(this.aqD);
    if (localc != null)
      this.aqF = new n(this.aqy, this.JF, new Container(this.mContext, this.aqy.getDataLayer(), this.aqm, 0L, localc), this.aqB);
    this.aqK = new a(paramBoolean)
    {
      public boolean b(Container paramContainer)
      {
        if (this.aqM)
          if (43200000L + paramContainer.getLastRefreshTime() < o.a(o.this).currentTimeMillis());
        do
        {
          return true;
          return false;
        }
        while (!paramContainer.isDefault());
        return false;
      }
    };
    if (pr())
    {
      this.aqJ.e(0L, "");
      return;
    }
    this.aqE.pt();
  }

  private void a(c.j paramj)
  {
    monitorenter;
    try
    {
      if (this.aqE != null)
      {
        pu.a locala = new pu.a();
        locala.auB = this.aqr;
        locala.gs = new c.f();
        locala.auC = paramj;
        this.aqE.b(locala);
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

  private void a(c.j paramj, long paramLong, boolean paramBoolean)
  {
    monitorenter;
    if (paramBoolean);
    while (true)
    {
      Container localContainer;
      try
      {
        boolean bool = this.aqG;
        if (bool)
          return;
        if ((!isReady()) || (this.aqF != null))
          continue;
        this.aqH = paramj;
        this.aqr = paramLong;
        w(Math.max(0L, Math.min(43200000L, 43200000L + this.aqr - this.wb.currentTimeMillis())));
        localContainer = new Container(this.mContext, this.aqy.getDataLayer(), this.aqm, paramLong, paramj);
        if (this.aqF == null)
        {
          this.aqF = new n(this.aqy, this.JF, localContainer, this.aqB);
          if ((isReady()) || (!this.aqK.b(localContainer)))
            continue;
          b(this.aqF);
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      this.aqF.a(localContainer);
    }
  }

  private boolean pr()
  {
    ce localce = ce.qa();
    return ((localce.qb() == ce.a.asr) || (localce.qb() == ce.a.ass)) && (this.aqm.equals(localce.getContainerId()));
  }

  private void w(long paramLong)
  {
    monitorenter;
    try
    {
      if (this.aqJ == null)
        bh.W("Refresh requested, but no network load scheduler.");
      while (true)
      {
        return;
        this.aqJ.e(paramLong, this.aqH.gt);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected ContainerHolder aD(Status paramStatus)
  {
    if (this.aqF != null)
      return this.aqF;
    if (paramStatus == Status.Kz)
      bh.T("timer expired: setting result to failure");
    return new n(paramStatus);
  }

  void ct(String paramString)
  {
    monitorenter;
    try
    {
      this.aqI = paramString;
      if (this.aqJ != null)
        this.aqJ.cw(paramString);
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

  String pl()
  {
    monitorenter;
    try
    {
      String str = this.aqI;
      monitorexit;
      return str;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public void po()
  {
    cr.c localc = this.aqE.fH(this.aqD);
    if (localc != null)
    {
      Container localContainer = new Container(this.mContext, this.aqy.getDataLayer(), this.aqm, 0L, localc);
      b(new n(this.aqy, this.JF, localContainer, new n.a()
      {
        public void ct(String paramString)
        {
          o.this.ct(paramString);
        }

        public String pl()
        {
          return o.this.pl();
        }

        public void pn()
        {
          bh.W("Refresh ignored: container loaded as default only.");
        }
      }));
    }
    while (true)
    {
      this.aqJ = null;
      this.aqE = null;
      return;
      bh.T("Default was requested, but no default container was found");
      b(aD(new Status(10, "Default was requested, but no default container was found", null)));
    }
  }

  public void pp()
  {
    V(false);
  }

  public void pq()
  {
    V(true);
  }

  static abstract interface a
  {
    public abstract boolean b(Container paramContainer);
  }

  private class b
    implements bg<pu.a>
  {
    private b()
    {
    }

    public void a(pu.a parama)
    {
      c.j localj;
      if (parama.auC != null)
        localj = parama.auC;
      while (true)
      {
        o.a(o.this, localj, parama.auB, true);
        return;
        c.f localf = parama.gs;
        localj = new c.j();
        localj.gs = localf;
        localj.gr = null;
        localj.gt = localf.version;
      }
    }

    public void a(bg.a parama)
    {
      if (!o.b(o.this))
        o.a(o.this, 0L);
    }

    public void ps()
    {
    }
  }

  private class c
    implements bg<c.j>
  {
    private c()
    {
    }

    public void a(bg.a parama)
    {
      if (o.f(o.this) != null)
        o.this.b(o.f(o.this));
      while (true)
      {
        o.a(o.this, 3600000L);
        return;
        o.this.b(o.this.aD(Status.Kz));
      }
    }

    public void b(c.j paramj)
    {
      synchronized (o.this)
      {
        if (paramj.gs == null)
        {
          if (o.c(o.this).gs == null)
          {
            bh.T("Current resource is null; network resource is also null");
            o.a(o.this, 3600000L);
            return;
          }
          paramj.gs = o.c(o.this).gs;
        }
        o.a(o.this, paramj, o.a(o.this).currentTimeMillis(), false);
        bh.V("setting refresh time to current time: " + o.d(o.this));
        if (!o.e(o.this))
          o.a(o.this, paramj);
        return;
      }
    }

    public void ps()
    {
    }
  }

  private class d
    implements n.a
  {
    private d()
    {
    }

    public void ct(String paramString)
    {
      o.this.ct(paramString);
    }

    public String pl()
    {
      return o.this.pl();
    }

    public void pn()
    {
      if (o.g(o.this).fe())
        o.a(o.this, 0L);
    }
  }

  static abstract interface e extends Releasable
  {
    public abstract void a(bg<c.j> parambg);

    public abstract void cw(String paramString);

    public abstract void e(long paramLong, String paramString);
  }

  static abstract interface f extends Releasable
  {
    public abstract void a(bg<pu.a> parambg);

    public abstract void b(pu.a parama);

    public abstract cr.c fH(int paramInt);

    public abstract void pt();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.o
 * JD-Core Version:    0.6.0
 */