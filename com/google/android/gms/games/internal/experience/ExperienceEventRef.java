package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.GameRef;

public final class ExperienceEventRef extends d
  implements ExperienceEvent
{
  private final GameRef acr;

  public ExperienceEventRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
    if (aS("external_game_id"))
    {
      this.acr = null;
      return;
    }
    this.acr = new GameRef(this.JG, this.KZ);
  }

  public String getIconImageUrl()
  {
    return getString("icon_url");
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.experience.ExperienceEventRef
 * JD-Core Version:    0.6.0
 */