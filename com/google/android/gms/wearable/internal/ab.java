package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ab
  implements SafeParcelable
{
  public static final Parcelable.Creator<ab> CREATOR = new ac();
  public final al axO;
  public final int statusCode;
  public final int versionCode;

  ab(int paramInt1, int paramInt2, al paramal)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.axO = paramal;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ac.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ab
 * JD-Core Version:    0.6.0
 */