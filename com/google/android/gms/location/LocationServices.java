package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.nf;
import com.google.android.gms.internal.ng;
import com.google.android.gms.internal.nk;

public class LocationServices
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  private static final Api.c<nk> DQ = new Api.c();
  private static final Api.b<nk, Api.ApiOptions.NoOptions> DR = new Api.b()
  {
    public nk e(Context paramContext, Looper paramLooper, jg paramjg, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      return new nk(paramContext, paramLooper, paramContext.getPackageName(), paramConnectionCallbacks, paramOnConnectionFailedListener, "locationServices", paramjg.getAccountName());
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };
  public static FusedLocationProviderApi FusedLocationApi;
  public static GeofencingApi GeofencingApi;

  static
  {
    API = new Api(DR, DQ, new Scope[0]);
    FusedLocationApi = new nf();
    GeofencingApi = new ng();
  }

  public static nk f(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    nk localnk;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      jx.b(bool2, "GoogleApiClient parameter is required.");
      localnk = (nk)paramGoogleApiClient.a(DQ);
      if (localnk == null)
        break label44;
    }
    while (true)
    {
      jx.a(bool1, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
      return localnk;
      bool2 = false;
      break;
      label44: bool1 = false;
    }
  }

  public static abstract class a<R extends Result> extends BaseImplementation.a<R, nk>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.LocationServices
 * JD-Core Version:    0.6.0
 */