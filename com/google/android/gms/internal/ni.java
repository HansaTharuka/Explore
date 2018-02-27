package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;
import com.google.android.gms.location.b.a;
import com.google.android.gms.location.d;
import com.google.android.gms.location.e;
import com.google.android.gms.location.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.g;
import com.google.android.gms.maps.model.i;
import java.util.ArrayList;
import java.util.List;

public abstract interface ni extends IInterface
{
  public abstract void S(boolean paramBoolean)
    throws RemoteException;

  public abstract void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(PendingIntent paramPendingIntent, nh paramnh, String paramString)
    throws RemoteException;

  public abstract void a(Location paramLocation, int paramInt)
    throws RemoteException;

  public abstract void a(nh paramnh, String paramString)
    throws RemoteException;

  public abstract void a(nl paramnl, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(nl paramnl, b paramb)
    throws RemoteException;

  public abstract void a(ns paramns, oh paramoh, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(nu paramnu, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(nw paramnw, oh paramoh)
    throws RemoteException;

  public abstract void a(ny paramny, oh paramoh, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(oc paramoc, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(oe paramoe, LatLngBounds paramLatLngBounds, List<String> paramList, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(oh paramoh, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, nh paramnh)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, b paramb)
    throws RemoteException;

  public abstract void a(LocationRequest paramLocationRequest, b paramb, String paramString)
    throws RemoteException;

  public abstract void a(b paramb)
    throws RemoteException;

  public abstract void a(LatLng paramLatLng, nu paramnu, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, nu paramnu, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, nu paramnu, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(String paramString, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(String paramString, LatLngBounds paramLatLngBounds, nq paramnq, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(List<nn> paramList, PendingIntent paramPendingIntent, nh paramnh, String paramString)
    throws RemoteException;

  public abstract void a(List<String> paramList, oh paramoh, og paramog)
    throws RemoteException;

  public abstract void a(String[] paramArrayOfString, nh paramnh, String paramString)
    throws RemoteException;

  public abstract void b(PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void b(Location paramLocation)
    throws RemoteException;

  public abstract void b(oh paramoh, PendingIntent paramPendingIntent)
    throws RemoteException;

  public abstract void b(String paramString, oh paramoh, og paramog)
    throws RemoteException;

  public abstract Location bZ(String paramString)
    throws RemoteException;

  public abstract e ca(String paramString)
    throws RemoteException;

  public abstract Location ni()
    throws RemoteException;

  public abstract IBinder nj()
    throws RemoteException;

  public abstract IBinder nk()
    throws RemoteException;

  public static abstract class a extends Binder
    implements ni
  {
    public static ni aO(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      if ((localIInterface != null) && ((localIInterface instanceof ni)))
        return (ni)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ArrayList localArrayList3 = paramParcel1.createTypedArrayList(nn.CREATOR);
        if (paramParcel1.readInt() != 0);
        for (PendingIntent localPendingIntent12 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent12 = null)
        {
          a(localArrayList3, localPendingIntent12, nh.a.aN(paramParcel1.readStrongBinder()), paramParcel1.readString());
          paramParcel2.writeNoException();
          return true;
        }
      case 57:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        GeofencingRequest localGeofencingRequest;
        if (paramParcel1.readInt() != 0)
        {
          localGeofencingRequest = (GeofencingRequest)GeofencingRequest.CREATOR.createFromParcel(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label476;
        }
        for (PendingIntent localPendingIntent11 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent11 = null)
        {
          a(localGeofencingRequest, localPendingIntent11, nh.a.aN(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localGeofencingRequest = null;
          break;
        }
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (PendingIntent localPendingIntent10 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent10 = null)
        {
          a(localPendingIntent10, nh.a.aN(paramParcel1.readStrongBinder()), paramParcel1.readString());
          paramParcel2.writeNoException();
          return true;
        }
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a(paramParcel1.createStringArray(), nh.a.aN(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a(nh.a.aN(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        long l = paramParcel1.readLong();
        boolean bool2;
        if (paramParcel1.readInt() != 0)
        {
          bool2 = true;
          if (paramParcel1.readInt() == 0)
            break label661;
        }
        for (PendingIntent localPendingIntent9 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent9 = null)
        {
          a(l, bool2, localPendingIntent9);
          paramParcel2.writeNoException();
          return true;
          bool2 = false;
          break;
        }
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (PendingIntent localPendingIntent8 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent8 = null)
        {
          a(localPendingIntent8);
          paramParcel2.writeNoException();
          return true;
        }
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Location localLocation4 = ni();
        paramParcel2.writeNoException();
        if (localLocation4 != null)
        {
          paramParcel2.writeInt(1);
          localLocation4.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i9 = paramParcel1.readInt();
        LocationRequest localLocationRequest3 = null;
        if (i9 != 0)
          localLocationRequest3 = LocationRequest.CREATOR.cJ(paramParcel1);
        a(localLocationRequest3, b.a.aL(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 20:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i8 = paramParcel1.readInt();
        LocationRequest localLocationRequest2 = null;
        if (i8 != 0)
          localLocationRequest2 = LocationRequest.CREATOR.cJ(paramParcel1);
        a(localLocationRequest2, b.a.aL(paramParcel1.readStrongBinder()), paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        LocationRequest localLocationRequest1;
        if (paramParcel1.readInt() != 0)
        {
          localLocationRequest1 = LocationRequest.CREATOR.cJ(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label917;
        }
        for (PendingIntent localPendingIntent7 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent7 = null)
        {
          a(localLocationRequest1, localPendingIntent7);
          paramParcel2.writeNoException();
          return true;
          localLocationRequest1 = null;
          break;
        }
      case 52:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i7 = paramParcel1.readInt();
        nl localnl2 = null;
        if (i7 != 0)
          localnl2 = nl.CREATOR.cM(paramParcel1);
        a(localnl2, b.a.aL(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 53:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        nl localnl1;
        if (paramParcel1.readInt() != 0)
        {
          localnl1 = nl.CREATOR.cM(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1034;
        }
        for (PendingIntent localPendingIntent6 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent6 = null)
        {
          a(localnl1, localPendingIntent6);
          paramParcel2.writeNoException();
          return true;
          localnl1 = null;
          break;
        }
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        a(b.a.aL(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (PendingIntent localPendingIntent5 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent5 = null)
        {
          b(localPendingIntent5);
          paramParcel2.writeNoException();
          return true;
        }
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        int i6 = paramParcel1.readInt();
        boolean bool1 = false;
        if (i6 != 0)
          bool1 = true;
        S(bool1);
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (Location localLocation3 = (Location)Location.CREATOR.createFromParcel(paramParcel1); ; localLocation3 = null)
        {
          b(localLocation3);
          paramParcel2.writeNoException();
          return true;
        }
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        LatLngBounds localLatLngBounds4;
        int i5;
        nu localnu4;
        if (paramParcel1.readInt() != 0)
        {
          localLatLngBounds4 = LatLngBounds.CREATOR.dd(paramParcel1);
          i5 = paramParcel1.readInt();
          if (paramParcel1.readInt() == 0)
            break label1279;
          localnu4 = nu.CREATOR.cQ(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1285;
        }
        for (oh localoh15 = oh.CREATOR.cW(paramParcel1); ; localoh15 = null)
        {
          a(localLatLngBounds4, i5, localnu4, localoh15, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localLatLngBounds4 = null;
          break;
          localnu4 = null;
          break label1232;
        }
      case 47:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        LatLngBounds localLatLngBounds3;
        int i3;
        String str4;
        if (paramParcel1.readInt() != 0)
        {
          localLatLngBounds3 = LatLngBounds.CREATOR.dd(paramParcel1);
          i3 = paramParcel1.readInt();
          str4 = paramParcel1.readString();
          if (paramParcel1.readInt() == 0)
            break label1397;
        }
        for (nu localnu3 = nu.CREATOR.cQ(paramParcel1); ; localnu3 = null)
        {
          int i4 = paramParcel1.readInt();
          oh localoh14 = null;
          if (i4 != 0)
            localoh14 = oh.CREATOR.cW(paramParcel1);
          a(localLatLngBounds3, i3, str4, localnu3, localoh14, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localLatLngBounds3 = null;
          break;
        }
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        String str3 = paramParcel1.readString();
        int i2 = paramParcel1.readInt();
        oh localoh13 = null;
        if (i2 != 0)
          localoh13 = oh.CREATOR.cW(paramParcel1);
        a(str3, localoh13, og.a.aP(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        LatLng localLatLng;
        if (paramParcel1.readInt() != 0)
        {
          localLatLng = LatLng.CREATOR.de(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1549;
        }
        for (nu localnu2 = nu.CREATOR.cQ(paramParcel1); ; localnu2 = null)
        {
          int i1 = paramParcel1.readInt();
          oh localoh12 = null;
          if (i1 != 0)
            localoh12 = oh.CREATOR.cW(paramParcel1);
          a(localLatLng, localnu2, localoh12, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localLatLng = null;
          break;
        }
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (nu localnu1 = nu.CREATOR.cQ(paramParcel1); ; localnu1 = null)
        {
          int n = paramParcel1.readInt();
          oh localoh11 = null;
          if (n != 0)
            localoh11 = oh.CREATOR.cW(paramParcel1);
          a(localnu1, localoh11, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
        }
      case 42:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        String str2 = paramParcel1.readString();
        int m = paramParcel1.readInt();
        oh localoh10 = null;
        if (m != 0)
          localoh10 = oh.CREATOR.cW(paramParcel1);
        b(str2, localoh10, og.a.aP(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 58:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ArrayList localArrayList2 = paramParcel1.createStringArrayList();
        int k = paramParcel1.readInt();
        oh localoh9 = null;
        if (k != 0)
          localoh9 = oh.CREATOR.cW(paramParcel1);
        a(localArrayList2, localoh9, og.a.aP(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 50:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        oe localoe;
        LatLngBounds localLatLngBounds2;
        ArrayList localArrayList1;
        if (paramParcel1.readInt() != 0)
        {
          localoe = oe.CREATOR.cV(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1830;
          localLatLngBounds2 = LatLngBounds.CREATOR.dd(paramParcel1);
          localArrayList1 = paramParcel1.createStringArrayList();
          if (paramParcel1.readInt() == 0)
            break label1836;
        }
        for (oh localoh8 = oh.CREATOR.cW(paramParcel1); ; localoh8 = null)
        {
          a(localoe, localLatLngBounds2, localArrayList1, localoh8, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localoe = null;
          break;
          localLatLngBounds2 = null;
          break label1777;
        }
      case 18:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ny localny;
        oh localoh7;
        if (paramParcel1.readInt() != 0)
        {
          localny = ny.CREATOR.cS(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1923;
          localoh7 = oh.CREATOR.cW(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1929;
        }
        for (PendingIntent localPendingIntent4 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent4 = null)
        {
          a(localny, localoh7, localPendingIntent4);
          paramParcel2.writeNoException();
          return true;
          localny = null;
          break;
          localoh7 = null;
          break label1880;
        }
      case 19:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        oh localoh6;
        if (paramParcel1.readInt() != 0)
        {
          localoh6 = oh.CREATOR.cW(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label1998;
        }
        for (PendingIntent localPendingIntent3 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent3 = null)
        {
          a(localoh6, localPendingIntent3);
          paramParcel2.writeNoException();
          return true;
          localoh6 = null;
          break;
        }
      case 48:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        ns localns;
        oh localoh5;
        if (paramParcel1.readInt() != 0)
        {
          localns = ns.CREATOR.cP(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2085;
          localoh5 = oh.CREATOR.cW(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2091;
        }
        for (PendingIntent localPendingIntent2 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent2 = null)
        {
          a(localns, localoh5, localPendingIntent2);
          paramParcel2.writeNoException();
          return true;
          localns = null;
          break;
          localoh5 = null;
          break label2042;
        }
      case 49:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        oh localoh4;
        if (paramParcel1.readInt() != 0)
        {
          localoh4 = oh.CREATOR.cW(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2160;
        }
        for (PendingIntent localPendingIntent1 = (PendingIntent)PendingIntent.CREATOR.createFromParcel(paramParcel1); ; localPendingIntent1 = null)
        {
          b(localoh4, localPendingIntent1);
          paramParcel2.writeNoException();
          return true;
          localoh4 = null;
          break;
        }
      case 55:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        String str1 = paramParcel1.readString();
        LatLngBounds localLatLngBounds1;
        nq localnq;
        if (paramParcel1.readInt() != 0)
        {
          localLatLngBounds1 = LatLngBounds.CREATOR.dd(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2257;
          localnq = nq.CREATOR.cO(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2263;
        }
        for (oh localoh3 = oh.CREATOR.cW(paramParcel1); ; localoh3 = null)
        {
          a(str1, localLatLngBounds1, localnq, localoh3, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
          localLatLngBounds1 = null;
          break;
          localnq = null;
          break label2210;
        }
      case 46:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (oc localoc = (oc)oc.CREATOR.createFromParcel(paramParcel1); ; localoc = null)
        {
          int j = paramParcel1.readInt();
          oh localoh2 = null;
          if (j != 0)
            localoh2 = oh.CREATOR.cW(paramParcel1);
          a(localoc, localoh2, og.a.aP(paramParcel1.readStrongBinder()));
          paramParcel2.writeNoException();
          return true;
        }
      case 21:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Location localLocation2 = bZ(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (localLocation2 != null)
        {
          paramParcel2.writeInt(1);
          localLocation2.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 25:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (nw localnw = nw.CREATOR.cR(paramParcel1); ; localnw = null)
        {
          int i = paramParcel1.readInt();
          oh localoh1 = null;
          if (i != 0)
            localoh1 = oh.CREATOR.cW(paramParcel1);
          a(localnw, localoh1);
          return true;
        }
      case 26:
        paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (paramParcel1.readInt() != 0);
        for (Location localLocation1 = (Location)Location.CREATOR.createFromParcel(paramParcel1); ; localLocation1 = null)
        {
          a(localLocation1, paramParcel1.readInt());
          paramParcel2.writeNoException();
          return true;
        }
      case 34:
        label1923: label2085: label2091: paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        label2210: e locale = ca(paramParcel1.readString());
        paramParcel2.writeNoException();
        if (locale != null)
        {
          paramParcel2.writeInt(1);
          locale.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 51:
        label476: label1279: paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        label661: label1232: label1397: label2042: IBinder localIBinder2 = nj();
        label917: label1777: paramParcel2.writeNoException();
        label1034: label1549: label1830: label1836: label1880: label2160: paramParcel2.writeStrongBinder(localIBinder2);
        label1285: label1929: label1998: label2257: label2263: return true;
      case 54:
      }
      paramParcel1.enforceInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
      IBinder localIBinder1 = nk();
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }

    private static class a
      implements ni
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void S(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(12, localParcel1, localParcel2, 0);
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

      public void a(long paramLong, boolean paramBoolean, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          localParcel1.writeLong(paramLong);
          if (paramBoolean)
          {
            localParcel1.writeInt(i);
            if (paramPendingIntent == null)
              break label94;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5, localParcel1, localParcel2, 0);
            localParcel2.readException();
            return;
            i = 0;
            break;
            label94: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(6, localParcel1, localParcel2, 0);
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

      public void a(PendingIntent paramPendingIntent, nh paramnh, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramPendingIntent == null)
              continue;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            if (paramnh != null)
            {
              localIBinder = paramnh.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              localParcel1.writeString(paramString);
              this.le.transact(2, localParcel1, localParcel2, 0);
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

      public void a(Location paramLocation, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramLocation != null)
          {
            localParcel1.writeInt(1);
            paramLocation.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            localParcel1.writeInt(paramInt);
            this.le.transact(26, localParcel1, localParcel2, 0);
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

      public void a(nh paramnh, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramnh != null);
          for (IBinder localIBinder = paramnh.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
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

      public void a(nl paramnl, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramnl == null)
              continue;
            localParcel1.writeInt(1);
            paramnl.writeToParcel(localParcel1, 0);
            if (paramPendingIntent != null)
            {
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
              this.le.transact(53, localParcel1, localParcel2, 0);
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

      public void a(nl paramnl, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramnl == null)
              continue;
            localParcel1.writeInt(1);
            paramnl.writeToParcel(localParcel1, 0);
            if (paramb != null)
            {
              localIBinder = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(52, localParcel1, localParcel2, 0);
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

      public void a(ns paramns, oh paramoh, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramns == null)
              continue;
            localParcel1.writeInt(1);
            paramns.writeToParcel(localParcel1, 0);
            if (paramoh != null)
            {
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramPendingIntent == null)
                break label134;
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
              this.le.transact(48, localParcel1, localParcel2, 0);
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
          label134: localParcel1.writeInt(0);
        }
      }

      public void a(nu paramnu, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramnu == null)
              continue;
            localParcel1.writeInt(1);
            paramnu.writeToParcel(localParcel1, 0);
            if (paramoh != null)
            {
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label136;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(17, localParcel1, localParcel2, 0);
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
          label136: IBinder localIBinder = null;
        }
      }

      public void a(nw paramnw, oh paramoh)
        throws RemoteException
      {
        Parcel localParcel = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramnw == null)
              continue;
            localParcel.writeInt(1);
            paramnw.writeToParcel(localParcel, 0);
            if (paramoh != null)
            {
              localParcel.writeInt(1);
              paramoh.writeToParcel(localParcel, 0);
              this.le.transact(25, localParcel, null, 1);
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

      public void a(ny paramny, oh paramoh, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramny == null)
              continue;
            localParcel1.writeInt(1);
            paramny.writeToParcel(localParcel1, 0);
            if (paramoh != null)
            {
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramPendingIntent == null)
                break label134;
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
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
          localParcel1.writeInt(0);
          continue;
          label134: localParcel1.writeInt(0);
        }
      }

      public void a(oc paramoc, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramoc == null)
              continue;
            localParcel1.writeInt(1);
            paramoc.writeToParcel(localParcel1, 0);
            if (paramoh != null)
            {
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label136;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(46, localParcel1, localParcel2, 0);
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
          label136: IBinder localIBinder = null;
        }
      }

      public void a(oe paramoe, LatLngBounds paramLatLngBounds, List<String> paramList, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramoe == null)
              continue;
            localParcel1.writeInt(1);
            paramoe.writeToParcel(localParcel1, 0);
            if (paramLatLngBounds != null)
            {
              localParcel1.writeInt(1);
              paramLatLngBounds.writeToParcel(localParcel1, 0);
              localParcel1.writeStringList(paramList);
              if (paramoh == null)
                break label163;
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label172;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(50, localParcel1, localParcel2, 0);
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
          label163: localParcel1.writeInt(0);
          continue;
          label172: IBinder localIBinder = null;
        }
      }

      public void a(oh paramoh, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramoh == null)
              continue;
            localParcel1.writeInt(1);
            paramoh.writeToParcel(localParcel1, 0);
            if (paramPendingIntent != null)
            {
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
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
          localParcel1.writeInt(0);
        }
      }

      public void a(GeofencingRequest paramGeofencingRequest, PendingIntent paramPendingIntent, nh paramnh)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramGeofencingRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramGeofencingRequest.writeToParcel(localParcel1, 0);
            if (paramPendingIntent != null)
            {
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
              if (paramnh == null)
                break label136;
              localIBinder = paramnh.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(57, localParcel1, localParcel2, 0);
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
          label136: IBinder localIBinder = null;
        }
      }

      public void a(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLocationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramLocationRequest.writeToParcel(localParcel1, 0);
            if (paramPendingIntent != null)
            {
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
              this.le.transact(9, localParcel1, localParcel2, 0);
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

      public void a(LocationRequest paramLocationRequest, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLocationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramLocationRequest.writeToParcel(localParcel1, 0);
            if (paramb != null)
            {
              localIBinder = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(8, localParcel1, localParcel2, 0);
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

      public void a(LocationRequest paramLocationRequest, b paramb, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLocationRequest == null)
              continue;
            localParcel1.writeInt(1);
            paramLocationRequest.writeToParcel(localParcel1, 0);
            if (paramb != null)
            {
              localIBinder = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              localParcel1.writeString(paramString);
              this.le.transact(20, localParcel1, localParcel2, 0);
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

      public void a(b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramb != null);
          for (IBinder localIBinder = paramb.asBinder(); ; localIBinder = null)
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

      public void a(LatLng paramLatLng, nu paramnu, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLatLng == null)
              continue;
            localParcel1.writeInt(1);
            paramLatLng.writeToParcel(localParcel1, 0);
            if (paramnu != null)
            {
              localParcel1.writeInt(1);
              paramnu.writeToParcel(localParcel1, 0);
              if (paramoh == null)
                break label155;
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label164;
              localIBinder = paramog.asBinder();
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
          localParcel1.writeInt(0);
          continue;
          label155: localParcel1.writeInt(0);
          continue;
          label164: IBinder localIBinder = null;
        }
      }

      public void a(LatLngBounds paramLatLngBounds, int paramInt, nu paramnu, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLatLngBounds == null)
              continue;
            localParcel1.writeInt(1);
            paramLatLngBounds.writeToParcel(localParcel1, 0);
            localParcel1.writeInt(paramInt);
            if (paramnu != null)
            {
              localParcel1.writeInt(1);
              paramnu.writeToParcel(localParcel1, 0);
              if (paramoh == null)
                break label163;
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label172;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(14, localParcel1, localParcel2, 0);
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
          label163: localParcel1.writeInt(0);
          continue;
          label172: IBinder localIBinder = null;
        }
      }

      public void a(LatLngBounds paramLatLngBounds, int paramInt, String paramString, nu paramnu, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramLatLngBounds == null)
              continue;
            localParcel1.writeInt(1);
            paramLatLngBounds.writeToParcel(localParcel1, 0);
            localParcel1.writeInt(paramInt);
            localParcel1.writeString(paramString);
            if (paramnu != null)
            {
              localParcel1.writeInt(1);
              paramnu.writeToParcel(localParcel1, 0);
              if (paramoh == null)
                break label171;
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label180;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(47, localParcel1, localParcel2, 0);
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
          label171: localParcel1.writeInt(0);
          continue;
          label180: IBinder localIBinder = null;
        }
      }

      public void a(String paramString, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localParcel1.writeString(paramString);
            if (paramoh == null)
              continue;
            localParcel1.writeInt(1);
            paramoh.writeToParcel(localParcel1, 0);
            if (paramog != null)
            {
              localIBinder = paramog.asBinder();
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

      public void a(String paramString, LatLngBounds paramLatLngBounds, nq paramnq, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localParcel1.writeString(paramString);
            if (paramLatLngBounds == null)
              continue;
            localParcel1.writeInt(1);
            paramLatLngBounds.writeToParcel(localParcel1, 0);
            if (paramnq != null)
            {
              localParcel1.writeInt(1);
              paramnq.writeToParcel(localParcel1, 0);
              if (paramoh == null)
                break label163;
              localParcel1.writeInt(1);
              paramoh.writeToParcel(localParcel1, 0);
              if (paramog == null)
                break label172;
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(55, localParcel1, localParcel2, 0);
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
          label163: localParcel1.writeInt(0);
          continue;
          label172: IBinder localIBinder = null;
        }
      }

      public void a(List<nn> paramList, PendingIntent paramPendingIntent, nh paramnh, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localParcel1.writeTypedList(paramList);
            if (paramPendingIntent == null)
              continue;
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
            if (paramnh != null)
            {
              localIBinder = paramnh.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              localParcel1.writeString(paramString);
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
          IBinder localIBinder = null;
        }
      }

      public void a(List<String> paramList, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localParcel1.writeStringList(paramList);
            if (paramoh == null)
              continue;
            localParcel1.writeInt(1);
            paramoh.writeToParcel(localParcel1, 0);
            if (paramog != null)
            {
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(58, localParcel1, localParcel2, 0);
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

      public void a(String[] paramArrayOfString, nh paramnh, String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          localParcel1.writeStringArray(paramArrayOfString);
          if (paramnh != null);
          for (IBinder localIBinder = paramnh.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeString(paramString);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void b(PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramPendingIntent != null)
          {
            localParcel1.writeInt(1);
            paramPendingIntent.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(11, localParcel1, localParcel2, 0);
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

      public void b(Location paramLocation)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          if (paramLocation != null)
          {
            localParcel1.writeInt(1);
            paramLocation.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(13, localParcel1, localParcel2, 0);
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

      public void b(oh paramoh, PendingIntent paramPendingIntent)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (paramoh == null)
              continue;
            localParcel1.writeInt(1);
            paramoh.writeToParcel(localParcel1, 0);
            if (paramPendingIntent != null)
            {
              localParcel1.writeInt(1);
              paramPendingIntent.writeToParcel(localParcel1, 0);
              this.le.transact(49, localParcel1, localParcel2, 0);
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

      public void b(String paramString, oh paramoh, og paramog)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            localParcel1.writeString(paramString);
            if (paramoh == null)
              continue;
            localParcel1.writeInt(1);
            paramoh.writeToParcel(localParcel1, 0);
            if (paramog != null)
            {
              localIBinder = paramog.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(42, localParcel1, localParcel2, 0);
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

      public Location bZ(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          localParcel1.writeString(paramString);
          this.le.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localLocation = (Location)Location.CREATOR.createFromParcel(localParcel2);
            return localLocation;
          }
          Location localLocation = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public e ca(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          localParcel1.writeString(paramString);
          this.le.transact(34, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            e locale2 = e.CREATOR.cK(localParcel2);
            locale1 = locale2;
            return locale1;
          }
          e locale1 = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public Location ni()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          this.le.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            localLocation = (Location)Location.CREATOR.createFromParcel(localParcel2);
            return localLocation;
          }
          Location localLocation = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public IBinder nj()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          this.le.transact(51, localParcel1, localParcel2, 0);
          localParcel2.readException();
          IBinder localIBinder = localParcel2.readStrongBinder();
          return localIBinder;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public IBinder nk()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
          this.le.transact(54, localParcel1, localParcel2, 0);
          localParcel2.readException();
          IBinder localIBinder = localParcel2.readStrongBinder();
          return localIBinder;
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
 * Qualified Name:     com.google.android.gms.internal.ni
 * JD-Core Version:    0.6.0
 */