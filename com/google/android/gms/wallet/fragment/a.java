package com.google.android.gms.wallet.fragment;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.wallet.MaskedWallet;
import com.google.android.gms.wallet.MaskedWalletRequest;

public class a
  implements Parcelable.Creator<WalletFragmentInitParams>
{
  static void a(WalletFragmentInitParams paramWalletFragmentInitParams, Parcel paramParcel, int paramInt)
  {
    int i = b.H(paramParcel);
    b.c(paramParcel, 1, paramWalletFragmentInitParams.CK);
    b.a(paramParcel, 2, paramWalletFragmentInitParams.getAccountName(), false);
    b.a(paramParcel, 3, paramWalletFragmentInitParams.getMaskedWalletRequest(), paramInt, false);
    b.c(paramParcel, 4, paramWalletFragmentInitParams.getMaskedWalletRequestCode());
    b.a(paramParcel, 5, paramWalletFragmentInitParams.getMaskedWallet(), paramInt, false);
    b.H(paramParcel, i);
  }

  public WalletFragmentInitParams dZ(Parcel paramParcel)
  {
    MaskedWallet localMaskedWallet = null;
    int i = com.google.android.gms.common.internal.safeparcel.a.G(paramParcel);
    int j = 0;
    int k = -1;
    MaskedWalletRequest localMaskedWalletRequest = null;
    String str = null;
    while (paramParcel.dataPosition() < i)
    {
      int m = com.google.android.gms.common.internal.safeparcel.a.F(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.a.aH(m))
      {
      default:
        com.google.android.gms.common.internal.safeparcel.a.b(paramParcel, m);
        break;
      case 1:
        j = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 2:
        str = com.google.android.gms.common.internal.safeparcel.a.o(paramParcel, m);
        break;
      case 3:
        localMaskedWalletRequest = (MaskedWalletRequest)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, MaskedWalletRequest.CREATOR);
        break;
      case 4:
        k = com.google.android.gms.common.internal.safeparcel.a.g(paramParcel, m);
        break;
      case 5:
        localMaskedWallet = (MaskedWallet)com.google.android.gms.common.internal.safeparcel.a.a(paramParcel, m, MaskedWallet.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new a.a("Overread allowed size end=" + i, paramParcel);
    return new WalletFragmentInitParams(j, str, localMaskedWalletRequest, k, localMaskedWallet);
  }

  public WalletFragmentInitParams[] gh(int paramInt)
  {
    return new WalletFragmentInitParams[paramInt];
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.a
 * JD-Core Version:    0.6.0
 */