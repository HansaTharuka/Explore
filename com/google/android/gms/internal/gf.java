package com.google.android.gms.internal;

@ey
public abstract class gf
{
  private final Runnable mv = new Runnable()
  {
    public final void run()
    {
      gf.a(gf.this, Thread.currentThread());
      gf.this.cx();
    }
  };
  private volatile Thread wu;

  public final void cancel()
  {
    onStop();
    if (this.wu != null)
      this.wu.interrupt();
  }

  public abstract void cx();

  public abstract void onStop();

  public final void start()
  {
    gh.a(this.mv);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gf
 * JD-Core Version:    0.6.0
 */