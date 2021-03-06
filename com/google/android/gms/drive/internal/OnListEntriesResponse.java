package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.i;

public class OnListEntriesResponse extends i
  implements SafeParcelable
{
  public static final Parcelable.Creator<OnListEntriesResponse> CREATOR = new ar();
  final int CK;
  final boolean PJ;
  final DataHolder QQ;

  OnListEntriesResponse(int paramInt, DataHolder paramDataHolder, boolean paramBoolean)
  {
    this.CK = paramInt;
    this.QQ = paramDataHolder;
    this.PJ = paramBoolean;
  }

  protected void I(Parcel paramParcel, int paramInt)
  {
    ar.a(this, paramParcel, paramInt);
  }

  public int describeContents()
  {
    return 0;
  }

  public DataHolder iR()
  {
    return this.QQ;
  }

  public boolean iS()
  {
    return this.PJ;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.OnListEntriesResponse
 * JD-Core Version:    0.6.0
 */