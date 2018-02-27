package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@ey
public final class y
  implements SafeParcelable
{
  public static final z CREATOR = new z();
  public final boolean mi;
  public final boolean ms;
  public final int versionCode;

  y(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = paramInt;
    this.mi = paramBoolean1;
    this.ms = paramBoolean2;
  }

  public y(boolean paramBoolean1, boolean paramBoolean2)
  {
    this.versionCode = 1;
    this.mi = paramBoolean1;
    this.ms = paramBoolean2;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    z.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.y
 * JD-Core Version:    0.6.0
 */