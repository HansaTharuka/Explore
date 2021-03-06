package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface h extends IInterface
{
  public abstract void c(boolean paramBoolean1, boolean paramBoolean2)
    throws RemoteException;

  public static abstract class a extends Binder
    implements h
  {
    public static h ag(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
      if ((localIInterface != null) && ((localIInterface instanceof h)))
        return (h)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
      if (paramParcel1.readInt() != 0);
      for (boolean bool1 = true; ; bool1 = false)
      {
        int i = paramParcel1.readInt();
        boolean bool2 = false;
        if (i != 0)
          bool2 = true;
        c(bool1, bool2);
        paramParcel2.writeNoException();
        return true;
      }
    }

    private static class a
      implements h
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

      public void c(boolean paramBoolean1, boolean paramBoolean2)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
          int j;
          if (paramBoolean1)
          {
            j = i;
            localParcel1.writeInt(j);
            if (!paramBoolean2)
              break label81;
          }
          while (true)
          {
            localParcel1.writeInt(i);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            j = 0;
            break;
            label81: i = 0;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.h
 * JD-Core Version:    0.6.0
 */