package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class k
  implements Parcelable.Creator<NotFilter>
{
  static void a(NotFilter paramNotFilter, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1000, paramNotFilter.CK);
    b.a(paramParcel, 1, paramNotFilter.Sv, paramInt, false);
    b.H(paramParcel, i);
  }

  public NotFilter ba(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    int j = 0;
    FilterHolder localFilterHolder = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1000:
        j = a.g(paramParcel, k);
        break;
      case 1:
        localFilterHolder = (FilterHolder)a.a(paramParcel, k, FilterHolder.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new NotFilter(j, localFilterHolder);
  }

  public NotFilter[] cp(int paramInt)
  {
    return new NotFilter[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.k
 * JD-Core Version:    0.6.0
 */