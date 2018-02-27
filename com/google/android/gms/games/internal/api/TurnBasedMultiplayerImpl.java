package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult;
import java.util.List;

public final class TurnBasedMultiplayerImpl
  implements TurnBasedMultiplayer
{
  public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> acceptInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new InitiateMatchImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.d(this, this.aaC);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.CancelMatchResult> cancelMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new CancelMatchImpl(paramString, paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.f(this, this.abU);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> createMatch(GoogleApiClient paramGoogleApiClient, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    return paramGoogleApiClient.b(new InitiateMatchImpl(paramGoogleApiClient, paramTurnBasedMatchConfig)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abS);
      }
    });
  }

  public void declineInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Games.d(paramGoogleApiClient).q(paramString, 1);
  }

  public void dismissInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Games.d(paramGoogleApiClient).p(paramString, 1);
  }

  public void dismissMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Games.d(paramGoogleApiClient).bA(paramString);
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return finishMatch(paramGoogleApiClient, paramString, null, (ParticipantResult[])null);
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, List<ParticipantResult> paramList)
  {
    if (paramList == null);
    for (ParticipantResult[] arrayOfParticipantResult = null; ; arrayOfParticipantResult = (ParticipantResult[])paramList.toArray(new ParticipantResult[paramList.size()]))
      return finishMatch(paramGoogleApiClient, paramString, paramArrayOfByte, arrayOfParticipantResult);
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> finishMatch(GoogleApiClient paramGoogleApiClient, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult)
  {
    return paramGoogleApiClient.b(new UpdateMatchImpl(paramGoogleApiClient, paramString, paramArrayOfByte, paramArrayOfParticipantResult)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abU, this.abX, this.abZ);
      }
    });
  }

  public Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).ln();
  }

  public int getMaxMatchDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lx();
  }

  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2)
  {
    return Games.d(paramGoogleApiClient).a(paramInt1, paramInt2, true);
  }

  public Intent getSelectOpponentsIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    return Games.d(paramGoogleApiClient).a(paramInt1, paramInt2, paramBoolean);
  }

  public PendingResult<TurnBasedMultiplayer.LeaveMatchResult> leaveMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new LeaveMatchImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.e(this, this.abU);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.LeaveMatchResult> leaveMatchDuringTurn(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.b(new LeaveMatchImpl(paramGoogleApiClient, paramString1, paramString2)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abU, this.abY);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.LoadMatchResult> loadMatch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.a(new LoadMatchImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.g(this, this.abU);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.LoadMatchesResult> loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int paramInt, int[] paramArrayOfInt)
  {
    return paramGoogleApiClient.a(new LoadMatchesImpl(paramGoogleApiClient, paramInt, paramArrayOfInt)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abV, this.abW);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.LoadMatchesResult> loadMatchesByStatus(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return loadMatchesByStatus(paramGoogleApiClient, 0, paramArrayOfInt);
  }

  public void registerMatchUpdateListener(GoogleApiClient paramGoogleApiClient, OnTurnBasedMatchUpdateReceivedListener paramOnTurnBasedMatchUpdateReceivedListener)
  {
    d locald = paramGoogleApiClient.d(paramOnTurnBasedMatchUpdateReceivedListener);
    Games.d(paramGoogleApiClient).b(locald);
  }

  public PendingResult<TurnBasedMultiplayer.InitiateMatchResult> rematch(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new InitiateMatchImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.c(this, this.abU);
      }
    });
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, (ParticipantResult[])null);
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, List<ParticipantResult> paramList)
  {
    if (paramList == null);
    for (ParticipantResult[] arrayOfParticipantResult = null; ; arrayOfParticipantResult = (ParticipantResult[])paramList.toArray(new ParticipantResult[paramList.size()]))
      return takeTurn(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, arrayOfParticipantResult);
  }

  public PendingResult<TurnBasedMultiplayer.UpdateMatchResult> takeTurn(GoogleApiClient paramGoogleApiClient, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
  {
    return paramGoogleApiClient.b(new UpdateMatchImpl(paramGoogleApiClient, paramString1, paramArrayOfByte, paramString2, paramArrayOfParticipantResult)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abU, this.abX, this.abY, this.abZ);
      }
    });
  }

  public void unregisterMatchUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    Games.d(paramGoogleApiClient).lq();
  }

  private static abstract class CancelMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.CancelMatchResult>
  {
    private final String CE;

    public CancelMatchImpl(String paramString, GoogleApiClient paramGoogleApiClient)
    {
      super();
      this.CE = paramString;
    }

    public TurnBasedMultiplayer.CancelMatchResult as(Status paramStatus)
    {
      return new TurnBasedMultiplayer.CancelMatchResult(paramStatus)
      {
        public String getMatchId()
        {
          return TurnBasedMultiplayerImpl.CancelMatchImpl.a(TurnBasedMultiplayerImpl.CancelMatchImpl.this);
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class InitiateMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.InitiateMatchResult>
  {
    private InitiateMatchImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public TurnBasedMultiplayer.InitiateMatchResult at(Status paramStatus)
    {
      return new TurnBasedMultiplayer.InitiateMatchResult(paramStatus)
      {
        public TurnBasedMatch getMatch()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class LeaveMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LeaveMatchResult>
  {
    private LeaveMatchImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public TurnBasedMultiplayer.LeaveMatchResult au(Status paramStatus)
    {
      return new TurnBasedMultiplayer.LeaveMatchResult(paramStatus)
      {
        public TurnBasedMatch getMatch()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class LoadMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LoadMatchResult>
  {
    private LoadMatchImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public TurnBasedMultiplayer.LoadMatchResult av(Status paramStatus)
    {
      return new TurnBasedMultiplayer.LoadMatchResult(paramStatus)
      {
        public TurnBasedMatch getMatch()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class LoadMatchesImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.LoadMatchesResult>
  {
    private LoadMatchesImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public TurnBasedMultiplayer.LoadMatchesResult aw(Status paramStatus)
    {
      return new TurnBasedMultiplayer.LoadMatchesResult(paramStatus)
      {
        public LoadMatchesResponse getMatches()
        {
          return new LoadMatchesResponse(new Bundle());
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

  private static abstract class UpdateMatchImpl extends Games.BaseGamesApiMethodImpl<TurnBasedMultiplayer.UpdateMatchResult>
  {
    private UpdateMatchImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public TurnBasedMultiplayer.UpdateMatchResult ax(Status paramStatus)
    {
      return new TurnBasedMultiplayer.UpdateMatchResult(paramStatus)
      {
        public TurnBasedMatch getMatch()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl
 * JD-Core Version:    0.6.0
 */