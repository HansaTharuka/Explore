package com.google.android.gms.appstate;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

public final class b extends d
  implements AppState
{
  b(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public boolean equals(Object paramObject)
  {
    return a.a(this, paramObject);
  }

  public AppState fJ()
  {
    return new a(this);
  }

  public byte[] getConflictData()
  {
    return getByteArray("conflict_data");
  }

  public String getConflictVersion()
  {
    return getString("conflict_version");
  }

  public int getKey()
  {
    return getInteger("key");
  }

  public byte[] getLocalData()
  {
    return getByteArray("local_data");
  }

  public String getLocalVersion()
  {
    return getString("local_version");
  }

  public boolean hasConflict()
  {
    return !aS("conflict_version");
  }

  public int hashCode()
  {
    return a.a(this);
  }

  public String toString()
  {
    return a.b(this);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.b
 * JD-Core Version:    0.6.0
 */