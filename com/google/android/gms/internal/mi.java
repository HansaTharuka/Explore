package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.ConfigApi;
import com.google.android.gms.fitness.request.DataTypeCreateRequest;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.result.DataTypeResult;

public class mi
  implements ConfigApi
{
  public PendingResult<DataTypeResult> createCustomDataType(GoogleApiClient paramGoogleApiClient, DataTypeCreateRequest paramDataTypeCreateRequest)
  {
    return paramGoogleApiClient.b(new lu.a(paramGoogleApiClient, paramDataTypeCreateRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mi.a locala = new mi.a(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vb, locala, str);
      }

      protected DataTypeResult w(Status paramStatus)
      {
        return DataTypeResult.E(paramStatus);
      }
    });
  }

  public PendingResult<Status> disableFit(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(localb, str);
      }
    });
  }

  public PendingResult<DataTypeResult> readDataType(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.a(new lu.a(paramGoogleApiClient, new j(paramString))
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mi.a locala = new mi.a(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vd, locala, str);
      }

      protected DataTypeResult w(Status paramStatus)
      {
        return DataTypeResult.E(paramStatus);
      }
    });
  }

  private static class a extends ly.a
  {
    private final BaseImplementation.b<DataTypeResult> Ea;

    private a(BaseImplementation.b<DataTypeResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(DataTypeResult paramDataTypeResult)
    {
      this.Ea.b(paramDataTypeResult);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mi
 * JD-Core Version:    0.6.0
 */