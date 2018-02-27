package com.google.android.gms.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;

public final class hc
{
  public static final Api.c<hx> CG = new Api.c();
  private static final Api.b<hx, Api.ApiOptions.NoOptions> CH = new Api.b()
  {
    public hx a(Context paramContext, Looper paramLooper, jg paramjg, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      return new hx(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener);
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Api<Api.ApiOptions.NoOptions> CI = new Api(CH, CG, new Scope[0]);
  public static final ht CJ = new hz();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hc
 * JD-Core Version:    0.6.0
 */