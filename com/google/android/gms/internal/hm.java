package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;

public class hm
  implements Parcelable.Creator<hl.a>
{
  static void a(hl.a parama, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.a(paramParcel, 1, parama.Dc, paramInt, false);
    b.c(paramParcel, 1000, parama.CK);
    b.H(paramParcel, i);
  }

  public hl.a[] N(int paramInt)
  {
    return new hl.a[paramInt];
  }

  public hl.a p(Parcel paramParcel)
  {
    int i = a.G(paramParcel);
    int j = 0;
    Account localAccount = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = a.F(paramParcel);
      switch (a.aH(k))
      {
      default:
        a.b(paramParcel, k);
        break;
      case 1:
        localAccount = (Account)a.a(paramParcel, k, Account.CREATOR);
        break;
      case 1000:
        j = a.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new hl.a(j, localAccount);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hm
 * JD-Core Version:    0.6.0
 */