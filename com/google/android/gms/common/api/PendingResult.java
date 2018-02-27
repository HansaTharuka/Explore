package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

public abstract interface PendingResult<R extends Result>
{
  public abstract void a(a parama);

  public abstract R await();

  public abstract R await(long paramLong, TimeUnit paramTimeUnit);

  public abstract void cancel();

  public abstract boolean isCanceled();

  public abstract void setResultCallback(ResultCallback<R> paramResultCallback);

  public abstract void setResultCallback(ResultCallback<R> paramResultCallback, long paramLong, TimeUnit paramTimeUnit);

  public static abstract interface a
  {
    public abstract void m(Status paramStatus);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.PendingResult
 * JD-Core Version:    0.6.0
 */