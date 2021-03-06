package com.google.android.gms.games.snapshot;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Snapshots
{
  public static final int DISPLAY_LIMIT_NONE = -1;
  public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
  public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";

  public abstract PendingResult<CommitSnapshotResult> commitAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange);

  public abstract PendingResult<DeleteSnapshotResult> delete(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata);

  public abstract void discardAndClose(GoogleApiClient paramGoogleApiClient, Snapshot paramSnapshot);

  public abstract int getMaxCoverImageSize(GoogleApiClient paramGoogleApiClient);

  public abstract int getMaxDataSize(GoogleApiClient paramGoogleApiClient);

  public abstract Intent getSelectSnapshotIntent(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt);

  public abstract SnapshotMetadata getSnapshotFromBundle(Bundle paramBundle);

  public abstract PendingResult<LoadSnapshotsResult> load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);

  public abstract PendingResult<OpenSnapshotResult> open(GoogleApiClient paramGoogleApiClient, SnapshotMetadata paramSnapshotMetadata);

  public abstract PendingResult<OpenSnapshotResult> open(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);

  public abstract PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString, Snapshot paramSnapshot);

  public abstract PendingResult<OpenSnapshotResult> resolveConflict(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents);

  public static abstract interface CommitSnapshotResult extends Result
  {
    public abstract SnapshotMetadata getSnapshotMetadata();
  }

  public static abstract interface DeleteSnapshotResult extends Result
  {
    public abstract String getSnapshotId();
  }

  public static abstract interface LoadSnapshotsResult extends Releasable, Result
  {
    public abstract SnapshotMetadataBuffer getSnapshots();
  }

  public static abstract interface OpenSnapshotResult extends Result
  {
    public abstract String getConflictId();

    public abstract Snapshot getConflictingSnapshot();

    public abstract SnapshotContents getResolutionSnapshotContents();

    public abstract Snapshot getSnapshot();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.Snapshots
 * JD-Core Version:    0.6.0
 */