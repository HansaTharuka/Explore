package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.BleApi;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.fitness.request.BleScanCallback;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.ad;
import com.google.android.gms.fitness.request.ah;
import com.google.android.gms.fitness.request.b;
import com.google.android.gms.fitness.result.BleDevicesResult;

public class mh
  implements BleApi
{
  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramBleDevice)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new b(this.Va), localb, str);
      }
    });
  }

  public PendingResult<Status> claimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramString)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new b(this.UZ), localb, str);
      }
    });
  }

  public PendingResult<BleDevicesResult> listClaimedBleDevices(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new lu.a(paramGoogleApiClient)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mh.a locala = new mh.a(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(locala, str);
      }

      protected BleDevicesResult v(Status paramStatus)
      {
        return BleDevicesResult.C(paramStatus);
      }
    });
  }

  public PendingResult<Status> startBleScan(GoogleApiClient paramGoogleApiClient, StartBleScanRequest paramStartBleScanRequest)
  {
    return paramGoogleApiClient.a(new lu.c(paramGoogleApiClient, paramStartBleScanRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.UW, localb, str);
      }
    });
  }

  public PendingResult<Status> stopBleScan(GoogleApiClient paramGoogleApiClient, BleScanCallback paramBleScanCallback)
  {
    return paramGoogleApiClient.a(new lu.c(paramGoogleApiClient, paramBleScanCallback)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        ad localad = new ad(this.UY);
        paramlu.jM().a(localad, localb, str);
      }
    });
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, BleDevice paramBleDevice)
  {
    return unclaimBleDevice(paramGoogleApiClient, paramBleDevice.getAddress());
  }

  public PendingResult<Status> unclaimBleDevice(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramString)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new ah(this.UZ), localb, str);
      }
    });
  }

  private static class a extends mp.a
  {
    private final BaseImplementation.b<BleDevicesResult> Ea;

    private a(BaseImplementation.b<BleDevicesResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(BleDevicesResult paramBleDevicesResult)
    {
      this.Ea.b(paramBleDevicesResult);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mh
 * JD-Core Version:    0.6.0
 */