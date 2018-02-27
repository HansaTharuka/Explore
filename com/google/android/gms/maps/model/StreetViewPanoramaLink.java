package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public class StreetViewPanoramaLink
  implements SafeParcelable
{
  public static final r CREATOR = new r();
  private final int CK;
  public final float bearing;
  public final String panoId;

  StreetViewPanoramaLink(int paramInt, String paramString, float paramFloat)
  {
    this.CK = paramInt;
    this.panoId = paramString;
    if (paramFloat <= 0.0D)
      paramFloat = 360.0F + paramFloat % 360.0F;
    this.bearing = (paramFloat % 360.0F);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    StreetViewPanoramaLink localStreetViewPanoramaLink;
    do
    {
      return true;
      if (!(paramObject instanceof StreetViewPanoramaLink))
        return false;
      localStreetViewPanoramaLink = (StreetViewPanoramaLink)paramObject;
    }
    while ((this.panoId.equals(localStreetViewPanoramaLink.panoId)) && (Float.floatToIntBits(this.bearing) == Float.floatToIntBits(localStreetViewPanoramaLink.bearing)));
    return false;
  }

  int getVersionCode()
  {
    return this.CK;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = this.panoId;
    arrayOfObject[1] = Float.valueOf(this.bearing);
    return jv.hashCode(arrayOfObject);
  }

  public String toString()
  {
    return jv.h(this).a("panoId", this.panoId).a("bearing", Float.valueOf(this.bearing)).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.StreetViewPanoramaLink
 * JD-Core Version:    0.6.0
 */