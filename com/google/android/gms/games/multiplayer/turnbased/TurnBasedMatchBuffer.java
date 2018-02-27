package com.google.android.gms.games.multiplayer.turnbased;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

public final class TurnBasedMatchBuffer extends g<TurnBasedMatch>
{
  public TurnBasedMatchBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  protected String ha()
  {
    return "external_match_id";
  }

  protected TurnBasedMatch m(int paramInt1, int paramInt2)
  {
    return new TurnBasedMatchRef(this.JG, paramInt1, paramInt2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer
 * JD-Core Version:    0.6.0
 */