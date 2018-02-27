package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.c.a;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public abstract interface qd extends IInterface
{
  public abstract qa a(d paramd, c paramc, WalletFragmentOptions paramWalletFragmentOptions, qb paramqb)
    throws RemoteException;

  public static abstract class a extends Binder
    implements qd
  {
    public static qd bS(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      if ((localIInterface != null) && ((localIInterface instanceof qd)))
        return (qd)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
        return true;
      case 1:
      }
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
      d locald = d.a.ap(paramParcel1.readStrongBinder());
      c localc = c.a.ao(paramParcel1.readStrongBinder());
      if (paramParcel1.readInt() != 0);
      for (WalletFragmentOptions localWalletFragmentOptions = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(paramParcel1); ; localWalletFragmentOptions = null)
      {
        qa localqa = a(locald, localc, localWalletFragmentOptions, qb.a.bQ(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        IBinder localIBinder = null;
        if (localqa != null)
          localIBinder = localqa.asBinder();
        paramParcel2.writeStrongBinder(localIBinder);
        return true;
      }
    }

    private static class a
      implements qd
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public qa a(d paramd, c paramc, WalletFragmentOptions paramWalletFragmentOptions, qb paramqb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
          IBinder localIBinder1;
          IBinder localIBinder2;
          if (paramd != null)
          {
            localIBinder1 = paramd.asBinder();
            localParcel1.writeStrongBinder(localIBinder1);
            if (paramc == null)
              break label146;
            localIBinder2 = paramc.asBinder();
            label48: localParcel1.writeStrongBinder(localIBinder2);
            if (paramWalletFragmentOptions == null)
              break label152;
            localParcel1.writeInt(1);
            paramWalletFragmentOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            IBinder localIBinder3 = null;
            if (paramqb != null)
              localIBinder3 = paramqb.asBinder();
            localParcel1.writeStrongBinder(localIBinder3);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            qa localqa = qa.a.bP(localParcel2.readStrongBinder());
            return localqa;
            localIBinder1 = null;
            break;
            label146: localIBinder2 = null;
            break label48;
            label152: localParcel1.writeInt(0);
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
 * Qualified Name:     com.google.android.gms.internal.qd
 * JD-Core Version:    0.6.0
 */