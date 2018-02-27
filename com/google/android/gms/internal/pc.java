package com.google.android.gms.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.People;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.Plus.a;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

public final class pc
  implements People
{
  public Person getCurrentPerson(GoogleApiClient paramGoogleApiClient)
  {
    return Plus.a(paramGoogleApiClient, Plus.DQ).getCurrentPerson();
  }

  public PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, Collection<String> paramCollection)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramCollection)
    {
      protected void a(e parame)
      {
        parame.a(this, this.aoj);
      }
    });
  }

  public PendingResult<People.LoadPeopleResult> load(GoogleApiClient paramGoogleApiClient, String[] paramArrayOfString)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramArrayOfString)
    {
      protected void a(e parame)
      {
        parame.d(this, this.aok);
      }
    });
  }

  public PendingResult<People.LoadPeopleResult> loadConnected(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient)
    {
      protected void a(e parame)
      {
        parame.k(this);
      }
    });
  }

  public PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramInt, paramString)
    {
      protected void a(e parame)
      {
        a(parame.a(this, this.aoh, this.aoa));
      }
    });
  }

  public PendingResult<People.LoadPeopleResult> loadVisible(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramString)
    {
      protected void a(e parame)
      {
        a(parame.q(this, this.aoa));
      }
    });
  }

  private static abstract class a extends Plus.a<People.LoadPeopleResult>
  {
    private a(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public People.LoadPeopleResult aC(Status paramStatus)
    {
      return new People.LoadPeopleResult(paramStatus)
      {
        public String getNextPageToken()
        {
          return null;
        }

        public PersonBuffer getPersonBuffer()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }

        public void release()
        {
        }
      };
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pc
 * JD-Core Version:    0.6.0
 */