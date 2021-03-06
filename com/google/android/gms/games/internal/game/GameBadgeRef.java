package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

public final class GameBadgeRef extends d
  implements GameBadge
{
  GameBadgeRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return GameBadgeEntity.a(this, paramObject);
  }

  public String getDescription()
  {
    return getString("badge_description");
  }

  public Uri getIconImageUri()
  {
    return aR("badge_icon_image_uri");
  }

  public String getTitle()
  {
    return getString("badge_title");
  }

  public int getType()
  {
    return getInteger("badge_type");
  }

  public int hashCode()
  {
    return GameBadgeEntity.a(this);
  }

  public GameBadge mk()
  {
    return new GameBadgeEntity(this);
  }

  public String toString()
  {
    return GameBadgeEntity.b(this);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((GameBadgeEntity)mk()).writeToParcel(paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.game.GameBadgeRef
 * JD-Core Version:    0.6.0
 */