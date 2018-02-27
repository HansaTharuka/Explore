package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.SensorsApi;
import com.google.android.gms.fitness.data.l;
import com.google.android.gms.fitness.data.l.a;
import com.google.android.gms.fitness.request.DataSourcesRequest;
import com.google.android.gms.fitness.request.OnDataPointListener;
import com.google.android.gms.fitness.request.SensorRequest;
import com.google.android.gms.fitness.request.o;
import com.google.android.gms.fitness.request.q;
import com.google.android.gms.fitness.result.DataSourcesResult;

public class mm
  implements SensorsApi
{
  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, o paramo)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramo)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vq, localb, str);
      }

      protected Status b(Status paramStatus)
      {
        return paramStatus;
      }
    });
  }

  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, q paramq, b paramb)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient, paramb, paramq)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mm.d locald = new mm.d(this, this.Vs, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vt, locald, str);
      }

      protected Status b(Status paramStatus)
      {
        return paramStatus;
      }
    });
  }

  public PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, PendingIntent paramPendingIntent)
  {
    return a(paramGoogleApiClient, new o(paramSensorRequest, null, paramPendingIntent));
  }

  public PendingResult<Status> add(GoogleApiClient paramGoogleApiClient, SensorRequest paramSensorRequest, OnDataPointListener paramOnDataPointListener)
  {
    return a(paramGoogleApiClient, new o(paramSensorRequest, l.a.jG().a(paramOnDataPointListener), null));
  }

  public PendingResult<DataSourcesResult> findDataSources(GoogleApiClient paramGoogleApiClient, DataSourcesRequest paramDataSourcesRequest)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramDataSourcesRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        mm.c localc = new mm.c(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vo, localc, str);
      }

      protected DataSourcesResult z(Status paramStatus)
      {
        return DataSourcesResult.D(paramStatus);
      }
    });
  }

  public PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return a(paramGoogleApiClient, new q(null, paramPendingIntent), null);
  }

  public PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, OnDataPointListener paramOnDataPointListener)
  {
    l locall = l.a.jG().b(paramOnDataPointListener);
    if (locall == null)
      return new me(Status.Kw);
    return a(paramGoogleApiClient, new q(locall, null), new b(paramOnDataPointListener)
    {
      public void jO()
      {
        l.a.jG().c(this.Vr);
      }
    });
  }

  private static abstract class a<R extends Result> extends BaseImplementation.a<R, lu>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }
  }

  private static abstract interface b
  {
    public abstract void jO();
  }

  private static class c extends lx.a
  {
    private final BaseImplementation.b<DataSourcesResult> Ea;

    private c(BaseImplementation.b<DataSourcesResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(DataSourcesResult paramDataSourcesResult)
    {
      this.Ea.b(paramDataSourcesResult);
    }
  }

  private static class d extends md.a
  {
    private final BaseImplementation.b<Status> Ea;
    private final mm.b Vu;

    private d(BaseImplementation.b<Status> paramb, mm.b paramb1)
    {
      this.Ea = paramb;
      this.Vu = paramb1;
    }

    public void j(Status paramStatus)
    {
      if ((this.Vu != null) && (paramStatus.isSuccess()))
        this.Vu.jO();
      this.Ea.b(paramStatus);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mm
 * JD-Core Version:    0.6.0
 */