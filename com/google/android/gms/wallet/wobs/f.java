package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class f
  implements SafeParcelable
{
  public static final Parcelable.Creator<f> CREATOR = new i();
  private final int CK;
  l avm;
  g awM;
  String label;
  String type;

  f()
  {
    this.CK = 1;
  }

  f(int paramInt, String paramString1, g paramg, String paramString2, l paraml)
  {
    this.CK = paramInt;
    this.label = paramString1;
    this.awM = paramg;
    this.type = paramString2;
    this.avm = paraml;
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
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.f
 * JD-Core Version:    0.6.0
 */