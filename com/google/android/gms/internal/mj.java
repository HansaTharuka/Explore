package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.HistoryApi;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.e.a;
import com.google.android.gms.fitness.result.DataReadResult;

public class mj
  implements HistoryApi
{
  public PendingResult<Status> deleteData(GoogleApiClient paramGoogleApiClient, DataDeleteRequest paramDataDeleteRequest)
  {
    return paramGoogleApiClient.a(new lu.c(paramGoogleApiClient, paramDataDeleteRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vg, localb, str);
      }
    });
  }

  public PendingResult<Status> insertData(GoogleApiClient paramGoogleApiClient, DataSet paramDataSet)
  {
    return paramGoogleApiClient.a(new lu.c(paramGoogleApiClient, paramDataSet)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new e.a().b(this.Ve).jU(), localb, str);
      }
    });
  }

  public PendingResult<DataReadResult> readData(GoogleApiClient paramGoogleApiClient, DataReadRequest paramDataReadRequest)
  {
    return paramGoogleApiClient.a(new lu.a(paramGoogleApiClient, paramDataReadRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mj.a locala = new mj.a(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vh, locala, str);
      }

      protected DataReadResult x(Status paramStatus)
      {
        return DataReadResult.a(paramStatus, this.Vh);
      }
    });
  }

  private static class a extends lw.a
  {
    private final BaseImplementation.b<DataReadResult> Ea;
    private int Vi = 0;
    private DataReadResult Vj = null;

    private a(BaseImplementation.b<DataReadResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(DataReadResult paramDataReadResult)
    {
      monitorenter;
      try
      {
        Log.v("Fitness", "Received batch result");
        if (this.Vj == null)
          this.Vj = paramDataReadResult;
        while (true)
        {
          this.Vi = (1 + this.Vi);
          if (this.Vi == this.Vj.kr())
            this.Ea.b(this.Vj);
          return;
          this.Vj.b(paramDataReadResult);
        }
      }
      finally
      {
        monitorexit;
      }
      throw localObject;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mj
 * JD-Core Version:    0.6.0
 */