package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.i;

public abstract interface l extends IInterface
{
  public abstract void b(a parama)
    throws RemoteException;

  public abstract float getAlpha()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract LatLng getPosition()
    throws RemoteException;

  public abstract float getRotation()
    throws RemoteException;

  public abstract String getSnippet()
    throws RemoteException;

  public abstract String getTitle()
    throws RemoteException;

  public abstract boolean h(l paraml)
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract void hideInfoWindow()
    throws RemoteException;

  public abstract boolean isDraggable()
    throws RemoteException;

  public abstract boolean isFlat()
    throws RemoteException;

  public abstract boolean isInfoWindowShown()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void n(d paramd)
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setAlpha(float paramFloat)
    throws RemoteException;

  public abstract void setAnchor(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract void setDraggable(boolean paramBoolean)
    throws RemoteException;

  public abstract void setFlat(boolean paramBoolean)
    throws RemoteException;

  public abstract void setInfoWindowAnchor(float paramFloat1, float paramFloat2)
    throws RemoteException;

  public abstract void setPosition(LatLng paramLatLng)
    throws RemoteException;

  public abstract void setRotation(float paramFloat)
    throws RemoteException;

  public abstract void setSnippet(String paramString)
    throws RemoteException;

  public abstract void setTitle(String paramString)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void showInfoWindow()
    throws RemoteException;

  public static abstract class a extends Binder
    implements l
  {
    public static l bA(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof l)))
        return (l)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        remove();
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        String str3 = getId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str3);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        int i5 = paramParcel1.readInt();
        LatLng localLatLng2 = null;
        if (i5 != 0)
          localLatLng2 = LatLng.CREATOR.de(paramParcel1);
        setPosition(localLatLng2);
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        LatLng localLatLng1 = getPosition();
        paramParcel2.writeNoException();
        if (localLatLng1 != null)
        {
          paramParcel2.writeInt(1);
          localLatLng1.writeToParcel(paramParcel2, 1);
          return true;
        }
        paramParcel2.writeInt(0);
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setTitle(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        String str2 = getTitle();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str2);
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setSnippet(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        String str1 = getSnippet();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str1);
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (paramParcel1.readInt() != 0);
        for (boolean bool8 = true; ; bool8 = false)
        {
          setDraggable(bool8);
          paramParcel2.writeNoException();
          return true;
        }
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        boolean bool7 = isDraggable();
        paramParcel2.writeNoException();
        int i4 = 0;
        if (bool7)
          i4 = 1;
        paramParcel2.writeInt(i4);
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        showInfoWindow();
        paramParcel2.writeNoException();
        return true;
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        hideInfoWindow();
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        boolean bool6 = isInfoWindowShown();
        paramParcel2.writeNoException();
        int i3 = 0;
        if (bool6)
          i3 = 1;
        paramParcel2.writeInt(i3);
        return true;
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        int i2 = paramParcel1.readInt();
        boolean bool5 = false;
        if (i2 != 0)
          bool5 = true;
        setVisible(bool5);
        paramParcel2.writeNoException();
        return true;
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        boolean bool4 = isVisible();
        paramParcel2.writeNoException();
        int i1 = 0;
        if (bool4)
          i1 = 1;
        paramParcel2.writeInt(i1);
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        boolean bool3 = h(bA(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        int n = 0;
        if (bool3)
          n = 1;
        paramParcel2.writeInt(n);
        return true;
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        int m = hashCodeRemote();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(m);
        return true;
      case 18:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        n(d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 19:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setAnchor(paramParcel1.readFloat(), paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 20:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        int k = paramParcel1.readInt();
        boolean bool2 = false;
        if (k != 0)
          bool2 = true;
        setFlat(bool2);
        paramParcel2.writeNoException();
        return true;
      case 21:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        boolean bool1 = isFlat();
        paramParcel2.writeNoException();
        int j = 0;
        if (bool1)
          j = 1;
        paramParcel2.writeInt(j);
        return true;
      case 22:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setRotation(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 23:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        float f2 = getRotation();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f2);
        return true;
      case 24:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setInfoWindowAnchor(paramParcel1.readFloat(), paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 25:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        setAlpha(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 26:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        float f1 = getAlpha();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        return true;
      case 28:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
      int i = paramParcel1.readInt();
      a locala = null;
      if (i != 0)
        locala = a.CREATOR.dp(paramParcel1);
      b(locala);
      paramParcel2.writeNoException();
      return true;
    }

    private static class a
      implements l
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public IBinder asBinder()
      {
        return this.le;
      }

      public void b(a parama)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          if (parama != null)
          {
            localParcel1.writeInt(1);
            parama.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(28, localParcel1, localParcel2, 0);
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

      public float getAlpha()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(26, localParcel1, localParcel2, 0);
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

      public String getId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public LatLng getPosition()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          if (localParcel2.readInt() != 0)
          {
            LatLng localLatLng2 = LatLng.CREATOR.de(localParcel2);
            localLatLng1 = localLatLng2;
            return localLatLng1;
          }
          LatLng localLatLng1 = null;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }

      public float getRotation()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(23, localParcel1, localParcel2, 0);
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

      public String getSnippet()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public String getTitle()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public boolean h(l paraml)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          if (paraml != null);
          for (IBinder localIBinder = paraml.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(16, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            int j = 0;
            if (i != 0)
              j = 1;
            return j;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public int hashCodeRemote()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(17, localParcel1, localParcel2, 0);
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

      public void hideInfoWindow()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

      public boolean isDraggable()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(10, localParcel1, localParcel2, 0);
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

      public boolean isFlat()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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

      public boolean isInfoWindowShown()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(13, localParcel1, localParcel2, 0);
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

      public boolean isVisible()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(15, localParcel1, localParcel2, 0);
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

      public void n(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(18, localParcel1, localParcel2, 0);
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

      public void remove()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(1, localParcel1, localParcel2, 0);
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

      public void setAlpha(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeFloat(paramFloat);
          this.le.transact(25, localParcel1, localParcel2, 0);
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

      public void setAnchor(float paramFloat1, float paramFloat2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeFloat(paramFloat1);
          localParcel1.writeFloat(paramFloat2);
          this.le.transact(19, localParcel1, localParcel2, 0);
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

      public void setDraggable(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(9, localParcel1, localParcel2, 0);
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

      public void setFlat(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(20, localParcel1, localParcel2, 0);
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

      public void setInfoWindowAnchor(float paramFloat1, float paramFloat2)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeFloat(paramFloat1);
          localParcel1.writeFloat(paramFloat2);
          this.le.transact(24, localParcel1, localParcel2, 0);
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

      public void setPosition(LatLng paramLatLng)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          if (paramLatLng != null)
          {
            localParcel1.writeInt(1);
            paramLatLng.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(3, localParcel1, localParcel2, 0);
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

      public void setRotation(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeFloat(paramFloat);
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

      public void setSnippet(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(7, localParcel1, localParcel2, 0);
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

      public void setTitle(String paramString)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          localParcel1.writeString(paramString);
          this.le.transact(5, localParcel1, localParcel2, 0);
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

      public void setVisible(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
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

      public void showInfoWindow()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.IMarkerDelegate");
          this.le.transact(11, localParcel1, localParcel2, 0);
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
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.model.internal.l
 * JD-Core Version:    0.6.0
 */