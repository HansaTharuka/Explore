package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult;
import com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult;
import com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult;

public final class SnapshotsImpl
  implements Snapshots
{
  public PendingResult<Snapshots.CommitSnapshotResult> commitAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    return paramGoogleApiClient.b(new CommitImpl(paramGoogleApiClient, paramSnapshot, paramSnapshotMetadataChange)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abI, this.abJ);
      }
    });
  }

  public PendingResult<Snapshots.DeleteSnapshotResult> delete(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    return paramGoogleApiClient.b(new DeleteImpl(paramGoogleApiClient, paramSnapshotMetadata)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.i(this, this.abK.getSnapshotId());
      }
    });
  }

  public void discardAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot)
  {
    Games.d(paramGoogleApiClient).a(paramSnapshot);
  }

  public int getMaxCoverImageSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lC();
  }

  public int getMaxDataSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lB();
  }

  public Intent getSelectSnapshotIntent(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    return Games.d(paramGoogleApiClient).a(paramString, paramBoolean1, paramBoolean2, paramInt);
  }

  public SnapshotMetadata getSnapshotFromBundle(Bundle paramBundle)
  {
    if ((paramBundle == null) || (!paramBundle.containsKey("com.google.android.gms.games.SNAPSHOT_METADATA")))
      return null;
    return (SnapshotMetadata)paramBundle.getParcelable("com.google.android.gms.games.SNAPSHOT_METADATA");
  }

  public PendingResult<Snapshots.LoadSnapshotsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return paramGoogleApiClient.a(new LoadImpl(paramGoogleApiClient, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.e(this, this.ZW);
      }
    });
  }

  public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata)
  {
    return open(paramGoogleApiClient, paramSnapshotMetadata.getUniqueName(), false);
  }

  public PendingResult<Snapshots.OpenSnapshotResult> open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean)
  {
    return paramGoogleApiClient.b(new OpenImpl(paramGoogleApiClient, paramString, paramBoolean)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.c(this, this.abG, this.abH);
      }
    });
  }

  public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString, Snapshot paramSnapshot)
  {
    SnapshotMetadata localSnapshotMetadata = paramSnapshot.getMetadata();
    SnapshotMetadataChange localSnapshotMetadataChange = new SnapshotMetadataChange.Builder().fromMetadata(localSnapshotMetadata).build();
    return resolveConflict(paramGoogleApiClient, paramString, localSnapshotMetadata.getSnapshotId(), localSnapshotMetadataChange, paramSnapshot.getSnapshotContents());
  }

  public PendingResult<Snapshots.OpenSnapshotResult> resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    return paramGoogleApiClient.b(new OpenImpl(paramGoogleApiClient, paramString1, paramString2, paramSnapshotMetadataChange, paramSnapshotContents)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
        throws RemoteException
      {
        paramGamesClientImpl.a(this, this.abL, this.abM, this.abJ, this.abN);
      }
    });
  }

  private static abstract class CommitImpl extends Games.BaseGamesApiMethodImpl<Snapshots.CommitSnapshotResult>
  {
    private CommitImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Snapshots.CommitSnapshotResult ao(Status paramStatus)
    {
      return new Snapshots.CommitSnapshotResult(paramStatus)
      {
        public SnapshotMetadata getSnapshotMetadata()
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

  private static abstract class DeleteImpl extends Games.BaseGamesApiMethodImpl<Snapshots.DeleteSnapshotResult>
  {
    private DeleteImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Snapshots.DeleteSnapshotResult ap(Status paramStatus)
    {
      return new Snapshots.DeleteSnapshotResult(paramStatus)
      {
        public String getSnapshotId()
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

  private static abstract class LoadImpl extends Games.BaseGamesApiMethodImpl<Snapshots.LoadSnapshotsResult>
  {
    private LoadImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Snapshots.LoadSnapshotsResult aq(Status paramStatus)
    {
      return new Snapshots.LoadSnapshotsResult(paramStatus)
      {
        public SnapshotMetadataBuffer getSnapshots()
        {
          return new SnapshotMetadataBuffer(DataHolder.av(14));
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

  private static abstract class OpenImpl extends Games.BaseGamesApiMethodImpl<Snapshots.OpenSnapshotResult>
  {
    private OpenImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Snapshots.OpenSnapshotResult ar(Status paramStatus)
    {
      return new Snapshots.OpenSnapshotResult(paramStatus)
      {
        public String getConflictId()
        {
          return null;
        }

        public Snapshot getConflictingSnapshot()
        {
          return null;
        }

        public SnapshotContents getResolutionSnapshotContents()
        {
          return null;
        }

        public Snapshot getSnapshot()
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
 * Qualified Name:     com.google.android.gms.games.internal.api.SnapshotsImpl
 * JD-Core Version:    0.6.0
 */