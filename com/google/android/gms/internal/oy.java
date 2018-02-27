package com.google.android.gms.internal;

import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Account;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.Plus.a;
import com.google.android.gms.plus.internal.e;

public final class oy
  implements Account
{
  private static e a(GoogleApiClient paramGoogleApiClient, Api.c<e> paramc)
  {
    boolean bool1 = true;
    boolean bool2;
    e locale;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      jx.b(bool2, "GoogleApiClient parameter is required.");
      jx.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      locale = (e)paramGoogleApiClient.a(paramc);
      if (locale == null)
        break label56;
    }
    while (true)
    {
      jx.a(bool1, "GoogleApiClient is not configured to use the Plus.API Api. Pass this into GoogleApiClient.Builder#addApi() to use this feature.");
      return locale;
      bool2 = false;
      break;
      label56: bool1 = false;
    }
  }

  public void clearDefaultAccount(GoogleApiClient paramGoogleApiClient)
  {
    a(paramGoogleApiClient, Plus.DQ).clearDefaultAccount();
  }

  public String getAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient, Plus.DQ).getAccountName();
  }

  public PendingResult<Status> revokeAccessAndDisconnect(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new a(paramGoogleApiClient)
    {
      protected void a(e parame)
      {
        parame.l(this);
      }
    });
  }

  private static abstract class a extends Plus.a<Status>
  {
    private a(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oy
 * JD-Core Version:    0.6.0
 */