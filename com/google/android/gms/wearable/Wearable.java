package com.google.android.gms.wearable;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.jg;
import com.google.android.gms.wearable.internal.ah;
import com.google.android.gms.wearable.internal.ak;
import com.google.android.gms.wearable.internal.ay;
import com.google.android.gms.wearable.internal.ba;
import com.google.android.gms.wearable.internal.e;

public class Wearable
{
  public static final Api<WearableOptions> API;
  public static final Api.c<ba> DQ;
  private static final Api.b<ba, WearableOptions> DR;
  public static final DataApi DataApi = new com.google.android.gms.wearable.internal.f();
  public static final MessageApi MessageApi = new ah();
  public static final NodeApi NodeApi = new ak();
  public static final b axl = new e();
  public static final f axm = new ay();

  static
  {
    DQ = new Api.c();
    DR = new Api.b()
    {
      public ba a(Context paramContext, Looper paramLooper, jg paramjg, Wearable.WearableOptions paramWearableOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
      {
        if (paramWearableOptions != null);
        while (true)
        {
          return new ba(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener);
          new Wearable.WearableOptions(new Wearable.WearableOptions.Builder(), null);
        }
      }

      public int getPriority()
      {
        return 2147483647;
      }
    };
    API = new Api(DR, DQ, new Scope[0]);
  }

  public static final class WearableOptions
    implements Api.ApiOptions.Optional
  {
    private WearableOptions(Builder paramBuilder)
    {
    }

    public static class Builder
    {
      public Wearable.WearableOptions build()
      {
        return new Wearable.WearableOptions(this, null);
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Wearable
 * JD-Core Version:    0.6.0
 */