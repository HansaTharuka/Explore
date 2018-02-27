package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public class OnDriveIdResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<OnDriveIdResponse> CREATOR = new ao();
  final int CK;
  DriveId Pp;

  OnDriveIdResponse(int paramInt, DriveId paramDriveId)
  {
    this.CK = paramInt;
    this.Pp = paramDriveId;
  }

  public int describeContents()
  {
    return 0;
  }

  public DriveId getDriveId()
  {
    return this.Pp;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ao.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.OnDriveIdResponse
 * JD-Core Version:    0.6.0
 */