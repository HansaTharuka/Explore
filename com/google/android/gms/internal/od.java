package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

public class od
  implements Parcelable.Creator<oc>
{
  static void a(oc paramoc, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.a(paramParcel, 1, paramoc.getName(), false);
    b.c(paramParcel, 1000, paramoc.CK);
    b.a(paramParcel, 2, paramoc.nx(), paramInt, false);
    b.a(paramParcel, 3, paramoc.getAddress(), false);
    b.c(paramParcel, 4, paramoc.ny(), false);
    b.a(paramParcel, 5, paramoc.getPhoneNumber(), false);
    b.a(paramParcel, 6, paramoc.nz(), false);
    b.H(paramParcel, i);
  }

  public oc cU(Parcel paramParcel)
  {
    String str1 = null;
    int i = a.G(paramParcel);
    int j = 0;
    String str2 = null;
    ArrayList localArrayList = null;
    String str3 = null;
    LatLng localLatLng = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        str4 = a.o(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 2:
        localLatLng = (LatLng)a.a(paramParcel, k, LatLng.CREATOR);
        break;
      case 3:
        str3 = a.o(paramParcel, k);
        break;
      case 4:
        localArrayList = a.c(paramParcel, k, oa.CREATOR);
        break;
      case 5:
        str2 = a.o(paramParcel, k);
        break;
      case 6:
        str1 = a.o(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new oc(j, str4, localLatLng, str3, localArrayList, str2, str1);
  }

  public oc[] eQ(int paramInt)
  {
    return new oc[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.od
 * JD-Core Version:    0.6.0
 */