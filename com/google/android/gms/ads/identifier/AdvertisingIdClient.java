package com.google.android.gms.ads.identifier;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.jx;
import com.google.android.gms.internal.s;
import com.google.android.gms.internal.s.a;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AdvertisingIdClient
{
  a ln;
  s lo;
  boolean lp;
  Object lq = new Object();
  a lr;
  final long ls;
  private final Context mContext;

  public AdvertisingIdClient(Context paramContext)
  {
    this(paramContext, 30000L);
  }

  public AdvertisingIdClient(Context paramContext, long paramLong)
  {
    jx.i(paramContext);
    this.mContext = paramContext;
    this.lp = false;
    this.ls = paramLong;
  }

  private void Z()
  {
    synchronized (this.lq)
    {
      if (this.lr != null)
        this.lr.cancel();
    }
    try
    {
      this.lr.join();
      label28: if (this.ls > 0L)
        this.lr = new a(this, this.ls);
      monitorexit;
      return;
      localObject2 = finally;
      monitorexit;
      throw localObject2;
    }
    catch (InterruptedException localInterruptedException)
    {
      break label28;
    }
  }

  static s a(Context paramContext, a parama)
    throws IOException
  {
    try
    {
      s locals = s.a.b(parama.gs());
      return locals;
    }
    catch (InterruptedException localInterruptedException)
    {
    }
    throw new IOException("Interrupted exception");
  }

  public static Info getAdvertisingIdInfo(Context paramContext)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    AdvertisingIdClient localAdvertisingIdClient = new AdvertisingIdClient(paramContext, -1L);
    try
    {
      localAdvertisingIdClient.b(false);
      Info localInfo = localAdvertisingIdClient.getInfo();
      return localInfo;
    }
    finally
    {
      localAdvertisingIdClient.finish();
    }
    throw localObject;
  }

  // ERROR //
  static a h(Context paramContext)
    throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 108	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   4: ldc 110
    //   6: iconst_0
    //   7: invokevirtual 116	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   10: pop
    //   11: aload_0
    //   12: invokestatic 121	com/google/android/gms/common/GooglePlayServicesUtil:C	(Landroid/content/Context;)V
    //   15: new 63	com/google/android/gms/common/a
    //   18: dup
    //   19: invokespecial 122	com/google/android/gms/common/a:<init>	()V
    //   22: astore 4
    //   24: new 124	android/content/Intent
    //   27: dup
    //   28: ldc 126
    //   30: invokespecial 127	android/content/Intent:<init>	(Ljava/lang/String;)V
    //   33: astore 5
    //   35: aload 5
    //   37: ldc 129
    //   39: invokevirtual 133	android/content/Intent:setPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   42: pop
    //   43: aload_0
    //   44: aload 5
    //   46: aload 4
    //   48: iconst_1
    //   49: invokevirtual 137	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   52: ifeq +27 -> 79
    //   55: aload 4
    //   57: areturn
    //   58: astore_1
    //   59: new 84	com/google/android/gms/common/GooglePlayServicesNotAvailableException
    //   62: dup
    //   63: bipush 9
    //   65: invokespecial 140	com/google/android/gms/common/GooglePlayServicesNotAvailableException:<init>	(I)V
    //   68: athrow
    //   69: astore_3
    //   70: new 61	java/io/IOException
    //   73: dup
    //   74: aload_3
    //   75: invokespecial 143	java/io/IOException:<init>	(Ljava/lang/Throwable;)V
    //   78: athrow
    //   79: new 61	java/io/IOException
    //   82: dup
    //   83: ldc 145
    //   85: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   88: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	11	58	android/content/pm/PackageManager$NameNotFoundException
    //   11	15	69	com/google/android/gms/common/GooglePlayServicesNotAvailableException
  }

  protected void b(boolean paramBoolean)
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    jx.aV("Calling this from your main thread can lead to deadlock");
    monitorenter;
    try
    {
      if (this.lp)
        finish();
      this.ln = h(this.mContext);
      this.lo = a(this.mContext, this.ln);
      this.lp = true;
      if (paramBoolean)
        Z();
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  protected void finalize()
    throws Throwable
  {
    finish();
    super.finalize();
  }

  // ERROR //
  public void finish()
  {
    // Byte code:
    //   0: ldc 147
    //   2: invokestatic 150	com/google/android/gms/internal/jx:aV	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 38	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   11: ifnull +10 -> 21
    //   14: aload_0
    //   15: getfield 154	com/google/android/gms/ads/identifier/AdvertisingIdClient:ln	Lcom/google/android/gms/common/a;
    //   18: ifnonnull +6 -> 24
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: aload_0
    //   25: getfield 40	com/google/android/gms/ads/identifier/AdvertisingIdClient:lp	Z
    //   28: ifeq +14 -> 42
    //   31: aload_0
    //   32: getfield 38	com/google/android/gms/ads/identifier/AdvertisingIdClient:mContext	Landroid/content/Context;
    //   35: aload_0
    //   36: getfield 154	com/google/android/gms/ads/identifier/AdvertisingIdClient:ln	Lcom/google/android/gms/common/a;
    //   39: invokevirtual 171	android/content/Context:unbindService	(Landroid/content/ServiceConnection;)V
    //   42: aload_0
    //   43: iconst_0
    //   44: putfield 40	com/google/android/gms/ads/identifier/AdvertisingIdClient:lp	Z
    //   47: aload_0
    //   48: aconst_null
    //   49: putfield 158	com/google/android/gms/ads/identifier/AdvertisingIdClient:lo	Lcom/google/android/gms/internal/s;
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield 154	com/google/android/gms/ads/identifier/AdvertisingIdClient:ln	Lcom/google/android/gms/common/a;
    //   57: aload_0
    //   58: monitorexit
    //   59: return
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    //   65: astore_2
    //   66: ldc 173
    //   68: ldc 175
    //   70: aload_2
    //   71: invokestatic 180	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   74: pop
    //   75: goto -33 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   7	21	60	finally
    //   21	23	60	finally
    //   24	42	60	finally
    //   42	59	60	finally
    //   61	63	60	finally
    //   66	75	60	finally
    //   24	42	65	java/lang/IllegalArgumentException
  }

  // ERROR //
  public Info getInfo()
    throws IOException
  {
    // Byte code:
    //   0: ldc 147
    //   2: invokestatic 150	com/google/android/gms/internal/jx:aV	(Ljava/lang/String;)V
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 40	com/google/android/gms/ads/identifier/AdvertisingIdClient:lp	Z
    //   11: ifne +91 -> 102
    //   14: aload_0
    //   15: getfield 30	com/google/android/gms/ads/identifier/AdvertisingIdClient:lq	Ljava/lang/Object;
    //   18: astore 7
    //   20: aload 7
    //   22: monitorenter
    //   23: aload_0
    //   24: getfield 46	com/google/android/gms/ads/identifier/AdvertisingIdClient:lr	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   27: ifnull +13 -> 40
    //   30: aload_0
    //   31: getfield 46	com/google/android/gms/ads/identifier/AdvertisingIdClient:lr	Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$a;
    //   34: invokevirtual 188	com/google/android/gms/ads/identifier/AdvertisingIdClient$a:aa	()Z
    //   37: ifne +26 -> 63
    //   40: new 61	java/io/IOException
    //   43: dup
    //   44: ldc 190
    //   46: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   49: athrow
    //   50: astore 8
    //   52: aload 7
    //   54: monitorexit
    //   55: aload 8
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: aload 7
    //   65: monitorexit
    //   66: aload_0
    //   67: iconst_0
    //   68: invokevirtual 91	com/google/android/gms/ads/identifier/AdvertisingIdClient:b	(Z)V
    //   71: aload_0
    //   72: getfield 40	com/google/android/gms/ads/identifier/AdvertisingIdClient:lp	Z
    //   75: ifne +27 -> 102
    //   78: new 61	java/io/IOException
    //   81: dup
    //   82: ldc 192
    //   84: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   87: athrow
    //   88: astore 9
    //   90: new 61	java/io/IOException
    //   93: dup
    //   94: ldc 192
    //   96: aload 9
    //   98: invokespecial 195	java/io/IOException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: aload_0
    //   103: getfield 154	com/google/android/gms/ads/identifier/AdvertisingIdClient:ln	Lcom/google/android/gms/common/a;
    //   106: invokestatic 36	com/google/android/gms/internal/jx:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   109: pop
    //   110: aload_0
    //   111: getfield 158	com/google/android/gms/ads/identifier/AdvertisingIdClient:lo	Lcom/google/android/gms/internal/s;
    //   114: invokestatic 36	com/google/android/gms/internal/jx:i	(Ljava/lang/Object;)Ljava/lang/Object;
    //   117: pop
    //   118: new 197	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info
    //   121: dup
    //   122: aload_0
    //   123: getfield 158	com/google/android/gms/ads/identifier/AdvertisingIdClient:lo	Lcom/google/android/gms/internal/s;
    //   126: invokeinterface 203 1 0
    //   131: aload_0
    //   132: getfield 158	com/google/android/gms/ads/identifier/AdvertisingIdClient:lo	Lcom/google/android/gms/internal/s;
    //   135: iconst_1
    //   136: invokeinterface 207 2 0
    //   141: invokespecial 210	com/google/android/gms/ads/identifier/AdvertisingIdClient$Info:<init>	(Ljava/lang/String;Z)V
    //   144: astore 4
    //   146: aload_0
    //   147: monitorexit
    //   148: aload_0
    //   149: invokespecial 160	com/google/android/gms/ads/identifier/AdvertisingIdClient:Z	()V
    //   152: aload 4
    //   154: areturn
    //   155: astore 5
    //   157: ldc 173
    //   159: ldc 212
    //   161: aload 5
    //   163: invokestatic 180	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   166: pop
    //   167: new 61	java/io/IOException
    //   170: dup
    //   171: ldc 214
    //   173: invokespecial 78	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   176: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   23	40	50	finally
    //   40	50	50	finally
    //   52	55	50	finally
    //   63	66	50	finally
    //   7	23	58	finally
    //   55	58	58	finally
    //   59	61	58	finally
    //   66	71	58	finally
    //   71	88	58	finally
    //   90	102	58	finally
    //   102	118	58	finally
    //   118	146	58	finally
    //   146	148	58	finally
    //   157	177	58	finally
    //   66	71	88	java/lang/Exception
    //   118	146	155	android/os/RemoteException
  }

  public void start()
    throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
  {
    b(true);
  }

  public static final class Info
  {
    private final String lx;
    private final boolean ly;

    public Info(String paramString, boolean paramBoolean)
    {
      this.lx = paramString;
      this.ly = paramBoolean;
    }

    public String getId()
    {
      return this.lx;
    }

    public boolean isLimitAdTrackingEnabled()
    {
      return this.ly;
    }

    public String toString()
    {
      return "{" + this.lx + "}" + this.ly;
    }
  }

  static class a extends Thread
  {
    private WeakReference<AdvertisingIdClient> lt;
    private long lu;
    CountDownLatch lv;
    boolean lw;

    public a(AdvertisingIdClient paramAdvertisingIdClient, long paramLong)
    {
      this.lt = new WeakReference(paramAdvertisingIdClient);
      this.lu = paramLong;
      this.lv = new CountDownLatch(1);
      this.lw = false;
      start();
    }

    private void disconnect()
    {
      AdvertisingIdClient localAdvertisingIdClient = (AdvertisingIdClient)this.lt.get();
      if (localAdvertisingIdClient != null)
      {
        localAdvertisingIdClient.finish();
        this.lw = true;
      }
    }

    public boolean aa()
    {
      return this.lw;
    }

    public void cancel()
    {
      this.lv.countDown();
    }

    public void run()
    {
      try
      {
        if (!this.lv.await(this.lu, TimeUnit.MILLISECONDS))
          disconnect();
        return;
      }
      catch (InterruptedException localInterruptedException)
      {
        disconnect();
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.identifier.AdvertisingIdClient
 * JD-Core Version:    0.6.0
 */