package com.google.android.gms.games.internal.constants;

public final class LeaderboardCollection
{
  public static String dZ(int paramInt)
  {
    switch (paramInt)
    {
    default:
      throw new IllegalArgumentException("Unknown leaderboard collection: " + paramInt);
    case 0:
      return "PUBLIC";
    case 1:
    }
    return "SOCIAL";
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.LeaderboardCollection
 * JD-Core Version:    0.6.0
 */