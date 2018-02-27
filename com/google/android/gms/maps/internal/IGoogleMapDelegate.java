package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.IPolylineDelegate.a;
import com.google.android.gms.maps.model.internal.i;
import com.google.android.gms.maps.model.internal.i.a;
import com.google.android.gms.maps.model.w;

public abstract interface IGoogleMapDelegate extends IInterface
{
  public abstract com.google.android.gms.maps.model.internal.h addCircle(CircleOptions paramCircleOptions)
    throws RemoteException;

  public abstract i addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
    throws RemoteException;

  public abstract i addGroundOverlay2(GroundOverlayOptions paramGroundOverlayOptions, com.google.android.gms.maps.model.internal.e parame)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.l addMarker(MarkerOptions paramMarkerOptions)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.l addMarker2(MarkerOptions paramMarkerOptions, com.google.android.gms.maps.model.internal.p paramp)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.m addPolygon(PolygonOptions paramPolygonOptions)
    throws RemoteException;

  public abstract IPolylineDelegate addPolyline(PolylineOptions paramPolylineOptions)
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.n addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
    throws RemoteException;

  public abstract void animateCamera(com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void animateCamera2(com.google.android.gms.maps.model.internal.c paramc)
    throws RemoteException;

  public abstract void animateCameraWithCallback(com.google.android.gms.dynamic.d paramd, b paramb)
    throws RemoteException;

  public abstract void animateCameraWithCallback2(com.google.android.gms.maps.model.internal.c paramc, b paramb)
    throws RemoteException;

  public abstract void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.d paramd, int paramInt, b paramb)
    throws RemoteException;

  public abstract void animateCameraWithDurationAndCallback2(com.google.android.gms.maps.model.internal.c paramc, int paramInt, b paramb)
    throws RemoteException;

  public abstract void clear()
    throws RemoteException;

  public abstract CameraPosition getCameraPosition()
    throws RemoteException;

  public abstract com.google.android.gms.maps.model.internal.j getFocusedBuilding()
    throws RemoteException;

  public abstract void getMapAsync(m paramm)
    throws RemoteException;

  public abstract int getMapType()
    throws RemoteException;

  public abstract float getMaxZoomLevel()
    throws RemoteException;

  public abstract float getMinZoomLevel()
    throws RemoteException;

  public abstract Location getMyLocation()
    throws RemoteException;

  public abstract IProjectionDelegate getProjection()
    throws RemoteException;

  public abstract IUiSettingsDelegate getUiSettings()
    throws RemoteException;

  public abstract boolean isBuildingsEnabled()
    throws RemoteException;

  public abstract boolean isIndoorEnabled()
    throws RemoteException;

  public abstract boolean isMyLocationEnabled()
    throws RemoteException;

  public abstract boolean isTrafficEnabled()
    throws RemoteException;

  public abstract void moveCamera(com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void moveCamera2(com.google.android.gms.maps.model.internal.c paramc)
    throws RemoteException;

  public abstract void onCreate(Bundle paramBundle)
    throws RemoteException;

  public abstract void onDestroy()
    throws RemoteException;

  public abstract void onLowMemory()
    throws RemoteException;

  public abstract void onPause()
    throws RemoteException;

  public abstract void onResume()
    throws RemoteException;

  public abstract void onSaveInstanceState(Bundle paramBundle)
    throws RemoteException;

  public abstract void setBuildingsEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void setContentDescription(String paramString)
    throws RemoteException;

  public abstract boolean setIndoorEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void setInfoWindowAdapter(d paramd)
    throws RemoteException;

  public abstract void setInfoWindowRenderer(e parame)
    throws RemoteException;

  public abstract void setLocationSource(ILocationSourceDelegate paramILocationSourceDelegate)
    throws RemoteException;

  public abstract void setMapType(int paramInt)
    throws RemoteException;

  public abstract void setMyLocationEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void setOnCameraChangeListener(f paramf)
    throws RemoteException;

  public abstract void setOnIndoorStateChangeListener(g paramg)
    throws RemoteException;

  public abstract void setOnInfoWindowClickListener(h paramh)
    throws RemoteException;

  public abstract void setOnMapClickListener(j paramj)
    throws RemoteException;

  public abstract void setOnMapLoadedCallback(k paramk)
    throws RemoteException;

  public abstract void setOnMapLongClickListener(l paraml)
    throws RemoteException;

  public abstract void setOnMarkerClickListener(n paramn)
    throws RemoteException;

  public abstract void setOnMarkerDragListener(o paramo)
    throws RemoteException;

  public abstract void setOnMyLocationButtonClickListener(p paramp)
    throws RemoteException;

  public abstract void setOnMyLocationChangeListener(q paramq)
    throws RemoteException;

  public abstract void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    throws RemoteException;

  public abstract void setTrafficEnabled(boolean paramBoolean)
    throws RemoteException;

  public abstract void snapshot(v paramv, com.google.android.gms.dynamic.d paramd)
    throws RemoteException;

  public abstract void stopAnimation()
    throws RemoteException;

  public abstract boolean useViewLifecycleWhenInFragment()
    throws RemoteException;

  public static abstract class a extends Binder
    implements IGoogleMapDelegate
  {
    public static IGoogleMapDelegate aT(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof IGoogleMapDelegate)))
        return (IGoogleMapDelegate)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        CameraPosition localCameraPosition = getCameraPosition();
        paramParcel2.writeNoException();
        if (localCameraPosition != null)
        {
          paramParcel2.writeInt(1);
          localCameraPosition.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        float f2 = getMaxZoomLevel();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f2);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        float f1 = getMinZoomLevel();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        moveCamera(com.google.android.gms.dynamic.d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        animateCamera(com.google.android.gms.dynamic.d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        animateCameraWithCallback(com.google.android.gms.dynamic.d.a.ap(paramParcel1.readStrongBinder()), b.a.aR(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.d.a.ap(paramParcel1.readStrongBinder()), paramParcel1.readInt(), b.a.aR(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        stopAnimation();
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (PolylineOptions localPolylineOptions = PolylineOptions.CREATOR.dh(paramParcel1); ; localPolylineOptions = null)
        {
          IPolylineDelegate localIPolylineDelegate = addPolyline(localPolylineOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder11 = null;
          if (localIPolylineDelegate != null)
            localIBinder11 = localIPolylineDelegate.asBinder();
          paramParcel2.writeStrongBinder(localIBinder11);
          return true;
        }
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (PolygonOptions localPolygonOptions = PolygonOptions.CREATOR.dg(paramParcel1); ; localPolygonOptions = null)
        {
          com.google.android.gms.maps.model.internal.m localm = addPolygon(localPolygonOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder10 = null;
          if (localm != null)
            localIBinder10 = localm.asBinder();
          paramParcel2.writeStrongBinder(localIBinder10);
          return true;
        }
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (MarkerOptions localMarkerOptions2 = MarkerOptions.CREATOR.df(paramParcel1); ; localMarkerOptions2 = null)
        {
          com.google.android.gms.maps.model.internal.l locall2 = addMarker(localMarkerOptions2);
          paramParcel2.writeNoException();
          IBinder localIBinder9 = null;
          if (locall2 != null)
            localIBinder9 = locall2.asBinder();
          paramParcel2.writeStrongBinder(localIBinder9);
          return true;
        }
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (GroundOverlayOptions localGroundOverlayOptions2 = GroundOverlayOptions.CREATOR.dc(paramParcel1); ; localGroundOverlayOptions2 = null)
        {
          i locali2 = addGroundOverlay(localGroundOverlayOptions2);
          paramParcel2.writeNoException();
          IBinder localIBinder8 = null;
          if (locali2 != null)
            localIBinder8 = locali2.asBinder();
          paramParcel2.writeStrongBinder(localIBinder8);
          return true;
        }
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (TileOverlayOptions localTileOverlayOptions = TileOverlayOptions.CREATOR.dn(paramParcel1); ; localTileOverlayOptions = null)
        {
          com.google.android.gms.maps.model.internal.n localn = addTileOverlay(localTileOverlayOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder7 = null;
          if (localn != null)
            localIBinder7 = localn.asBinder();
          paramParcel2.writeStrongBinder(localIBinder7);
          return true;
        }
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        clear();
        paramParcel2.writeNoException();
        return true;
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i9 = getMapType();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i9);
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setMapType(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        boolean bool10 = isTrafficEnabled();
        paramParcel2.writeNoException();
        if (bool10);
        for (int i8 = 1; ; i8 = 0)
        {
          paramParcel2.writeInt(i8);
          return true;
        }
      case 18:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i7 = paramParcel1.readInt();
        boolean bool9 = false;
        if (i7 != 0)
          bool9 = true;
        setTrafficEnabled(bool9);
        paramParcel2.writeNoException();
        return true;
      case 19:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        boolean bool8 = isIndoorEnabled();
        paramParcel2.writeNoException();
        int i6 = 0;
        if (bool8)
          i6 = 1;
        paramParcel2.writeInt(i6);
        return true;
      case 20:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (boolean bool6 = true; ; bool6 = false)
        {
          boolean bool7 = setIndoorEnabled(bool6);
          paramParcel2.writeNoException();
          int i5 = 0;
          if (bool7)
            i5 = 1;
          paramParcel2.writeInt(i5);
          return true;
        }
      case 21:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        boolean bool5 = isMyLocationEnabled();
        paramParcel2.writeNoException();
        int i4 = 0;
        if (bool5)
          i4 = 1;
        paramParcel2.writeInt(i4);
        return true;
      case 22:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i3 = paramParcel1.readInt();
        boolean bool4 = false;
        if (i3 != 0)
          bool4 = true;
        setMyLocationEnabled(bool4);
        paramParcel2.writeNoException();
        return true;
      case 23:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        Location localLocation = getMyLocation();
        paramParcel2.writeNoException();
        if (localLocation != null)
        {
          paramParcel2.writeInt(1);
          localLocation.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 24:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setLocationSource(ILocationSourceDelegate.a.aW(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 25:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        IUiSettingsDelegate localIUiSettingsDelegate = getUiSettings();
        paramParcel2.writeNoException();
        IBinder localIBinder6 = null;
        if (localIUiSettingsDelegate != null)
          localIBinder6 = localIUiSettingsDelegate.asBinder();
        paramParcel2.writeStrongBinder(localIBinder6);
        return true;
      case 26:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        IProjectionDelegate localIProjectionDelegate = getProjection();
        paramParcel2.writeNoException();
        IBinder localIBinder5 = null;
        if (localIProjectionDelegate != null)
          localIBinder5 = localIProjectionDelegate.asBinder();
        paramParcel2.writeStrongBinder(localIBinder5);
        return true;
      case 27:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnCameraChangeListener(f.a.aZ(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 28:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMapClickListener(j.a.bd(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 29:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMapLongClickListener(l.a.bf(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 30:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMarkerClickListener(n.a.bh(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 31:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMarkerDragListener(o.a.bi(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 32:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnInfoWindowClickListener(h.a.bb(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 33:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setInfoWindowAdapter(d.a.aU(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 35:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (CircleOptions localCircleOptions = CircleOptions.CREATOR.db(paramParcel1); ; localCircleOptions = null)
        {
          com.google.android.gms.maps.model.internal.h localh = addCircle(localCircleOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder4 = null;
          if (localh != null)
            localIBinder4 = localh.asBinder();
          paramParcel2.writeStrongBinder(localIBinder4);
          return true;
        }
      case 36:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMyLocationChangeListener(q.a.bk(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 37:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMyLocationButtonClickListener(p.a.bj(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 38:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        snapshot(v.a.bq(paramParcel1.readStrongBinder()), com.google.android.gms.dynamic.d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 39:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setPadding(paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt(), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 40:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        boolean bool3 = isBuildingsEnabled();
        paramParcel2.writeNoException();
        int i2 = 0;
        if (bool3)
          i2 = 1;
        paramParcel2.writeInt(i2);
        return true;
      case 41:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1 = paramParcel1.readInt();
        boolean bool2 = false;
        if (i1 != 0)
          bool2 = true;
        setBuildingsEnabled(bool2);
        paramParcel2.writeNoException();
        return true;
      case 42:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnMapLoadedCallback(k.a.be(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 44:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        com.google.android.gms.maps.model.internal.j localj = getFocusedBuilding();
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (localj != null)
          localIBinder3 = localj.asBinder();
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      case 45:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setOnIndoorStateChangeListener(g.a.ba(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 53:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        getMapAsync(m.a.bg(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 54:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle2 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle2 = null)
        {
          onCreate(localBundle2);
          paramParcel2.writeNoException();
          return true;
        }
      case 55:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        onResume();
        paramParcel2.writeNoException();
        return true;
      case 56:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        onPause();
        paramParcel2.writeNoException();
        return true;
      case 57:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        onDestroy();
        paramParcel2.writeNoException();
        return true;
      case 58:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        onLowMemory();
        paramParcel2.writeNoException();
        return true;
      case 59:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        boolean bool1 = useViewLifecycleWhenInFragment();
        paramParcel2.writeNoException();
        int n = 0;
        if (bool1)
          n = 1;
        paramParcel2.writeInt(n);
        return true;
      case 60:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (paramParcel1.readInt() != 0);
        for (Bundle localBundle1 = (Bundle)Bundle.CREATOR.createFromParcel(paramParcel1); ; localBundle1 = null)
        {
          onSaveInstanceState(localBundle1);
          paramParcel2.writeNoException();
          if (localBundle1 == null)
            break;
          paramParcel2.writeInt(1);
          localBundle1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 61:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setContentDescription(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 64:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int m = paramParcel1.readInt();
        com.google.android.gms.maps.model.internal.c localc4 = null;
        if (m != 0)
          localc4 = com.google.android.gms.maps.model.internal.c.CREATOR.dq(paramParcel1);
        moveCamera2(localc4);
        paramParcel2.writeNoException();
        return true;
      case 65:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int k = paramParcel1.readInt();
        com.google.android.gms.maps.model.internal.c localc3 = null;
        if (k != 0)
          localc3 = com.google.android.gms.maps.model.internal.c.CREATOR.dq(paramParcel1);
        animateCamera2(localc3);
        paramParcel2.writeNoException();
        return true;
      case 66:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int j = paramParcel1.readInt();
        com.google.android.gms.maps.model.internal.c localc2 = null;
        if (j != 0)
          localc2 = com.google.android.gms.maps.model.internal.c.CREATOR.dq(paramParcel1);
        animateCameraWithCallback2(localc2, b.a.aR(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 67:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i = paramParcel1.readInt();
        com.google.android.gms.maps.model.internal.c localc1 = null;
        if (i != 0)
          localc1 = com.google.android.gms.maps.model.internal.c.CREATOR.dq(paramParcel1);
        animateCameraWithDurationAndCallback2(localc1, paramParcel1.readInt(), b.a.aR(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 68:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        MarkerOptions localMarkerOptions1;
        if (paramParcel1.readInt() != 0)
        {
          localMarkerOptions1 = MarkerOptions.CREATOR.df(paramParcel1);
          if (paramParcel1.readInt() == 0)
            break label2501;
        }
        for (com.google.android.gms.maps.model.internal.p localp = com.google.android.gms.maps.model.internal.p.CREATOR.ds(paramParcel1); ; localp = null)
        {
          com.google.android.gms.maps.model.internal.l locall1 = addMarker2(localMarkerOptions1, localp);
          paramParcel2.writeNoException();
          IBinder localIBinder2 = null;
          if (locall1 != null)
            localIBinder2 = locall1.asBinder();
          paramParcel2.writeStrongBinder(localIBinder2);
          return true;
          localMarkerOptions1 = null;
          break;
        }
      case 69:
        label2501: paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        setInfoWindowRenderer(e.a.aV(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 70:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
      GroundOverlayOptions localGroundOverlayOptions1;
      if (paramParcel1.readInt() != 0)
      {
        localGroundOverlayOptions1 = GroundOverlayOptions.CREATOR.dc(paramParcel1);
        if (paramParcel1.readInt() == 0)
          break label2613;
      }
      label2613: for (com.google.android.gms.maps.model.internal.e locale = com.google.android.gms.maps.model.internal.e.CREATOR.dr(paramParcel1); ; locale = null)
      {
        i locali1 = addGroundOverlay2(localGroundOverlayOptions1, locale);
        paramParcel2.writeNoException();
        IBinder localIBinder1 = null;
        if (locali1 != null)
          localIBinder1 = locali1.asBinder();
        paramParcel2.writeStrongBinder(localIBinder1);
        return true;
        localGroundOverlayOptions1 = null;
        break;
      }
    }

    private static class a
      implements IGoogleMapDelegate
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public com.google.android.gms.maps.model.internal.h addCircle(CircleOptions paramCircleOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramCircleOptions != null)
          {
            localParcel1.writeInt(1);
            paramCircleOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(35, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.maps.model.internal.h localh = com.google.android.gms.maps.model.internal.h.a.bw(localParcel2.readStrongBinder());
            return localh;
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

      public i addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramGroundOverlayOptions != null)
          {
            localParcel1.writeInt(1);
            paramGroundOverlayOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12, localParcel1, localParcel2, 0);
            localParcel2.readException();
            i locali = i.a.bx(localParcel2.readStrongBinder());
            return locali;
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

      public i addGroundOverlay2(GroundOverlayOptions paramGroundOverlayOptions, com.google.android.gms.maps.model.internal.e parame)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (paramGroundOverlayOptions == null)
              continue;
            localParcel1.writeInt(1);
            paramGroundOverlayOptions.writeToParcel(localParcel1, 0);
            if (parame != null)
            {
              localParcel1.writeInt(1);
              parame.writeToParcel(localParcel1, 0);
              this.le.transact(70, localParcel1, localParcel2, 0);
              localParcel2.readException();
              i locali = i.a.bx(localParcel2.readStrongBinder());
              return locali;
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

      public com.google.android.gms.maps.model.internal.l addMarker(MarkerOptions paramMarkerOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramMarkerOptions != null)
          {
            localParcel1.writeInt(1);
            paramMarkerOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(11, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.maps.model.internal.l locall = com.google.android.gms.maps.model.internal.l.a.bA(localParcel2.readStrongBinder());
            return locall;
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

      public com.google.android.gms.maps.model.internal.l addMarker2(MarkerOptions paramMarkerOptions, com.google.android.gms.maps.model.internal.p paramp)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (paramMarkerOptions == null)
              continue;
            localParcel1.writeInt(1);
            paramMarkerOptions.writeToParcel(localParcel1, 0);
            if (paramp != null)
            {
              localParcel1.writeInt(1);
              paramp.writeToParcel(localParcel1, 0);
              this.le.transact(68, localParcel1, localParcel2, 0);
              localParcel2.readException();
              com.google.android.gms.maps.model.internal.l locall = com.google.android.gms.maps.model.internal.l.a.bA(localParcel2.readStrongBinder());
              return locall;
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

      public com.google.android.gms.maps.model.internal.m addPolygon(PolygonOptions paramPolygonOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramPolygonOptions != null)
          {
            localParcel1.writeInt(1);
            paramPolygonOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.maps.model.internal.m localm = com.google.android.gms.maps.model.internal.m.a.bB(localParcel2.readStrongBinder());
            return localm;
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

      public IPolylineDelegate addPolyline(PolylineOptions paramPolylineOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramPolylineOptions != null)
          {
            localParcel1.writeInt(1);
            paramPolylineOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(9, localParcel1, localParcel2, 0);
            localParcel2.readException();
            IPolylineDelegate localIPolylineDelegate = IPolylineDelegate.a.bC(localParcel2.readStrongBinder());
            return localIPolylineDelegate;
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

      public com.google.android.gms.maps.model.internal.n addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramTileOverlayOptions != null)
          {
            localParcel1.writeInt(1);
            paramTileOverlayOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(13, localParcel1, localParcel2, 0);
            localParcel2.readException();
            com.google.android.gms.maps.model.internal.n localn = com.google.android.gms.maps.model.internal.n.a.bD(localParcel2.readStrongBinder());
            return localn;
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

      public void animateCamera(com.google.android.gms.dynamic.d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
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

      public void animateCamera2(com.google.android.gms.maps.model.internal.c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramc != null)
          {
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(65, localParcel1, localParcel2, 0);
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

      public void animateCameraWithCallback(com.google.android.gms.dynamic.d paramd, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramd != null);
          for (IBinder localIBinder1 = paramd.asBinder(); ; localIBinder1 = null)
          {
            localParcel1.writeStrongBinder(localIBinder1);
            IBinder localIBinder2 = null;
            if (paramb != null)
              localIBinder2 = paramb.asBinder();
            localParcel1.writeStrongBinder(localIBinder2);
            this.le.transact(6, localParcel1, localParcel2, 0);
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

      public void animateCameraWithCallback2(com.google.android.gms.maps.model.internal.c paramc, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (paramc == null)
              continue;
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
            if (paramb != null)
            {
              localIBinder = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(66, localParcel1, localParcel2, 0);
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

      public void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.d paramd, int paramInt, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramd != null);
          for (IBinder localIBinder1 = paramd.asBinder(); ; localIBinder1 = null)
          {
            localParcel1.writeStrongBinder(localIBinder1);
            localParcel1.writeInt(paramInt);
            IBinder localIBinder2 = null;
            if (paramb != null)
              localIBinder2 = paramb.asBinder();
            localParcel1.writeStrongBinder(localIBinder2);
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

      public void animateCameraWithDurationAndCallback2(com.google.android.gms.maps.model.internal.c paramc, int paramInt, b paramb)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (paramc == null)
              continue;
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
            localParcel1.writeInt(paramInt);
            if (paramb != null)
            {
              localIBinder = paramb.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(67, localParcel1, localParcel2, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void clear()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(14, localParcel1, localParcel2, 0);
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

      public CameraPosition getCameraPosition()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(1, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            CameraPosition localCameraPosition2 = CameraPosition.CREATOR.da(localParcel2);
            localCameraPosition1 = localCameraPosition2;
            return localCameraPosition1;
          }
          CameraPosition localCameraPosition1 = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public com.google.android.gms.maps.model.internal.j getFocusedBuilding()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(44, localParcel1, localParcel2, 0);
          localParcel2.readException();
          com.google.android.gms.maps.model.internal.j localj = com.google.android.gms.maps.model.internal.j.a.by(localParcel2.readStrongBinder());
          return localj;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void getMapAsync(m paramm)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramm != null);
          for (IBinder localIBinder = paramm.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(53, localParcel1, localParcel2, 0);
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

      public int getMapType()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public float getMaxZoomLevel()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          float f = localParcel2.readFloat();
          return f;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public float getMinZoomLevel()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          float f = localParcel2.readFloat();
          return f;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public Location getMyLocation()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(23, localParcel1, localParcel2, 0);
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

      public IProjectionDelegate getProjection()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(26, localParcel1, localParcel2, 0);
          localParcel2.readException();
          IProjectionDelegate localIProjectionDelegate = IProjectionDelegate.a.bp(localParcel2.readStrongBinder());
          return localIProjectionDelegate;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public IUiSettingsDelegate getUiSettings()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(25, localParcel1, localParcel2, 0);
          localParcel2.readException();
          IUiSettingsDelegate localIUiSettingsDelegate = IUiSettingsDelegate.a.bu(localParcel2.readStrongBinder());
          return localIUiSettingsDelegate;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public boolean isBuildingsEnabled()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(40, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          int j = 0;
          if (i != 0)
            j = 1;
          return j;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public boolean isIndoorEnabled()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          int j = 0;
          if (i != 0)
            j = 1;
          return j;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public boolean isMyLocationEnabled()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(21, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          int j = 0;
          if (i != 0)
            j = 1;
          return j;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public boolean isTrafficEnabled()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          int j = 0;
          if (i != 0)
            j = 1;
          return j;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void moveCamera(com.google.android.gms.dynamic.d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
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

      public void moveCamera2(com.google.android.gms.maps.model.internal.c paramc)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramc != null)
          {
            localParcel1.writeInt(1);
            paramc.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(64, localParcel1, localParcel2, 0);
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

      public void onCreate(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(54, localParcel1, localParcel2, 0);
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

      public void onDestroy()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(57, localParcel1, localParcel2, 0);
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

      public void onLowMemory()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(58, localParcel1, localParcel2, 0);
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

      public void onPause()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(56, localParcel1, localParcel2, 0);
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

      public void onResume()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(55, localParcel1, localParcel2, 0);
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

      public void onSaveInstanceState(Bundle paramBundle)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramBundle != null)
          {
            localParcel1.writeInt(1);
            paramBundle.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(60, localParcel1, localParcel2, 0);
            localParcel2.readException();
            if (localParcel2.readInt() != 0)
              paramBundle.readFromParcel(localParcel2);
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

      public void setBuildingsEnabled(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(41, localParcel1, localParcel2, 0);
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

      public void setContentDescription(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(61, localParcel1, localParcel2, 0);
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

      public boolean setIndoorEnabled(boolean paramBoolean)
        throws RemoteException
      {
        int i = 1;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          int j;
          if (paramBoolean)
          {
            j = i;
            localParcel1.writeInt(j);
            this.le.transact(20, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int k = localParcel2.readInt();
            if (k == 0)
              break label80;
          }
          while (true)
          {
            return i;
            j = 0;
            break;
            label80: i = 0;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void setInfoWindowAdapter(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
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

      public void setInfoWindowRenderer(e parame)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (parame != null);
          for (IBinder localIBinder = parame.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(69, localParcel1, localParcel2, 0);
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

      public void setLocationSource(ILocationSourceDelegate paramILocationSourceDelegate)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramILocationSourceDelegate != null);
          for (IBinder localIBinder = paramILocationSourceDelegate.asBinder(); ; localIBinder = null)
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

      public void setMapType(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localParcel1.writeInt(paramInt);
          this.le.transact(16, localParcel1, localParcel2, 0);
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

      public void setMyLocationEnabled(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(22, localParcel1, localParcel2, 0);
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

      public void setOnCameraChangeListener(f paramf)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramf != null);
          for (IBinder localIBinder = paramf.asBinder(); ; localIBinder = null)
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

      public void setOnIndoorStateChangeListener(g paramg)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramg != null);
          for (IBinder localIBinder = paramg.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(45, localParcel1, localParcel2, 0);
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

      public void setOnInfoWindowClickListener(h paramh)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramh != null);
          for (IBinder localIBinder = paramh.asBinder(); ; localIBinder = null)
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

      public void setOnMapClickListener(j paramj)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramj != null);
          for (IBinder localIBinder = paramj.asBinder(); ; localIBinder = null)
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

      public void setOnMapLoadedCallback(k paramk)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramk != null);
          for (IBinder localIBinder = paramk.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(42, localParcel1, localParcel2, 0);
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

      public void setOnMapLongClickListener(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
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

      public void setOnMarkerClickListener(n paramn)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramn != null);
          for (IBinder localIBinder = paramn.asBinder(); ; localIBinder = null)
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

      public void setOnMarkerDragListener(o paramo)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramo != null);
          for (IBinder localIBinder = paramo.asBinder(); ; localIBinder = null)
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

      public void setOnMyLocationButtonClickListener(p paramp)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramp != null);
          for (IBinder localIBinder = paramp.asBinder(); ; localIBinder = null)
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

      public void setOnMyLocationChangeListener(q paramq)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramq != null);
          for (IBinder localIBinder = paramq.asBinder(); ; localIBinder = null)
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

      public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          localParcel1.writeInt(paramInt1);
          localParcel1.writeInt(paramInt2);
          localParcel1.writeInt(paramInt3);
          localParcel1.writeInt(paramInt4);
          this.le.transact(39, localParcel1, localParcel2, 0);
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

      public void setTrafficEnabled(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(18, localParcel1, localParcel2, 0);
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

      public void snapshot(v paramv, com.google.android.gms.dynamic.d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          if (paramv != null);
          for (IBinder localIBinder1 = paramv.asBinder(); ; localIBinder1 = null)
          {
            localParcel1.writeStrongBinder(localIBinder1);
            IBinder localIBinder2 = null;
            if (paramd != null)
              localIBinder2 = paramd.asBinder();
            localParcel1.writeStrongBinder(localIBinder2);
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

      public void stopAnimation()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(8, localParcel1, localParcel2, 0);
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

      public boolean useViewLifecycleWhenInFragment()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
          this.le.transact(59, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          int j = 0;
          if (i != 0)
            j = 1;
          return j;
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
 * Qualified Name:     com.google.android.gms.maps.internal.IGoogleMapDelegate
 * JD-Core Version:    0.6.0
 */