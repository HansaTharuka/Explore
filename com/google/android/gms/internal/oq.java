package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public abstract interface oq extends IInterface
{
  public abstract void a(String paramString, ov paramov, or paramor)
    throws RemoteException;

  public abstract void a(String paramString, ov paramov, List<or> paramList)
    throws RemoteException;

  public abstract void a(String paramString, ov paramov, byte[] paramArrayOfByte)
    throws RemoteException;

  public static abstract class a extends Binder
    implements oq
  {
    public static oq bI(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      if ((localIInterface != null) && ((localIInterface instanceof oq)))
        return (oq)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.playlog.internal.IPlayLogService");
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        String str3 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (ov localov3 = ov.CREATOR.du(paramParcel1); ; localov3 = null)
        {
          int k = paramParcel1.readInt();
          or localor = null;
          if (k != 0)
            localor = or.CREATOR.dt(paramParcel1);
          a(str3, localov3, localor);
          return true;
        }
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
        String str2 = paramParcel1.readString();
        int j = paramParcel1.readInt();
        ov localov2 = null;
        if (j != 0)
          localov2 = ov.CREATOR.du(paramParcel1);
        a(str2, localov2, paramParcel1.createTypedArrayList(or.CREATOR));
        return true;
      case 4:
      }
      paramParcel1.enforceInterface("com.google.android.gms.playlog.internal.IPlayLogService");
      String str1 = paramParcel1.readString();
      int i = paramParcel1.readInt();
      ov localov1 = null;
      if (i != 0)
        localov1 = ov.CREATOR.du(paramParcel1);
      a(str1, localov1, paramParcel1.createByteArray());
      return true;
    }

    private static class a
      implements oq
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(String paramString, ov paramov, or paramor)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
            localParcel.writeString(paramString);
            if (paramov == null)
              continue;
            localParcel.writeInt(1);
            paramov.writeToParcel(localParcel, 0);
            if (paramor != null)
            {
              localParcel.writeInt(1);
              paramor.writeToParcel(localParcel, 0);
              this.le.transact(2, localParcel, null, 1);
              return;
              localParcel.writeInt(0);
              continue;
            }
          }
          finally
          {
            localParcel.recycle();
          }
          localParcel.writeInt(0);
        }
      }

      public void a(String paramString, ov paramov, List<or> paramList)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
          localParcel.writeString(paramString);
          if (paramov != null)
          {
            localParcel.writeInt(1);
            paramov.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            localParcel.writeTypedList(paramList);
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

      public void a(String paramString, ov paramov, byte[] paramArrayOfByte)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.playlog.internal.IPlayLogService");
          localParcel.writeString(paramString);
          if (paramov != null)
          {
            localParcel.writeInt(1);
            paramov.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            localParcel.writeByteArray(paramArrayOfByte);
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

      public IBinder asBinder()
      {
        return this.le;
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oq
 * JD-Core Version:    0.6.0
 */