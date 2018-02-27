package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.BleDevice;

public abstract interface l extends IInterface
{
  public abstract void onDeviceFound(BleDevice paramBleDevice)
    throws RemoteException;

  public abstract void onScanStopped()
    throws RemoteException;

  public static abstract class a extends Binder
    implements l
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
    }

    public static l aB(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
      if ((localIInterface != null) && ((localIInterface instanceof l)))
        return (l)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.fitness.request.IBleScanCallback");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
        if (paramParcel1.readInt() != 0);
        for (BleDevice localBleDevice = (BleDevice)BleDevice.CREATOR.createFromParcel(paramParcel1); ; localBleDevice = null)
        {
          onDeviceFound(localBleDevice);
          return true;
        }
      case 2:
      }
      paramParcel1.enforceInterface("com.google.android.gms.fitness.request.IBleScanCallback");
      onScanStopped();
      return true;
    }

    private static class a
      implements l
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

      public void onDeviceFound(BleDevice paramBleDevice)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
          if (paramBleDevice != null)
          {
            localParcel.writeInt(1);
            paramBleDevice.writeToParcel(localParcel, 0);
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

      public void onScanStopped()
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.fitness.request.IBleScanCallback");
          this.le.transact(2, localParcel, null, 1);
          return;
        }
        finally
        {
          localParcel.recycle();
        }
        throw localObject;
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.l
 * JD-Core Version:    0.6.0
 */