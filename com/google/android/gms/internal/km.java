package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class km
  implements SafeParcelable
{
  public static final kn CREATOR = new kn();
  private final int CK;
  private final ko NF;

  km(int paramInt, ko paramko)
  {
    this.CK = paramInt;
    this.NF = paramko;
  }

  private km(ko paramko)
  {
    this.CK = 1;
    this.NF = paramko;
  }

  public static km a(kr.b<?, ?> paramb)
  {
    if ((paramb instanceof ko))
      return new km((ko)paramb);
    throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
  }

  public int describeContents()
  {
    return 0;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  ko hF()
  {
    return this.NF;
  }

  public kr.b<?, ?> hG()
  {
    if (this.NF != null)
      return this.NF;
    throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kn.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.km
 * JD-Core Version:    0.6.0
 */