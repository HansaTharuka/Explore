package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

public final class TurnBasedMatchConfigImpl extends TurnBasedMatchConfig
{
  private final int adW;
  private final Bundle aem;
  private final String[] aeo;
  private final int aew;

  TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder paramBuilder)
  {
    this.adW = paramBuilder.adW;
    this.aew = paramBuilder.aew;
    this.aem = paramBuilder.aem;
    int i = paramBuilder.ael.size();
    this.aeo = ((String[])paramBuilder.ael.toArray(new String[i]));
  }

  public Bundle getAutoMatchCriteria()
  {
    return this.aem;
  }

  public String[] getInvitedPlayerIds()
  {
    return this.aeo;
  }

  public int getVariant()
  {
    return this.adW;
  }

  public int mO()
  {
    return this.aew;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfigImpl
 * JD-Core Version:    0.6.0
 */