package com.google.android.gms.internal;

import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

abstract class kf<R extends Result> extends BaseImplementation.a<R, kg>
{
  public kf(GoogleApiClient paramGoogleApiClient)
  {
    super(kc.DQ, paramGoogleApiClient);
  }

  static abstract class a extends kf<Status>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.kf
 * JD-Core Version:    0.6.0
 */