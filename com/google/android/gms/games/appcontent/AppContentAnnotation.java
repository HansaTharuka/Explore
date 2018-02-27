package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface AppContentAnnotation extends Parcelable, Freezable<AppContentAnnotation>
{
  public abstract String getDescription();

  public abstract String getTitle();

  public abstract String getType();

  public abstract Uri kL();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.appcontent.AppContentAnnotation
 * JD-Core Version:    0.6.0
 */