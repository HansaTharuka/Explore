package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate.a;
import com.google.android.gms.maps.internal.b;
import com.google.android.gms.maps.internal.b.a;
import com.google.android.gms.maps.internal.d.a;
import com.google.android.gms.maps.internal.f.a;
import com.google.android.gms.maps.internal.g.a;
import com.google.android.gms.maps.internal.h.a;
import com.google.android.gms.maps.internal.j.a;
import com.google.android.gms.maps.internal.k.a;
import com.google.android.gms.maps.internal.l.a;
import com.google.android.gms.maps.internal.n.a;
import com.google.android.gms.maps.internal.o.a;
import com.google.android.gms.maps.internal.p.a;
import com.google.android.gms.maps.internal.q.a;
import com.google.android.gms.maps.internal.v.a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.j;
import com.google.android.gms.maps.model.internal.l;
import com.google.android.gms.maps.model.internal.n;

public final class GoogleMap
{
  public static final int MAP_TYPE_HYBRID = 4;
  public static final int MAP_TYPE_NONE = 0;
  public static final int MAP_TYPE_NORMAL = 1;
  public static final int MAP_TYPE_SATELLITE = 2;
  public static final int MAP_TYPE_TERRAIN = 3;
  private final IGoogleMapDelegate akm;
  private UiSettings akn;

  protected GoogleMap(IGoogleMapDelegate paramIGoogleMapDelegate)
  {
    this.akm = ((IGoogleMapDelegate)jx.i(paramIGoogleMapDelegate));
  }

  public final Circle addCircle(CircleOptions paramCircleOptions)
  {
    try
    {
      Circle localCircle = new Circle(this.akm.addCircle(paramCircleOptions));
      return localCircle;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final GroundOverlay addGroundOverlay(GroundOverlayOptions paramGroundOverlayOptions)
  {
    try
    {
      com.google.android.gms.maps.model.internal.i locali = this.akm.addGroundOverlay(paramGroundOverlayOptions);
      if (locali != null)
      {
        GroundOverlay localGroundOverlay = new GroundOverlay(locali);
        return localGroundOverlay;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Marker addMarker(MarkerOptions paramMarkerOptions)
  {
    try
    {
      l locall = this.akm.addMarker(paramMarkerOptions);
      if (locall != null)
      {
        Marker localMarker = new Marker(locall);
        return localMarker;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    try
    {
      Polygon localPolygon = new Polygon(this.akm.addPolygon(paramPolygonOptions));
      return localPolygon;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    try
    {
      Polyline localPolyline = new Polyline(this.akm.addPolyline(paramPolylineOptions));
      return localPolyline;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final TileOverlay addTileOverlay(TileOverlayOptions paramTileOverlayOptions)
  {
    try
    {
      n localn = this.akm.addTileOverlay(paramTileOverlayOptions);
      if (localn != null)
      {
        TileOverlay localTileOverlay = new TileOverlay(localn);
        return localTileOverlay;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.akm.animateCamera(paramCameraUpdate.nA());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate, int paramInt, CancelableCallback paramCancelableCallback)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.akm;
      d locald = paramCameraUpdate.nA();
      if (paramCancelableCallback == null);
      for (Object localObject = null; ; localObject = new a(paramCancelableCallback))
      {
        localIGoogleMapDelegate.animateCameraWithDurationAndCallback(locald, paramInt, (b)localObject);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void animateCamera(CameraUpdate paramCameraUpdate, CancelableCallback paramCancelableCallback)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.akm;
      d locald = paramCameraUpdate.nA();
      if (paramCancelableCallback == null);
      for (Object localObject = null; ; localObject = new a(paramCancelableCallback))
      {
        localIGoogleMapDelegate.animateCameraWithCallback(locald, (b)localObject);
        return;
      }
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void clear()
  {
    try
    {
      this.akm.clear();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final CameraPosition getCameraPosition()
  {
    try
    {
      CameraPosition localCameraPosition = this.akm.getCameraPosition();
      return localCameraPosition;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public IndoorBuilding getFocusedBuilding()
  {
    try
    {
      j localj = this.akm.getFocusedBuilding();
      if (localj != null)
      {
        IndoorBuilding localIndoorBuilding = new IndoorBuilding(localj);
        return localIndoorBuilding;
      }
      return null;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final int getMapType()
  {
    try
    {
      int i = this.akm.getMapType();
      return i;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final float getMaxZoomLevel()
  {
    try
    {
      float f = this.akm.getMaxZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final float getMinZoomLevel()
  {
    try
    {
      float f = this.akm.getMinZoomLevel();
      return f;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  @Deprecated
  public final Location getMyLocation()
  {
    try
    {
      Location localLocation = this.akm.getMyLocation();
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final Projection getProjection()
  {
    try
    {
      Projection localProjection = new Projection(this.akm.getProjection());
      return localProjection;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final UiSettings getUiSettings()
  {
    try
    {
      if (this.akn == null)
        this.akn = new UiSettings(this.akm.getUiSettings());
      UiSettings localUiSettings = this.akn;
      return localUiSettings;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isBuildingsEnabled()
  {
    try
    {
      boolean bool = this.akm.isBuildingsEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isIndoorEnabled()
  {
    try
    {
      boolean bool = this.akm.isIndoorEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isMyLocationEnabled()
  {
    try
    {
      boolean bool = this.akm.isMyLocationEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean isTrafficEnabled()
  {
    try
    {
      boolean bool = this.akm.isTrafficEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void moveCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      this.akm.moveCamera(paramCameraUpdate.nA());
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  IGoogleMapDelegate nC()
  {
    return this.akm;
  }

  public final void setBuildingsEnabled(boolean paramBoolean)
  {
    try
    {
      this.akm.setBuildingsEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setContentDescription(String paramString)
  {
    try
    {
      this.akm.setContentDescription(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final boolean setIndoorEnabled(boolean paramBoolean)
  {
    try
    {
      boolean bool = this.akm.setIndoorEnabled(paramBoolean);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setInfoWindowAdapter(InfoWindowAdapter paramInfoWindowAdapter)
  {
    if (paramInfoWindowAdapter == null);
    try
    {
      this.akm.setInfoWindowAdapter(null);
      return;
      this.akm.setInfoWindowAdapter(new d.a(paramInfoWindowAdapter)
      {
        public d f(l paraml)
        {
          return e.k(this.akD.getInfoWindow(new Marker(paraml)));
        }

        public d g(l paraml)
        {
          return e.k(this.akD.getInfoContents(new Marker(paraml)));
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setLocationSource(LocationSource paramLocationSource)
  {
    if (paramLocationSource == null);
    try
    {
      this.akm.setLocationSource(null);
      return;
      this.akm.setLocationSource(new ILocationSourceDelegate.a(paramLocationSource)
      {
        public void activate(com.google.android.gms.maps.internal.i parami)
        {
          this.aku.activate(new LocationSource.OnLocationChangedListener(parami)
          {
            public void onLocationChanged(Location paramLocation)
            {
              try
              {
                this.akv.d(paramLocation);
                return;
              }
              catch (RemoteException localRemoteException)
              {
              }
              throw new RuntimeRemoteException(localRemoteException);
            }
          });
        }

        public void deactivate()
        {
          this.aku.deactivate();
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setMapType(int paramInt)
  {
    try
    {
      this.akm.setMapType(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setMyLocationEnabled(boolean paramBoolean)
  {
    try
    {
      this.akm.setMyLocationEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnCameraChangeListener(OnCameraChangeListener paramOnCameraChangeListener)
  {
    if (paramOnCameraChangeListener == null);
    try
    {
      this.akm.setOnCameraChangeListener(null);
      return;
      this.akm.setOnCameraChangeListener(new f.a(paramOnCameraChangeListener)
      {
        public void onCameraChange(CameraPosition paramCameraPosition)
        {
          this.akx.onCameraChange(paramCameraPosition);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnIndoorStateChangeListener(OnIndoorStateChangeListener paramOnIndoorStateChangeListener)
  {
    if (paramOnIndoorStateChangeListener == null);
    try
    {
      this.akm.setOnIndoorStateChangeListener(null);
      return;
      this.akm.setOnIndoorStateChangeListener(new g.a(paramOnIndoorStateChangeListener)
      {
        public void a(j paramj)
        {
          this.ako.onIndoorLevelActivated(new IndoorBuilding(paramj));
        }

        public void onIndoorBuildingFocused()
        {
          this.ako.onIndoorBuildingFocused();
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnInfoWindowClickListener(OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    if (paramOnInfoWindowClickListener == null);
    try
    {
      this.akm.setOnInfoWindowClickListener(null);
      return;
      this.akm.setOnInfoWindowClickListener(new h.a(paramOnInfoWindowClickListener)
      {
        public void e(l paraml)
        {
          this.akC.onInfoWindowClick(new Marker(paraml));
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnMapClickListener(OnMapClickListener paramOnMapClickListener)
  {
    if (paramOnMapClickListener == null);
    try
    {
      this.akm.setOnMapClickListener(null);
      return;
      this.akm.setOnMapClickListener(new j.a(paramOnMapClickListener)
      {
        public void onMapClick(LatLng paramLatLng)
        {
          this.aky.onMapClick(paramLatLng);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setOnMapLoadedCallback(OnMapLoadedCallback paramOnMapLoadedCallback)
  {
    if (paramOnMapLoadedCallback == null);
    try
    {
      this.akm.setOnMapLoadedCallback(null);
      return;
      this.akm.setOnMapLoadedCallback(new k.a(paramOnMapLoadedCallback)
      {
        public void onMapLoaded()
          throws RemoteException
        {
          this.aks.onMapLoaded();
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnMapLongClickListener(OnMapLongClickListener paramOnMapLongClickListener)
  {
    if (paramOnMapLongClickListener == null);
    try
    {
      this.akm.setOnMapLongClickListener(null);
      return;
      this.akm.setOnMapLongClickListener(new l.a(paramOnMapLongClickListener)
      {
        public void onMapLongClick(LatLng paramLatLng)
        {
          this.akz.onMapLongClick(paramLatLng);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnMarkerClickListener(OnMarkerClickListener paramOnMarkerClickListener)
  {
    if (paramOnMarkerClickListener == null);
    try
    {
      this.akm.setOnMarkerClickListener(null);
      return;
      this.akm.setOnMarkerClickListener(new n.a(paramOnMarkerClickListener)
      {
        public boolean a(l paraml)
        {
          return this.akA.onMarkerClick(new Marker(paraml));
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnMarkerDragListener(OnMarkerDragListener paramOnMarkerDragListener)
  {
    if (paramOnMarkerDragListener == null);
    try
    {
      this.akm.setOnMarkerDragListener(null);
      return;
      this.akm.setOnMarkerDragListener(new o.a(paramOnMarkerDragListener)
      {
        public void b(l paraml)
        {
          this.akB.onMarkerDragStart(new Marker(paraml));
        }

        public void c(l paraml)
        {
          this.akB.onMarkerDragEnd(new Marker(paraml));
        }

        public void d(l paraml)
        {
          this.akB.onMarkerDrag(new Marker(paraml));
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnMyLocationButtonClickListener(OnMyLocationButtonClickListener paramOnMyLocationButtonClickListener)
  {
    if (paramOnMyLocationButtonClickListener == null);
    try
    {
      this.akm.setOnMyLocationButtonClickListener(null);
      return;
      this.akm.setOnMyLocationButtonClickListener(new p.a(paramOnMyLocationButtonClickListener)
      {
        public boolean onMyLocationButtonClick()
          throws RemoteException
        {
          return this.akr.onMyLocationButtonClick();
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  @Deprecated
  public final void setOnMyLocationChangeListener(OnMyLocationChangeListener paramOnMyLocationChangeListener)
  {
    if (paramOnMyLocationChangeListener == null);
    try
    {
      this.akm.setOnMyLocationChangeListener(null);
      return;
      this.akm.setOnMyLocationChangeListener(new q.a(paramOnMyLocationChangeListener)
      {
        public void c(Location paramLocation)
        {
          this.akq.onMyLocationChange(paramLocation);
        }

        public void g(d paramd)
        {
          this.akq.onMyLocationChange((Location)e.f(paramd));
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      this.akm.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setTrafficEnabled(boolean paramBoolean)
  {
    try
    {
      this.akm.setTrafficEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void snapshot(SnapshotReadyCallback paramSnapshotReadyCallback)
  {
    snapshot(paramSnapshotReadyCallback, null);
  }

  public final void snapshot(SnapshotReadyCallback paramSnapshotReadyCallback, Bitmap paramBitmap)
  {
    d locald;
    if (paramBitmap != null)
      locald = e.k(paramBitmap);
    while (true)
    {
      e locale = (e)(e)locald;
      try
      {
        this.akm.snapshot(new v.a(paramSnapshotReadyCallback)
        {
          public void h(d paramd)
            throws RemoteException
          {
            this.akt.onSnapshotReady((Bitmap)e.f(paramd));
          }

          public void onSnapshotReady(Bitmap paramBitmap)
            throws RemoteException
          {
            this.akt.onSnapshotReady(paramBitmap);
          }
        }
        , locale);
        return;
        locald = null;
      }
      catch (RemoteException localRemoteException)
      {
      }
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void stopAnimation()
  {
    try
    {
      this.akm.stopAnimation();
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static abstract interface CancelableCallback
  {
    public abstract void onCancel();

    public abstract void onFinish();
  }

  public static abstract interface InfoWindowAdapter
  {
    public abstract View getInfoContents(Marker paramMarker);

    public abstract View getInfoWindow(Marker paramMarker);
  }

  public static abstract interface OnCameraChangeListener
  {
    public abstract void onCameraChange(CameraPosition paramCameraPosition);
  }

  public static abstract interface OnIndoorStateChangeListener
  {
    public abstract void onIndoorBuildingFocused();

    public abstract void onIndoorLevelActivated(IndoorBuilding paramIndoorBuilding);
  }

  public static abstract interface OnInfoWindowClickListener
  {
    public abstract void onInfoWindowClick(Marker paramMarker);
  }

  public static abstract interface OnMapClickListener
  {
    public abstract void onMapClick(LatLng paramLatLng);
  }

  public static abstract interface OnMapLoadedCallback
  {
    public abstract void onMapLoaded();
  }

  public static abstract interface OnMapLongClickListener
  {
    public abstract void onMapLongClick(LatLng paramLatLng);
  }

  public static abstract interface OnMarkerClickListener
  {
    public abstract boolean onMarkerClick(Marker paramMarker);
  }

  public static abstract interface OnMarkerDragListener
  {
    public abstract void onMarkerDrag(Marker paramMarker);

    public abstract void onMarkerDragEnd(Marker paramMarker);

    public abstract void onMarkerDragStart(Marker paramMarker);
  }

  public static abstract interface OnMyLocationButtonClickListener
  {
    public abstract boolean onMyLocationButtonClick();
  }

  @Deprecated
  public static abstract interface OnMyLocationChangeListener
  {
    public abstract void onMyLocationChange(Location paramLocation);
  }

  public static abstract interface SnapshotReadyCallback
  {
    public abstract void onSnapshotReady(Bitmap paramBitmap);
  }

  private static final class a extends b.a
  {
    private final GoogleMap.CancelableCallback akE;

    a(GoogleMap.CancelableCallback paramCancelableCallback)
    {
      this.akE = paramCancelableCallback;
    }

    public void onCancel()
    {
      this.akE.onCancel();
    }

    public void onFinish()
    {
      this.akE.onFinish();
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.GoogleMap
 * JD-Core Version:    0.6.0
 */