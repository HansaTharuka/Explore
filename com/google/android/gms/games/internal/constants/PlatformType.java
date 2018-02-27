package com.google.android.gms.games.internal.constants;

public final class PlatformType
{
  public static String dZ(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown platform type: " + paramInt);
    case 0:
      return "ANDROID";
    case 1:
      return "IOS";
    case 2:
    }
    return "WEB_APP";
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.PlatformType
 * JD-Core Version:    0.6.0
 */