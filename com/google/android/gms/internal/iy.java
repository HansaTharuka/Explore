package com.google.android.gms.internal;

import android.content.ContentResolver;
import android.content.Context;

public abstract class iy<T>
{
  private static a KO;
  private static final Object mH = new Object();
  protected final String KP;
  protected final T KQ;
  private T KR = null;

  static
  {
    KO = null;
  }

  protected iy(String paramString, T paramT)
  {
    this.KP = paramString;
    this.KQ = paramT;
  }

  public static void H(Context paramContext)
  {
    synchronized (mH)
    {
      if (KO == null)
        KO = new b(paramContext.getContentResolver());
      return;
    }
  }

  public static iy<Integer> a(String paramString, Integer paramInteger)
  {
    return new iy(paramString, paramInteger)
    {
    };
  }

  public static iy<Boolean> h(String paramString, boolean paramBoolean)
  {
    return new iy(paramString, Boolean.valueOf(paramBoolean))
    {
    };
  }

  public static iy<String> l(String paramString1, String paramString2)
  {
    return new iy(paramString1, paramString2)
    {
    };
  }

  public String getKey()
  {
    return this.KP;
  }

  private static abstract interface a
  {
  }

  private static class b
    implements iy.a
  {
    private final ContentResolver mContentResolver;

    public b(ContentResolver paramContentResolver)
    {
      this.mContentResolver = paramContentResolver;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iy
 * JD-Core Version:    0.6.0
 */