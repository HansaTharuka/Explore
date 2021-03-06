package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject.a;

public final class OfferWalletObject
  implements SafeParcelable
{
  public static final Parcelable.Creator<OfferWalletObject> CREATOR = new n();
  private final int CK;
  String avN;
  CommonWalletObject avO;
  String fl;

  OfferWalletObject()
  {
    this.CK = 3;
  }

  OfferWalletObject(int paramInt, String paramString1, String paramString2, CommonWalletObject paramCommonWalletObject)
  {
    this.CK = paramInt;
    this.avN = paramString2;
    if (paramInt < 3)
    {
      this.avO = CommonWalletObject.rh().dh(paramString1).ri();
      return;
    }
    this.avO = paramCommonWalletObject;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getId()
  {
    return this.avO.getId();
  }

  public String getRedemptionCode()
  {
    return this.avN;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    n.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.OfferWalletObject
 * JD-Core Version:    0.6.0
 */