package com.google.android.gms.identity.intents;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.HasOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.mw;

public final class Address
{
  public static final Api<AddressOptions> API;
  static final Api.c<mw> DQ = new Api.c();
  private static final Api.b<mw, AddressOptions> DR = new Api.b()
  {
    public mw a(Context paramContext, Looper paramLooper, jg paramjg, Address.AddressOptions paramAddressOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      jx.b(paramContext instanceof Activity, "An Activity must be used for Address APIs");
      if (paramAddressOptions == null)
        paramAddressOptions = new Address.AddressOptions();
      return new mw((Activity)paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramjg.getAccountName(), paramAddressOptions.theme);
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };

  static
  {
    API = new Api(DR, DQ, new Scope[0]);
  }

  public static void requestUserAddress(GoogleApiClient paramGoogleApiClient, UserAddressRequest paramUserAddressRequest, int paramInt)
  {
    paramGoogleApiClient.a(new a(paramGoogleApiClient, paramUserAddressRequest, paramInt)
    {
      protected void a(mw parammw)
        throws RemoteException
      {
        parammw.a(this.afF, this.afG);
        b(Status.Kw);
      }
    });
  }

  public static final class AddressOptions
    implements Api.ApiOptions.HasOptions
  {
    public final int theme;

    public AddressOptions()
    {
      this.theme = 0;
    }

    public AddressOptions(int paramInt)
    {
      this.theme = paramInt;
    }
  }

  private static abstract class a extends BaseImplementation.a<Status, mw>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }

    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.identity.intents.Address
 * JD-Core Version:    0.6.0
 */