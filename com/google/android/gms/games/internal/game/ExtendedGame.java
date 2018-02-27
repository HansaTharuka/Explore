package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;

public abstract interface ExtendedGame extends Parcelable, Freezable<ExtendedGame>
{
  public abstract Game getGame();

  public abstract ArrayList<GameBadge> lY();

  public abstract int lZ();

  public abstract boolean ma();

  public abstract int mb();

  public abstract long mc();

  public abstract long md();

  public abstract String me();

  public abstract long mf();

  public abstract String mg();

  public abstract SnapshotMetadata mh();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.game.ExtendedGame
 * JD-Core Version:    0.6.0
 */