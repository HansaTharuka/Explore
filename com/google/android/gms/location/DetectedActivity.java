package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Comparator;

public class DetectedActivity
  implements SafeParcelable
{
  public static final DetectedActivityCreator CREATOR;
  public static final int IN_VEHICLE = 0;
  public static final int ON_BICYCLE = 1;
  public static final int ON_FOOT = 2;
  public static final int RUNNING = 8;
  public static final int STILL = 3;
  public static final int TILTING = 5;
  public static final int UNKNOWN = 4;
  public static final int WALKING = 7;
  public static final Comparator<DetectedActivity> aga = new Comparator()
  {
    public int a(DetectedActivity paramDetectedActivity1, DetectedActivity paramDetectedActivity2)
    {
      int i = Integer.valueOf(paramDetectedActivity2.getConfidence()).compareTo(Integer.valueOf(paramDetectedActivity1.getConfidence()));
      if (i == 0)
        i = Integer.valueOf(paramDetectedActivity1.getType()).compareTo(Integer.valueOf(paramDetectedActivity2.getType()));
      return i;
    }
  };
  private final int CK;
  int agb;
  int agc;

  static
  {
    CREATOR = new DetectedActivityCreator();
  }

  public DetectedActivity(int paramInt1, int paramInt2)
  {
    this.CK = 1;
    this.agb = paramInt1;
    this.agc = paramInt2;
  }

  public DetectedActivity(int paramInt1, int paramInt2, int paramInt3)
  {
    this.CK = paramInt1;
    this.agb = paramInt2;
    this.agc = paramInt3;
  }

  private int ev(int paramInt)
  {
    if (paramInt > 9)
      paramInt = 4;
    return paramInt;
  }

  public int describeContents()
  {
    return 0;
  }

  public int getConfidence()
  {
    return this.agc;
  }

  public int getType()
  {
    return ev(this.agb);
  }

  public int getVersionCode()
  {
    return this.CK;
  }

  public String toString()
  {
    return "DetectedActivity [type=" + getType() + ", confidence=" + this.agc + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    DetectedActivityCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * JD-Core Version:    0.6.0
 */