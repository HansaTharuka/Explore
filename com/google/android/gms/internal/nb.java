package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.ActivityRecognition.a;
import com.google.android.gms.location.ActivityRecognitionApi;

public class nb
  implements ActivityRecognitionApi
{
  public PendingResult<Status> removeActivityUpdates(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.a(this.agB);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> requestActivityUpdates(GoogleApiClient paramGoogleApiClient, long paramLong, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramLong, paramPendingIntent)
    {
      protected void a(nk paramnk)
        throws RemoteException
      {
        paramnk.a(this.agA, this.agB);
        b(Status.Kw);
      }
    });
  }

  private static abstract class a extends ActivityRecognition.a<Status>
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
 * Qualified Name:     com.google.android.gms.internal.nb
 * JD-Core Version:    0.6.0
 */