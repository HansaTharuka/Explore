package com.google.android.gms.games;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.DataHolder;

public final class GameBuffer extends DataBuffer<Game>
{
  public GameBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  public Game get(int paramInt)
  {
    return new GameRef(this.JG, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.GameBuffer
 * JD-Core Version:    0.6.0
 */