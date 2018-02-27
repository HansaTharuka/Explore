package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.io.InputStream;

public final class f
  implements DataApi
{
  private PendingResult<Status> a(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramDataListener, paramArrayOfIntentFilter, null));
  }

  private void a(Asset paramAsset)
  {
    if (paramAsset == null)
      throw new IllegalArgumentException("asset is null");
    if (paramAsset.getDigest() == null)
      throw new IllegalArgumentException("invalid asset");
    if (paramAsset.getData() != null)
      throw new IllegalArgumentException("invalid asset");
  }

  public PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    return a(paramGoogleApiClient, paramDataListener, null);
  }

  public PendingResult<DataApi.DeleteDataItemsResult> deleteDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramUri)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.c(this, this.amO);
      }

      protected DataApi.DeleteDataItemsResult aG(Status paramStatus)
      {
        return new f.c(paramStatus, 0);
      }
    });
  }

  public PendingResult<DataApi.DataItemResult> getDataItem(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramUri)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.a(this, this.amO);
      }

      protected DataApi.DataItemResult aE(Status paramStatus)
      {
        return new f.b(paramStatus, null);
      }
    });
  }

  public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.n(this);
      }

      protected DataItemBuffer aF(Status paramStatus)
      {
        return new DataItemBuffer(DataHolder.av(paramStatus.getStatusCode()));
      }
    });
  }

  public PendingResult<DataItemBuffer> getDataItems(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramUri)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.b(this, this.amO);
      }

      protected DataItemBuffer aF(Status paramStatus)
      {
        return new DataItemBuffer(DataHolder.av(paramStatus.getStatusCode()));
      }
    });
  }

  public PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, Asset paramAsset)
  {
    a(paramAsset);
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramAsset)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.a(this, this.axz);
      }

      protected DataApi.GetFdForAssetResult aH(Status paramStatus)
      {
        return new f.d(paramStatus, null);
      }
    });
  }

  public PendingResult<DataApi.GetFdForAssetResult> getFdForAsset(GoogleApiClient paramGoogleApiClient, DataItemAsset paramDataItemAsset)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramDataItemAsset)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.a(this, this.axA);
      }

      protected DataApi.GetFdForAssetResult aH(Status paramStatus)
      {
        return new f.d(paramStatus, null);
      }
    });
  }

  public PendingResult<DataApi.DataItemResult> putDataItem(GoogleApiClient paramGoogleApiClient, PutDataRequest paramPutDataRequest)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramPutDataRequest)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.a(this, this.axx);
      }

      public DataApi.DataItemResult aE(Status paramStatus)
      {
        return new f.b(paramStatus, null);
      }
    });
  }

  public PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramDataListener)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.a(this, this.axB);
      }

      public Status b(Status paramStatus)
      {
        return paramStatus;
      }
    });
  }

  private static final class a extends d<Status>
  {
    private DataApi.DataListener axC;
    private IntentFilter[] axD;

    private a(GoogleApiClient paramGoogleApiClient, DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
    {
      super();
      this.axC = paramDataListener;
      this.axD = paramArrayOfIntentFilter;
    }

    protected void a(ba paramba)
      throws RemoteException
    {
      paramba.a(this, this.axC, this.axD);
      this.axC = null;
      this.axD = null;
    }

    public Status b(Status paramStatus)
    {
      this.axC = null;
      this.axD = null;
      return paramStatus;
    }
  }

  public static class b
    implements DataApi.DataItemResult
  {
    private final Status Eb;
    private final DataItem axE;

    public b(Status paramStatus, DataItem paramDataItem)
    {
      this.Eb = paramStatus;
      this.axE = paramDataItem;
    }

    public DataItem getDataItem()
    {
      return this.axE;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }

  public static class c
    implements DataApi.DeleteDataItemsResult
  {
    private final Status Eb;
    private final int axF;

    public c(Status paramStatus, int paramInt)
    {
      this.Eb = paramStatus;
      this.axF = paramInt;
    }

    public int getNumDeleted()
    {
      return this.axF;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }

  public static class d
    implements DataApi.GetFdForAssetResult
  {
    private final Status Eb;
    private volatile InputStream ZO;
    private volatile ParcelFileDescriptor axG;
    private volatile boolean mClosed = false;

    public d(Status paramStatus, ParcelFileDescriptor paramParcelFileDescriptor)
    {
      this.Eb = paramStatus;
      this.axG = paramParcelFileDescriptor;
    }

    public ParcelFileDescriptor getFd()
    {
      if (this.mClosed)
        throw new IllegalStateException("Cannot access the file descriptor after release().");
      return this.axG;
    }

    public InputStream getInputStream()
    {
      if (this.mClosed)
        throw new IllegalStateException("Cannot access the input stream after release().");
      if (this.axG == null)
        return null;
      if (this.ZO == null)
        this.ZO = new ParcelFileDescriptor.AutoCloseInputStream(this.axG);
      return this.ZO;
    }

    public Status getStatus()
    {
      return this.Eb;
    }

    public void release()
    {
      if (this.axG == null)
        return;
      if (this.mClosed)
        throw new IllegalStateException("releasing an already released result.");
      try
      {
        if (this.ZO != null)
          this.ZO.close();
        while (true)
        {
          this.mClosed = true;
          this.axG = null;
          this.ZO = null;
          return;
          this.axG.close();
        }
      }
      catch (IOException localIOException)
      {
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.f
 * JD-Core Version:    0.6.0
 */