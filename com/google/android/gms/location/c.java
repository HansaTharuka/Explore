package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.internal.nk;

@Deprecated
public class c
  implements GooglePlayServicesClient
{
  private final nk agq;

  public void connect()
  {
    this.agq.connect();
  }

  public void disconnect()
  {
    this.agq.disconnect();
  }

  public boolean isConnected()
  {
    return this.agq.isConnected();
  }

  public boolean isConnecting()
  {
    return this.agq.isConnecting();
  }

  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.agq.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.agq.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.agq.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.agq.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.agq.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.agq.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }

  public static abstract interface a
  {
    public abstract void a(int paramInt, String[] paramArrayOfString);
  }

  public static abstract interface b
  {
    public abstract void a(int paramInt, PendingIntent paramPendingIntent);

    public abstract void b(int paramInt, String[] paramArrayOfString);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.location.c
 * JD-Core Version:    0.6.0
 */