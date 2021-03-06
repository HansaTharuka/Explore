package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class CancelPendingActionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<CancelPendingActionsRequest> CREATOR = new d();
  final int CK;
  final List<String> Pb;

  CancelPendingActionsRequest(int paramInt, List<String> paramList)
  {
    this.CK = paramInt;
    this.Pb = paramList;
  }

  public CancelPendingActionsRequest(List<String> paramList)
  {
    this(1, paramList);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    d.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.CancelPendingActionsRequest
 * JD-Core Version:    0.6.0
 */