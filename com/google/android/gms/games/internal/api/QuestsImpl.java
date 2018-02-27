package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.quest.Quests.AcceptQuestResult;
import com.google.android.gms.games.quest.Quests.ClaimMilestoneResult;
import com.google.android.gms.games.quest.Quests.LoadQuestsResult;

public final class QuestsImpl
  implements Quests
{
  public PendingResult<Quests.AcceptQuestResult> accept(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return paramGoogleApiClient.b(new AcceptImpl(paramGoogleApiClient, paramString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.h(this, this.abk);
      }
    });
  }

  public PendingResult<Quests.ClaimMilestoneResult> claim(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    return paramGoogleApiClient.b(new ClaimImpl(paramGoogleApiClient, paramString1, paramString2)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.abk, this.abm);
      }
    });
  }

  public Intent getQuestIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return Games.d(paramGoogleApiClient).bE(paramString);
  }

  public Intent getQuestsIntent(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return Games.d(paramGoogleApiClient).b(paramArrayOfInt);
  }

  public PendingResult<Quests.LoadQuestsResult> load(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadsImpl(paramGoogleApiClient, paramArrayOfInt, paramInt, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abn, this.aaA, this.ZW);
      }
    });
  }

  public PendingResult<Quests.LoadQuestsResult> loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String[] paramArrayOfString)
  {
    return paramGoogleApiClient.a(new LoadsImpl(paramGoogleApiClient, paramBoolean, paramArrayOfString)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this, this.ZW, this.abo);
      }
    });
  }

  public void registerQuestUpdateListener(GoogleApiClient paramGoogleApiClient, QuestUpdateListener paramQuestUpdateListener)
  {
    d locald = paramGoogleApiClient.d(paramQuestUpdateListener);
    Games.d(paramGoogleApiClient).c(locald);
  }

  public void showStateChangedPopup(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Games.d(paramGoogleApiClient).bF(paramString);
  }

  public void unregisterQuestUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    Games.d(paramGoogleApiClient).lr();
  }

  private static abstract class AcceptImpl extends Games.BaseGamesApiMethodImpl<Quests.AcceptQuestResult>
  {
    private AcceptImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Quests.AcceptQuestResult ah(Status paramStatus)
    {
      return new Quests.AcceptQuestResult(paramStatus)
      {
        public Quest getQuest()
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

  private static abstract class ClaimImpl extends Games.BaseGamesApiMethodImpl<Quests.ClaimMilestoneResult>
  {
    private ClaimImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Quests.ClaimMilestoneResult ai(Status paramStatus)
    {
      return new Quests.ClaimMilestoneResult(paramStatus)
      {
        public Milestone getMilestone()
        {
          return null;
        }

        public Quest getQuest()
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

  private static abstract class LoadsImpl extends Games.BaseGamesApiMethodImpl<Quests.LoadQuestsResult>
  {
    private LoadsImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Quests.LoadQuestsResult aj(Status paramStatus)
    {
      return new Quests.LoadQuestsResult(paramStatus)
      {
        public QuestBuffer getQuests()
        {
          return new QuestBuffer(DataHolder.av(this.DS.getStatusCode()));
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
 * Qualified Name:     com.google.android.gms.games.internal.api.QuestsImpl
 * JD-Core Version:    0.6.0
 */