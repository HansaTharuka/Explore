package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

public abstract interface i extends IInterface
{
  public abstract void d(Location paramLocation)
    throws RemoteException;

  public abstract void l(d paramd)
    throws RemoteException;

  public static abstract class a extends Binder
    implements i
  {
    public static i bc(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      if ((localIInterface != null) && ((localIInterface instanceof i)))
        return (i)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.internal.IOnLocationChangeListener");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
        l(d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IOnLocationChangeListener");
      if (paramParcel1.readInt() != 0);
      for (Location localLocation = (Location)Location.CREATOR.createFromParcel(paramParcel1); ; localLocation = null)
      {
        d(localLocation);
        paramParcel2.writeNoException();
        return true;
      }
    }

    private static class a
      implements i
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

      public void d(Location paramLocation)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
          if (paramLocation != null)
          {
            localParcel1.writeInt(1);
            paramLocation.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
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

      public void l(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IOnLocationChangeListener");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.i
 * JD-Core Version:    0.6.0
 */