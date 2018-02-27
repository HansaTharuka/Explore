package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;

public class bg extends c
{
  private final BaseImplementation.b<Status> Ea;

  public bg(BaseImplementation.b<Status> paramb)
  {
    this.Ea = paramb;
  }

  public void n(Status paramStatus)
    throws RemoteException
  {
    this.Ea.b(paramStatus);
  }

  public void onSuccess()
    throws RemoteException
  {
    this.Ea.b(Status.Kw);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.bg
 * JD-Core Version:    0.6.0
 */