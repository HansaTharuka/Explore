package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;

public abstract interface m extends IInterface
{
  public abstract void a(int paramInt, j paramj)
    throws RemoteException;

  public abstract void a(BeginCompoundOperationRequest paramBeginCompoundOperationRequest, o paramo)
    throws RemoteException;

  public abstract void a(EndCompoundOperationRequest paramEndCompoundOperationRequest, j paramj)
    throws RemoteException;

  public abstract void a(EndCompoundOperationRequest paramEndCompoundOperationRequest, o paramo)
    throws RemoteException;

  public abstract void a(ParcelableIndexReference paramParcelableIndexReference, n paramn)
    throws RemoteException;

  public abstract void a(c paramc)
    throws RemoteException;

  public abstract void a(d paramd)
    throws RemoteException;

  public abstract void a(e parame)
    throws RemoteException;

  public abstract void a(h paramh)
    throws RemoteException;

  public abstract void a(i parami)
    throws RemoteException;

  public abstract void a(j paramj)
    throws RemoteException;

  public abstract void a(l paraml)
    throws RemoteException;

  public abstract void a(o paramo)
    throws RemoteException;

  public abstract void a(String paramString, int paramInt1, int paramInt2, g paramg)
    throws RemoteException;

  public abstract void a(String paramString, int paramInt1, int paramInt2, j paramj)
    throws RemoteException;

  public abstract void a(String paramString, int paramInt, DataHolder paramDataHolder, g paramg)
    throws RemoteException;

  public abstract void a(String paramString, int paramInt, DataHolder paramDataHolder, j paramj)
    throws RemoteException;

  public abstract void a(String paramString, int paramInt, o paramo)
    throws RemoteException;

  public abstract void a(String paramString1, int paramInt1, String paramString2, int paramInt2, j paramj)
    throws RemoteException;

  public abstract void a(String paramString1, int paramInt, String paramString2, j paramj)
    throws RemoteException;

  public abstract void a(String paramString, DataHolder paramDataHolder, j paramj)
    throws RemoteException;

  public abstract void a(String paramString, f paramf)
    throws RemoteException;

  public abstract void a(String paramString, j paramj)
    throws RemoteException;

  public abstract void a(String paramString, k paramk)
    throws RemoteException;

  public abstract void a(String paramString, l paraml)
    throws RemoteException;

  public abstract void a(String paramString, n paramn)
    throws RemoteException;

  public abstract void a(String paramString, o paramo)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, f paramf)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, g paramg)
    throws RemoteException;

  public abstract void a(String paramString1, String paramString2, j paramj)
    throws RemoteException;

  public abstract void b(c paramc)
    throws RemoteException;

  public abstract void b(j paramj)
    throws RemoteException;

  public abstract void b(l paraml)
    throws RemoteException;

  public abstract void b(o paramo)
    throws RemoteException;

  public abstract void b(String paramString, f paramf)
    throws RemoteException;

  public abstract void b(String paramString, l paraml)
    throws RemoteException;

  public abstract void b(String paramString, n paramn)
    throws RemoteException;

  public abstract void b(String paramString, o paramo)
    throws RemoteException;

  public abstract void c(c paramc)
    throws RemoteException;

  public abstract void c(String paramString, l paraml)
    throws RemoteException;

  public abstract void d(c paramc)
    throws RemoteException;

  public static abstract class a extends Binder
    implements m
  {
    public static m al(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      if ((localIInterface != null) && ((localIInterface instanceof m)))
        return (m)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), n.a.am(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(c.a.ab(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 33:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(c.a.ab(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 35:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 40:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(l.a.ak(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readString(), f.a.ae(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), l.a.ak(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        String str3 = paramParcel1.readString();
        int i4 = paramParcel1.readInt();
        DataHolder localDataHolder3 = null;
        if (i4 != 0)
          localDataHolder3 = DataHolder.CREATOR.B(paramParcel1);
        a(str3, localDataHolder3, j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 20:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), f.a.ae(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 21:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readString(), g.a.af(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(paramParcel1.readString(), l.a.ak(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(paramParcel1.readString(), n.a.am(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readString(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(paramParcel1.readString(), f.a.ae(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        c(paramParcel1.readString(), l.a.ak(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        String str2 = paramParcel1.readString();
        int i2 = paramParcel1.readInt();
        int i3 = paramParcel1.readInt();
        DataHolder localDataHolder2 = null;
        if (i3 != 0)
          localDataHolder2 = DataHolder.CREATOR.B(paramParcel1);
        a(str2, i2, localDataHolder2, j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        String str1 = paramParcel1.readString();
        int n = paramParcel1.readInt();
        int i1 = paramParcel1.readInt();
        DataHolder localDataHolder1 = null;
        if (i1 != 0)
          localDataHolder1 = DataHolder.CREATOR.B(paramParcel1);
        a(str1, n, localDataHolder1, g.a.af(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readInt(), g.a.af(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 37:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readInt(), paramParcel1.readString(), paramParcel1.readInt(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 18:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        int m = paramParcel1.readInt();
        BeginCompoundOperationRequest localBeginCompoundOperationRequest = null;
        if (m != 0)
          localBeginCompoundOperationRequest = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
        a(localBeginCompoundOperationRequest, o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 41:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        int k = paramParcel1.readInt();
        EndCompoundOperationRequest localEndCompoundOperationRequest2 = null;
        if (k != 0)
          localEndCompoundOperationRequest2 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
        a(localEndCompoundOperationRequest2, j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 22:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 23:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 24:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        c(c.a.ab(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 25:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        d(c.a.ab(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 26:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        int j = paramParcel1.readInt();
        ParcelableIndexReference localParcelableIndexReference = null;
        if (j != 0)
          localParcelableIndexReference = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(paramParcel1);
        a(localParcelableIndexReference, n.a.am(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 27:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), k.a.aj(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 28:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), paramParcel1.readInt(), o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 29:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(l.a.ak(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 30:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readInt(), j.a.ai(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 31:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(e.a.ad(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 32:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(d.a.ac(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 34:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(i.a.ah(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 36:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(h.a.ag(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 38:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        a(paramParcel1.readString(), o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 39:
        paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        b(paramParcel1.readString(), o.a.an(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 19:
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
      int i = paramParcel1.readInt();
      EndCompoundOperationRequest localEndCompoundOperationRequest1 = null;
      if (i != 0)
        localEndCompoundOperationRequest1 = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(paramParcel1);
      a(localEndCompoundOperationRequest1, o.a.an(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }

    private static class a
      implements m
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(int paramInt, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeInt(paramInt);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(30, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(BeginCompoundOperationRequest paramBeginCompoundOperationRequest, o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (paramBeginCompoundOperationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramBeginCompoundOperationRequest.writeToParcel(localParcel1, 0);
            if (paramo != null)
            {
              localIBinder = paramo.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(18, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(EndCompoundOperationRequest paramEndCompoundOperationRequest, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (paramEndCompoundOperationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramEndCompoundOperationRequest.writeToParcel(localParcel1, 0);
            if (paramj != null)
            {
              localIBinder = paramj.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(41, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(EndCompoundOperationRequest paramEndCompoundOperationRequest, o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (paramEndCompoundOperationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramEndCompoundOperationRequest.writeToParcel(localParcel1, 0);
            if (paramo != null)
            {
              localIBinder = paramo.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(19, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(ParcelableIndexReference paramParcelableIndexReference, n paramn)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            if (paramParcelableIndexReference == null)
              continue;
            localParcel1.writeInt(1);
            paramParcelableIndexReference.writeToParcel(localParcel1, 0);
            if (paramn != null)
            {
              localIBinder = paramn.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(26, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramc != null);
          for (IBinder localIBinder = paramc.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(32, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(e parame)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (parame != null);
          for (IBinder localIBinder = parame.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(31, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(h paramh)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramh != null);
          for (IBinder localIBinder = paramh.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(36, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(i parami)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (parami != null);
          for (IBinder localIBinder = parami.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(34, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(22, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(40, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, int paramInt1, int paramInt2, g paramg)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          if (paramg != null);
          for (IBinder localIBinder = paramg.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(17, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, int paramInt1, int paramInt2, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(11, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, int paramInt, DataHolder paramDataHolder, g paramg)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            localParcel1.writeString(paramString);
            localParcel1.writeInt(paramInt);
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            if (paramg != null)
            {
              localIBinder = paramg.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(16, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(String paramString, int paramInt, DataHolder paramDataHolder, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            localParcel1.writeString(paramString);
            localParcel1.writeInt(paramInt);
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            if (paramj != null)
            {
              localIBinder = paramj.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(15, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(String paramString, int paramInt, o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          localParcel1.writeInt(paramInt);
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(28, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString1, int paramInt1, String paramString2, int paramInt2, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString1);
          localParcel1.writeInt(paramInt1);
          localParcel1.writeString(paramString2);
          localParcel1.writeInt(paramInt2);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(37, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString1, int paramInt, String paramString2, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString1);
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString2);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(10, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, DataHolder paramDataHolder, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
            localParcel1.writeString(paramString);
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            if (paramj != null)
            {
              localIBinder = paramj.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(6, localParcel1, localParcel2, 0);
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
          IBinder localIBinder = null;
        }
      }

      public void a(String paramString, f paramf)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramf != null);
          for (IBinder localIBinder = paramf.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(20, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(7, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, k paramk)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramk != null);
          for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(27, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, n paramn)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramn != null);
          for (IBinder localIBinder = paramn.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString, o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(38, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString1, String paramString2, f paramf)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramf != null);
          for (IBinder localIBinder = paramf.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(4, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString1, String paramString2, g paramg)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramg != null);
          for (IBinder localIBinder = paramg.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(21, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(String paramString1, String paramString2, j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString1);
          localParcel1.writeString(paramString2);
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(12, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
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

      public void b(c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramc != null);
          for (IBinder localIBinder = paramc.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(33, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(23, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(29, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(35, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(String paramString, f paramf)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramf != null);
          for (IBinder localIBinder = paramf.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(13, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(String paramString, l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(8, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(String paramString, n paramn)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramn != null);
          for (IBinder localIBinder = paramn.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(9, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(String paramString, o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(39, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void c(c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramc != null);
          for (IBinder localIBinder = paramc.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(24, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void c(String paramString, l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          localParcel1.writeString(paramString);
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(14, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void d(c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
          if (paramc != null);
          for (IBinder localIBinder = paramc.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(25, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
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
 * Qualified Name:     com.google.android.gms.drive.realtime.internal.m
 * JD-Core Version:    0.6.0
 */