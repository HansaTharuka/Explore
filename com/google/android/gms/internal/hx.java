package com.google.android.gms.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class hx extends jl<hu>
{
  public hx(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
  }

  protected hu G(IBinder paramIBinder)
  {
    return hu.a.E(paramIBinder);
  }

  protected void a(jt paramjt, jl.e parame)
    throws RemoteException
  {
    paramjt.b(parame, 6587000, getContext().getPackageName());
  }

  protected String bK()
  {
    return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
  }

  protected String bL()
  {
    return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
  }

  public hu fH()
    throws DeadObjectException
  {
    return (hu)hw();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hx
 * JD-Core Version:    0.6.0
 */