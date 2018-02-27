package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract interface og extends IInterface
{
  public abstract void X(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void Y(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void Z(DataHolder paramDataHolder)
    throws RemoteException;

  public static abstract class a extends Binder
    implements og
  {
    public static og aP(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof og)))
        return (og)localIInterface;
      return new a(paramIBinder);
    }

    public IBinder asBinder()
    {
      return this;
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
        paramParcel2.writeString("com.google.android.gms.location.places.internal.IPlacesCallbacks");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
        int k = paramParcel1.readInt();
        DataHolder localDataHolder3 = null;
        if (k != 0)
          localDataHolder3 = DataHolder.CREATOR.B(paramParcel1);
        X(localDataHolder3);
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
        int j = paramParcel1.readInt();
        DataHolder localDataHolder2 = null;
        if (j != 0)
          localDataHolder2 = DataHolder.CREATOR.B(paramParcel1);
        Y(localDataHolder2);
        return true;
      case 3:
      }
      paramParcel1.enforceInterface("com.google.android.gms.location.places.internal.IPlacesCallbacks");
      int i = paramParcel1.readInt();
      DataHolder localDataHolder1 = null;
      if (i != 0)
        localDataHolder1 = DataHolder.CREATOR.B(paramParcel1);
      Z(localDataHolder1);
      return true;
    }

    private static class a
      implements og
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void X(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel.writeInt(1);
            paramDataHolder.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(1, localParcel, null, 1);
            return;
            localParcel.writeInt(0);
          }
        }
        finally
        {
          localParcel.recycle();
        }
        throw localObject;
      }

      public void Y(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel.writeInt(1);
            paramDataHolder.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel, null, 1);
            return;
            localParcel.writeInt(0);
          }
        }
        finally
        {
          localParcel.recycle();
        }
        throw localObject;
      }

      public void Z(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.location.places.internal.IPlacesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel.writeInt(1);
            paramDataHolder.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(3, localParcel, null, 1);
            return;
            localParcel.writeInt(0);
          }
        }
        finally
        {
          localParcel.recycle();
        }
        throw localObject;
      }

      public IBinder asBinder()
      {
        return this.le;
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.og
 * JD-Core Version:    0.6.0
 */