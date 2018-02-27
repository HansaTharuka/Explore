package com.google.android.gms.drive.realtime.internal;

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
import com.google.android.gms.drive.realtime.internal.event.ParcelableEventList;

public abstract interface g extends IInterface
{
  public abstract void a(DataHolder paramDataHolder, ParcelableEventList paramParcelableEventList)
    throws RemoteException;

  public abstract void n(Status paramStatus)
    throws RemoteException;

  public static abstract class a extends Binder
    implements g
  {
    public static g af(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
      if ((localIInterface != null) && ((localIInterface instanceof g)))
        return (g)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
        DataHolder localDataHolder;
        if (paramParcel1.readInt() != 0)
        {
          localDataHolder = DataHolder.CREATOR.B(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label117;
        }
        label117: for (ParcelableEventList localParcelableEventList = (ParcelableEventList)ParcelableEventList.CREATOR.createFromParcel(paramParcel1); ; localParcelableEventList = null)
        {
          a(localDataHolder, localParcelableEventList);
          paramParcel2.writeNoException();
          return true;
          localDataHolder = null;
          break;
        }
      case 2:
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
      int i = paramParcel1.readInt();
      Status localStatus = null;
      if (i != 0)
        localStatus = Status.CREATOR.createFromParcel(paramParcel1);
      n(localStatus);
      paramParcel2.writeNoException();
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

      public void a(DataHolder paramDataHolder, ParcelableEventList paramParcelableEventList)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            if (paramParcelableEventList != null)
            {
              localParcel1.writeInt(1);
              paramParcelableEventList.writeToParcel(localParcel1, 0);
              this.le.transact(1, localParcel1, localParcel2, 0);
              localParcel2.readException();
              return;
              localParcel1.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
          localParcel1.writeInt(0);
        }
      }

      public IBinder asBinder()
      {
        return this.le;
      }

      public void n(Status paramStatus)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IDataHolderEventCallback");
          if (paramStatus != null)
          {
            localParcel1.writeInt(1);
            paramStatus.writeToParcel(localParcel1, 0);
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
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.g
 * JD-Core Version:    0.6.0
 */