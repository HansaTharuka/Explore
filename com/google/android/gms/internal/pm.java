package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import java.util.HashSet;
import java.util.Set;

public class pm
  implements Parcelable.Creator<pi.b.a>
{
  static void a(pi.b.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    Set localSet = parama.aon;
    if (localSet.contains(Integer.valueOf(1)))
      b.c(paramParcel, 1, parama.CK);
    if (localSet.contains(Integer.valueOf(2)))
      b.c(paramParcel, 2, parama.apJ);
    if (localSet.contains(Integer.valueOf(3)))
      b.c(paramParcel, 3, parama.apK);
    b.H(paramParcel, i);
  }

  public pi.b.a dC(Parcel paramParcel)
  {
    int i = 0;
    int j = a.G(paramParcel);
    HashSet localHashSet = new HashSet();
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = a.F(paramParcel);
      switch (a.aH(n))
      {
      default:
        a.b(paramParcel, n);
        break;
      case 1:
        m = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(1));
        break;
      case 2:
        k = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(2));
        break;
      case 3:
        i = a.g(paramParcel, n);
        localHashSet.add(Integer.valueOf(3));
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new a.a("Overread allowed size end=" + j, paramParcel);
    return new pi.b.a(localHashSet, m, k, i);
  }

  public pi.b.a[] fA(int paramInt)
  {
    return new pi.b.a[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pm
 * JD-Core Version:    0.6.0
 */