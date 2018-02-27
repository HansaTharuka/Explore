package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.wallet.FullWalletRequest;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.NotifyTransactionStatusRequest;
import com.google.android.gms.wallet.d;

public abstract interface qc extends IInterface
{
  public abstract void a(Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void a(pw parampw, Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, qe paramqe)
    throws RemoteException;

  public abstract void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
    throws RemoteException;

  public abstract void a(d paramd, Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, Bundle paramBundle, qf paramqf)
    throws RemoteException;

  public abstract void r(Bundle paramBundle)
    throws RemoteException;

  public abstract void s(Bundle paramBundle)
    throws RemoteException;

  public static abstract class a extends Binder
    implements qc
  {
    public static qc bR(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
      if ((localIInterface != null) && ((localIInterface instanceof qc)))
        return (qc)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.wallet.internal.IOwService");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        MaskedWalletRequest localMaskedWalletRequest2;
        if (paramParcel1.readInt() != 0)
        {
          localMaskedWalletRequest2 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label189;
        }
        for (Bundle localBundle10 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle10 = null)
        {
          a(localMaskedWalletRequest2, localBundle10, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
          localMaskedWalletRequest2 = null;
          break;
        }
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        FullWalletRequest localFullWalletRequest;
        if (paramParcel1.readInt() != 0)
        {
          localFullWalletRequest = (FullWalletRequest)FullWalletRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label266;
        }
        for (Bundle localBundle9 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle9 = null)
        {
          a(localFullWalletRequest, localBundle9, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
          localFullWalletRequest = null;
          break;
        }
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        String str1 = paramParcel1.readString();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle8 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle8 = null)
        {
          a(str1, str2, localBundle8, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
        }
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        NotifyTransactionStatusRequest localNotifyTransactionStatusRequest;
        if (paramParcel1.readInt() != 0)
        {
          localNotifyTransactionStatusRequest = (NotifyTransactionStatusRequest)NotifyTransactionStatusRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label400;
        }
        for (Bundle localBundle7 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle7 = null)
        {
          a(localNotifyTransactionStatusRequest, localBundle7);
          return true;
          localNotifyTransactionStatusRequest = null;
          break;
        }
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle6 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle6 = null)
        {
          a(localBundle6, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
        }
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        d locald;
        if (paramParcel1.readInt() != 0)
        {
          locald = (d)d.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label525;
        }
        for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
        {
          a(locald, localBundle5, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
          locald = null;
          break;
        }
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        MaskedWalletRequest localMaskedWalletRequest1;
        if (paramParcel1.readInt() != 0)
        {
          localMaskedWalletRequest1 = (MaskedWalletRequest)MaskedWalletRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label602;
        }
        for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
        {
          a(localMaskedWalletRequest1, localBundle4, qe.a.bT(paramParcel1.readStrongBinder()));
          return true;
          localMaskedWalletRequest1 = null;
          break;
        }
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        pw localpw;
        if (paramParcel1.readInt() != 0)
        {
          localpw = (pw)pw.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label679;
        }
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
        {
          a(localpw, localBundle3, qf.a.bU(paramParcel1.readStrongBinder()));
          return true;
          localpw = null;
          break;
        }
      case 9:
        label189: label602: paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
        label266: label400: label679: if (paramParcel1.readInt() != 0);
        label525: for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
        {
          r(localBundle2);
          return true;
        }
      case 10:
      }
      paramParcel1.enforceInterface("com.google.android.gms.wallet.internal.IOwService");
      if (paramParcel1.readInt() != 0);
      for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
      {
        s(localBundle1);
        return true;
      }
    }

    private static class a
      implements qc
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            IBinder localIBinder = null;
            if (paramqf != null)
              localIBinder = paramqf.asBinder();
            localParcel.writeStrongBinder(localIBinder);
            this.le.transact(5, localParcel, null, 1);
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

      public void a(pw parampw, Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (parampw == null)
              continue;
            localParcel.writeInt(1);
            parampw.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              IBinder localIBinder = null;
              if (paramqf == null)
                continue;
              localIBinder = paramqf.asBinder();
              localParcel.writeStrongBinder(localIBinder);
              this.le.transact(8, localParcel, null, 1);
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

      public void a(FullWalletRequest paramFullWalletRequest, Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramFullWalletRequest == null)
              continue;
            localParcel.writeInt(1);
            paramFullWalletRequest.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              IBinder localIBinder = null;
              if (paramqf == null)
                continue;
              localIBinder = paramqf.asBinder();
              localParcel.writeStrongBinder(localIBinder);
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

      public void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, qe paramqe)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramMaskedWalletRequest == null)
              continue;
            localParcel.writeInt(1);
            paramMaskedWalletRequest.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              IBinder localIBinder = null;
              if (paramqe == null)
                continue;
              localIBinder = paramqe.asBinder();
              localParcel.writeStrongBinder(localIBinder);
              this.le.transact(7, localParcel, null, 1);
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

      public void a(MaskedWalletRequest paramMaskedWalletRequest, Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramMaskedWalletRequest == null)
              continue;
            localParcel.writeInt(1);
            paramMaskedWalletRequest.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              IBinder localIBinder = null;
              if (paramqf == null)
                continue;
              localIBinder = paramqf.asBinder();
              localParcel.writeStrongBinder(localIBinder);
              this.le.transact(1, localParcel, null, 1);
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

      public void a(NotifyTransactionStatusRequest paramNotifyTransactionStatusRequest, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramNotifyTransactionStatusRequest == null)
              continue;
            localParcel.writeInt(1);
            paramNotifyTransactionStatusRequest.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              this.le.transact(4, localParcel, null, 1);
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

      public void a(d paramd, Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            if (paramd == null)
              continue;
            localParcel.writeInt(1);
            paramd.writeToParcel(localParcel, 0);
            if (paramBundle != null)
            {
              localParcel.writeInt(1);
              paramBundle.writeToParcel(localParcel, 0);
              IBinder localIBinder = null;
              if (paramqf == null)
                continue;
              localIBinder = paramqf.asBinder();
              localParcel.writeStrongBinder(localIBinder);
              this.le.transact(6, localParcel, null, 1);
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

      public void a(String paramString1, String paramString2, Bundle paramBundle, qf paramqf)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
          localParcel.writeString(paramString1);
          localParcel.writeString(paramString2);
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            IBinder localIBinder = null;
            if (paramqf != null)
              localIBinder = paramqf.asBinder();
            localParcel.writeStrongBinder(localIBinder);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void r(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(9, localParcel, null, 1);
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

      public void s(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        try
        {
          localParcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
          if (paramBundle != null)
          {
            localParcel.writeInt(1);
            paramBundle.writeToParcel(localParcel, 0);
          }
          while (true)
          {
            this.le.transact(10, localParcel, null, 1);
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
 * Qualified Name:     com.google.android.gms.internal.qc
 * JD-Core Version:    0.6.0
 */