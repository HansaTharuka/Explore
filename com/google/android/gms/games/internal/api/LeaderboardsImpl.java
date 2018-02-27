package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult;
import com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult;
import com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;

public final class LeaderboardsImpl
  implements Leaderboards
{
  public Intent getAllLeaderboardsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).ll();
  }

  public Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return getLeaderboardIntent(paramGoogleApiClient, paramString, -1);
  }

  public Intent getLeaderboardIntent(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return Games.d(paramGoogleApiClient).n(paramString, paramInt);
  }

  public PendingResult<Leaderboards.LoadPlayerScoreResult> loadCurrentPlayerLeaderboardScore(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2)
  {
    return paramGoogleApiClient.a(new LoadPlayerScoreImpl(paramGoogleApiClient, paramString, paramInt1, paramInt2)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, null, this.aaF, this.aaG, this.aaH);
      }
    });
  }

  public PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadMetadataImpl(paramGoogleApiClient, paramString, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.aaF, this.ZW);
      }
    });
  }

  public PendingResult<Leaderboards.LeaderboardMetadataResult> loadLeaderboardMetadata(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadMetadataImpl(paramGoogleApiClient, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.ZW);
      }
    });
  }

  public PendingResult<Leaderboards.LoadScoresResult> loadMoreScores(GoogleApiClient paramGoogleApiClient, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    return paramGoogleApiClient.a(new LoadScoresImpl(paramGoogleApiClient, paramLeaderboardScoreBuffer, paramInt1, paramInt2)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aaJ, this.aaI, this.aaK);
      }
    });
  }

  public PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadPlayerCenteredScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }

  public PendingResult<Leaderboards.LoadScoresResult> loadPlayerCenteredScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadScoresImpl(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.aaF, this.aaG, this.aaH, this.aaI, this.ZW);
      }
    });
  }

  public PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    return loadTopScores(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, false);
  }

  public PendingResult<Leaderboards.LoadScoresResult> loadTopScores(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadScoresImpl(paramGoogleApiClient, paramString, paramInt1, paramInt2, paramInt3, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aaF, this.aaG, this.aaH, this.aaI, this.ZW);
      }
    });
  }

  public void submitScore(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    submitScore(paramGoogleApiClient, paramString, paramLong, null);
  }

  public void submitScore(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    Games.d(paramGoogleApiClient).a(null, paramString1, paramLong, paramString2);
  }

  public PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString, long paramLong)
  {
    return submitScoreImmediate(paramGoogleApiClient, paramString, paramLong, null);
  }

  public PendingResult<Leaderboards.SubmitScoreResult> submitScoreImmediate(GoogleApiClient paramGoogleApiClient, String paramString1, long paramLong, String paramString2)
  {
    return paramGoogleApiClient.b(new SubmitScoreImpl(paramGoogleApiClient, paramString1, paramLong, paramString2)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aaF, this.aaL, this.aaM);
      }
    });
  }

  private static abstract class LoadMetadataImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LeaderboardMetadataResult>
  {
    private LoadMetadataImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Leaderboards.LeaderboardMetadataResult U(Status paramStatus)
    {
      return new Leaderboards.LeaderboardMetadataResult(paramStatus)
      {
        public LeaderboardBuffer getLeaderboards()
        {
          return new LeaderboardBuffer(DataHolder.av(14));
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

  private static abstract class LoadPlayerScoreImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LoadPlayerScoreResult>
  {
    private LoadPlayerScoreImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Leaderboards.LoadPlayerScoreResult V(Status paramStatus)
    {
      return new Leaderboards.LoadPlayerScoreResult(paramStatus)
      {
        public LeaderboardScore getScore()
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

  private static abstract class LoadScoresImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.LoadScoresResult>
  {
    private LoadScoresImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Leaderboards.LoadScoresResult W(Status paramStatus)
    {
      return new Leaderboards.LoadScoresResult(paramStatus)
      {
        public Leaderboard getLeaderboard()
        {
          return null;
        }

        public LeaderboardScoreBuffer getScores()
        {
          return new LeaderboardScoreBuffer(DataHolder.av(14));
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

  protected static abstract class SubmitScoreImpl extends Games.BaseGamesApiMethodImpl<Leaderboards.SubmitScoreResult>
  {
    protected SubmitScoreImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Leaderboards.SubmitScoreResult X(Status paramStatus)
    {
      return new Leaderboards.SubmitScoreResult(paramStatus)
      {
        public ScoreSubmissionData getScoreData()
        {
          return new ScoreSubmissionData(DataHolder.av(14));
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
 * Qualified Name:     com.google.android.gms.games.internal.api.LeaderboardsImpl
 * JD-Core Version:    0.6.0
 */