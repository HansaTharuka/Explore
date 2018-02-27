package com.google.android.gms.internal;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ey
public class gk<T>
  implements Future<T>
{
  private final T wF;

  public gk(T paramT)
  {
    this.wF = paramT;
  }

  public boolean cancel(boolean paramBoolean)
  {
    return false;
  }

  public T get()
  {
    return this.wF;
  }

  public T get(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.wF;
  }

  public boolean isCancelled()
  {
    return false;
  }

  public boolean isDone()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gk
 * JD-Core Version:    0.6.0
 */