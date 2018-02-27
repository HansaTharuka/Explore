package com.google.android.gms.games.multiplayer.realtime;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

public final class RoomBuffer extends g<Room>
{
  public RoomBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  protected String ha()
  {
    return "external_match_id";
  }

  protected Room l(int paramInt1, int paramInt2)
  {
    return new RoomRef(this.JG, paramInt1, paramInt2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomBuffer
 * JD-Core Version:    0.6.0
 */