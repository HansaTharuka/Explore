package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult;
import com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
  implements Achievements
{
  public Intent getAchievementsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lm();
  }

  public void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString, paramInt)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(null, this.aaa, this.aab);
      }
    });
  }

  public PendingResult<Achievements.UpdateAchievementResult> incrementImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString, paramInt)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aaa, this.aab);
      }
    });
  }

  public PendingResult<Achievements.LoadAchievementsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadImpl(paramGoogleApiClient, paramBoolean)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.c(this, this.ZW);
      }
    });
  }

  public void reveal(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(null, this.aaa);
      }
    });
  }

  public PendingResult<Achievements.UpdateAchievementResult> revealImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.aaa);
      }
    });
  }

  public void setSteps(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString, paramInt)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(null, this.aaa, this.aab);
      }
    });
  }

  public PendingResult<Achievements.UpdateAchievementResult> setStepsImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt)
  {
    return paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString, paramInt)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.aaa, this.aab);
      }
    });
  }

  public void unlock(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(null, this.aaa);
      }
    });
  }

  public PendingResult<Achievements.UpdateAchievementResult> unlockImmediate(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new UpdateImpl(paramString, paramGoogleApiClient, paramString)
    {
      public void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.aaa);
      }
    });
  }

  private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Achievements.LoadAchievementsResult>
  {
    private LoadImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Achievements.LoadAchievementsResult I(Status paramStatus)
    {
      return new Achievements.LoadAchievementsResult(paramStatus)
      {
        public AchievementBuffer getAchievements()
        {
          return new AchievementBuffer(DataHolder.av(14));
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

  private static abstract class UpdateImpl extends Games.BaseGamesApiMethodImpl<Achievements.UpdateAchievementResult>
  {
    private final String CE;

    public UpdateImpl(String paramString, GoogleApiClient paramGoogleApiClient)
    {
      super();
      this.CE = paramString;
    }

    public Achievements.UpdateAchievementResult J(Status paramStatus)
    {
      return new Achievements.UpdateAchievementResult(paramStatus)
      {
        public String getAchievementId()
        {
          return AchievementsImpl.UpdateImpl.a(AchievementsImpl.UpdateImpl.this);
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
 * Qualified Name:     com.google.android.gms.games.internal.api.AchievementsImpl
 * JD-Core Version:    0.6.0
 */