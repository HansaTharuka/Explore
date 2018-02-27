package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.Geofence;
import com.google.android.gms.location.GeofencingApi;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.GeofencingRequest.Builder;
import com.google.android.gms.location.LocationServices.a;
import com.google.android.gms.location.LocationStatusCodes;
import com.google.android.gms.location.c.a;
import com.google.android.gms.location.c.b;
import java.util.List;

public class ng
  implements GeofencingApi
{
  public PendingResult<Status> addGeofences(GoogleApiClient paramGoogleApiClient, GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramGeofencingRequest, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        1 local1 = new c.a()
        {
          public void a(int paramInt, String[] paramArrayOfString)
          {
            ng.1.this.b(LocationStatusCodes.eD(paramInt));
          }
        };
        paramnk.a(this.agL, this.agM, local1);
      }
    });
  }

  @Deprecated
  public PendingResult<Status> addGeofences(GoogleApiClient paramGoogleApiClient, List<Geofence> paramList, PendingIntent paramPendingIntent)
  {
    GeofencingRequest.Builder localBuilder = new GeofencingRequest.Builder();
    localBuilder.addGeofences(paramList);
    localBuilder.setInitialTrigger(5);
    return addGeofences(paramGoogleApiClient, localBuilder.build(), paramPendingIntent);
  }

  public PendingResult<Status> removeGeofences(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        1 local1 = new c.b()
        {
          public void a(int paramInt, PendingIntent paramPendingIntent)
          {
            ng.2.this.b(LocationStatusCodes.eD(paramInt));
          }

          public void b(int paramInt, String[] paramArrayOfString)
          {
            Log.wtf("GeofencingImpl", "Request ID callback shouldn't have been called");
          }
        };
        paramnk.a(this.agM, local1);
      }
    });
  }

  public PendingResult<Status> removeGeofences(GoogleApiClient paramGoogleApiClient, List<String> paramList)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramList)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        1 local1 = new c.b()
        {
          public void a(int paramInt, PendingIntent paramPendingIntent)
          {
            Log.wtf("GeofencingImpl", "PendingIntent callback shouldn't have been called");
          }

          public void b(int paramInt, String[] paramArrayOfString)
          {
            ng.3.this.b(LocationStatusCodes.eD(paramInt));
          }
        };
        paramnk.a(this.agQ, local1);
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
 * Qualified Name:     com.google.android.gms.internal.ng
 * JD-Core Version:    0.6.0
 */