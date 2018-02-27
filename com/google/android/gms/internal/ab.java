package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

@ey
public class ab
{
  private final a mu;
  private final Runnable mv;
  private av mw;
  private boolean mx = false;
  private boolean my = false;
  private long mz = 0L;

  public ab(u paramu)
  {
    this(paramu, new a(gq.wR));
  }

  ab(u paramu, a parama)
  {
    this.mu = parama;
    this.mv = new Runnable(paramu)
    {
      private final WeakReference<u> mA = new WeakReference(this.mB);

      public void run()
      {
        ab.a(ab.this, false);
        u localu = (u)this.mA.get();
        if (localu != null)
          localu.b(ab.a(ab.this));
      }
    };
  }

  public void a(av paramav, long paramLong)
  {
    if (this.mx)
      gr.W("An ad refresh is already scheduled.");
    do
    {
      return;
      this.mw = paramav;
      this.mx = true;
      this.mz = paramLong;
    }
    while (this.my);
    gr.U("Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.mu.postDelayed(this.mv, paramLong);
  }

  public boolean aD()
  {
    return this.mx;
  }

  public void c(av paramav)
  {
    a(paramav, 60000L);
  }

  public void cancel()
  {
    this.mx = false;
    this.mu.removeCallbacks(this.mv);
  }

  public void pause()
  {
    this.my = true;
    if (this.mx)
      this.mu.removeCallbacks(this.mv);
  }

  public void resume()
  {
    this.my = false;
    if (this.mx)
    {
      this.mx = false;
      a(this.mw, this.mz);
    }
  }

  public static class a
  {
    private final Handler mHandler;

    public a(Handler paramHandler)
    {
      this.mHandler = paramHandler;
    }

    public boolean postDelayed(Runnable paramRunnable, long paramLong)
    {
      return this.mHandler.postDelayed(paramRunnable, paramLong);
    }

    public void removeCallbacks(Runnable paramRunnable)
    {
      this.mHandler.removeCallbacks(paramRunnable);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab
 * JD-Core Version:    0.6.0
 */