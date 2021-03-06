package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.List;

public class RealtimeDocumentSyncRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<RealtimeDocumentSyncRequest> CREATOR = new f();
  final int CK;
  final List<String> OK;
  final List<String> OL;

  RealtimeDocumentSyncRequest(int paramInt, List<String> paramList1, List<String> paramList2)
  {
    this.CK = paramInt;
    this.OK = ((List)jx.i(paramList1));
    this.OL = ((List)jx.i(paramList2));
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.RealtimeDocumentSyncRequest
 * JD-Core Version:    0.6.0
 */