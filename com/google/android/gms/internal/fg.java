package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

@ey
public class fg extends jl<fl>
{
  final int qg;

  public fg(Context paramContext, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, int paramInt)
  {
    super(paramContext, paramContext.getMainLooper(), paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
    this.qg = paramInt;
  }

  protected fl B(IBinder paramIBinder)
  {
    return fl.a.C(paramIBinder);
  }

  protected void a(jt paramjt, jl.e parame)
    throws RemoteException
  {
    Bundle localBundle = new Bundle();
    paramjt.g(parame, this.qg, getContext().getPackageName(), localBundle);
  }

  protected String bK()
  {
    return "com.google.android.gms.ads.service.START";
  }

  protected String bL()
  {
    return "com.google.android.gms.ads.internal.request.IAdRequestService";
  }

  public fl cL()
    throws DeadObjectException
  {
    return (fl)super.hw();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fg
 * JD-Core Version:    0.6.0
 */