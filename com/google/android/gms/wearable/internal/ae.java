package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

public abstract interface ae extends IInterface
{
  public abstract void a(ai paramai)
    throws RemoteException;

  public abstract void a(al paramal)
    throws RemoteException;

  public abstract void aa(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void b(al paramal)
    throws RemoteException;

  public static abstract class a extends Binder
    implements ae
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }

    public static ae bY(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
      if ((localIInterface != null) && ((localIInterface instanceof ae)))
        return (ae)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wearable.internal.IWearableListener");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
        int m = paramParcel1.readInt();
        DataHolder localDataHolder = null;
        if (m != 0)
          localDataHolder = DataHolder.CREATOR.B(paramParcel1);
        aa(localDataHolder);
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
        int k = paramParcel1.readInt();
        ai localai = null;
        if (k != 0)
          localai = (ai)ai.CREATOR.createFromParcel(paramParcel1);
        a(localai);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
        int j = paramParcel1.readInt();
        al localal2 = null;
        if (j != 0)
          localal2 = (al)al.CREATOR.createFromParcel(paramParcel1);
        a(localal2);
        return true;
      case 4:
      }
      paramParcel1.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
      int i = paramParcel1.readInt();
      al localal1 = null;
      if (i != 0)
        localal1 = (al)al.CREATOR.createFromParcel(paramParcel1);
      b(localal1);
      return true;
    }

    private static class a
      implements ae
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(ai paramai)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
          if (paramai != null)
          {
            localParcel.writeInt(1);
            paramai.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel, null, 1);
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

      public void a(al paramal)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
          if (paramal != null)
          {
            localParcel.writeInt(1);
            paramal.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(3, localParcel, null, 1);
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

      public void aa(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
          if (paramDataHolder != null)
          {
            localParcel.writeInt(1);
            paramDataHolder.writeToParcel(localParcel, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void b(al paramal)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
          if (paramal != null)
          {
            localParcel.writeInt(1);
            paramal.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(4, localParcel, null, 1);
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
 * Qualified Name:     com.google.android.gms.wearable.internal.ae
 * JD-Core Version:    0.6.0
 */