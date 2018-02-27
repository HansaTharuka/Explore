package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface MostRecentGameInfo extends Parcelable, Freezable<MostRecentGameInfo>
{
  public abstract Uri mA();

  public abstract Uri mB();

  public abstract String mw();

  public abstract String mx();

  public abstract long my();

  public abstract Uri mz();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.player.MostRecentGameInfo
 * JD-Core Version:    0.6.0
 */