package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract interface ad extends IInterface
{
  public abstract void a(Status paramStatus)
    throws RemoteException;

  public abstract void a(ab paramab)
    throws RemoteException;

  public abstract void a(ap paramap)
    throws RemoteException;

  public abstract void a(at paramat)
    throws RemoteException;

  public abstract void a(aw paramaw)
    throws RemoteException;

  public abstract void a(p paramp)
    throws RemoteException;

  public abstract void a(r paramr)
    throws RemoteException;

  public abstract void a(t paramt)
    throws RemoteException;

  public abstract void a(v paramv)
    throws RemoteException;

  public abstract void a(x paramx)
    throws RemoteException;

  public abstract void a(z paramz)
    throws RemoteException;

  public abstract void ab(DataHolder paramDataHolder)
    throws RemoteException;

  public static abstract class a extends Binder
    implements ad
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
    }

    public static ad bX(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof ad)))
        return (ad)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i7 = paramParcel1.readInt();
        r localr = null;
        if (i7 != 0)
          localr = (r)r.CREATOR.createFromParcel(paramParcel1);
        a(localr);
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i6 = paramParcel1.readInt();
        t localt = null;
        if (i6 != 0)
          localt = (t)t.CREATOR.createFromParcel(paramParcel1);
        a(localt);
        paramParcel2.writeNoException();
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i5 = paramParcel1.readInt();
        ap localap = null;
        if (i5 != 0)
          localap = (ap)ap.CREATOR.createFromParcel(paramParcel1);
        a(localap);
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i4 = paramParcel1.readInt();
        x localx = null;
        if (i4 != 0)
          localx = (x)x.CREATOR.createFromParcel(paramParcel1);
        a(localx);
        paramParcel2.writeNoException();
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i3 = paramParcel1.readInt();
        DataHolder localDataHolder = null;
        if (i3 != 0)
          localDataHolder = DataHolder.CREATOR.B(paramParcel1);
        ab(localDataHolder);
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i2 = paramParcel1.readInt();
        p localp = null;
        if (i2 != 0)
          localp = (p)p.CREATOR.createFromParcel(paramParcel1);
        a(localp);
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int i1 = paramParcel1.readInt();
        at localat = null;
        if (i1 != 0)
          localat = (at)at.CREATOR.createFromParcel(paramParcel1);
        a(localat);
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int n = paramParcel1.readInt();
        z localz = null;
        if (n != 0)
          localz = (z)z.CREATOR.createFromParcel(paramParcel1);
        a(localz);
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int m = paramParcel1.readInt();
        ab localab = null;
        if (m != 0)
          localab = (ab)ab.CREATOR.createFromParcel(paramParcel1);
        a(localab);
        paramParcel2.writeNoException();
        return true;
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int k = paramParcel1.readInt();
        v localv = null;
        if (k != 0)
          localv = (v)v.CREATOR.createFromParcel(paramParcel1);
        a(localv);
        paramParcel2.writeNoException();
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
        int j = paramParcel1.readInt();
        Status localStatus = null;
        if (j != 0)
          localStatus = Status.CREATOR.createFromParcel(paramParcel1);
        a(localStatus);
        paramParcel2.writeNoException();
        return true;
      case 12:
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
      int i = paramParcel1.readInt();
      aw localaw = null;
      if (i != 0)
        localaw = (aw)aw.CREATOR.createFromParcel(paramParcel1);
      a(localaw);
      paramParcel2.writeNoException();
      return true;
    }

    private static class a
      implements ad
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(Status paramStatus)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramStatus != null)
          {
            localParcel1.writeInt(1);
            paramStatus.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(11, localParcel1, localParcel2, 0);
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

      public void a(ab paramab)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramab != null)
          {
            localParcel1.writeInt(1);
            paramab.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(9, localParcel1, localParcel2, 0);
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

      public void a(ap paramap)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramap != null)
          {
            localParcel1.writeInt(1);
            paramap.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(3, localParcel1, localParcel2, 0);
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

      public void a(at paramat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramat != null)
          {
            localParcel1.writeInt(1);
            paramat.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(7, localParcel1, localParcel2, 0);
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

      public void a(aw paramaw)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramaw != null)
          {
            localParcel1.writeInt(1);
            paramaw.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12, localParcel1, localParcel2, 0);
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

      public void a(p paramp)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramp != null)
          {
            localParcel1.writeInt(1);
            paramp.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(6, localParcel1, localParcel2, 0);
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

      public void a(r paramr)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramr != null)
          {
            localParcel1.writeInt(1);
            paramr.writeToParcel(localParcel1, 0);
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

      public void a(t paramt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramt != null)
          {
            localParcel1.writeInt(1);
            paramt.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(13, localParcel1, localParcel2, 0);
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

      public void a(v paramv)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramv != null)
          {
            localParcel1.writeInt(1);
            paramv.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10, localParcel1, localParcel2, 0);
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

      public void a(x paramx)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramx != null)
          {
            localParcel1.writeInt(1);
            paramx.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(4, localParcel1, localParcel2, 0);
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

      public void a(z paramz)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramz != null)
          {
            localParcel1.writeInt(1);
            paramz.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8, localParcel1, localParcel2, 0);
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

      public void ab(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5, localParcel1, localParcel2, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ad
 * JD-Core Version:    0.6.0
 */