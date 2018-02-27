package com.google.android.gms.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View.MeasureSpec;
import android.webkit.WebView;

@ey
public class fb
  implements Runnable
{
  private final int li;
  private final int lj;
  protected final gu mo;
  private final Handler tr;
  private final long ts;
  private long tt;
  private gv.a tu;
  protected boolean tv;
  protected boolean tw;

  public fb(gv.a parama, gu paramgu, int paramInt1, int paramInt2)
  {
    this(parama, paramgu, paramInt1, paramInt2, 200L, 50L);
  }

  public fb(gv.a parama, gu paramgu, int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    this.ts = paramLong1;
    this.tt = paramLong2;
    this.tr = new Handler(Looper.getMainLooper());
    this.mo = paramgu;
    this.tu = parama;
    this.tv = false;
    this.tw = false;
    this.lj = paramInt2;
    this.li = paramInt1;
  }

  public void a(fj paramfj, gz paramgz)
  {
    this.mo.setWebViewClient(paramgz);
    gu localgu = this.mo;
    if (TextUtils.isEmpty(paramfj.sg));
    for (String str = null; ; str = gi.L(paramfj.sg))
    {
      localgu.loadDataWithBaseURL(str, paramfj.tU, "text/html", "UTF-8", null);
      return;
    }
  }

  public void b(fj paramfj)
  {
    a(paramfj, new gz(this, this.mo, paramfj.ud));
  }

  public void cF()
  {
    this.tr.postDelayed(this, this.ts);
  }

  public void cG()
  {
    monitorenter;
    try
    {
      this.tv = true;
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

  public boolean cH()
  {
    monitorenter;
    try
    {
      boolean bool = this.tv;
      monitorexit;
      return bool;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public boolean cI()
  {
    return this.tw;
  }

  public void run()
  {
    if ((this.mo == null) || (cH()))
    {
      this.tu.a(this.mo);
      return;
    }
    new a(this.mo).execute(new Void[0]);
  }

  protected final class a extends AsyncTask<Void, Void, Boolean>
  {
    private final WebView tx;
    private Bitmap ty;

    public a(WebView arg2)
    {
      Object localObject;
      this.tx = localObject;
    }

    protected void a(Boolean paramBoolean)
    {
      fb.c(fb.this);
      if ((paramBoolean.booleanValue()) || (fb.this.cH()) || (fb.d(fb.this) <= 0L))
      {
        fb.this.tw = paramBoolean.booleanValue();
        fb.e(fb.this).a(fb.this.mo);
      }
      do
        return;
      while (fb.d(fb.this) <= 0L);
      if (gr.v(2))
        gr.S("Ad not detected, scheduling another run.");
      fb.g(fb.this).postDelayed(fb.this, fb.f(fb.this));
    }

    protected Boolean b(Void[] paramArrayOfVoid)
    {
      monitorenter;
      while (true)
      {
        int k;
        int n;
        try
        {
          int i = this.ty.getWidth();
          int j = this.ty.getHeight();
          if ((i != 0) && (j != 0))
            continue;
          Boolean localBoolean1 = Boolean.valueOf(false);
          Object localObject2 = localBoolean1;
          return localObject2;
          k = 0;
          int m = 0;
          if (k >= i)
            continue;
          n = 0;
          if (n >= j)
            break label139;
          if (this.ty.getPixel(k, n) != 0)
          {
            m++;
            break label133;
            if (m / (i * j / 100.0D) <= 0.1D)
              continue;
            boolean bool = true;
            Boolean localBoolean2 = Boolean.valueOf(bool);
            localObject2 = localBoolean2;
            continue;
            bool = false;
            continue;
          }
        }
        finally
        {
          monitorexit;
        }
        label133: n += 10;
        continue;
        label139: k += 10;
      }
    }

    protected void onPreExecute()
    {
      monitorenter;
      try
      {
        this.ty = Bitmap.createBitmap(fb.a(fb.this), fb.b(fb.this), Bitmap.Config.ARGB_8888);
        this.tx.setVisibility(0);
        this.tx.measure(View.MeasureSpec.makeMeasureSpec(fb.a(fb.this), 0), View.MeasureSpec.makeMeasureSpec(fb.b(fb.this), 0));
        this.tx.layout(0, 0, fb.a(fb.this), fb.b(fb.this));
        Canvas localCanvas = new Canvas(this.ty);
        this.tx.draw(localCanvas);
        this.tx.invalidate();
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
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fb
 * JD-Core Version:    0.6.0
 */