package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.panorama.Panorama;
import com.google.android.gms.panorama.PanoramaApi;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

public class ol
  implements PanoramaApi
{
  private static void a(Context paramContext, Uri paramUri)
  {
    paramContext.revokeUriPermission(paramUri, 1);
  }

  private static void a(Context paramContext, ok paramok, oj paramoj, Uri paramUri, Bundle paramBundle)
    throws RemoteException
  {
    paramContext.grantUriPermission("com.google.android.gms", paramUri, 1);
    3 local3 = new oj.a(paramContext, paramUri, paramoj)
    {
      public void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
        throws RemoteException
      {
        ol.b(this.nf, this.amO);
        this.amQ.a(paramInt1, paramBundle, paramInt2, paramIntent);
      }
    };
    try
    {
      paramok.a(local3, paramUri, paramBundle, true);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      a(paramContext, paramUri);
      throw localRemoteException;
    }
    catch (RuntimeException localRuntimeException)
    {
      a(paramContext, paramUri);
    }
    throw localRuntimeException;
  }

  public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfo(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramUri)
    {
      protected void a(Context paramContext, ok paramok)
        throws RemoteException
      {
        paramok.a(new ol.b(this), this.amO, null, false);
      }
    });
  }

  public PendingResult<PanoramaApi.PanoramaResult> loadPanoramaInfoAndGrantAccess(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramUri)
    {
      protected void a(Context paramContext, ok paramok)
        throws RemoteException
      {
        ol.b(paramContext, paramok, new ol.b(this), this.amO, null);
      }
    });
  }

  private static abstract class a extends ol.c<PanoramaApi.PanoramaResult>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    protected PanoramaApi.PanoramaResult ay(Status paramStatus)
    {
      return new on(paramStatus, null);
    }
  }

  private static final class b extends oj.a
  {
    private final BaseImplementation.b<PanoramaApi.PanoramaResult> Ea;

    public b(BaseImplementation.b<PanoramaApi.PanoramaResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
    {
      if (paramBundle != null);
      for (PendingIntent localPendingIntent = (PendingIntent)paramBundle.getParcelable("pendingIntent"); ; localPendingIntent = null)
      {
        Status localStatus = new Status(paramInt1, null, localPendingIntent);
        this.Ea.b(new on(localStatus, paramIntent));
        return;
      }
    }
  }

  private static abstract class c<R extends Result> extends BaseImplementation.a<R, om>
  {
    protected c(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }

    protected abstract void a(Context paramContext, ok paramok)
      throws RemoteException;

    protected final void a(om paramom)
      throws RemoteException
    {
      a(paramom.getContext(), (ok)paramom.hw());
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ol
 * JD-Core Version:    0.6.0
 */