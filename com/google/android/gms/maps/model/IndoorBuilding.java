package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.model.internal.j;
import com.google.android.gms.maps.model.internal.k.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class IndoorBuilding
{
  private final j ami;

  public IndoorBuilding(j paramj)
  {
    this.ami = ((j)jx.i(paramj));
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof IndoorBuilding))
      return false;
    try
    {
      boolean bool = this.ami.b(((IndoorBuilding)paramObject).ami);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getActiveLevelIndex()
  {
    try
    {
      int i = this.ami.getActiveLevelIndex();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public int getDefaultLevelIndex()
  {
    try
    {
      int i = this.ami.getActiveLevelIndex();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public List<IndoorLevel> getLevels()
  {
    ArrayList localArrayList;
    try
    {
      List localList = this.ami.getLevels();
      localArrayList = new ArrayList(localList.size());
      Iterator localIterator = localList.iterator();
      while (localIterator.hasNext())
        localArrayList.add(new IndoorLevel(k.a.bz((IBinder)localIterator.next())));
    }
    catch (RemoteException localRemoteException)
    {
      throw new RuntimeRemoteException(localRemoteException);
    }
    return localArrayList;
  }

  public int hashCode()
  {
    try
    {
      int i = this.ami.hashCodeRemote();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isUnderground()
  {
    try
    {
      boolean bool = this.ami.isUnderground();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.IndoorBuilding
 * JD-Core Version:    0.6.0
 */