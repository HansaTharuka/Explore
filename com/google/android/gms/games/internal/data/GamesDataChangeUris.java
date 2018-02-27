package com.google.android.gms.games.internal.data;

import android.net.Uri;
import android.net.Uri.Builder;

public final class GamesDataChangeUris
{
  private static final Uri ach = Uri.parse("content://com.google.android.gms.games/").buildUpon().appendPath("data_change").build();
  public static final Uri aci = ach.buildUpon().appendPath("invitations").build();
  public static final Uri acj = ach.buildUpon().appendEncodedPath("players").build();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.data.GamesDataChangeUris
 * JD-Core Version:    0.6.0
 */