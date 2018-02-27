package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public abstract interface IGamesCallbacks extends IInterface
{
  public abstract void A(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void B(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void C(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void D(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void E(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void F(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void G(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void H(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void I(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void J(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void K(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void L(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void M(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void N(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void O(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void P(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void Q(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void a(int paramInt, String paramString, boolean paramBoolean)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder1, DataHolder paramDataHolder2)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, Contents paramContents)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
    throws RemoteException;

  public abstract void a(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void a(DataHolder[] paramArrayOfDataHolder)
    throws RemoteException;

  public abstract void b(int paramInt1, int paramInt2, String paramString)
    throws RemoteException;

  public abstract void b(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void b(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void c(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void c(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void c(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void d(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void d(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void d(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void dO(int paramInt)
    throws RemoteException;

  public abstract void dP(int paramInt)
    throws RemoteException;

  public abstract void dQ(int paramInt)
    throws RemoteException;

  public abstract void e(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void e(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void e(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void f(int paramInt, Bundle paramBundle)
    throws RemoteException;

  public abstract void f(int paramInt, String paramString)
    throws RemoteException;

  public abstract void f(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void f(DataHolder paramDataHolder, String[] paramArrayOfString)
    throws RemoteException;

  public abstract void fK()
    throws RemoteException;

  public abstract void g(int paramInt, String paramString)
    throws RemoteException;

  public abstract void g(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void h(int paramInt, String paramString)
    throws RemoteException;

  public abstract void h(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void i(int paramInt, String paramString)
    throws RemoteException;

  public abstract void i(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void j(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void k(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void l(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void m(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void n(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void o(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void onInvitationRemoved(String paramString)
    throws RemoteException;

  public abstract void onLeftRoom(int paramInt, String paramString)
    throws RemoteException;

  public abstract void onP2PConnected(String paramString)
    throws RemoteException;

  public abstract void onP2PDisconnected(String paramString)
    throws RemoteException;

  public abstract void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
    throws RemoteException;

  public abstract void onRequestRemoved(String paramString)
    throws RemoteException;

  public abstract void onTurnBasedMatchRemoved(String paramString)
    throws RemoteException;

  public abstract void p(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void q(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void r(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void s(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void t(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void u(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void v(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void w(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void x(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void y(DataHolder paramDataHolder)
    throws RemoteException;

  public abstract void z(DataHolder paramDataHolder)
    throws RemoteException;

  public static abstract class Stub extends Binder
    implements IGamesCallbacks
  {
    public Stub()
    {
      attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static IGamesCallbacks aD(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof IGamesCallbacks)))
        return (IGamesCallbacks)localIInterface;
      return new Proxy(paramIBinder);
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
        paramParcel2.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
        return true;
      case 5001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        f(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5002:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        if (paramParcel1.readInt() != 0);
        for (DataHolder localDataHolder51 = DataHolder.CREATOR.B(paramParcel1); ; localDataHolder51 = null)
        {
          c(localDataHolder51);
          paramParcel2.writeNoException();
          return true;
        }
      case 5003:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        g(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5004:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i49 = paramParcel1.readInt();
        DataHolder localDataHolder50 = null;
        if (i49 != 0)
          localDataHolder50 = DataHolder.CREATOR.B(paramParcel1);
        e(localDataHolder50);
        paramParcel2.writeNoException();
        return true;
      case 5005:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        if (paramParcel1.readInt() != 0);
        for (DataHolder localDataHolder48 = DataHolder.CREATOR.B(paramParcel1); ; localDataHolder48 = null)
        {
          int i48 = paramParcel1.readInt();
          DataHolder localDataHolder49 = null;
          if (i48 != 0)
            localDataHolder49 = DataHolder.CREATOR.B(paramParcel1);
          a(localDataHolder48, localDataHolder49);
          paramParcel2.writeNoException();
          return true;
        }
      case 5006:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i47 = paramParcel1.readInt();
        DataHolder localDataHolder47 = null;
        if (i47 != 0)
          localDataHolder47 = DataHolder.CREATOR.B(paramParcel1);
        f(localDataHolder47);
        paramParcel2.writeNoException();
        return true;
      case 5007:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i46 = paramParcel1.readInt();
        DataHolder localDataHolder46 = null;
        if (i46 != 0)
          localDataHolder46 = DataHolder.CREATOR.B(paramParcel1);
        g(localDataHolder46);
        paramParcel2.writeNoException();
        return true;
      case 5008:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i45 = paramParcel1.readInt();
        DataHolder localDataHolder45 = null;
        if (i45 != 0)
          localDataHolder45 = DataHolder.CREATOR.B(paramParcel1);
        h(localDataHolder45);
        paramParcel2.writeNoException();
        return true;
      case 5009:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i44 = paramParcel1.readInt();
        DataHolder localDataHolder44 = null;
        if (i44 != 0)
          localDataHolder44 = DataHolder.CREATOR.B(paramParcel1);
        i(localDataHolder44);
        paramParcel2.writeNoException();
        return true;
      case 5010:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i43 = paramParcel1.readInt();
        DataHolder localDataHolder43 = null;
        if (i43 != 0)
          localDataHolder43 = DataHolder.CREATOR.B(paramParcel1);
        j(localDataHolder43);
        paramParcel2.writeNoException();
        return true;
      case 5011:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i42 = paramParcel1.readInt();
        DataHolder localDataHolder42 = null;
        if (i42 != 0)
          localDataHolder42 = DataHolder.CREATOR.B(paramParcel1);
        k(localDataHolder42);
        paramParcel2.writeNoException();
        return true;
      case 5016:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        fK();
        paramParcel2.writeNoException();
        return true;
      case 5017:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i41 = paramParcel1.readInt();
        DataHolder localDataHolder41 = null;
        if (i41 != 0)
          localDataHolder41 = DataHolder.CREATOR.B(paramParcel1);
        m(localDataHolder41);
        paramParcel2.writeNoException();
        return true;
      case 5037:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i40 = paramParcel1.readInt();
        DataHolder localDataHolder40 = null;
        if (i40 != 0)
          localDataHolder40 = DataHolder.CREATOR.B(paramParcel1);
        n(localDataHolder40);
        paramParcel2.writeNoException();
        return true;
      case 5018:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i39 = paramParcel1.readInt();
        DataHolder localDataHolder39 = null;
        if (i39 != 0)
          localDataHolder39 = DataHolder.CREATOR.B(paramParcel1);
        u(localDataHolder39);
        paramParcel2.writeNoException();
        return true;
      case 5019:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i38 = paramParcel1.readInt();
        DataHolder localDataHolder38 = null;
        if (i38 != 0)
          localDataHolder38 = DataHolder.CREATOR.B(paramParcel1);
        v(localDataHolder38);
        paramParcel2.writeNoException();
        return true;
      case 5020:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onLeftRoom(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5021:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i37 = paramParcel1.readInt();
        DataHolder localDataHolder37 = null;
        if (i37 != 0)
          localDataHolder37 = DataHolder.CREATOR.B(paramParcel1);
        w(localDataHolder37);
        paramParcel2.writeNoException();
        return true;
      case 5022:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i36 = paramParcel1.readInt();
        DataHolder localDataHolder36 = null;
        if (i36 != 0)
          localDataHolder36 = DataHolder.CREATOR.B(paramParcel1);
        x(localDataHolder36);
        paramParcel2.writeNoException();
        return true;
      case 5023:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i35 = paramParcel1.readInt();
        DataHolder localDataHolder35 = null;
        if (i35 != 0)
          localDataHolder35 = DataHolder.CREATOR.B(paramParcel1);
        y(localDataHolder35);
        paramParcel2.writeNoException();
        return true;
      case 5024:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i34 = paramParcel1.readInt();
        DataHolder localDataHolder34 = null;
        if (i34 != 0)
          localDataHolder34 = DataHolder.CREATOR.B(paramParcel1);
        z(localDataHolder34);
        paramParcel2.writeNoException();
        return true;
      case 5025:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i33 = paramParcel1.readInt();
        DataHolder localDataHolder33 = null;
        if (i33 != 0)
          localDataHolder33 = DataHolder.CREATOR.B(paramParcel1);
        A(localDataHolder33);
        paramParcel2.writeNoException();
        return true;
      case 5026:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i32 = paramParcel1.readInt();
        DataHolder localDataHolder32 = null;
        if (i32 != 0)
          localDataHolder32 = DataHolder.CREATOR.B(paramParcel1);
        a(localDataHolder32, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5027:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i31 = paramParcel1.readInt();
        DataHolder localDataHolder31 = null;
        if (i31 != 0)
          localDataHolder31 = DataHolder.CREATOR.B(paramParcel1);
        b(localDataHolder31, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5028:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i30 = paramParcel1.readInt();
        DataHolder localDataHolder30 = null;
        if (i30 != 0)
          localDataHolder30 = DataHolder.CREATOR.B(paramParcel1);
        c(localDataHolder30, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5029:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i29 = paramParcel1.readInt();
        DataHolder localDataHolder29 = null;
        if (i29 != 0)
          localDataHolder29 = DataHolder.CREATOR.B(paramParcel1);
        d(localDataHolder29, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5030:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i28 = paramParcel1.readInt();
        DataHolder localDataHolder28 = null;
        if (i28 != 0)
          localDataHolder28 = DataHolder.CREATOR.B(paramParcel1);
        e(localDataHolder28, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5031:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i27 = paramParcel1.readInt();
        DataHolder localDataHolder27 = null;
        if (i27 != 0)
          localDataHolder27 = DataHolder.CREATOR.B(paramParcel1);
        f(localDataHolder27, paramParcel1.createStringArray());
        paramParcel2.writeNoException();
        return true;
      case 5032:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        if (paramParcel1.readInt() != 0);
        for (RealTimeMessage localRealTimeMessage = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(paramParcel1); ; localRealTimeMessage = null)
        {
          onRealTimeMessageReceived(localRealTimeMessage);
          paramParcel2.writeNoException();
          return true;
        }
      case 5033:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        b(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5034:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i26 = paramParcel1.readInt();
        String str2 = paramParcel1.readString();
        if (paramParcel1.readInt() != 0);
        for (boolean bool = true; ; bool = false)
        {
          a(i26, str2, bool);
          paramParcel2.writeNoException();
          return true;
        }
      case 5038:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i25 = paramParcel1.readInt();
        DataHolder localDataHolder26 = null;
        if (i25 != 0)
          localDataHolder26 = DataHolder.CREATOR.B(paramParcel1);
        B(localDataHolder26);
        paramParcel2.writeNoException();
        return true;
      case 5035:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i24 = paramParcel1.readInt();
        DataHolder localDataHolder25 = null;
        if (i24 != 0)
          localDataHolder25 = DataHolder.CREATOR.B(paramParcel1);
        C(localDataHolder25);
        paramParcel2.writeNoException();
        return true;
      case 5036:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        dO(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 5039:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i23 = paramParcel1.readInt();
        DataHolder localDataHolder24 = null;
        if (i23 != 0)
          localDataHolder24 = DataHolder.CREATOR.B(paramParcel1);
        D(localDataHolder24);
        paramParcel2.writeNoException();
        return true;
      case 5040:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        dP(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 6001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onP2PConnected(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 6002:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onP2PDisconnected(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 8001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i22 = paramParcel1.readInt();
        DataHolder localDataHolder23 = null;
        if (i22 != 0)
          localDataHolder23 = DataHolder.CREATOR.B(paramParcel1);
        E(localDataHolder23);
        paramParcel2.writeNoException();
        return true;
      case 8002:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i21 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle5 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle5 = null)
        {
          b(i21, localBundle5);
          paramParcel2.writeNoException();
          return true;
        }
      case 8003:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i20 = paramParcel1.readInt();
        DataHolder localDataHolder22 = null;
        if (i20 != 0)
          localDataHolder22 = DataHolder.CREATOR.B(paramParcel1);
        p(localDataHolder22);
        paramParcel2.writeNoException();
        return true;
      case 8004:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i19 = paramParcel1.readInt();
        DataHolder localDataHolder21 = null;
        if (i19 != 0)
          localDataHolder21 = DataHolder.CREATOR.B(paramParcel1);
        q(localDataHolder21);
        paramParcel2.writeNoException();
        return true;
      case 8005:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i18 = paramParcel1.readInt();
        DataHolder localDataHolder20 = null;
        if (i18 != 0)
          localDataHolder20 = DataHolder.CREATOR.B(paramParcel1);
        r(localDataHolder20);
        paramParcel2.writeNoException();
        return true;
      case 8006:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i17 = paramParcel1.readInt();
        DataHolder localDataHolder19 = null;
        if (i17 != 0)
          localDataHolder19 = DataHolder.CREATOR.B(paramParcel1);
        s(localDataHolder19);
        paramParcel2.writeNoException();
        return true;
      case 8007:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        h(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 8008:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i16 = paramParcel1.readInt();
        DataHolder localDataHolder18 = null;
        if (i16 != 0)
          localDataHolder18 = DataHolder.CREATOR.B(paramParcel1);
        t(localDataHolder18);
        paramParcel2.writeNoException();
        return true;
      case 8009:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onTurnBasedMatchRemoved(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 8010:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onInvitationRemoved(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 9001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i15 = paramParcel1.readInt();
        DataHolder localDataHolder17 = null;
        if (i15 != 0)
          localDataHolder17 = DataHolder.CREATOR.B(paramParcel1);
        l(localDataHolder17);
        paramParcel2.writeNoException();
        return true;
      case 10001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i14 = paramParcel1.readInt();
        DataHolder localDataHolder16 = null;
        if (i14 != 0)
          localDataHolder16 = DataHolder.CREATOR.B(paramParcel1);
        o(localDataHolder16);
        paramParcel2.writeNoException();
        return true;
      case 10002:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        onRequestRemoved(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 10003:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i13 = paramParcel1.readInt();
        DataHolder localDataHolder15 = null;
        if (i13 != 0)
          localDataHolder15 = DataHolder.CREATOR.B(paramParcel1);
        F(localDataHolder15);
        paramParcel2.writeNoException();
        return true;
      case 10004:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i12 = paramParcel1.readInt();
        DataHolder localDataHolder14 = null;
        if (i12 != 0)
          localDataHolder14 = DataHolder.CREATOR.B(paramParcel1);
        G(localDataHolder14);
        paramParcel2.writeNoException();
        return true;
      case 10005:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i11 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle4 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle4 = null)
        {
          c(i11, localBundle4);
          paramParcel2.writeNoException();
          return true;
        }
      case 10006:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i10 = paramParcel1.readInt();
        DataHolder localDataHolder13 = null;
        if (i10 != 0)
          localDataHolder13 = DataHolder.CREATOR.B(paramParcel1);
        H(localDataHolder13);
        paramParcel2.writeNoException();
        return true;
      case 11001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i9 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle3 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle3 = null)
        {
          d(i9, localBundle3);
          paramParcel2.writeNoException();
          return true;
        }
      case 12001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i8 = paramParcel1.readInt();
        DataHolder localDataHolder12 = null;
        if (i8 != 0)
          localDataHolder12 = DataHolder.CREATOR.B(paramParcel1);
        I(localDataHolder12);
        paramParcel2.writeNoException();
        return true;
      case 12004:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        DataHolder localDataHolder11;
        if (paramParcel1.readInt() != 0)
        {
          localDataHolder11 = DataHolder.CREATOR.B(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2865;
        }
        for (Contents localContents4 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1); ; localContents4 = null)
        {
          a(localDataHolder11, localContents4);
          paramParcel2.writeNoException();
          return true;
          localDataHolder11 = null;
          break;
        }
      case 12017:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        DataHolder localDataHolder10;
        String str1;
        Contents localContents1;
        if (paramParcel1.readInt() != 0)
        {
          localDataHolder10 = DataHolder.CREATOR.B(paramParcel1);
          str1 = paramParcel1.readString();
          if (paramParcel1.readInt() == 0)
            break label2995;
          localContents1 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label3001;
        }
        for (Contents localContents2 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1); ; localContents2 = null)
        {
          int i7 = paramParcel1.readInt();
          Contents localContents3 = null;
          if (i7 != 0)
            localContents3 = (Contents)Contents.CREATOR.createFromParcel(paramParcel1);
          a(localDataHolder10, str1, localContents1, localContents2, localContents3);
          paramParcel2.writeNoException();
          return true;
          localDataHolder10 = null;
          break;
          localContents1 = null;
          break label2920;
        }
      case 12005:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i6 = paramParcel1.readInt();
        DataHolder localDataHolder9 = null;
        if (i6 != 0)
          localDataHolder9 = DataHolder.CREATOR.B(paramParcel1);
        J(localDataHolder9);
        paramParcel2.writeNoException();
        return true;
      case 12012:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        i(paramParcel1.readInt(), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 12003:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i5 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
        {
          e(i5, localBundle2);
          paramParcel2.writeNoException();
          return true;
        }
      case 12013:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i4 = paramParcel1.readInt();
        DataHolder localDataHolder8 = null;
        if (i4 != 0)
          localDataHolder8 = DataHolder.CREATOR.B(paramParcel1);
        P(localDataHolder8);
        paramParcel2.writeNoException();
        return true;
      case 12011:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i3 = paramParcel1.readInt();
        DataHolder localDataHolder7 = null;
        if (i3 != 0)
          localDataHolder7 = DataHolder.CREATOR.B(paramParcel1);
        d(localDataHolder7);
        paramParcel2.writeNoException();
        return true;
      case 12006:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i2 = paramParcel1.readInt();
        DataHolder localDataHolder6 = null;
        if (i2 != 0)
          localDataHolder6 = DataHolder.CREATOR.B(paramParcel1);
        K(localDataHolder6);
        paramParcel2.writeNoException();
        return true;
      case 12007:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i1 = paramParcel1.readInt();
        DataHolder localDataHolder5 = null;
        if (i1 != 0)
          localDataHolder5 = DataHolder.CREATOR.B(paramParcel1);
        L(localDataHolder5);
        paramParcel2.writeNoException();
        return true;
      case 12014:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int n = paramParcel1.readInt();
        DataHolder localDataHolder4 = null;
        if (n != 0)
          localDataHolder4 = DataHolder.CREATOR.B(paramParcel1);
        M(localDataHolder4);
        paramParcel2.writeNoException();
        return true;
      case 12016:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int m = paramParcel1.readInt();
        DataHolder localDataHolder3 = null;
        if (m != 0)
          localDataHolder3 = DataHolder.CREATOR.B(paramParcel1);
        N(localDataHolder3);
        paramParcel2.writeNoException();
        return true;
      case 12008:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int k = paramParcel1.readInt();
        DataHolder localDataHolder2 = null;
        if (k != 0)
          localDataHolder2 = DataHolder.CREATOR.B(paramParcel1);
        O(localDataHolder2);
        paramParcel2.writeNoException();
        return true;
      case 12015:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int j = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
        {
          f(j, localBundle1);
          paramParcel2.writeNoException();
          return true;
        }
      case 13001:
        paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        int i = paramParcel1.readInt();
        DataHolder localDataHolder1 = null;
        if (i != 0)
          localDataHolder1 = DataHolder.CREATOR.B(paramParcel1);
        Q(localDataHolder1);
        paramParcel2.writeNoException();
        return true;
      case 13002:
        label2865: label2920: paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        label2995: label3001: dQ(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 14001:
      }
      paramParcel1.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
      a((DataHolder[])paramParcel1.createTypedArray(DataHolder.CREATOR));
      paramParcel2.writeNoException();
      return true;
    }

    private static class Proxy
      implements IGamesCallbacks
    {
      private IBinder le;

      Proxy(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void A(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5025, localParcel1, localParcel2, 0);
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

      public void B(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5038, localParcel1, localParcel2, 0);
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

      public void C(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5035, localParcel1, localParcel2, 0);
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

      public void D(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5039, localParcel1, localParcel2, 0);
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

      public void E(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8001, localParcel1, localParcel2, 0);
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

      public void F(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10003, localParcel1, localParcel2, 0);
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

      public void G(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10004, localParcel1, localParcel2, 0);
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

      public void H(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10006, localParcel1, localParcel2, 0);
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

      public void I(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12001, localParcel1, localParcel2, 0);
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

      public void J(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12005, localParcel1, localParcel2, 0);
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

      public void K(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12006, localParcel1, localParcel2, 0);
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

      public void L(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12007, localParcel1, localParcel2, 0);
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

      public void M(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12014, localParcel1, localParcel2, 0);
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

      public void N(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12016, localParcel1, localParcel2, 0);
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

      public void O(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12008, localParcel1, localParcel2, 0);
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

      public void P(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12013, localParcel1, localParcel2, 0);
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

      public void Q(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(13001, localParcel1, localParcel2, 0);
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

      public void a(int paramInt, String paramString, boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(5034, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(DataHolder paramDataHolder1, DataHolder paramDataHolder2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (paramDataHolder1 == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder1.writeToParcel(localParcel1, 0);
            if (paramDataHolder2 != null)
            {
              localParcel1.writeInt(1);
              paramDataHolder2.writeToParcel(localParcel1, 0);
              this.le.transact(5005, localParcel1, localParcel2, 0);
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

      public void a(DataHolder paramDataHolder, Contents paramContents)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            if (paramContents != null)
            {
              localParcel1.writeInt(1);
              paramContents.writeToParcel(localParcel1, 0);
              this.le.transact(12004, localParcel1, localParcel2, 0);
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

      public void a(DataHolder paramDataHolder, String paramString, Contents paramContents1, Contents paramContents2, Contents paramContents3)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (paramDataHolder == null)
              continue;
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
            localParcel1.writeString(paramString);
            if (paramContents1 != null)
            {
              localParcel1.writeInt(1);
              paramContents1.writeToParcel(localParcel1, 0);
              if (paramContents2 == null)
                break label162;
              localParcel1.writeInt(1);
              paramContents2.writeToParcel(localParcel1, 0);
              if (paramContents3 == null)
                break label171;
              localParcel1.writeInt(1);
              paramContents3.writeToParcel(localParcel1, 0);
              this.le.transact(12017, localParcel1, localParcel2, 0);
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
          continue;
          label162: localParcel1.writeInt(0);
          continue;
          label171: localParcel1.writeInt(0);
        }
      }

      public void a(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5026, localParcel1, localParcel2, 0);
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

      public void a(DataHolder[] paramArrayOfDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeTypedArray(paramArrayOfDataHolder, 0);
          this.le.transact(14001, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
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

      public void b(int paramInt1, int paramInt2, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeString(paramString);
          this.le.transact(5033, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void b(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8002, localParcel1, localParcel2, 0);
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

      public void b(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5027, localParcel1, localParcel2, 0);
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

      public void c(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10005, localParcel1, localParcel2, 0);
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

      public void c(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5002, localParcel1, localParcel2, 0);
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

      public void c(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5028, localParcel1, localParcel2, 0);
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

      public void d(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(11001, localParcel1, localParcel2, 0);
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

      public void d(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12011, localParcel1, localParcel2, 0);
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

      public void d(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5029, localParcel1, localParcel2, 0);
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

      public void dO(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          this.le.transact(5036, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void dP(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          this.le.transact(5040, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void dQ(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          this.le.transact(13002, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void e(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12003, localParcel1, localParcel2, 0);
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

      public void e(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5004, localParcel1, localParcel2, 0);
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

      public void e(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5030, localParcel1, localParcel2, 0);
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

      public void f(int paramInt, Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12015, localParcel1, localParcel2, 0);
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

      public void f(int paramInt, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.le.transact(5001, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void f(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5006, localParcel1, localParcel2, 0);
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

      public void f(DataHolder paramDataHolder, String[] paramArrayOfString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeStringArray(paramArrayOfString);
            this.le.transact(5031, localParcel1, localParcel2, 0);
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

      public void fK()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          this.le.transact(5016, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void g(int paramInt, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.le.transact(5003, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void g(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5007, localParcel1, localParcel2, 0);
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

      public void h(int paramInt, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.le.transact(8007, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void h(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5008, localParcel1, localParcel2, 0);
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

      public void i(int paramInt, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.le.transact(12012, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void i(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5009, localParcel1, localParcel2, 0);
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

      public void j(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5010, localParcel1, localParcel2, 0);
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

      public void k(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5011, localParcel1, localParcel2, 0);
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

      public void l(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(9001, localParcel1, localParcel2, 0);
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

      public void m(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5017, localParcel1, localParcel2, 0);
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

      public void n(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5037, localParcel1, localParcel2, 0);
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

      public void o(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10001, localParcel1, localParcel2, 0);
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

      public void onInvitationRemoved(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeString(paramString);
          this.le.transact(8010, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void onLeftRoom(int paramInt, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeInt(paramInt);
          localParcel1.writeString(paramString);
          this.le.transact(5020, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void onP2PConnected(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeString(paramString);
          this.le.transact(6001, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void onP2PDisconnected(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeString(paramString);
          this.le.transact(6002, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramRealTimeMessage != null)
          {
            localParcel1.writeInt(1);
            paramRealTimeMessage.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5032, localParcel1, localParcel2, 0);
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

      public void onRequestRemoved(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeString(paramString);
          this.le.transact(10002, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void onTurnBasedMatchRemoved(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          localParcel1.writeString(paramString);
          this.le.transact(8009, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void p(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8003, localParcel1, localParcel2, 0);
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

      public void q(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8004, localParcel1, localParcel2, 0);
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

      public void r(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8005, localParcel1, localParcel2, 0);
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

      public void s(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8006, localParcel1, localParcel2, 0);
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

      public void t(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8008, localParcel1, localParcel2, 0);
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

      public void u(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5018, localParcel1, localParcel2, 0);
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

      public void v(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5019, localParcel1, localParcel2, 0);
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

      public void w(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5021, localParcel1, localParcel2, 0);
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

      public void x(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5022, localParcel1, localParcel2, 0);
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

      public void y(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5023, localParcel1, localParcel2, 0);
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

      public void z(DataHolder paramDataHolder)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
          if (paramDataHolder != null)
          {
            localParcel1.writeInt(1);
            paramDataHolder.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5024, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.games.internal.IGamesCallbacks
 * JD-Core Version:    0.6.0
 */