package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.c;

public abstract interface af extends IInterface
{
  public abstract void a(ad paramad)
    throws RemoteException;

  public abstract void a(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void a(ad paramad, Asset paramAsset)
    throws RemoteException;

  public abstract void a(ad paramad, PutDataRequest paramPutDataRequest)
    throws RemoteException;

  public abstract void a(ad paramad, c paramc)
    throws RemoteException;

  public abstract void a(ad paramad, ar paramar)
    throws RemoteException;

  public abstract void a(ad paramad, b paramb)
    throws RemoteException;

  public abstract void a(ad paramad, String paramString)
    throws RemoteException;

  public abstract void a(ad paramad, String paramString1, String paramString2, byte[] paramArrayOfByte)
    throws RemoteException;

  public abstract void b(ad paramad)
    throws RemoteException;

  public abstract void b(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void b(ad paramad, c paramc)
    throws RemoteException;

  public abstract void b(ad paramad, String paramString)
    throws RemoteException;

  public abstract void c(ad paramad)
    throws RemoteException;

  public abstract void c(ad paramad, Uri paramUri)
    throws RemoteException;

  public abstract void c(ad paramad, String paramString)
    throws RemoteException;

  public abstract void d(ad paramad)
    throws RemoteException;

  public abstract void e(ad paramad)
    throws RemoteException;

  public abstract void f(ad paramad)
    throws RemoteException;

  public abstract void g(ad paramad)
    throws RemoteException;

  public abstract void h(ad paramad)
    throws RemoteException;

  public abstract void i(ad paramad)
    throws RemoteException;

  public abstract void j(ad paramad)
    throws RemoteException;

  public abstract void k(ad paramad)
    throws RemoteException;

  public static abstract class a extends Binder
    implements af
  {
    public static af bZ(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
      if ((localIInterface != null) && ((localIInterface instanceof af)))
        return (af)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableService");
        return true;
      case 20:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad9 = ad.a.bX(paramParcel1.readStrongBinder());
        int i4 = paramParcel1.readInt();
        c localc2 = null;
        if (i4 != 0)
          localc2 = (c)c.CREATOR.createFromParcel(paramParcel1);
        a(localad9, localc2);
        paramParcel2.writeNoException();
        return true;
      case 21:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        a(ad.a.bX(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 22:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        a(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 23:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        b(ad.a.bX(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 24:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        c(ad.a.bX(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad8 = ad.a.bX(paramParcel1.readStrongBinder());
        int i3 = paramParcel1.readInt();
        PutDataRequest localPutDataRequest = null;
        if (i3 != 0)
          localPutDataRequest = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(paramParcel1);
        a(localad8, localPutDataRequest);
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad7 = ad.a.bX(paramParcel1.readStrongBinder());
        int i2 = paramParcel1.readInt();
        Uri localUri3 = null;
        if (i2 != 0)
          localUri3 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        a(localad7, localUri3);
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        b(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad6 = ad.a.bX(paramParcel1.readStrongBinder());
        int i1 = paramParcel1.readInt();
        Uri localUri2 = null;
        if (i1 != 0)
          localUri2 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        b(localad6, localUri2);
        paramParcel2.writeNoException();
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad5 = ad.a.bX(paramParcel1.readStrongBinder());
        int n = paramParcel1.readInt();
        Uri localUri1 = null;
        if (n != 0)
          localUri1 = (Uri)Uri.CREATOR.createFromParcel(paramParcel1);
        c(localad5, localUri1);
        paramParcel2.writeNoException();
        return true;
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        a(ad.a.bX(paramParcel1.readStrongBinder()), paramParcel1.readString(), paramParcel1.readString(), paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad4 = ad.a.bX(paramParcel1.readStrongBinder());
        int m = paramParcel1.readInt();
        Asset localAsset = null;
        if (m != 0)
          localAsset = (Asset)Asset.CREATOR.createFromParcel(paramParcel1);
        a(localad4, localAsset);
        paramParcel2.writeNoException();
        return true;
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        c(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        d(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad3 = ad.a.bX(paramParcel1.readStrongBinder());
        int k = paramParcel1.readInt();
        b localb = null;
        if (k != 0)
          localb = (b)b.CREATOR.createFromParcel(paramParcel1);
        a(localad3, localb);
        paramParcel2.writeNoException();
        return true;
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad2 = ad.a.bX(paramParcel1.readStrongBinder());
        int j = paramParcel1.readInt();
        ar localar = null;
        if (j != 0)
          localar = (ar)ar.CREATOR.createFromParcel(paramParcel1);
        a(localad2, localar);
        paramParcel2.writeNoException();
        return true;
      case 18:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        e(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 19:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        f(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 25:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        g(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 26:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        h(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        ad localad1 = ad.a.bX(paramParcel1.readStrongBinder());
        int i = paramParcel1.readInt();
        c localc1 = null;
        if (i != 0)
          localc1 = (c)c.CREATOR.createFromParcel(paramParcel1);
        b(localad1, localc1);
        paramParcel2.writeNoException();
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        i(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
        j(ad.a.bX(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
      k(ad.a.bX(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }

    private static class a
      implements af
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(22, localParcel1, localParcel2, 0);
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

      public void a(ad paramad, Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramUri == null)
              break label85;
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(7, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, Asset paramAsset)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramAsset == null)
              break label85;
            localParcel1.writeInt(1);
            paramAsset.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(13, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, PutDataRequest paramPutDataRequest)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramPutDataRequest == null)
              break label85;
            localParcel1.writeInt(1);
            paramPutDataRequest.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(6, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramc == null)
              break label85;
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(20, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, ar paramar)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramar == null)
              break label85;
            localParcel1.writeInt(1);
            paramar.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(17, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramb == null)
              break label85;
            localParcel1.writeInt(1);
            paramb.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(16, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(ad paramad, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.le.transact(21, localParcel1, localParcel2, 0);
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

      public void a(ad paramad, String paramString1, String paramString2, byte[] paramArrayOfByte)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString1);
            localParcel1.writeString(paramString2);
            localParcel1.writeByteArray(paramArrayOfByte);
            this.le.transact(12, localParcel1, localParcel2, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void b(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(8, localParcel1, localParcel2, 0);
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

      public void b(ad paramad, Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramUri == null)
              break label85;
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(9, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(ad paramad, c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramc == null)
              break label84;
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label84: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(ad paramad, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.le.transact(23, localParcel1, localParcel2, 0);
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

      public void c(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(14, localParcel1, localParcel2, 0);
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

      public void c(ad paramad, Uri paramUri)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          IBinder localIBinder;
          if (paramad != null)
          {
            localIBinder = paramad.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramUri == null)
              break label85;
            localParcel1.writeInt(1);
            paramUri.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(11, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            localIBinder = null;
            break;
            label85: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void c(ad paramad, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
            this.le.transact(24, localParcel1, localParcel2, 0);
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

      public void d(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(15, localParcel1, localParcel2, 0);
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

      public void e(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(18, localParcel1, localParcel2, 0);
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

      public void f(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(19, localParcel1, localParcel2, 0);
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

      public void g(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(25, localParcel1, localParcel2, 0);
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

      public void h(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(26, localParcel1, localParcel2, 0);
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

      public void i(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(3, localParcel1, localParcel2, 0);
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

      public void j(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(4, localParcel1, localParcel2, 0);
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

      public void k(ad paramad)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableService");
          if (paramad != null);
          for (IBinder localIBinder = paramad.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(5, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.wearable.internal.af
 * JD-Core Version:    0.6.0
 */