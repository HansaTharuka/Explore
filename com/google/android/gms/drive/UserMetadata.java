package com.google.android.gms.drive;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class UserMetadata
  implements SafeParcelable
{
  public static final Parcelable.Creator<UserMetadata> CREATOR = new h();
  final int CK;
  final String OR;
  final String OS;
  final String OT;
  final boolean OU;
  final String OV;

  UserMetadata(int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this.CK = paramInt;
    this.OR = paramString1;
    this.OS = paramString2;
    this.OT = paramString3;
    this.OU = paramBoolean;
    this.OV = paramString4;
  }

  public UserMetadata(String paramString1, String paramString2, String paramString3, boolean paramBoolean, String paramString4)
  {
    this(1, paramString1, paramString2, paramString3, paramBoolean, paramString4);
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.OR;
    arrayOfObject[1] = this.OS;
    arrayOfObject[2] = this.OT;
    arrayOfObject[3] = Boolean.valueOf(this.OU);
    arrayOfObject[4] = this.OV;
    return String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.UserMetadata
 * JD-Core Version:    0.6.0
 */