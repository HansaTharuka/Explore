package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

public abstract interface bw extends IInterface
{
  public abstract void aw()
    throws RemoteException;

  public abstract String bB()
    throws RemoteException;

  public abstract d bC()
    throws RemoteException;

  public abstract d bD()
    throws RemoteException;

  public abstract String bE()
    throws RemoteException;

  public abstract double bF()
    throws RemoteException;

  public abstract String bG()
    throws RemoteException;

  public abstract String bH()
    throws RemoteException;

  public abstract String getBody()
    throws RemoteException;

  public abstract void j(int paramInt)
    throws RemoteException;

  public static abstract class a extends Binder
    implements bw
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
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
        paramParcel2.writeString("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        j(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        aw();
        paramParcel2.writeNoException();
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        String str5 = bB();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str5);
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        d locald2 = bC();
        paramParcel2.writeNoException();
        IBinder localIBinder2 = null;
        if (locald2 != null)
          localIBinder2 = locald2.asBinder();
        paramParcel2.writeStrongBinder(localIBinder2);
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        String str4 = getBody();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str4);
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        d locald1 = bD();
        paramParcel2.writeNoException();
        IBinder localIBinder1 = null;
        if (locald1 != null)
          localIBinder1 = locald1.asBinder();
        paramParcel2.writeStrongBinder(localIBinder1);
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        String str3 = bE();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        double d = bF();
        paramParcel2.writeNoException();
        paramParcel2.writeDouble(d);
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
        String str2 = bG();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 10:
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      String str1 = bH();
      paramParcel2.writeNoException();
      paramParcel2.writeString(str1);
      return true;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bw
 * JD-Core Version:    0.6.0
 */