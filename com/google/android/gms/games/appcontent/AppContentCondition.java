package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface AppContentCondition extends Parcelable, Freezable<AppContentCondition>
{
  public abstract String kT();

  public abstract String kU();

  public abstract String kV();

  public abstract Bundle kW();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentCondition
 * JD-Core Version:    0.6.0
 */