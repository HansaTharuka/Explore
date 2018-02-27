package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a
  implements ServiceConnection
{
  boolean Is = false;
  private final BlockingQueue<IBinder> It = new LinkedBlockingQueue();

  public IBinder gs()
    throws InterruptedException
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
    if (this.Is)
      throw new IllegalStateException();
    this.Is = true;
    return (IBinder)this.It.take();
  }

  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.It.add(paramIBinder);
  }

  public void onServiceDisconnected(ComponentName paramComponentName)
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.a
 * JD-Core Version:    0.6.0
 */