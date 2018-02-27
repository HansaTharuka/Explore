package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface fl extends IInterface
{
  public abstract fj b(fh paramfh)
    throws RemoteException;

  public static abstract class a extends Binder
    implements fl
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public static fl C(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      if ((localIInterface != null) && ((localIInterface instanceof fl)))
        return (fl)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
      fh localfh;
      if (paramParcel1.readInt() != 0)
      {
        localfh = fh.CREATOR.h(paramParcel1);
        fj localfj = b(localfh);
        paramParcel2.writeNoException();
        if (localfj == null)
          break label105;
        paramParcel2.writeInt(1);
        localfj.writeToParcel(paramParcel2, 1);
      }
      while (true)
      {
        return true;
        localfh = null;
        break;
        label105: paramParcel2.writeInt(0);
      }
    }

    private static class a
      implements fl
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

      public fj b(fh paramfh)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (paramfh == null)
              continue;
            localParcel1.writeInt(1);
            paramfh.writeToParcel(localParcel1, 0);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
            {
              fj localfj2 = fj.CREATOR.i(localParcel2);
              localfj1 = localfj2;
              return localfj1;
              localParcel1.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          fj localfj1 = null;
        }
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fl
 * JD-Core Version:    0.6.0
 */