package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class kk
  implements SafeParcelable
{
  public static final kl CREATOR = new kl();
  final int CK;
  public final String ND;
  public final int NE;

  public kk(int paramInt1, String paramString, int paramInt2)
  {
    this.CK = paramInt1;
    this.ND = paramString;
    this.NE = paramInt2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    kl.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kk
 * JD-Core Version:    0.6.0
 */