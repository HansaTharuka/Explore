package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.l;
import com.google.android.gms.maps.model.internal.l.a;

public abstract interface d extends IInterface
{
  public abstract com.google.android.gms.dynamic.d f(l paraml)
    throws RemoteException;

  public abstract com.google.android.gms.dynamic.d g(l paraml)
    throws RemoteException;

  public static abstract class a extends Binder
    implements d
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.maps.internal.IInfoWindowAdapter");
    }

    public static d aU(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      if ((localIInterface != null) && ((localIInterface instanceof d)))
        return (d)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        com.google.android.gms.dynamic.d locald2 = f(l.a.bA(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locald2 != null)
          localIBinder2 = locald2.asBinder();
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      case 2:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
      com.google.android.gms.dynamic.d locald1 = g(l.a.bA(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald1 != null)
        localIBinder1 = locald1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }

    private static class a
      implements d
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

      public com.google.android.gms.dynamic.d f(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.dynamic.d locald = com.google.android.gms.dynamic.d.a.ap(localParcel2.readStrongBinder());
            return locald;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public com.google.android.gms.dynamic.d g(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.dynamic.d locald = com.google.android.gms.dynamic.d.a.ap(localParcel2.readStrongBinder());
            return locald;
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
 * Qualified Name:     com.google.android.gms.maps.internal.d
 * JD-Core Version:    0.6.0
 */