package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ReferenceShiftedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator<ReferenceShiftedDetails> CREATOR = new d();
  final int CK;
  final String Te;
  final String Tf;
  final int Tg;
  final int Th;

  ReferenceShiftedDetails(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.CK = paramInt1;
    this.Te = paramString1;
    this.Tf = paramString2;
    this.Tg = paramInt2;
    this.Th = paramInt3;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ReferenceShiftedDetails
 * JD-Core Version:    0.6.0
 */