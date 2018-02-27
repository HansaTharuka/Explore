package com.google.android.gms.maps.model.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class c
  implements SafeParcelable
{
  public static final d CREATOR = new d();
  private final int CK;
  private Bundle amK;
  private int type;

  c(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.CK = paramInt1;
    this.type = paramInt2;
    this.amK = paramBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getType()
  {
    return this.type;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public Bundle oi()
  {
    return this.amK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.c
 * JD-Core Version:    0.6.0
 */