package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import java.math.BigInteger;
import java.util.Locale;

@ey
public final class ge
{
  private static final Object ut = new Object();
  private static String wt;

  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    synchronized (ut)
    {
      if ((wt == null) && (!TextUtils.isEmpty(paramString1)))
        b(paramContext, paramString1, paramString2);
      String str = wt;
      return str;
    }
  }

  private static void b(Context paramContext, String paramString1, String paramString2)
  {
    BigInteger localBigInteger2;
    try
    {
      ClassLoader localClassLoader = paramContext.createPackageContext(paramString2, 3).getClassLoader();
      Class localClass = Class.forName("com.google.ads.mediation.MediationAdapter", false, localClassLoader);
      BigInteger localBigInteger1 = new BigInteger(new byte[1]);
      String[] arrayOfString = paramString1.split(",");
      localBigInteger2 = localBigInteger1;
      for (int i = 0; i < arrayOfString.length; i++)
      {
        if (!gi.a(localClassLoader, localClass, arrayOfString[i]))
          continue;
        localBigInteger2 = localBigInteger2.setBit(i);
      }
    }
    catch (Throwable localThrowable)
    {
      wt = "err";
      return;
    }
    wt = String.format(Locale.US, "%X", new Object[] { localBigInteger2 });
  }

  public static String dr()
  {
    synchronized (ut)
    {
      String str = wt;
      return str;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ge
 * JD-Core Version:    0.6.0
 */