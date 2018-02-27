package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.SessionsApi;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.request.aa;
import com.google.android.gms.fitness.request.u;
import com.google.android.gms.fitness.request.w.a;
import com.google.android.gms.fitness.request.y.a;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;

public class mn
  implements SessionsApi
{
  private PendingResult<SessionStopResult> a(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.b(new lu.a(paramGoogleApiClient, paramString1, paramString2)
    {
      protected SessionStopResult A(Status paramStatus)
      {
        return SessionStopResult.H(paramStatus);
      }

      protected void a(lu paramlu)
        throws RemoteException
      {
        mn.b localb = new mn.b(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new y.a().bx(this.val$name).by(this.Vx).kl(), localb, str);
      }
    });
  }

  public PendingResult<Status> insertSession(GoogleApiClient paramGoogleApiClient, SessionInsertRequest paramSessionInsertRequest)
  {
    return paramGoogleApiClient.a(new lu.c(paramGoogleApiClient, paramSessionInsertRequest)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vy, localb, str);
      }
    });
  }

  public PendingResult<SessionReadResult> readSession(GoogleApiClient paramGoogleApiClient, SessionReadRequest paramSessionReadRequest)
  {
    return paramGoogleApiClient.a(new lu.a(paramGoogleApiClient, paramSessionReadRequest)
    {
      protected SessionReadResult B(Status paramStatus)
      {
        return SessionReadResult.G(paramStatus);
      }

      protected void a(lu paramlu)
        throws RemoteException
      {
        mn.a locala = new mn.a(this, null);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(this.Vz, locala, str);
      }
    });
  }

  public PendingResult<Status> registerForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramPendingIntent)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        u localu = new u(this.VA);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(localu, localb, str);
      }
    });
  }

  public PendingResult<Status> startSession(GoogleApiClient paramGoogleApiClient, Session paramSession)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramSession)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(new w.a().b(this.Vv).kk(), localb, str);
      }
    });
  }

  public PendingResult<SessionStopResult> stopSession(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return a(paramGoogleApiClient, null, paramString);
  }

  public PendingResult<Status> unregisterForSessions(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent)
  {
    return paramGoogleApiClient.b(new lu.c(paramGoogleApiClient, paramPendingIntent)
    {
      protected void a(lu paramlu)
        throws RemoteException
      {
        lu.b localb = new lu.b(this);
        aa localaa = new aa(this.VA);
        String str = paramlu.getContext().getPackageName();
        paramlu.jM().a(localaa, localb, str);
      }
    });
  }

  private static class a extends mb.a
  {
    private final BaseImplementation.b<SessionReadResult> Ea;

    private a(BaseImplementation.b<SessionReadResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(SessionReadResult paramSessionReadResult)
      throws RemoteException
    {
      this.Ea.b(paramSessionReadResult);
    }
  }

  private static class b extends mc.a
  {
    private final BaseImplementation.b<SessionStopResult> Ea;

    private b(BaseImplementation.b<SessionStopResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(SessionStopResult paramSessionStopResult)
    {
      this.Ea.b(paramSessionStopResult);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mn
 * JD-Core Version:    0.6.0
 */