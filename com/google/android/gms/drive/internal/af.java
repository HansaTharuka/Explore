package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.drive.realtime.internal.m;
import com.google.android.gms.drive.realtime.internal.m.a;

public abstract interface af extends IInterface
{
  public abstract void a(OnContentsResponse paramOnContentsResponse)
    throws RemoteException;

  public abstract void a(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse)
    throws RemoteException;

  public abstract void a(OnDownloadProgressResponse paramOnDownloadProgressResponse)
    throws RemoteException;

  public abstract void a(OnDriveIdResponse paramOnDriveIdResponse)
    throws RemoteException;

  public abstract void a(OnDrivePreferencesResponse paramOnDrivePreferencesResponse)
    throws RemoteException;

  public abstract void a(OnListEntriesResponse paramOnListEntriesResponse)
    throws RemoteException;

  public abstract void a(OnListParentsResponse paramOnListParentsResponse)
    throws RemoteException;

  public abstract void a(OnLoadRealtimeResponse paramOnLoadRealtimeResponse, m paramm)
    throws RemoteException;

  public abstract void a(OnMetadataResponse paramOnMetadataResponse)
    throws RemoteException;

  public abstract void a(OnResourceIdSetResponse paramOnResourceIdSetResponse)
    throws RemoteException;

  public abstract void a(OnStorageStatsResponse paramOnStorageStatsResponse)
    throws RemoteException;

  public abstract void a(OnSyncMoreResponse paramOnSyncMoreResponse)
    throws RemoteException;

  public abstract void n(Status paramStatus)
    throws RemoteException;

  public abstract void onSuccess()
    throws RemoteException;

  public static abstract class a extends Binder
    implements af
  {
    public a()
    {
      attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }

    public static af Y(IBinder paramIBinder)
    {
      if (paramIBinder == null)
        return null;
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      if ((localIInterface != null) && ((localIInterface instanceof af)))
        return (af)localIInterface;
      return new a(paramIBinder);
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
        paramParcel2.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        return true;
      case 1:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i8 = paramParcel1.readInt();
        OnDownloadProgressResponse localOnDownloadProgressResponse = null;
        if (i8 != 0)
          localOnDownloadProgressResponse = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnDownloadProgressResponse);
        paramParcel2.writeNoException();
        return true;
      case 2:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i7 = paramParcel1.readInt();
        OnListEntriesResponse localOnListEntriesResponse = null;
        if (i7 != 0)
          localOnListEntriesResponse = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnListEntriesResponse);
        paramParcel2.writeNoException();
        return true;
      case 3:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i6 = paramParcel1.readInt();
        OnDriveIdResponse localOnDriveIdResponse = null;
        if (i6 != 0)
          localOnDriveIdResponse = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnDriveIdResponse);
        paramParcel2.writeNoException();
        return true;
      case 4:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i5 = paramParcel1.readInt();
        OnMetadataResponse localOnMetadataResponse = null;
        if (i5 != 0)
          localOnMetadataResponse = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnMetadataResponse);
        paramParcel2.writeNoException();
        return true;
      case 5:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i4 = paramParcel1.readInt();
        OnContentsResponse localOnContentsResponse = null;
        if (i4 != 0)
          localOnContentsResponse = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnContentsResponse);
        paramParcel2.writeNoException();
        return true;
      case 6:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i3 = paramParcel1.readInt();
        Status localStatus = null;
        if (i3 != 0)
          localStatus = Status.CREATOR.createFromParcel(paramParcel1);
        n(localStatus);
        paramParcel2.writeNoException();
        return true;
      case 7:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        onSuccess();
        paramParcel2.writeNoException();
        return true;
      case 8:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i2 = paramParcel1.readInt();
        OnListParentsResponse localOnListParentsResponse = null;
        if (i2 != 0)
          localOnListParentsResponse = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnListParentsResponse);
        paramParcel2.writeNoException();
        return true;
      case 9:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int i1 = paramParcel1.readInt();
        OnSyncMoreResponse localOnSyncMoreResponse = null;
        if (i1 != 0)
          localOnSyncMoreResponse = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnSyncMoreResponse);
        paramParcel2.writeNoException();
        return true;
      case 10:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int n = paramParcel1.readInt();
        OnStorageStatsResponse localOnStorageStatsResponse = null;
        if (n != 0)
          localOnStorageStatsResponse = (OnStorageStatsResponse)OnStorageStatsResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnStorageStatsResponse);
        paramParcel2.writeNoException();
        return true;
      case 11:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int m = paramParcel1.readInt();
        OnLoadRealtimeResponse localOnLoadRealtimeResponse = null;
        if (m != 0)
          localOnLoadRealtimeResponse = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnLoadRealtimeResponse, m.a.al(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      case 12:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int k = paramParcel1.readInt();
        OnResourceIdSetResponse localOnResourceIdSetResponse = null;
        if (k != 0)
          localOnResourceIdSetResponse = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnResourceIdSetResponse);
        paramParcel2.writeNoException();
        return true;
      case 13:
        paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        int j = paramParcel1.readInt();
        OnDrivePreferencesResponse localOnDrivePreferencesResponse = null;
        if (j != 0)
          localOnDrivePreferencesResponse = (OnDrivePreferencesResponse)OnDrivePreferencesResponse.CREATOR.createFromParcel(paramParcel1);
        a(localOnDrivePreferencesResponse);
        paramParcel2.writeNoException();
        return true;
      case 14:
      }
      paramParcel1.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
      int i = paramParcel1.readInt();
      OnDeviceUsagePreferenceResponse localOnDeviceUsagePreferenceResponse = null;
      if (i != 0)
        localOnDeviceUsagePreferenceResponse = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.createFromParcel(paramParcel1);
      a(localOnDeviceUsagePreferenceResponse);
      paramParcel2.writeNoException();
      return true;
    }

    private static class a
      implements af
    {
      private IBinder le;

      a(IBinder paramIBinder)
      {
        this.le = paramIBinder;
      }

      public void a(OnContentsResponse paramOnContentsResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnContentsResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnContentsResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(5, localParcel1, localParcel2, 0);
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

      public void a(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnDeviceUsagePreferenceResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnDeviceUsagePreferenceResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(14, localParcel1, localParcel2, 0);
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

      public void a(OnDownloadProgressResponse paramOnDownloadProgressResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnDownloadProgressResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnDownloadProgressResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(1, localParcel1, localParcel2, 0);
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

      public void a(OnDriveIdResponse paramOnDriveIdResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnDriveIdResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnDriveIdResponse.writeToParcel(localParcel1, 0);
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

      public void a(OnDrivePreferencesResponse paramOnDrivePreferencesResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnDrivePreferencesResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnDrivePreferencesResponse.writeToParcel(localParcel1, 0);
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

      public void a(OnListEntriesResponse paramOnListEntriesResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnListEntriesResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnListEntriesResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(2, localParcel1, localParcel2, 0);
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

      public void a(OnListParentsResponse paramOnListParentsResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnListParentsResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnListParentsResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(8, localParcel1, localParcel2, 0);
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

      public void a(OnLoadRealtimeResponse paramOnLoadRealtimeResponse, m paramm)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        while (true)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (paramOnLoadRealtimeResponse == null)
              continue;
            localParcel1.writeInt(1);
            paramOnLoadRealtimeResponse.writeToParcel(localParcel1, 0);
            if (paramm != null)
            {
              localIBinder = paramm.asBinder();
              localParcel1.writeStrongBinder(localIBinder);
              this.le.transact(11, localParcel1, localParcel2, 0);
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

      public void a(OnMetadataResponse paramOnMetadataResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnMetadataResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnMetadataResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(4, localParcel1, localParcel2, 0);
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

      public void a(OnResourceIdSetResponse paramOnResourceIdSetResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnResourceIdSetResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnResourceIdSetResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(12, localParcel1, localParcel2, 0);
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

      public void a(OnStorageStatsResponse paramOnStorageStatsResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnStorageStatsResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnStorageStatsResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(10, localParcel1, localParcel2, 0);
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

      public void a(OnSyncMoreResponse paramOnSyncMoreResponse)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramOnSyncMoreResponse != null)
          {
            localParcel1.writeInt(1);
            paramOnSyncMoreResponse.writeToParcel(localParcel1, 0);
          }
          while (true)
          {
            this.le.transact(9, localParcel1, localParcel2, 0);
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

      public IBinder asBinder()
      {
        return this.le;
      }

      public void n(Status paramStatus)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
          if (paramStatus != null)
          {
            localParcel1.writeInt(1);
            paramStatus.writeToParcel(localParcel1, 0);
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

      public void onSuccess()
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
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
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.af
 * JD-Core Version:    0.6.0
 */