package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.fitness.data.DataSet;

public class f
  implements Parcelable.Creator<e>
{
  static void a(e parame, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.a(paramParcel, 1, parame.jH(), paramInt, false);
    b.c(paramParcel, 1000, parame.getVersionCode());
    b.H(paramParcel, i);
  }

  public e bK(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    int j = 0;
    DataSet localDataSet = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localDataSet = (DataSet)a.a(paramParcel, k, DataSet.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new e(j, localDataSet);
  }

  public e[] de(int paramInt)
  {
    return new e[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.f
 * JD-Core Version:    0.6.0
 */