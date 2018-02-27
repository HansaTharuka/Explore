package com.google.android.gms.games.internal;

import com.google.android.gms.internal.ji;
import com.google.android.gms.internal.lg;

public abstract class GamesDowngradeableSafeParcel extends ji
{
  protected static boolean c(Integer paramInteger)
  {
    if (paramInteger == null)
      return false;
    return lg.aV(paramInteger.intValue());
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.GamesDowngradeableSafeParcel
 * JD-Core Version:    0.6.0
 */