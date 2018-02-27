package com.google.android.gms.internal;

import android.os.SystemClock;

public final class lf
  implements ld
{
  private static lf Of;

  public static ld jdMethod_if()
  {
    monitorenter;
    try
    {
      if (Of == null)
        Of = new lf();
      lf locallf = Of;
      return locallf;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }

  public long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lf
 * JD-Core Version:    0.6.0
 */