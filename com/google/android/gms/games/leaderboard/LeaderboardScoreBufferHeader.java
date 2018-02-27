package com.google.android.gms.games.leaderboard;

import android.os.Bundle;

public final class LeaderboardScoreBufferHeader
{
  private final Bundle DJ;

  public LeaderboardScoreBufferHeader(Bundle paramBundle)
  {
    if (paramBundle == null)
      paramBundle = new Bundle();
    this.DJ = paramBundle;
  }

  public Bundle mI()
  {
    return this.DJ;
  }

  public static final class Builder
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader
 * JD-Core Version:    0.6.0
 */