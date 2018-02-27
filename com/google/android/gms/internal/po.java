package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class po
  implements Parcelable.Creator<pi.c>
{
  static void a(pi.c paramc, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    Set localSet = paramc.aon;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, paramc.CK);
    if (localSet.contains(Integer.valueOf(2)))
      b.a(paramParcel, 2, paramc.vf, true);
    b.H(paramParcel, i);
  }

  public pi.c dE(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    HashSet localHashSet = new HashSet();
    int j = 0;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        j = a.g(paramParcel, k);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        str = a.o(paramParcel, k);
        localHashSet.add(Integer.valueOf(2));
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new pi.c(localHashSet, j, str);
  }

  public pi.c[] fC(int paramInt)
  {
    return new pi.c[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.po
 * JD-Core Version:    0.6.0
 */