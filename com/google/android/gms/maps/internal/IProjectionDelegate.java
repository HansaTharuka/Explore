package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.i;

public abstract interface IProjectionDelegate extends IInterface
{
  public abstract LatLng fromScreenLocation(d paramd)
    throws RemoteException;

  public abstract LatLng fromScreenLocation2(y paramy)
    throws RemoteException;

  public abstract VisibleRegion getVisibleRegion()
    throws RemoteException;

  public abstract d toScreenLocation(LatLng paramLatLng)
    throws RemoteException;

  public abstract y toScreenLocation2(LatLng paramLatLng)
    throws RemoteException;

  public static abstract class a extends Binder
    implements IProjectionDelegate
  {
    public static IProjectionDelegate bp(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof IProjectionDelegate)))
        return (IProjectionDelegate)localIInterface;
      return new a(paramIBinder);
    }

    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default:
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902:
        paramParcel2.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        LatLng localLatLng4 = fromScreenLocation(d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        if (localLatLng4 != null)
        {
          paramParcel2.writeInt(1);
          localLatLng4.writeToParcel(paramParcel2, 1);
        }
        while (true)
        {
          return true;
          paramParcel2.writeInt(0);
        }
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (paramParcel1.readInt() != 0);
        for (LatLng localLatLng3 = LatLng.CREATOR.de(paramParcel1); ; localLatLng3 = null)
        {
          d locald = toScreenLocation(localLatLng3);
          paramParcel2.writeNoException();
          IBinder localIBinder = null;
          if (locald != null)
            localIBinder = locald.asBinder();
          paramParcel2.writeStrongBinder(localIBinder);
          return true;
        }
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        VisibleRegion localVisibleRegion = getVisibleRegion();
        paramParcel2.writeNoException();
        if (localVisibleRegion != null)
        {
          paramParcel2.writeInt(1);
          localVisibleRegion.writeToParcel(paramParcel2, 1);
        }
        while (true)
        {
          return true;
          paramParcel2.writeInt(0);
        }
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        int j = paramParcel1.readInt();
        y localy2 = null;
        if (j != 0)
          localy2 = y.CREATOR.cZ(paramParcel1);
        LatLng localLatLng2 = fromScreenLocation2(localy2);
        paramParcel2.writeNoException();
        if (localLatLng2 != null)
        {
          paramParcel2.writeInt(1);
          localLatLng2.writeToParcel(paramParcel2, 1);
        }
        while (true)
        {
          return true;
          paramParcel2.writeInt(0);
        }
      case 5:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
      int i = paramParcel1.readInt();
      LatLng localLatLng1 = null;
      if (i != 0)
        localLatLng1 = LatLng.CREATOR.de(paramParcel1);
      y localy1 = toScreenLocation2(localLatLng1);
      paramParcel2.writeNoException();
      if (localy1 != null)
      {
        paramParcel2.writeInt(1);
        localy1.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        paramParcel2.writeInt(0);
      }
    }

    private static class a
      implements IProjectionDelegate
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public IBinder asBinder()
      {
        return this.le;
      }

      public LatLng fromScreenLocation(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            Object localObject2 = null;
            if (i != 0)
            {
              LatLng localLatLng = LatLng.CREATOR.de(localParcel2);
              localObject2 = localLatLng;
            }
            return localObject2;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject1;
      }

      public LatLng fromScreenLocation2(y paramy)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (paramy == null)
              continue;
            localParcel1.writeInt(1);
            paramy.writeToParcel(localParcel1, 0);
            this.le.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
            {
              LatLng localLatLng2 = LatLng.CREATOR.de(localParcel2);
              localLatLng1 = localLatLng2;
              return localLatLng1;
              localParcel1.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          LatLng localLatLng1 = null;
        }
      }

      public VisibleRegion getVisibleRegion()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
          this.le.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            VisibleRegion localVisibleRegion2 = VisibleRegion.CREATOR.jdMethod_do(localParcel2);
            localVisibleRegion1 = localVisibleRegion2;
            return localVisibleRegion1;
          }
          VisibleRegion localVisibleRegion1 = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public d toScreenLocation(LatLng paramLatLng)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
          if (paramLatLng != null)
          {
            localParcel1.writeInt(1);
            paramLatLng.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            d locald = d.a.ap(localParcel2.readStrongBinder());
            return locald;
            localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public y toScreenLocation2(LatLng paramLatLng)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (paramLatLng == null)
              continue;
            localParcel1.writeInt(1);
            paramLatLng.writeToParcel(localParcel1, 0);
            this.le.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
            {
              y localy2 = y.CREATOR.cZ(localParcel2);
              localy1 = localy2;
              return localy1;
              localParcel1.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          y localy1 = null;
        }
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.IProjectionDelegate
 * JD-Core Version:    0.6.0
 */