package com.google.android.gms.wearable.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.jl;
import com.google.android.gms.internal.jl.e;
import com.google.android.gms.internal.jt;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataApi.DataListener;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;
import com.google.android.gms.wearable.DataApi.GetFdForAssetResult;
import com.google.android.gms.wearable.DataItemAsset;
import com.google.android.gms.wearable.DataItemBuffer;
import com.google.android.gms.wearable.MessageApi.MessageListener;
import com.google.android.gms.wearable.MessageApi.SendMessageResult;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import com.google.android.gms.wearable.PutDataRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class ba extends jl<af>
{
  private final ExecutorService asJ = Executors.newCachedThreadPool();
  private final ag<DataApi.DataListener> ayg = new ag.b();
  private final ag<MessageApi.MessageListener> ayh = new ag.c();
  private final ag<NodeApi.NodeListener> ayi = new ag.d();

  public ba(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, new String[0]);
  }

  private FutureTask<Boolean> a(ParcelFileDescriptor paramParcelFileDescriptor, byte[] paramArrayOfByte)
  {
    return new FutureTask(new Callable(paramParcelFileDescriptor, paramArrayOfByte)
    {
      // ERROR //
      public Boolean rr()
      {
        // Byte code:
        //   0: ldc 41
        //   2: iconst_3
        //   3: invokestatic 47	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   6: ifeq +31 -> 37
        //   9: ldc 41
        //   11: new 49	java/lang/StringBuilder
        //   14: dup
        //   15: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   18: ldc 52
        //   20: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   23: aload_0
        //   24: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   27: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   30: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   33: invokestatic 67	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
        //   36: pop
        //   37: new 69	android/os/ParcelFileDescriptor$AutoCloseOutputStream
        //   40: dup
        //   41: aload_0
        //   42: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   45: invokespecial 72	android/os/ParcelFileDescriptor$AutoCloseOutputStream:<init>	(Landroid/os/ParcelFileDescriptor;)V
        //   48: astore_1
        //   49: aload_1
        //   50: aload_0
        //   51: getfield 26	com/google/android/gms/wearable/internal/ba$1:DU	[B
        //   54: invokevirtual 76	android/os/ParcelFileDescriptor$AutoCloseOutputStream:write	([B)V
        //   57: aload_1
        //   58: invokevirtual 79	android/os/ParcelFileDescriptor$AutoCloseOutputStream:flush	()V
        //   61: ldc 41
        //   63: iconst_3
        //   64: invokestatic 47	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   67: ifeq +31 -> 98
        //   70: ldc 41
        //   72: new 49	java/lang/StringBuilder
        //   75: dup
        //   76: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   79: ldc 81
        //   81: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   84: aload_0
        //   85: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   88: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   91: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   94: invokestatic 67	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
        //   97: pop
        //   98: iconst_1
        //   99: invokestatic 87	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   102: astore 9
        //   104: ldc 41
        //   106: iconst_3
        //   107: invokestatic 47	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   110: ifeq +31 -> 141
        //   113: ldc 41
        //   115: new 49	java/lang/StringBuilder
        //   118: dup
        //   119: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   122: ldc 89
        //   124: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   127: aload_0
        //   128: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   131: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   134: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   137: invokestatic 67	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
        //   140: pop
        //   141: aload_1
        //   142: invokevirtual 92	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   145: aload 9
        //   147: areturn
        //   148: astore 5
        //   150: ldc 41
        //   152: new 49	java/lang/StringBuilder
        //   155: dup
        //   156: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   159: ldc 94
        //   161: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   164: aload_0
        //   165: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   168: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   171: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   174: invokestatic 97	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
        //   177: pop
        //   178: ldc 41
        //   180: iconst_3
        //   181: invokestatic 47	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   184: ifeq +31 -> 215
        //   187: ldc 41
        //   189: new 49	java/lang/StringBuilder
        //   192: dup
        //   193: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   196: ldc 89
        //   198: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: aload_0
        //   202: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   205: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   208: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   211: invokestatic 67	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
        //   214: pop
        //   215: aload_1
        //   216: invokevirtual 92	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   219: iconst_0
        //   220: invokestatic 87	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
        //   223: areturn
        //   224: astore_2
        //   225: ldc 41
        //   227: iconst_3
        //   228: invokestatic 47	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
        //   231: ifeq +31 -> 262
        //   234: ldc 41
        //   236: new 49	java/lang/StringBuilder
        //   239: dup
        //   240: invokespecial 50	java/lang/StringBuilder:<init>	()V
        //   243: ldc 89
        //   245: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: aload_0
        //   249: getfield 24	com/google/android/gms/wearable/internal/ba$1:ayj	Landroid/os/ParcelFileDescriptor;
        //   252: invokevirtual 59	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   255: invokevirtual 63	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   258: invokestatic 67	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
        //   261: pop
        //   262: aload_1
        //   263: invokevirtual 92	android/os/ParcelFileDescriptor$AutoCloseOutputStream:close	()V
        //   266: aload_2
        //   267: athrow
        //   268: astore_3
        //   269: goto -3 -> 266
        //   272: astore 7
        //   274: goto -55 -> 219
        //   277: astore 10
        //   279: aload 9
        //   281: areturn
        //
        // Exception table:
        //   from	to	target	type
        //   49	98	148	java/io/IOException
        //   98	104	148	java/io/IOException
        //   49	98	224	finally
        //   98	104	224	finally
        //   150	178	224	finally
        //   225	262	268	java/io/IOException
        //   262	266	268	java/io/IOException
        //   178	215	272	java/io/IOException
        //   215	219	272	java/io/IOException
        //   104	141	277	java/io/IOException
        //   141	145	277	java/io/IOException
      }
    });
  }

  protected void a(int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    if (Log.isLoggable("WearableClient", 2))
      Log.d("WearableClient", "onPostInitHandler: statusCode " + paramInt);
    if (paramInt == 0)
    {
      this.ayg.ca(paramIBinder);
      this.ayh.ca(paramIBinder);
      this.ayi.ca(paramIBinder);
    }
    super.a(paramInt, paramIBinder, paramBundle);
  }

  public void a(BaseImplementation.b<DataApi.DataItemResult> paramb, Uri paramUri)
    throws RemoteException
  {
    ((af)hw()).a(new az.d(paramb), paramUri);
  }

  public void a(BaseImplementation.b<DataApi.GetFdForAssetResult> paramb, Asset paramAsset)
    throws RemoteException
  {
    ((af)hw()).a(new az.f(paramb), paramAsset);
  }

  public void a(BaseImplementation.b<Status> paramb, DataApi.DataListener paramDataListener)
    throws RemoteException
  {
    this.ayg.a(this, paramb, paramDataListener);
  }

  public void a(BaseImplementation.b<Status> paramb, DataApi.DataListener paramDataListener, IntentFilter[] paramArrayOfIntentFilter)
    throws RemoteException
  {
    this.ayg.a(this, paramb, paramDataListener, paramArrayOfIntentFilter);
  }

  public void a(BaseImplementation.b<DataApi.GetFdForAssetResult> paramb, DataItemAsset paramDataItemAsset)
    throws RemoteException
  {
    a(paramb, Asset.createFromRef(paramDataItemAsset.getId()));
  }

  public void a(BaseImplementation.b<Status> paramb, MessageApi.MessageListener paramMessageListener)
    throws RemoteException
  {
    this.ayh.a(this, paramb, paramMessageListener);
  }

  public void a(BaseImplementation.b<Status> paramb, MessageApi.MessageListener paramMessageListener, IntentFilter[] paramArrayOfIntentFilter)
    throws RemoteException
  {
    this.ayh.a(this, paramb, paramMessageListener, paramArrayOfIntentFilter);
  }

  public void a(BaseImplementation.b<Status> paramb, NodeApi.NodeListener paramNodeListener)
    throws RemoteException, RemoteException
  {
    this.ayi.a(this, paramb, paramNodeListener, null);
  }

  public void a(BaseImplementation.b<DataApi.DataItemResult> paramb, PutDataRequest paramPutDataRequest)
    throws RemoteException
  {
    Iterator localIterator1 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Asset localAsset2 = (Asset)((Map.Entry)localIterator1.next()).getValue();
      if ((localAsset2.getData() != null) || (localAsset2.getDigest() != null) || (localAsset2.getFd() != null) || (localAsset2.getUri() != null))
        continue;
      throw new IllegalArgumentException("Put for " + paramPutDataRequest.getUri() + " contains invalid asset: " + localAsset2);
    }
    PutDataRequest localPutDataRequest = PutDataRequest.k(paramPutDataRequest.getUri());
    localPutDataRequest.setData(paramPutDataRequest.getData());
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator2 = paramPutDataRequest.getAssets().entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      Asset localAsset1 = (Asset)localEntry.getValue();
      if (localAsset1.getData() == null)
      {
        localPutDataRequest.putAsset((String)localEntry.getKey(), (Asset)localEntry.getValue());
        continue;
      }
      try
      {
        ParcelFileDescriptor[] arrayOfParcelFileDescriptor = ParcelFileDescriptor.createPipe();
        if (Log.isLoggable("WearableClient", 3))
          Log.d("WearableClient", "processAssets: replacing data with FD in asset: " + localAsset1 + " read:" + arrayOfParcelFileDescriptor[0] + " write:" + arrayOfParcelFileDescriptor[1]);
        localPutDataRequest.putAsset((String)localEntry.getKey(), Asset.createFromFd(arrayOfParcelFileDescriptor[0]));
        FutureTask localFutureTask = a(arrayOfParcelFileDescriptor[1], localAsset1.getData());
        localArrayList.add(localFutureTask);
        this.asJ.submit(localFutureTask);
      }
      catch (IOException localIOException)
      {
        throw new IllegalStateException("Unable to create ParcelFileDescriptor for asset in request: " + paramPutDataRequest, localIOException);
      }
    }
    try
    {
      ((af)hw()).a(new az.i(paramb, localArrayList), localPutDataRequest);
      return;
    }
    catch (NullPointerException localNullPointerException)
    {
    }
    throw new IllegalStateException("Unable to putDataItem: " + paramPutDataRequest, localNullPointerException);
  }

  public void a(BaseImplementation.b<MessageApi.SendMessageResult> paramb, String paramString1, String paramString2, byte[] paramArrayOfByte)
    throws RemoteException
  {
    ((af)hw()).a(new az.j(paramb), paramString1, paramString2, paramArrayOfByte);
  }

  protected void a(jt paramjt, jl.e parame)
    throws RemoteException
  {
    paramjt.e(parame, 6587000, getContext().getPackageName());
  }

  public void b(BaseImplementation.b<DataItemBuffer> paramb, Uri paramUri)
    throws RemoteException
  {
    ((af)hw()).b(new az.e(paramb), paramUri);
  }

  public void b(BaseImplementation.b<Status> paramb, NodeApi.NodeListener paramNodeListener)
    throws RemoteException
  {
    this.ayi.a(this, paramb, paramNodeListener);
  }

  protected String bK()
  {
    return "com.google.android.gms.wearable.BIND";
  }

  protected String bL()
  {
    return "com.google.android.gms.wearable.internal.IWearableService";
  }

  public void c(BaseImplementation.b<DataApi.DeleteDataItemsResult> paramb, Uri paramUri)
    throws RemoteException
  {
    ((af)hw()).c(new az.b(paramb), paramUri);
  }

  protected af cb(IBinder paramIBinder)
  {
    return af.a.bZ(paramIBinder);
  }

  public void disconnect()
  {
    this.ayg.b(this);
    this.ayh.b(this);
    this.ayi.b(this);
    super.disconnect();
  }

  public void n(BaseImplementation.b<DataItemBuffer> paramb)
    throws RemoteException
  {
    ((af)hw()).b(new az.e(paramb));
  }

  public void o(BaseImplementation.b<NodeApi.GetLocalNodeResult> paramb)
    throws RemoteException
  {
    ((af)hw()).c(new az.g(paramb));
  }

  public void p(BaseImplementation.b<NodeApi.GetConnectedNodesResult> paramb)
    throws RemoteException
  {
    ((af)hw()).d(new az.c(paramb));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ba
 * JD-Core Version:    0.6.0
 */