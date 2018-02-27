package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class ke
  implements kd
{
  public PendingResult<Status> c(GoogleApiClient paramGoogleApiClient)
  {
    return new kf.a(paramGoogleApiClient)
    {
      protected void a(kg paramkg)
        throws RemoteException
      {
        ((ki)paramkg.hw()).a(new ke.a(this));
      }
    }
    .gE();
  }

  private static class a extends kb
  {
    private final BaseImplementation.b<Status> Ea;

    public a(BaseImplementation.b<Status> paramb)
    {
      this.Ea = paramb;
    }

    public void aI(int paramInt)
      throws RemoteException
    {
      this.Ea.b(new Status(paramInt));
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ke
 * JD-Core Version:    0.6.0
 */