package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;

abstract class q<R extends Result> extends BaseImplementation.a<R, r>
{
  public q(GoogleApiClient paramGoogleApiClient)
  {
    super(Drive.DQ, paramGoogleApiClient);
  }

  static abstract class a extends q<Status>
  {
    a(GoogleApiClient paramGoogleApiClient)
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
 * Qualified Name:     com.google.android.gms.drive.internal.q
 * JD-Core Version:    0.6.0
 */