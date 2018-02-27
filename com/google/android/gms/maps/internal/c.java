package com.google.android.gms.maps.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.d.a;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.a;
import com.google.android.gms.maps.model.internal.g;
import com.google.android.gms.maps.model.internal.g.a;

public abstract interface c extends IInterface
{
  public abstract IMapViewDelegate a(d paramd, GoogleMapOptions paramGoogleMapOptions)
    throws RemoteException;

  public abstract IStreetViewPanoramaViewDelegate a(d paramd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
    throws RemoteException;

  public abstract void a(d paramd, int paramInt)
    throws RemoteException;

  public abstract void i(d paramd)
    throws RemoteException;

  public abstract IMapFragmentDelegate j(d paramd)
    throws RemoteException;

  public abstract IStreetViewPanoramaFragmentDelegate k(d paramd)
    throws RemoteException;

  public abstract ICameraUpdateFactoryDelegate nW()
    throws RemoteException;

  public abstract g nX()
    throws RemoteException;

  public static abstract class a extends Binder
    implements c
  {
    public static c aS(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
      if ((localIInterface != null) && ((localIInterface instanceof c)))
        return (c)localIInterface;
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
        paramParcel2.writeString("com.google.android.gms.maps.internal.ICreator");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        i(d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        IMapFragmentDelegate localIMapFragmentDelegate = j(d.a.ap(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        IBinder localIBinder6 = null;
        if (localIMapFragmentDelegate != null)
          localIBinder6 = localIMapFragmentDelegate.asBinder();
        paramParcel2.writeStrongBinder(localIBinder6);
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        d locald2 = d.a.ap(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0);
        for (GoogleMapOptions localGoogleMapOptions = GoogleMapOptions.CREATOR.cX(paramParcel1); ; localGoogleMapOptions = null)
        {
          IMapViewDelegate localIMapViewDelegate = a(locald2, localGoogleMapOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder5 = null;
          if (localIMapViewDelegate != null)
            localIBinder5 = localIMapViewDelegate.asBinder();
          paramParcel2.writeStrongBinder(localIBinder5);
          return true;
        }
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        ICameraUpdateFactoryDelegate localICameraUpdateFactoryDelegate = nW();
        paramParcel2.writeNoException();
        IBinder localIBinder4 = null;
        if (localICameraUpdateFactoryDelegate != null)
          localIBinder4 = localICameraUpdateFactoryDelegate.asBinder();
        paramParcel2.writeStrongBinder(localIBinder4);
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        g localg = nX();
        paramParcel2.writeNoException();
        IBinder localIBinder3 = null;
        if (localg != null)
          localIBinder3 = localg.asBinder();
        paramParcel2.writeStrongBinder(localIBinder3);
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        a(d.a.ap(paramParcel1.readStrongBinder()), paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
        d locald1 = d.a.ap(paramParcel1.readStrongBinder());
        if (paramParcel1.readInt() != 0);
        for (StreetViewPanoramaOptions localStreetViewPanoramaOptions = StreetViewPanoramaOptions.CREATOR.cY(paramParcel1); ; localStreetViewPanoramaOptions = null)
        {
          IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = a(locald1, localStreetViewPanoramaOptions);
          paramParcel2.writeNoException();
          IBinder localIBinder2 = null;
          if (localIStreetViewPanoramaViewDelegate != null)
            localIBinder2 = localIStreetViewPanoramaViewDelegate.asBinder();
          paramParcel2.writeStrongBinder(localIBinder2);
          return true;
        }
      case 8:
      }
      paramParcel1.enforceInterface("com.google.android.gms.maps.internal.ICreator");
      IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = k(d.a.ap(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      IBinder localIBinder1 = null;
      if (localIStreetViewPanoramaFragmentDelegate != null)
        localIBinder1 = localIStreetViewPanoramaFragmentDelegate.asBinder();
      paramParcel2.writeStrongBinder(localIBinder1);
      return true;
    }

    private static class a
      implements c
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public IMapViewDelegate a(d paramd, GoogleMapOptions paramGoogleMapOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          IBinder localIBinder;
          if (paramd != null)
          {
            localIBinder = paramd.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramGoogleMapOptions == null)
              break label96;
            localParcel1.writeInt(1);
            paramGoogleMapOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(3, localParcel1, localParcel2, 0);
            localParcel2.readException();
            IMapViewDelegate localIMapViewDelegate = IMapViewDelegate.a.aY(localParcel2.readStrongBinder());
            return localIMapViewDelegate;
            localIBinder = null;
            break;
            label96: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public IStreetViewPanoramaViewDelegate a(d paramd, StreetViewPanoramaOptions paramStreetViewPanoramaOptions)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          IBinder localIBinder;
          if (paramd != null)
          {
            localIBinder = paramd.asBinder();
            localParcel1.writeStrongBinder(localIBinder);
            if (paramStreetViewPanoramaOptions == null)
              break label97;
            localParcel1.writeInt(1);
            paramStreetViewPanoramaOptions.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(7, localParcel1, localParcel2, 0);
            localParcel2.readException();
            IStreetViewPanoramaViewDelegate localIStreetViewPanoramaViewDelegate = IStreetViewPanoramaViewDelegate.a.bt(localParcel2.readStrongBinder());
            return localIStreetViewPanoramaViewDelegate;
            localIBinder = null;
            break;
            label97: localParcel1.writeInt(0);
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public void a(d paramd, int paramInt)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            localParcel1.writeInt(paramInt);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void i(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
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

      public IMapFragmentDelegate j(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            IMapFragmentDelegate localIMapFragmentDelegate = IMapFragmentDelegate.a.aX(localParcel2.readStrongBinder());
            return localIMapFragmentDelegate;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public IStreetViewPanoramaFragmentDelegate k(d paramd)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          if (paramd != null);
          for (IBinder localIBinder = paramd.asBinder(); ; localIBinder = null)
          {
            localParcel1.writeStrongBinder(localIBinder);
            this.le.transact(8, localParcel1, localParcel2, 0);
            localParcel2.readException();
            IStreetViewPanoramaFragmentDelegate localIStreetViewPanoramaFragmentDelegate = IStreetViewPanoramaFragmentDelegate.a.bs(localParcel2.readStrongBinder());
            return localIStreetViewPanoramaFragmentDelegate;
          }
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public ICameraUpdateFactoryDelegate nW()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          this.le.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          ICameraUpdateFactoryDelegate localICameraUpdateFactoryDelegate = ICameraUpdateFactoryDelegate.a.aQ(localParcel2.readStrongBinder());
          return localICameraUpdateFactoryDelegate;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
        throw localObject;
      }

      public g nX()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
          this.le.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          g localg = g.a.bv(localParcel2.readStrongBinder());
          return localg;
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
 * Qualified Name:     com.google.android.gms.maps.internal.c
 * JD-Core Version:    0.6.0
 */