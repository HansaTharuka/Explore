package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentCard extends Parcelable, Freezable<AppContentCard>
{
  public abstract List<AppContentAction> getActions();

  public abstract String getDescription();

  public abstract Uri getIconImageUri();

  public abstract String getTitle();

  public abstract String getType();

  public abstract List<AppContentCondition> kH();

  public abstract String kI();

  public abstract Uri kL();

  public abstract List<AppContentAnnotation> kN();

  public abstract int kO();

  public abstract Bundle kP();

  public abstract String kQ();

  public abstract int kR();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentCard
 * JD-Core Version:    0.6.0
 */