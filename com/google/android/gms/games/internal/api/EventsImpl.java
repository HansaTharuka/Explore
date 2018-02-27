package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.event.Events.LoadEventsResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
  implements Events
{
  public void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    GamesClientImpl localGamesClientImpl = Games.e(paramGoogleApiClient);
    if (localGamesClientImpl.isConnected())
    {
      localGamesClientImpl.o(paramString, paramInt);
      return;
    }
    paramGoogleApiClient.b(new UpdateImpl(paramGoogleApiClient, paramString, paramInt)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.o(this.aal, this.aam);
      }
    });
  }

  public PendingResult<Events.LoadEventsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadImpl(paramGoogleApiClient, paramBoolean)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.d(this, this.ZW);
      }
    });
  }

  public PendingResult<Events.LoadEventsResult> loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String[] paramArrayOfString)
  {
    return paramGoogleApiClient.a(new LoadImpl(paramGoogleApiClient, paramBoolean, paramArrayOfString)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.ZW, this.aaj);
      }
    });
  }

  private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Events.LoadEventsResult>
  {
    private LoadImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Events.LoadEventsResult O(Status paramStatus)
    {
      return new Events.LoadEventsResult(paramStatus)
      {
        public EventBuffer getEvents()
        {
          return new EventBuffer(DataHolder.av(14));
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

  private static abstract class UpdateImpl extends Games.BaseGamesApiMethodImpl<Result>
  {
    private UpdateImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Result c(Status paramStatus)
    {
      return new Result(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.api.EventsImpl
 * JD-Core Version:    0.6.0
 */