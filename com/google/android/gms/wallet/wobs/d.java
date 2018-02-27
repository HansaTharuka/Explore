package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.la;
import java.util.ArrayList;

public final class d
  implements SafeParcelable
{
  public static final Parcelable.Creator<d> CREATOR = new e();
  private final int CK;
  String awJ;
  String awK;
  ArrayList<b> awL;

  d()
  {
    this.CK = 1;
    this.awL = la.ie();
  }

  d(int paramInt, String paramString1, String paramString2, ArrayList<b> paramArrayList)
  {
    this.CK = paramInt;
    this.awJ = paramString1;
    this.awK = paramString2;
    this.awL = paramArrayList;
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
    e.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.d
 * JD-Core Version:    0.6.0
 */