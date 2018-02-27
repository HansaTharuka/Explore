package com.google.android.gms.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ey
public class gj<T>
  implements Future<T>
{
  private final Object mH = new Object();
  private boolean qj = false;
  private T wF = null;
  private boolean wG = false;

  public void a(T paramT)
  {
    synchronized (this.mH)
    {
      if (this.wG)
        throw new IllegalStateException("Provided CallbackFuture with multiple values.");
    }
    this.wG = true;
    this.wF = paramT;
    this.mH.notifyAll();
    monitorexit;
  }

  public boolean cancel(boolean paramBoolean)
  {
    if (!paramBoolean)
      return false;
    synchronized (this.mH)
    {
      if (this.wG)
        return false;
    }
    this.qj = true;
    this.wG = true;
    this.mH.notifyAll();
    monitorexit;
    return true;
  }

  public T get()
  {
    synchronized (this.mH)
    {
      boolean bool = this.wG;
      if (bool);
    }
    try
    {
      this.mH.wait();
      label23: if (this.qj)
      {
        throw new CancellationException("CallbackFuture was cancelled.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      Object localObject3 = this.wF;
      monitorexit;
      return localObject3;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label23;
    }
  }

  public T get(long paramLong, TimeUnit paramTimeUnit)
    throws TimeoutException
  {
    synchronized (this.mH)
    {
      boolean bool = this.wG;
      if (bool);
    }
    try
    {
      long l = paramTimeUnit.toMillis(paramLong);
      if (l != 0L)
        this.mH.wait(l);
      label43: if (!this.wG)
      {
        throw new TimeoutException("CallbackFuture timed out.");
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      if (this.qj)
        throw new CancellationException("CallbackFuture was cancelled.");
      Object localObject3 = this.wF;
      monitorexit;
      return localObject3;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label43;
    }
  }

  public boolean isCancelled()
  {
    synchronized (this.mH)
    {
      boolean bool = this.qj;
      return bool;
    }
  }

  public boolean isDone()
  {
    synchronized (this.mH)
    {
      boolean bool = this.wG;
      return bool;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gj
 * JD-Core Version:    0.6.0
 */