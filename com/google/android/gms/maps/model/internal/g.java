package com.google.android.gms.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;

public abstract interface g extends IInterface
{
  public abstract d b(Bitmap paramBitmap)
    throws RemoteException;

  public abstract d c(float paramFloat)
    throws RemoteException;

  public abstract d cd(String paramString)
    throws RemoteException;

  public abstract d ce(String paramString)
    throws RemoteException;

  public abstract d cf(String paramString)
    throws RemoteException;

  public abstract d fo(int paramInt)
    throws RemoteException;

  public abstract d ok()
    throws RemoteException;

  public static abstract class a extends Binder
    implements g
  {
    public static g bv(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof g)))
        return (g)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        d locald7 = fo(paramParcel1.readInt());
        paramParcel2.writeNoException();
        if (locald7 != null);
        for (IBinder localIBinder7 = locald7.asBinder(); ; localIBinder7 = null)
        {
          paramParcel2.writeStrongBinder(localIBinder7);
          return true;
        }
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        d locald6 = cd(paramParcel1.readString());
        paramParcel2.writeNoException();
        IBinder localIBinder6 = null;
        if (locald6 != null)
          localIBinder6 = locald6.asBinder();
        paramParcel2.writeStrongBinder(localIBinder6);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        d locald5 = ce(paramParcel1.readString());
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (locald5 != null)
          localIBinder5 = locald5.asBinder();
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        d locald4 = ok();
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (locald4 != null)
          localIBinder4 = locald4.asBinder();
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        d locald3 = c(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (locald3 != null)
          localIBinder3 = locald3.asBinder();
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (paramParcel1.readInt() != 0);
        for (Bitmap localBitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(paramParcel1); ; localBitmap = null)
        {
          d locald2 = b(localBitmap);
          paramParcel2.writeNoException();
          IBinder localIBinder2 = null;
          if (locald2 != null)
            localIBinder2 = locald2.asBinder();
          paramParcel2.writeStrongBinder(localIBinder2);
          return true;
        }
      case 7:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
      d locald1 = cf(paramParcel1.readString());
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (locald1 != null)
        localIBinder1 = locald1.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }

    private static class a
      implements g
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

      public d b(Bitmap paramBitmap)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          if (paramBitmap != null)
          {
            localParcel1.writeInt(1);
            paramBitmap.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(6, localParcel1, localParcel2, 0);
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

      public d c(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          localParcel1.writeFloat(paramFloat);
          this.le.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public d cd(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public d ce(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public d cf(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public d fo(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          localParcel1.writeInt(paramInt);
          this.le.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public d ok()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
          this.le.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          d locald = d.a.ap(localParcel2.readStrongBinder());
          return locald;
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
 * Qualified Name:     com.google.android.gms.maps.model.internal.g
 * JD-Core Version:    0.6.0
 */