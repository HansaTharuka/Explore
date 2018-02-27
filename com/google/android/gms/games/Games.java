package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

public final class Games
{
  public static final Api<GamesOptions> API;
  public static final Achievements Achievements;
  static final Api.c<GamesClientImpl> DQ = new Api.c();
  private static final Api.b<GamesClientImpl, GamesOptions> DR = new Api.b()
  {
    public GamesClientImpl a(Context paramContext, Looper paramLooper, jg paramjg, Games.GamesOptions paramGamesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      if (paramGamesOptions == null);
      for (Games.GamesOptions localGamesOptions = new Games.GamesOptions(null); ; localGamesOptions = paramGamesOptions)
        return new GamesClientImpl(paramContext, paramLooper, paramjg.hq(), paramjg.hm(), paramConnectionCallbacks, paramOnConnectionFailedListener, paramjg.hp(), paramjg.hn(), paramjg.hr(), localGamesOptions);
    }

    public int getPriority()
    {
      return 1;
    }
  };
  public static final String EXTRA_PLAYER_IDS = "players";
  public static final Events Events;
  public static final GamesMetadata GamesMetadata;
  public static final Invitations Invitations;
  public static final Leaderboards Leaderboards;
  public static final Notifications Notifications;
  public static final Players Players;
  public static final Quests Quests;
  public static final RealTimeMultiplayer RealTimeMultiplayer;
  public static final Requests Requests;
  public static final Scope SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
  public static final Snapshots Snapshots;
  public static final TurnBasedMultiplayer TurnBasedMultiplayer;
  public static final Scope WV;
  public static final Api<GamesOptions> WW;
  public static final AppContents WX;
  public static final Multiplayer WY;
  public static final Acls WZ;

  static
  {
    Api.b localb1 = DR;
    Api.c localc1 = DQ;
    Scope[] arrayOfScope1 = new Scope[1];
    arrayOfScope1[0] = SCOPE_GAMES;
    API = new Api(localb1, localc1, arrayOfScope1);
    WV = new Scope("https://www.googleapis.com/auth/games.firstparty");
    Api.b localb2 = DR;
    Api.c localc2 = DQ;
    Scope[] arrayOfScope2 = new Scope[1];
    arrayOfScope2[0] = WV;
    WW = new Api(localb2, localc2, arrayOfScope2);
    GamesMetadata = new GamesMetadataImpl();
    Achievements = new AchievementsImpl();
    WX = new AppContentsImpl();
    Events = new EventsImpl();
    Leaderboards = new LeaderboardsImpl();
    Invitations = new InvitationsImpl();
    TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    WY = new MultiplayerImpl();
    Players = new PlayersImpl();
    Notifications = new NotificationsImpl();
    Quests = new QuestsImpl();
    Requests = new RequestsImpl();
    Snapshots = new SnapshotsImpl();
    WZ = new AclsImpl();
  }

  public static GamesClientImpl d(GoogleApiClient paramGoogleApiClient)
  {
    if (paramGoogleApiClient != null);
    for (boolean bool = true; ; bool = false)
    {
      jx.b(bool, "GoogleApiClient parameter is required.");
      jx.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return e(paramGoogleApiClient);
    }
  }

  public static GamesClientImpl e(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = (GamesClientImpl)paramGoogleApiClient.a(DQ);
    if (localGamesClientImpl != null);
    for (boolean bool = true; ; bool = false)
    {
      jx.a(bool, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
      return localGamesClientImpl;
    }
  }

  public static String getAppId(GoogleApiClient paramGoogleApiClient)
  {
    return d(paramGoogleApiClient).lw();
  }

  public static String getCurrentAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return d(paramGoogleApiClient).lh();
  }

  public static int getSdkVariant(GoogleApiClient paramGoogleApiClient)
  {
    return d(paramGoogleApiClient).lv();
  }

  public static Intent getSettingsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return d(paramGoogleApiClient).lu();
  }

  public static void setGravityForPopups(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    d(paramGoogleApiClient).dS(paramInt);
  }

  public static void setViewForPopups(GoogleApiClient paramGoogleApiClient, View paramView)
  {
    jx.i(paramView);
    d(paramGoogleApiClient).k(paramView);
  }

  public static PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new SignOutImpl(paramGoogleApiClient)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.b(this);
      }
    });
  }

  public static abstract class BaseGamesApiMethodImpl<R extends Result> extends BaseImplementation.a<R, GamesClientImpl>
  {
    public BaseGamesApiMethodImpl(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }
  }

  public static final class GamesOptions
    implements Api.ApiOptions.Optional
  {
    public final boolean Xa;
    public final boolean Xb;
    public final int Xc;
    public final boolean Xd;
    public final int Xe;
    public final String Xf;
    public final ArrayList<String> Xg;

    private GamesOptions()
    {
      this.Xa = false;
      this.Xb = true;
      this.Xc = 17;
      this.Xd = false;
      this.Xe = 4368;
      this.Xf = null;
      this.Xg = new ArrayList();
    }

    private GamesOptions(Builder paramBuilder)
    {
      this.Xa = paramBuilder.Xa;
      this.Xb = paramBuilder.Xb;
      this.Xc = paramBuilder.Xc;
      this.Xd = paramBuilder.Xd;
      this.Xe = paramBuilder.Xe;
      this.Xf = paramBuilder.Xf;
      this.Xg = paramBuilder.Xg;
    }

    public static Builder builder()
    {
      return new Builder(null);
    }

    public static final class Builder
    {
      boolean Xa = false;
      boolean Xb = true;
      int Xc = 17;
      boolean Xd = false;
      int Xe = 4368;
      String Xf = null;
      ArrayList<String> Xg = new ArrayList();

      public Games.GamesOptions build()
      {
        return new Games.GamesOptions(this, null);
      }

      public Builder setSdkVariant(int paramInt)
      {
        this.Xe = paramInt;
        return this;
      }

      public Builder setShowConnectingPopup(boolean paramBoolean)
      {
        this.Xb = paramBoolean;
        this.Xc = 17;
        return this;
      }

      public Builder setShowConnectingPopup(boolean paramBoolean, int paramInt)
      {
        this.Xb = paramBoolean;
        this.Xc = paramInt;
        return this;
      }
    }
  }

  private static abstract class SignOutImpl extends Games.BaseGamesApiMethodImpl<Status>
  {
    private SignOutImpl(GoogleApiClient paramGoogleApiClient)
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
 * Qualified Name:     com.google.android.gms.games.Games
 * JD-Core Version:    0.6.0
 */