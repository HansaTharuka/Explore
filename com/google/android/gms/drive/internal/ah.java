package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface ah extends IInterface
{
  public abstract void M(boolean paramBoolean)
    throws RemoteException;

  public static abstract class a extends Binder
    implements ah
  {
    public static ah aa(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ah)))
        return (ah)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.drive.internal.IEventReleaseCallback");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IEventReleaseCallback");
      if (paramParcel1.readInt() != 0);
      for (boolean bool = true; ; bool = false)
      {
        M(bool);
        return true;
      }
    }

    private static class a
      implements ah
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void M(boolean paramBoolean)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.drive.internal.IEventReleaseCallback");
          if (paramBoolean);
          while (true)
          {
            localParcel.writeInt(i);
            this.le.transact(1, localParcel, null, 1);
            return;
            i = 0;
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
 * Qualified Name:     com.google.android.gms.drive.internal.ah
 * JD-Core Version:    0.6.0
 */