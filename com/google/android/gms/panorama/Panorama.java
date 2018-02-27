package com.google.android.gms.panorama;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.ol;
import com.google.android.gms.internal.om;

public final class Panorama
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  public static final Api.c<om> DQ = new Api.c();
  static final Api.b<om, Api.ApiOptions.NoOptions> DR = new Api.b()
  {
    public om f(Context paramContext, Looper paramLooper, jg paramjg, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      return new om(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener);
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };
  public static final PanoramaApi PanoramaApi;

  static
  {
    API = new Api(DR, DQ, new Scope[0]);
    PanoramaApi = new ol();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.panorama.Panorama
 * JD-Core Version:    0.6.0
 */