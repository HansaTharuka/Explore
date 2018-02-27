package com.google.android.gms.games.snapshot;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Snapshot extends Parcelable, Freezable<Snapshot>
{
  public abstract SnapshotMetadata getMetadata();

  public abstract SnapshotContents getSnapshotContents();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.snapshot.Snapshot
 * JD-Core Version:    0.6.0
 */