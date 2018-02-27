package com.google.android.gms.games.internal.constants;

public final class TimeSpan
{
  private TimeSpan()
  {
    throw new AssertionError("Uninstantiable");
  }

  public static String dZ(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown time span " + paramInt);
    case 0:
      return "DAILY";
    case 1:
      return "WEEKLY";
    case 2:
    }
    return "ALL_TIME";
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.TimeSpan
 * JD-Core Version:    0.6.0
 */