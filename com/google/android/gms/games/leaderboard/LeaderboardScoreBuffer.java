package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class LeaderboardScoreBuffer extends DataBuffer<LeaderboardScore>
{
  private final LeaderboardScoreBufferHeader adr;

  public LeaderboardScoreBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    this.adr = new LeaderboardScoreBufferHeader(paramDataHolder.gV());
  }

  public LeaderboardScore get(int paramInt)
  {
    return new LeaderboardScoreRef(this.JG, paramInt);
  }

  public LeaderboardScoreBufferHeader mH()
  {
    return this.adr;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer
 * JD-Core Version:    0.6.0
 */