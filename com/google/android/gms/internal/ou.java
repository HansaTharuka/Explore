package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public class ou
  implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
{
  private ox amU;
  private final op.a ane;
  private boolean anf;

  public ou(op.a parama)
  {
    this.ane = parama;
    this.amU = null;
    this.anf = true;
  }

  public void T(boolean paramBoolean)
  {
    this.anf = paramBoolean;
  }

  public void a(ox paramox)
  {
    this.amU = paramox;
  }

  public void onConnected(Bundle paramBundle)
  {
    this.amU.U(false);
    if ((this.anf) && (this.ane != null))
      this.ane.on();
    this.anf = false;
  }

  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.amU.U(true);
    if ((this.anf) && (this.ane != null))
    {
      if (!paramConnectionResult.hasResolution())
        break label48;
      this.ane.d(paramConnectionResult.getResolution());
    }
    while (true)
    {
      this.anf = false;
      return;
      label48: this.ane.oo();
    }
  }

  public void onDisconnected()
  {
    this.amU.U(true);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ou
 * JD-Core Version:    0.6.0
 */