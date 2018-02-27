package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

public final class LeaderboardBuffer extends g<Leaderboard>
{
  public LeaderboardBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  protected String ha()
  {
    return "external_leaderboard_id";
  }

  protected Leaderboard j(int paramInt1, int paramInt2)
  {
    return new LeaderboardRef(this.JG, paramInt1, paramInt2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardBuffer
 * JD-Core Version:    0.6.0
 */