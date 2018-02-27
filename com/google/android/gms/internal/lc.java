package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.regex.Pattern;

public final class lc
{
  private static Pattern Oe = null;

  public static boolean K(Context paramContext)
  {
    return paramContext.getPackageManager().hasSystemFeature("android.hardware.type.watch");
  }

  public static int aS(int paramInt)
  {
    return paramInt / 1000;
  }

  public static int aT(int paramInt)
  {
    return paramInt % 1000 / 100;
  }

  public static boolean aU(int paramInt)
  {
    return aT(paramInt) == 3;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lc
 * JD-Core Version:    0.6.0
 */