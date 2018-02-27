package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class hj
  implements SafeParcelable
{
  public static final hk CREATOR = new hk();
  final int CK;
  final Bundle Db;
  public final int id;

  hj(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    this.CK = paramInt1;
    this.id = paramInt2;
    this.Db = paramBundle;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    hk.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hj
 * JD-Core Version:    0.6.0
 */