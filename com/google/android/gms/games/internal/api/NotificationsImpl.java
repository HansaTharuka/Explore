package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Notifications;
import com.google.android.gms.games.Notifications.ContactSettingLoadResult;
import com.google.android.gms.games.Notifications.GameMuteStatusChangeResult;
import com.google.android.gms.games.Notifications.GameMuteStatusLoadResult;
import com.google.android.gms.games.Notifications.InboxCountResult;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class NotificationsImpl
  implements Notifications
{
  public void clear(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    Games.d(paramGoogleApiClient).dT(paramInt);
  }

  public void clearAll(GoogleApiClient paramGoogleApiClient)
  {
    clear(paramGoogleApiClient, 31);
  }

  private static abstract class ContactSettingLoadImpl extends Games.BaseGamesApiMethodImpl<Notifications.ContactSettingLoadResult>
  {
    public Notifications.ContactSettingLoadResult aa(Status paramStatus)
    {
      return new Notifications.ContactSettingLoadResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class ContactSettingUpdateImpl extends Games.BaseGamesApiMethodImpl<Status>
  {
    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }

  private static abstract class InboxCountImpl extends Games.BaseGamesApiMethodImpl<Notifications.InboxCountResult>
  {
    public Notifications.InboxCountResult ab(Status paramStatus)
    {
      return new Notifications.InboxCountResult(paramStatus)
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
 * Qualified Name:     com.google.android.gms.games.internal.api.NotificationsImpl
 * JD-Core Version:    0.6.0
 */