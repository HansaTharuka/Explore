package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class n
  implements SafeParcelable
{
  public static final Parcelable.Creator<n> CREATOR = new o();
  private final int CK;
  String awW;
  String description;

  n()
  {
    this.CK = 1;
  }

  n(int paramInt, String paramString1, String paramString2)
  {
    this.CK = paramInt;
    this.awW = paramString1;
    this.description = paramString2;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.n
 * JD-Core Version:    0.6.0
 */