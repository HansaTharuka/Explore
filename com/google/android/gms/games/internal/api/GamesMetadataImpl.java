package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.GamesMetadata.LoadExtendedGamesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult;
import com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class GamesMetadataImpl
  implements GamesMetadata
{
  public Game getCurrentGame(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lk();
  }

  public PendingResult<GamesMetadata.LoadGamesResult> loadGame(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new LoadGamesImpl(paramGoogleApiClient)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.f(this);
      }
    });
  }

  private static abstract class LoadExtendedGamesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadExtendedGamesResult>
  {
    public GamesMetadata.LoadExtendedGamesResult P(Status paramStatus)
    {
      return new GamesMetadata.LoadExtendedGamesResult(paramStatus)
      {
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

  private static abstract class LoadGameInstancesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGameInstancesResult>
  {
    public GamesMetadata.LoadGameInstancesResult Q(Status paramStatus)
    {
      return new GamesMetadata.LoadGameInstancesResult(paramStatus)
      {
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

  private static abstract class LoadGameSearchSuggestionsImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGameSearchSuggestionsResult>
  {
    public GamesMetadata.LoadGameSearchSuggestionsResult R(Status paramStatus)
    {
      return new GamesMetadata.LoadGameSearchSuggestionsResult(paramStatus)
      {
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

  private static abstract class LoadGamesImpl extends Games.BaseGamesApiMethodImpl<GamesMetadata.LoadGamesResult>
  {
    private LoadGamesImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public GamesMetadata.LoadGamesResult S(Status paramStatus)
    {
      return new GamesMetadata.LoadGamesResult(paramStatus)
      {
        public GameBuffer getGames()
        {
          return new GameBuffer(DataHolder.av(14));
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
 * Qualified Name:     com.google.android.gms.games.internal.api.GamesMetadataImpl
 * JD-Core Version:    0.6.0
 */