package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class oc
  implements SafeParcelable
{
  public static final Parcelable.Creator<oc> CREATOR = new od();
  final int CK;
  private final String TW;
  private final LatLng ajX;
  private final List<oa> ajY;
  private final String ajZ;
  private final String aka;
  private final String mName;

  oc(int paramInt, String paramString1, LatLng paramLatLng, String paramString2, List<oa> paramList, String paramString3, String paramString4)
  {
    this.CK = paramInt;
    this.mName = paramString1;
    this.ajX = paramLatLng;
    this.TW = paramString2;
    this.ajY = new ArrayList(paramList);
    this.ajZ = paramString3;
    this.aka = paramString4;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getAddress()
  {
    return this.TW;
  }

  public String getName()
  {
    return this.mName;
  }

  public String getPhoneNumber()
  {
    return this.ajZ;
  }

  public LatLng nx()
  {
    return this.ajX;
  }

  public List<oa> ny()
  {
    return this.ajY;
  }

  public String nz()
  {
    return this.aka;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    od.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oc
 * JD-Core Version:    0.6.0
 */