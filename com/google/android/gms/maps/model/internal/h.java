package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.i;

public abstract interface h extends IInterface
{
  public abstract boolean a(h paramh)
    throws RemoteException;

  public abstract LatLng getCenter()
    throws RemoteException;

  public abstract int getFillColor()
    throws RemoteException;

  public abstract String getId()
    throws RemoteException;

  public abstract double getRadius()
    throws RemoteException;

  public abstract int getStrokeColor()
    throws RemoteException;

  public abstract float getStrokeWidth()
    throws RemoteException;

  public abstract float getZIndex()
    throws RemoteException;

  public abstract int hashCodeRemote()
    throws RemoteException;

  public abstract boolean isVisible()
    throws RemoteException;

  public abstract void remove()
    throws RemoteException;

  public abstract void setCenter(LatLng paramLatLng)
    throws RemoteException;

  public abstract void setFillColor(int paramInt)
    throws RemoteException;

  public abstract void setRadius(double paramDouble)
    throws RemoteException;

  public abstract void setStrokeColor(int paramInt)
    throws RemoteException;

  public abstract void setStrokeWidth(float paramFloat)
    throws RemoteException;

  public abstract void setVisible(boolean paramBoolean)
    throws RemoteException;

  public abstract void setZIndex(float paramFloat)
    throws RemoteException;

  public static abstract class a extends Binder
    implements h
  {
    public static h bw(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
      if ((localIInterface != null) && ((localIInterface instanceof h)))
        return (h)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        remove();
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        String str = getId();
        paramParcel2.writeNoException();
        paramParcel2.writeString(str);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (paramParcel1.readInt() != 0);
        for (LatLng localLatLng2 = LatLng.CREATOR.de(paramParcel1); ; localLatLng2 = null)
        {
          setCenter(localLatLng2);
          paramParcel2.writeNoException();
          return true;
        }
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        LatLng localLatLng1 = getCenter();
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
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        setRadius(paramParcel1.readDouble());
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        double d = getRadius();
        paramParcel2.writeNoException();
        paramParcel2.writeDouble(d);
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        setStrokeWidth(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        float f2 = getStrokeWidth();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f2);
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        setStrokeColor(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        int i1 = getStrokeColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(i1);
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        setFillColor(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        int n = getFillColor();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(n);
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        setZIndex(paramParcel1.readFloat());
        paramParcel2.writeNoException();
        return true;
      case 14:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        float f1 = getZIndex();
        paramParcel2.writeNoException();
        paramParcel2.writeFloat(f1);
        return true;
      case 15:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        int m = paramParcel1.readInt();
        boolean bool3 = false;
        if (m != 0)
          bool3 = true;
        setVisible(bool3);
        paramParcel2.writeNoException();
        return true;
      case 16:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        boolean bool2 = isVisible();
        paramParcel2.writeNoException();
        int k = 0;
        if (bool2)
          k = 1;
        paramParcel2.writeInt(k);
        return true;
      case 17:
        paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        boolean bool1 = a(bw(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        int j = 0;
        if (bool1)
          j = 1;
        paramParcel2.writeInt(j);
        return true;
      case 18:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
      int i = hashCodeRemote();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(i);
      return true;
    }

    private static class a
      implements h
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public boolean a(h paramh)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          if (paramh != null);
          for (IBinder localIBinder = paramh.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(17, localParcel1, localParcel2, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public LatLng getCenter()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

      public int getFillColor()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(12, localParcel1, localParcel2, 0);
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

      public String getId()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

      public double getRadius()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          double d = localParcel2.readDouble();
          return d;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public int getStrokeColor()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(10, localParcel1, localParcel2, 0);
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

      public float getStrokeWidth()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(8, localParcel1, localParcel2, 0);
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

      public float getZIndex()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(14, localParcel1, localParcel2, 0);
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

      public int hashCodeRemote()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(18, localParcel1, localParcel2, 0);
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

      public boolean isVisible()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          this.le.transact(16, localParcel1, localParcel2, 0);
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

      public void remove()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

      public void setCenter(LatLng paramLatLng)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
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

      public void setFillColor(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          localParcel1.writeInt(paramInt);
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

      public void setRadius(double paramDouble)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          localParcel1.writeDouble(paramDouble);
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

      public void setStrokeColor(int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          localParcel1.writeInt(paramInt);
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

      public void setStrokeWidth(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          localParcel1.writeFloat(paramFloat);
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

      public void setVisible(boolean paramBoolean)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          int i = 0;
          if (paramBoolean)
            i = 1;
          localParcel1.writeInt(i);
          this.le.transact(15, localParcel1, localParcel2, 0);
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

      public void setZIndex(float paramFloat)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.model.internal.ICircleDelegate");
          localParcel1.writeFloat(paramFloat);
          this.le.transact(13, localParcel1, localParcel2, 0);
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
 * Qualified Name:     com.google.android.gms.maps.model.internal.h
 * JD-Core Version:    0.6.0
 */