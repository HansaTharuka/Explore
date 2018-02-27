package com.google.android.gms.tagmanager;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.LinkedBlockingQueue;

class as extends Thread
  implements ar
{
  private static as ary;
  private final LinkedBlockingQueue<Runnable> arx = new LinkedBlockingQueue();
  private volatile at arz;
  private volatile boolean mClosed = false;
  private final Context mContext;
  private volatile boolean zK = false;

  private as(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null);
    for (this.mContext = paramContext.getApplicationContext(); ; this.mContext = paramContext)
    {
      start();
      return;
    }
  }

  static as Z(Context paramContext)
  {
    if (ary == null)
      ary = new as(paramContext);
    return ary;
  }

  private String g(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }

  public void b(Runnable paramRunnable)
  {
    this.arx.add(paramRunnable);
  }

  void b(String paramString, long paramLong)
  {
    b(new Runnable(this, paramLong, paramString)
    {
      public void run()
      {
        if (as.a(as.this) == null)
        {
          cy localcy = cy.qN();
          localcy.a(as.b(as.this), this.arA);
          as.a(as.this, localcy.qO());
        }
        as.a(as.this).f(this.arB, this.wO);
      }
    });
  }

  public void cE(String paramString)
  {
    b(paramString, System.currentTimeMillis());
  }

  public void run()
  {
    while (!this.mClosed)
      try
      {
        Runnable localRunnable = (Runnable)this.arx.take();
        if (this.zK)
          continue;
        localRunnable.run();
      }
      catch (InterruptedException localInterruptedException)
      {
        bh.U(localInterruptedException.toString());
      }
      catch (Throwable localThrowable)
      {
        bh.T("Error on Google TagManager Thread: " + g(localThrowable));
        bh.T("Google TagManager is shutting down.");
        this.zK = true;
      }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.as
 * JD-Core Version:    0.6.0
 */