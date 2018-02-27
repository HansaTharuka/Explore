package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.Players.LoadOwnerCoverPhotoUrisResult;
import com.google.android.gms.games.Players.LoadPlayersResult;
import com.google.android.gms.games.Players.LoadProfileSettingsResult;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import com.google.android.gms.games.Players.LoadXpStreamResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class PlayersImpl
  implements Players
{
  public Player getCurrentPlayer(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lj();
  }

  public String getCurrentPlayerId(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).li();
  }

  public Intent getPlayerSearchIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lt();
  }

  public PendingResult<Players.LoadPlayersResult> loadConnectedPlayers(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.ZW);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramInt, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aar, false, this.ZW);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadMoreInvitablePlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramInt)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aar, true, false);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadMoreRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramInt)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, "played_with", this.aar, true, false);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.ZY, false);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadPlayer(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramString, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.ZY, this.ZW);
      }
    });
  }

  public PendingResult<Players.LoadPlayersResult> loadRecentlyPlayedWithPlayers(GoogleApiClient paramGoogleApiClient, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadPlayersImpl(paramGoogleApiClient, paramInt, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, "played_with", this.aar, false, this.ZW);
      }
    });
  }

  private static abstract class LoadOwnerCoverPhotoUrisImpl extends Games.BaseGamesApiMethodImpl<Players.LoadOwnerCoverPhotoUrisResult>
  {
    public Players.LoadOwnerCoverPhotoUrisResult ac(Status paramStatus)
    {
      return new Players.LoadOwnerCoverPhotoUrisResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class LoadPlayersImpl extends Games.BaseGamesApiMethodImpl<Players.LoadPlayersResult>
  {
    private LoadPlayersImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Players.LoadPlayersResult ad(Status paramStatus)
    {
      return new Players.LoadPlayersResult(paramStatus)
      {
        public PlayerBuffer getPlayers()
        {
          return new PlayerBuffer(DataHolder.av(14));
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

  private static abstract class LoadProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadProfileSettingsResult>
  {
    protected Players.LoadProfileSettingsResult ae(Status paramStatus)
    {
      return new Players.LoadProfileSettingsResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }

        public boolean isProfileVisible()
        {
          return true;
        }

        public boolean isVisibilityExplicitlySet()
        {
          return false;
        }
      };
    }
  }

  private static abstract class LoadXpForGameCategoriesResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpForGameCategoriesResult>
  {
    public Players.LoadXpForGameCategoriesResult af(Status paramStatus)
    {
      return new Players.LoadXpForGameCategoriesResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class LoadXpStreamResultImpl extends Games.BaseGamesApiMethodImpl<Players.LoadXpStreamResult>
  {
    public Players.LoadXpStreamResult ag(Status paramStatus)
    {
      return new Players.LoadXpStreamResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class UpdateProfileSettingsResultImpl extends Games.BaseGamesApiMethodImpl<Status>
  {
    protected Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.api.PlayersImpl
 * JD-Core Version:    0.6.0
 */