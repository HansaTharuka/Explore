package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class py
  implements SafeParcelable
{
  public static final Parcelable.Creator<py> CREATOR = new pz();
  private final int CK;
  String[] avY;
  byte[][] avZ;

  py()
  {
    this(1, new String[0], new byte[0][]);
  }

  py(int paramInt, String[] paramArrayOfString, byte[][] paramArrayOfByte)
  {
    this.CK = paramInt;
    this.avY = paramArrayOfString;
    this.avZ = paramArrayOfByte;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    pz.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.py
 * JD-Core Version:    0.6.0
 */