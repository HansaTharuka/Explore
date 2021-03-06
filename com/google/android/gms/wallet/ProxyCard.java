package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new o();
  private final int CK;
  String avP;
  String avQ;
  int avR;
  int avS;

  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.CK = paramInt1;
    this.avP = paramString1;
    this.avQ = paramString2;
    this.avR = paramInt2;
    this.avS = paramInt3;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getCvn()
  {
    return this.avQ;
  }

  public int getExpirationMonth()
  {
    return this.avR;
  }

  public int getExpirationYear()
  {
    return this.avS;
  }

  public String getPan()
  {
    return this.avP;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * JD-Core Version:    0.6.0
 */