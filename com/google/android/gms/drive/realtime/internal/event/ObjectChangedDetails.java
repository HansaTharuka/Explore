package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ObjectChangedDetails
  implements SafeParcelable
{
  public static final Parcelable.Creator<ObjectChangedDetails> CREATOR = new a();
  final int CK;
  final int SO;
  final int SP;

  ObjectChangedDetails(int paramInt1, int paramInt2, int paramInt3)
  {
    this.CK = paramInt1;
    this.SO = paramInt2;
    this.SP = paramInt3;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.event.ObjectChangedDetails
 * JD-Core Version:    0.6.0
 */