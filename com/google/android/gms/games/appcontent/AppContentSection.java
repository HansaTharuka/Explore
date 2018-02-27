package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentSection extends Parcelable, Freezable<AppContentSection>
{
  public abstract List<AppContentAction> getActions();

  public abstract String getTitle();

  public abstract String getType();

  public abstract String kI();

  public abstract Bundle kP();

  public abstract String kQ();

  public abstract Uri kY();

  public abstract List<AppContentCard> kZ();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentSection
 * JD-Core Version:    0.6.0
 */