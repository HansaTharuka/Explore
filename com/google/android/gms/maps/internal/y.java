package com.google.android.gms.maps.internal;

import android.graphics.Point;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class y
  implements SafeParcelable
{
  public static final z CREATOR = new z();
  private final Point alK;
  private final int versionCode;

  public y(int paramInt, Point paramPoint)
  {
    this.versionCode = paramInt;
    this.alK = paramPoint;
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if (!(paramObject instanceof y))
      return false;
    y localy = (y)paramObject;
    return this.alK.equals(localy.alK);
  }

  int getVersionCode()
  {
    return this.versionCode;
  }

  public int hashCode()
  {
    return this.alK.hashCode();
  }

  public Point oa()
  {
    return this.alK;
  }

  public String toString()
  {
    return this.alK.toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    z.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.y
 * JD-Core Version:    0.6.0
 */