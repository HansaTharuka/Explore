package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

public class OnMetadataResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<OnMetadataResponse> CREATOR = new at();
  final int CK;
  final MetadataBundle Px;

  OnMetadataResponse(int paramInt, MetadataBundle paramMetadataBundle)
  {
    this.CK = paramInt;
    this.Px = paramMetadataBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public MetadataBundle iU()
  {
    return this.Px;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    at.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.OnMetadataResponse
 * JD-Core Version:    0.6.0
 */