package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class gt
  implements Parcelable.Creator<gs>
{
  static void a(gs paramgs, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1, paramgs.versionCode);
    b.a(paramParcel, 2, paramgs.wS, false);
    b.c(paramParcel, 3, paramgs.wT);
    b.c(paramParcel, 4, paramgs.wU);
    b.a(paramParcel, 5, paramgs.wV);
    b.H(paramParcel, i);
  }

  public gs j(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.G(paramParcel);
    String str = null;
    int j = 0;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < i)
    {
      int n = a.F(paramParcel);
      switch (a.aH(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        break;
      case 2:
        str = a.o(paramParcel, n);
        break;
      case 3:
        k = a.g(paramParcel, n);
        break;
      case 4:
        j = a.g(paramParcel, n);
        break;
      case 5:
        bool = a.c(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new gs(m, str, k, j, bool);
  }

  public gs[] w(int paramInt)
  {
    return new gs[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gt
 * JD-Core Version:    0.6.0
 */