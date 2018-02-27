package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.DataTypeResult;

public abstract interface ly extends IInterface
{
  public abstract void a(DataTypeResult paramDataTypeResult)
    throws RemoteException;

  public static abstract class a extends Binder
    implements ly
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.fitness.internal.IDataTypeCallback");
    }

    public static ly au(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
      if ((localIInterface != null) && ((localIInterface instanceof ly)))
        return (ly)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.fitness.internal.IDataTypeCallback");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.fitness.internal.IDataTypeCallback");
      if (paramParcel1.readInt() != 0);
      for (DataTypeResult localDataTypeResult = (DataTypeResult)DataTypeResult.CREATOR.createFromParcel(paramParcel1); ; localDataTypeResult = null)
      {
        a(localDataTypeResult);
        paramParcel2.writeNoException();
        return true;
      }
    }

    private static class a
      implements ly
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(DataTypeResult paramDataTypeResult)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.fitness.internal.IDataTypeCallback");
          if (paramDataTypeResult != null)
          {
            localParcel1.writeInt(1);
            paramDataTypeResult.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(1, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.internal.ly
 * JD-Core Version:    0.6.0
 */