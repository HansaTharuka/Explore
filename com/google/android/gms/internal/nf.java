package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationServices.a;

public class nf
  implements FusedLocationProviderApi
{
  public Location getLastLocation(GoogleApiClient paramGoogleApiClient)
  {
    nk localnk = LocationServices.f(paramGoogleApiClient);
    try
    {
      Location localLocation = localnk.nl();
      return localLocation;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public PendingResult<Status> removeLocationUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.c(this.agB);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> removeLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLocationListener)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.a(this.agG);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLocationRequest, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.b(this.agF, this.agB);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLocationRequest, paramLocationListener)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.a(this.agF, this.agG, null);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> requestLocationUpdates(GoogleApiClient paramGoogleApiClient, LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLocationRequest, paramLocationListener, paramLooper)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.a(this.agF, this.agG, this.agJ);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> setMockLocation(GoogleApiClient paramGoogleApiClient, Location paramLocation)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLocation)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.b(this.agI);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> setMockMode(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramBoolean)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.S(this.agK);
        b(Status.Kw);
      }
    });
  }

  private static abstract class a extends LocationServices.a<Status>
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
 * Qualified Name:     com.google.android.gms.internal.nf
 * JD-Core Version:    0.6.0
 */