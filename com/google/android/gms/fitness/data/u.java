package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class u
  implements Parcelable.Creator<Value>
{
  static void a(Value paramValue, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1, paramValue.getFormat());
    b.c(paramParcel, 1000, paramValue.getVersionCode());
    b.a(paramParcel, 2, paramValue.isSet());
    b.a(paramParcel, 3, paramValue.jL());
    b.H(paramParcel, i);
  }

  public Value bF(Parcel paramParcel)
  {
    boolean bool = false;
    int i = a.G(paramParcel);
    float f = 0.0F;
    int j = 0;
    int k = 0;
    while (paramParcel.dataPosition() < i)
    {
      int m = a.F(paramParcel);
      switch (a.aH(m))
      {
      default:
        a.b(paramParcel, m);
        break;
      case 1:
        j = a.g(paramParcel, m);
        break;
      case 1000:
        k = a.g(paramParcel, m);
        break;
      case 2:
        bool = a.c(paramParcel, m);
        break;
      case 3:
        f = a.l(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new Value(k, j, bool, f);
  }

  public Value[] cZ(int paramInt)
  {
    return new Value[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.u
 * JD-Core Version:    0.6.0
 */