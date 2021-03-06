package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.List;

public class SetResourceParentsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SetResourceParentsRequest> CREATOR = new bf();
  final int CK;
  final DriveId QW;
  final List<DriveId> QX;

  SetResourceParentsRequest(int paramInt, DriveId paramDriveId, List<DriveId> paramList)
  {
    this.CK = paramInt;
    this.QW = paramDriveId;
    this.QX = paramList;
  }

  public SetResourceParentsRequest(DriveId paramDriveId, List<DriveId> paramList)
  {
    this(1, paramDriveId, paramList);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    bf.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.SetResourceParentsRequest
 * JD-Core Version:    0.6.0
 */