package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ij
  implements SafeParcelable
{
  public static final Parcelable.Creator<ij> CREATOR = new ik();
  private final int CK;
  private String Hd;

  public ij()
  {
    this(1, null);
  }

  ij(int paramInt, String paramString)
  {
    this.CK = paramInt;
    this.Hd = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof ij))
      return false;
    ij localij = (ij)paramObject;
    return in.a(this.Hd, localij.Hd);
  }

  public String fT()
  {
    return this.Hd;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.Hd;
    return jv.hashCode(arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ik.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ij
 * JD-Core Version:    0.6.0
 */