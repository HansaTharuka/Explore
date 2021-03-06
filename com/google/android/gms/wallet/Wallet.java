package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.pv;
import com.google.android.gms.internal.qg;
import com.google.android.gms.internal.qh;
import com.google.android.gms.internal.qj;
import com.google.android.gms.internal.qk;
import com.google.android.gms.wallet.wobs.r;
import java.util.Locale;

public final class Wallet
{
  public static final Api<WalletOptions> API;
  private static final Api.c<qh> DQ = new Api.c();
  private static final Api.b<qh, WalletOptions> DR = new Api.b()
  {
    public qh a(Context paramContext, Looper paramLooper, jg paramjg, Wallet.WalletOptions paramWalletOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      jx.b(paramContext instanceof Activity, "An Activity must be used for Wallet APIs");
      Activity localActivity = (Activity)paramContext;
      if (paramWalletOptions != null);
      while (true)
      {
        return new qh(localActivity, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramWalletOptions.environment, paramjg.getAccountName(), paramWalletOptions.theme);
        paramWalletOptions = new Wallet.WalletOptions(null);
      }
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Payments Payments;
  public static final r avT;
  public static final pv avU;

  static
  {
    API = new Api(DR, DQ, new Scope[0]);
    Payments = new qg();
    avT = new qk();
    avU = new qj();
  }

  @Deprecated
  public static void changeMaskedWallet(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, int paramInt)
  {
    Payments.changeMaskedWallet(paramGoogleApiClient, paramString1, paramString2, paramInt);
  }

  @Deprecated
  public static void checkForPreAuthorization(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    Payments.checkForPreAuthorization(paramGoogleApiClient, paramInt);
  }

  @Deprecated
  public static void loadFullWallet(GoogleApiClient paramGoogleApiClient, FullWalletRequest paramFullWalletRequest, int paramInt)
  {
    Payments.loadFullWallet(paramGoogleApiClient, paramFullWalletRequest, paramInt);
  }

  @Deprecated
  public static void loadMaskedWallet(GoogleApiClient paramGoogleApiClient, MaskedWalletRequest paramMaskedWalletRequest, int paramInt)
  {
    Payments.loadMaskedWallet(paramGoogleApiClient, paramMaskedWalletRequest, paramInt);
  }

  @Deprecated
  public static void notifyTransactionStatus(GoogleApiClient paramGoogleApiClient, NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest)
  {
    Payments.notifyTransactionStatus(paramGoogleApiClient, paramNotifyTransactionStatusRequest);
  }

  public static final class WalletOptions
    implements Api.ApiOptions.HasOptions
  {
    public final int environment;
    public final int theme;

    private WalletOptions()
    {
      this(new Builder());
    }

    private WalletOptions(Builder paramBuilder)
    {
      this.environment = Builder.a(paramBuilder);
      this.theme = Builder.b(paramBuilder);
    }

    public static final class Builder
    {
      private int avV = 0;
      private int mTheme = 0;

      public Wallet.WalletOptions build()
      {
        return new Wallet.WalletOptions(this, null);
      }

      public Builder setEnvironment(int paramInt)
      {
        if ((paramInt == 0) || (paramInt == 2) || (paramInt == 1))
        {
          this.avV = paramInt;
          return this;
        }
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        throw new IllegalArgumentException(String.format(localLocale, "Invalid environment value %d", arrayOfObject));
      }

      public Builder setTheme(int paramInt)
      {
        if ((paramInt == 0) || (paramInt == 1))
        {
          this.mTheme = paramInt;
          return this;
        }
        Locale localLocale = Locale.US;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramInt);
        throw new IllegalArgumentException(String.format(localLocale, "Invalid theme value %d", arrayOfObject));
      }
    }
  }

  public static abstract class a<R extends Result> extends BaseImplementation.a<R, qh>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }
  }

  public static abstract class b extends Wallet.a<Status>
  {
    public b(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    protected Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.Wallet
 * JD-Core Version:    0.6.0
 */