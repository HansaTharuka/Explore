package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.Payments;
import com.google.android.gms.wallet.Wallet.b;

public class qg
  implements Payments
{
  public void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b(paramGoogleApiClient, paramString1, paramString2, paramInt)
    {
      protected void a(qh paramqh)
      {
        paramqh.d(this.awD, this.awE, this.afG);
        b(Status.Kw);
      }
    });
  }

  public void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b(paramGoogleApiClient, paramInt)
    {
      protected void a(qh paramqh)
      {
        paramqh.gk(this.afG);
        b(Status.Kw);
      }
    });
  }

  public void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b(paramGoogleApiClient, paramFullWalletRequest, paramInt)
    {
      protected void a(qh paramqh)
      {
        paramqh.a(this.awC, this.afG);
        b(Status.Kw);
      }
    });
  }

  public void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    paramGoogleApiClient.a(new Wallet.b(paramGoogleApiClient, paramMaskedWalletRequest, paramInt)
    {
      protected void a(qh paramqh)
      {
        paramqh.a(this.awB, this.afG);
        b(Status.Kw);
      }
    });
  }

  public void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    paramGoogleApiClient.a(new Wallet.b(paramGoogleApiClient, paramNotifyTransactionStatusRequest)
    {
      protected void a(qh paramqh)
      {
        paramqh.a(this.awF);
        b(Status.Kw);
      }
    });
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qg
 * JD-Core Version:    0.6.0
 */