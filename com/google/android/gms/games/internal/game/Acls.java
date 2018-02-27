package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Acls
{
  public static abstract interface LoadAclResult extends Releasable, Result
  {
  }

  public static abstract interface LoadFAclResult extends Releasable, Result
  {
  }

  public static abstract interface OnGameplayAclLoadedCallback
  {
  }

  public static abstract interface OnGameplayAclUpdatedCallback
  {
  }

  public static abstract interface OnNotifyAclLoadedCallback
  {
  }

  public static abstract interface OnNotifyAclUpdatedCallback
  {
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.game.Acls
 * JD-Core Version:    0.6.0
 */