package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@Deprecated
public final class Address
  implements SafeParcelable
{
  public static final Parcelable.Creator<Address> CREATOR = new a();
  private final int CK;
  String afK;
  String afL;
  String afM;
  String afR;
  String afT;
  boolean afU;
  String afV;
  String auD;
  String auE;
  String name;
  String vk;

  Address()
  {
    this.CK = 1;
  }

  Address(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, boolean paramBoolean, String paramString10)
  {
    this.CK = paramInt;
    this.name = paramString1;
    this.afK = paramString2;
    this.afL = paramString3;
    this.afM = paramString4;
    this.vk = paramString5;
    this.auD = paramString6;
    this.auE = paramString7;
    this.afR = paramString8;
    this.afT = paramString9;
    this.afU = paramBoolean;
    this.afV = paramString10;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getAddress1()
  {
    return this.afK;
  }

  public String getAddress2()
  {
    return this.afL;
  }

  public String getAddress3()
  {
    return this.afM;
  }

  public String getCity()
  {
    return this.auD;
  }

  public String getCompanyName()
  {
    return this.afV;
  }

  public String getCountryCode()
  {
    return this.vk;
  }

  public String getName()
  {
    return this.name;
  }

  public String getPhoneNumber()
  {
    return this.afT;
  }

  public String getPostalCode()
  {
    return this.afR;
  }

  public String getState()
  {
    return this.auE;
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public boolean isPostBox()
  {
    return this.afU;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    a.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Address
 * JD-Core Version:    0.6.0
 */