package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class SetFileUploadPreferencesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<SetFileUploadPreferencesRequest> CREATOR = new be();
  final int CK;
  final FileUploadPreferencesImpl QK;

  SetFileUploadPreferencesRequest(int paramInt, FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this.CK = paramInt;
    this.QK = paramFileUploadPreferencesImpl;
  }

  public SetFileUploadPreferencesRequest(FileUploadPreferencesImpl paramFileUploadPreferencesImpl)
  {
    this(1, paramFileUploadPreferencesImpl);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    be.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.SetFileUploadPreferencesRequest
 * JD-Core Version:    0.6.0
 */