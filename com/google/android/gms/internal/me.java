package com.google.android.gms.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.a;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import java.util.concurrent.TimeUnit;

class me<T extends Result>
  implements PendingResult<T>
{
  private final T UU;

  me(T paramT)
  {
    this.UU = paramT;
  }

  public void a(PendingResult.a parama)
  {
    parama.m(this.UU.getStatus());
  }

  public T await()
  {
    return this.UU;
  }

  public T await(long paramLong, TimeUnit paramTimeUnit)
  {
    return this.UU;
  }

  public void cancel()
  {
  }

  public boolean isCanceled()
  {
    return false;
  }

  public void setResultCallback(ResultCallback<T> paramResultCallback)
  {
    paramResultCallback.onResult(this.UU);
  }

  public void setResultCallback(ResultCallback<T> paramResultCallback, long paramLong, TimeUnit paramTimeUnit)
  {
    paramResultCallback.onResult(this.UU);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.me
 * JD-Core Version:    0.6.0
 */