package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.r.a;
import com.google.android.gms.maps.internal.s.a;
import com.google.android.gms.maps.internal.t.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public class StreetViewPanorama
{
  private final IStreetViewPanoramaDelegate alg;

  protected StreetViewPanorama(IStreetViewPanoramaDelegate paramIStreetViewPanoramaDelegate)
  {
    this.alg = ((IStreetViewPanoramaDelegate)jx.i(paramIStreetViewPanoramaDelegate));
  }

  public void animateTo(StreetViewPanoramaCamera paramStreetViewPanoramaCamera, long paramLong)
  {
    try
    {
      this.alg.animateTo(paramStreetViewPanoramaCamera, paramLong);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public StreetViewPanoramaLocation getLocation()
  {
    try
    {
      StreetViewPanoramaLocation localStreetViewPanoramaLocation = this.alg.getStreetViewPanoramaLocation();
      return localStreetViewPanoramaLocation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public StreetViewPanoramaCamera getPanoramaCamera()
  {
    try
    {
      StreetViewPanoramaCamera localStreetViewPanoramaCamera = this.alg.getPanoramaCamera();
      return localStreetViewPanoramaCamera;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isPanningGesturesEnabled()
  {
    try
    {
      boolean bool = this.alg.isPanningGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isStreetNamesEnabled()
  {
    try
    {
      boolean bool = this.alg.isStreetNamesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isUserNavigationEnabled()
  {
    try
    {
      boolean bool = this.alg.isUserNavigationEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public boolean isZoomGesturesEnabled()
  {
    try
    {
      boolean bool = this.alg.isZoomGesturesEnabled();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  IStreetViewPanoramaDelegate nQ()
  {
    return this.alg;
  }

  public Point orientationToPoint(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
  {
    try
    {
      d locald = this.alg.orientationToPoint(paramStreetViewPanoramaOrientation);
      if (locald == null)
        return null;
      Point localPoint = (Point)e.f(locald);
      return localPoint;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public StreetViewPanoramaOrientation pointToOrientation(Point paramPoint)
  {
    try
    {
      StreetViewPanoramaOrientation localStreetViewPanoramaOrientation = this.alg.pointToOrientation(e.k(paramPoint));
      return localStreetViewPanoramaOrientation;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnStreetViewPanoramaCameraChangeListener(OnStreetViewPanoramaCameraChangeListener paramOnStreetViewPanoramaCameraChangeListener)
  {
    if (paramOnStreetViewPanoramaCameraChangeListener == null);
    try
    {
      this.alg.setOnStreetViewPanoramaCameraChangeListener(null);
      return;
      this.alg.setOnStreetViewPanoramaCameraChangeListener(new r.a(paramOnStreetViewPanoramaCameraChangeListener)
      {
        public void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera paramStreetViewPanoramaCamera)
        {
          this.alj.onStreetViewPanoramaCameraChange(paramStreetViewPanoramaCamera);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnStreetViewPanoramaChangeListener(OnStreetViewPanoramaChangeListener paramOnStreetViewPanoramaChangeListener)
  {
    if (paramOnStreetViewPanoramaChangeListener == null);
    try
    {
      this.alg.setOnStreetViewPanoramaChangeListener(null);
      return;
      this.alg.setOnStreetViewPanoramaChangeListener(new s.a(paramOnStreetViewPanoramaChangeListener)
      {
        public void onStreetViewPanoramaChange(StreetViewPanoramaLocation paramStreetViewPanoramaLocation)
        {
          this.alh.onStreetViewPanoramaChange(paramStreetViewPanoramaLocation);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public final void setOnStreetViewPanoramaClickListener(OnStreetViewPanoramaClickListener paramOnStreetViewPanoramaClickListener)
  {
    if (paramOnStreetViewPanoramaClickListener == null);
    try
    {
      this.alg.setOnStreetViewPanoramaClickListener(null);
      return;
      this.alg.setOnStreetViewPanoramaClickListener(new t.a(paramOnStreetViewPanoramaClickListener)
      {
        public void onStreetViewPanoramaClick(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation)
        {
          this.alk.onStreetViewPanoramaClick(paramStreetViewPanoramaOrientation);
        }
      });
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPanningGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      this.alg.enablePanning(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(LatLng paramLatLng)
  {
    try
    {
      this.alg.setPosition(paramLatLng);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(LatLng paramLatLng, int paramInt)
  {
    try
    {
      this.alg.setPositionWithRadius(paramLatLng, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setPosition(String paramString)
  {
    try
    {
      this.alg.setPositionWithID(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setStreetNamesEnabled(boolean paramBoolean)
  {
    try
    {
      this.alg.enableStreetNames(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setUserNavigationEnabled(boolean paramBoolean)
  {
    try
    {
      this.alg.enableUserNavigation(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public void setZoomGesturesEnabled(boolean paramBoolean)
  {
    try
    {
      this.alg.enableZoom(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
    }
    throw new RuntimeRemoteException(localRemoteException);
  }

  public static abstract interface OnStreetViewPanoramaCameraChangeListener
  {
    public abstract void onStreetViewPanoramaCameraChange(StreetViewPanoramaCamera paramStreetViewPanoramaCamera);
  }

  public static abstract interface OnStreetViewPanoramaChangeListener
  {
    public abstract void onStreetViewPanoramaChange(StreetViewPanoramaLocation paramStreetViewPanoramaLocation);
  }

  public static abstract interface OnStreetViewPanoramaClickListener
  {
    public abstract void onStreetViewPanoramaClick(StreetViewPanoramaOrientation paramStreetViewPanoramaOrientation);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.StreetViewPanorama
 * JD-Core Version:    0.6.0
 */