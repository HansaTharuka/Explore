package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class GetMetadataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<GetMetadataRequest> CREATOR = new ad();
  final int CK;
  final DriveId Pp;

  GetMetadataRequest(int paramInt, DriveId paramDriveId)
  {
    this.CK = paramInt;
    this.Pp = paramDriveId;
  }

  public GetMetadataRequest(DriveId paramDriveId)
  {
    this(1, paramDriveId);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ad.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.GetMetadataRequest
 * JD-Core Version:    0.6.0
 */