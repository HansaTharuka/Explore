package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

@ey
public abstract class ff extends gf
{
  private final fh qh;
  private final fe.a tI;

  public ff(fh paramfh, fe.a parama)
  {
    this.qh = paramfh;
    this.tI = parama;
  }

  private static fj a(fl paramfl, fh paramfh)
  {
    try
    {
      fj localfj = paramfl.b(paramfh);
      return localfj;
    }
    catch (RemoteException localRemoteException)
    {
      gr.d("Could not fetch ad response from ad request service.", localRemoteException);
      return null;
    }
    catch (NullPointerException localNullPointerException)
    {
      gr.d("Could not fetch ad response from ad request service due to an Exception.", localNullPointerException);
      return null;
    }
    catch (SecurityException localSecurityException)
    {
      gr.d("Could not fetch ad response from ad request service due to an Exception.", localSecurityException);
      return null;
    }
    catch (Throwable localThrowable)
    {
      ga.e(localThrowable);
    }
    return null;
  }

  public abstract void cJ();

  public abstract fl cK();

  public final void cx()
  {
    try
    {
      fl localfl = cK();
      fj localfj;
      if (localfl == null)
        localfj = new fj(0);
      while (true)
      {
        cJ();
        this.tI.a(localfj);
        return;
        localfj = a(localfl, this.qh);
        if (localfj != null)
          continue;
        localfj = new fj(0);
      }
    }
    finally
    {
      cJ();
    }
    throw localObject;
  }

  public final void onStop()
  {
    cJ();
  }

  @ey
  public static final class a extends ff
  {
    private final Context mContext;

    public a(Context paramContext, fh paramfh, fe.a parama)
    {
      super(parama);
      this.mContext = paramContext;
    }

    public void cJ()
    {
    }

    public fl cK()
    {
      Bundle localBundle = ga.bN();
      bm localbm = new bm(localBundle.getString("gads:sdk_core_location"), localBundle.getString("gads:sdk_core_experiment_id"), localBundle.getString("gads:block_autoclicks_experiment_id"), localBundle.getString("gads:spam_app_context:experiment_id"));
      return fq.a(this.mContext, localbm, new co(), new fx());
    }
  }

  @ey
  public static final class b extends ff
    implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
  {
    private final Object mH = new Object();
    private final fe.a tI;
    private final fg tJ;

    public b(Context paramContext, fh paramfh, fe.a parama)
    {
      super(parama);
      this.tI = parama;
      this.tJ = new fg(paramContext, this, this, paramfh.lO.wU);
      this.tJ.connect();
    }

    public void cJ()
    {
      synchronized (this.mH)
      {
        if ((this.tJ.isConnected()) || (this.tJ.isConnecting()))
          this.tJ.disconnect();
        return;
      }
    }

    public fl cK()
    {
      synchronized (this.mH)
      {
        try
        {
          fl localfl = this.tJ.cL();
          return localfl;
        }
        catch (DeadObjectException localDeadObjectException)
        {
          return null;
        }
      }
    }

    public void onConnected(Bundle paramBundle)
    {
      start();
    }

    public void onConnectionFailed(ConnectionResult paramConnectionResult)
    {
      this.tI.a(new fj(0));
    }

    public void onConnectionSuspended(int paramInt)
    {
      gr.S("Disconnected from remote ad request service.");
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ff
 * JD-Core Version:    0.6.0
 */