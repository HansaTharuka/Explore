package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public abstract interface jq extends IInterface
{
  public abstract Account hk()
    throws RemoteException;

  public static abstract class a extends Binder
    implements jq
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.common.internal.IAccountAccessor");
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
        paramParcel2.writeString("com.google.android.gms.common.internal.IAccountAccessor");
        return true;
      case 2:
      }
      paramParcel1.enforceInterface("com.google.android.gms.common.internal.IAccountAccessor");
      Account localAccount = hk();
      paramParcel2.writeNoException();
      if (localAccount != null)
      {
        paramParcel2.writeInt(1);
        localAccount.writeToParcel(paramParcel2, 1);
        return true;
      }
      paramParcel2.writeInt(0);
      return true;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jq
 * JD-Core Version:    0.6.0
 */