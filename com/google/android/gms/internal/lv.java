package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public class lv extends jl<lz>
  implements lu
{
  private final String DZ;

  public lv(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, String paramString, String[] paramArrayOfString)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramArrayOfString);
    this.DZ = paramString;
  }

  protected void a(jt paramjt, jl.e parame)
    throws RemoteException
  {
    paramjt.a(parame, 6587000, getContext().getPackageName(), this.DZ, hv(), new Bundle());
  }

  protected lz ar(IBinder paramIBinder)
  {
    return lz.a.av(paramIBinder);
  }

  protected String bK()
  {
    return "com.google.android.gms.fitness.GoogleFitnessService.START";
  }

  protected String bL()
  {
    return "com.google.android.gms.fitness.internal.IGoogleFitnessService";
  }

  public lz jM()
    throws DeadObjectException
  {
    return (lz)hw();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lv
 * JD-Core Version:    0.6.0
 */