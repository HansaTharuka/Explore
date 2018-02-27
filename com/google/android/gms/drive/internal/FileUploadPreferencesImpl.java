package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.FileUploadPreferences;

public final class FileUploadPreferencesImpl
  implements SafeParcelable, FileUploadPreferences
{
  public static final Parcelable.Creator<FileUploadPreferencesImpl> CREATOR = new ab();
  final int CK;
  int QA;
  boolean QB;
  int Qz;

  FileUploadPreferencesImpl(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    this.CK = paramInt1;
    this.Qz = paramInt2;
    this.QA = paramInt3;
    this.QB = paramBoolean;
  }

  public static boolean by(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    case 2:
    }
    return true;
  }

  public static boolean bz(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 256:
    case 257:
    }
    return true;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getBatteryUsagePreference()
  {
    if (!bz(this.QA))
      return 0;
    return this.QA;
  }

  public int getNetworkTypePreference()
  {
    if (!by(this.Qz))
      return 0;
    return this.Qz;
  }

  public boolean isRoamingAllowed()
  {
    return this.QB;
  }

  public void setBatteryUsagePreference(int paramInt)
  {
    if (!bz(paramInt))
      throw new IllegalArgumentException("Invalid battery usage preference value.");
    this.QA = paramInt;
  }

  public void setNetworkTypePreference(int paramInt)
  {
    if (!by(paramInt))
      throw new IllegalArgumentException("Invalid data connection preference value.");
    this.Qz = paramInt;
  }

  public void setRoamingAllowed(boolean paramBoolean)
  {
    this.QB = paramBoolean;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ab.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.FileUploadPreferencesImpl
 * JD-Core Version:    0.6.0
 */