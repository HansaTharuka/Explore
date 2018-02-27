package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentAction extends Parcelable, Freezable<AppContentAction>
{
  public abstract Bundle getExtras();

  public abstract String getLabel();

  public abstract String getType();

  public abstract List<AppContentCondition> kH();

  public abstract String kI();

  public abstract String kJ();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAction
 * JD-Core Version:    0.6.0
 */