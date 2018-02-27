package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.Moments;
import com.google.android.gms.plus.Moments.LoadMomentsResult;
import com.google.android.gms.plus.Plus.a;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public final class pb
  implements Moments
{
  public PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient)
    {
      protected void a(e parame)
      {
        parame.j(this);
      }
    });
  }

  public PendingResult<Moments.LoadMomentsResult> load(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramInt, paramString1, paramUri, paramString2, paramString3)
    {
      protected void a(e parame)
      {
        parame.a(this, this.aaI, this.aoa, this.aob, this.aoc, this.aod);
      }
    });
  }

  public PendingResult<Status> remove(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramString)
    {
      protected void a(e parame)
      {
        parame.removeMoment(this.aof);
        b(Status.Kw);
      }
    });
  }

  public PendingResult<Status> write(GoogleApiClient paramGoogleApiClient, Moment paramMoment)
  {
    return paramGoogleApiClient.b(new c(paramGoogleApiClient, paramMoment)
    {
      protected void a(e parame)
      {
        parame.a(this, this.aoe);
      }
    });
  }

  private static abstract class a extends Plus.a<Moments.LoadMomentsResult>
  {
    private a(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Moments.LoadMomentsResult aB(Status paramStatus)
    {
      return new Moments.LoadMomentsResult(paramStatus)
      {
        public MomentBuffer getMomentBuffer()
        {
          return null;
        }

        public String getNextPageToken()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }

        public String getUpdated()
        {
          return null;
        }

        public void release()
        {
        }
      };
    }
  }

  private static abstract class b extends Plus.a<Status>
  {
    private b(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }

  private static abstract class c extends Plus.a<Status>
  {
    private c(GoogleApiClient paramGoogleApiClient)
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
 * Qualified Name:     com.google.android.gms.internal.pb
 * JD-Core Version:    0.6.0
 */