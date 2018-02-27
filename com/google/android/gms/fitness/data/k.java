package com.google.android.gms.fitness.data;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface k extends IInterface
{
  public abstract void c(DataPoint paramDataPoint)
    throws RemoteException;

  public static abstract class a extends Binder
    implements k
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.fitness.data.IDataSourceListener");
    }

    public static k aq(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.data.IDataSourceListener");
      if ((localIInterface != null) && ((localIInterface instanceof k)))
        return (k)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.fitness.data.IDataSourceListener");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.fitness.data.IDataSourceListener");
      if (paramParcel1.readInt() != 0);
      for (DataPoint localDataPoint = (DataPoint)DataPoint.CREATOR.createFromParcel(paramParcel1); ; localDataPoint = null)
      {
        c(localDataPoint);
        return true;
      }
    }

    private static class a
      implements k
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

      public void c(DataPoint paramDataPoint)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.fitness.data.IDataSourceListener");
          if (paramDataPoint != null)
          {
            localParcel.writeInt(1);
            paramDataPoint.writeToParcel(localParcel, 0);
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
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.k
 * JD-Core Version:    0.6.0
 */