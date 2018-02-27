package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

@ey
public final class ck
{
  public static void a(Context paramContext, b paramb)
  {
    if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramContext) != 0)
    {
      paramb.a(bn.by());
      return;
    }
    new a(paramContext, paramb);
  }

  public static final class a
    implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
  {
    private final Object mH = new Object();
    private final ck.b qe;
    private final cl qf;

    public a(Context paramContext, ck.b paramb)
    {
      this(paramContext, paramb, false);
    }

    a(Context paramContext, ck.b paramb, boolean paramBoolean)
    {
      this.qe = paramb;
      this.qf = new cl(paramContext, this, this, 6587000);
      if (!paramBoolean)
        this.qf.connect();
    }

    // ERROR //
    public void onConnected(Bundle paramBundle)
    {
      // Byte code:
      //   0: invokestatic 49	com/google/android/gms/internal/bn:by	()Landroid/os/Bundle;
      //   3: astore_2
      //   4: aload_0
      //   5: getfield 24	com/google/android/gms/internal/ck$a:mH	Ljava/lang/Object;
      //   8: astore_3
      //   9: aload_3
      //   10: monitorenter
      //   11: aload_0
      //   12: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   15: invokevirtual 53	com/google/android/gms/internal/cl:bM	()Lcom/google/android/gms/internal/cm;
      //   18: astore 9
      //   20: aload 9
      //   22: ifnull +186 -> 208
      //   25: aload 9
      //   27: invokeinterface 58 1 0
      //   32: astore 10
      //   34: aload 10
      //   36: astore 7
      //   38: aload_0
      //   39: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   42: invokevirtual 62	com/google/android/gms/internal/cl:isConnected	()Z
      //   45: ifne +13 -> 58
      //   48: aload_0
      //   49: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   52: invokevirtual 65	com/google/android/gms/internal/cl:isConnecting	()Z
      //   55: ifeq +10 -> 65
      //   58: aload_0
      //   59: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   62: invokevirtual 68	com/google/android/gms/internal/cl:disconnect	()V
      //   65: aload_3
      //   66: monitorexit
      //   67: aload_0
      //   68: getfield 26	com/google/android/gms/internal/ck$a:qe	Lcom/google/android/gms/internal/ck$b;
      //   71: aload 7
      //   73: invokeinterface 73 2 0
      //   78: return
      //   79: astore 8
      //   81: ldc 75
      //   83: aload 8
      //   85: invokestatic 81	com/google/android/gms/internal/gr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   88: aload_0
      //   89: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   92: invokevirtual 62	com/google/android/gms/internal/cl:isConnected	()Z
      //   95: ifne +13 -> 108
      //   98: aload_0
      //   99: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   102: invokevirtual 65	com/google/android/gms/internal/cl:isConnecting	()Z
      //   105: ifeq +97 -> 202
      //   108: aload_0
      //   109: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   112: invokevirtual 68	com/google/android/gms/internal/cl:disconnect	()V
      //   115: aload_2
      //   116: astore 7
      //   118: goto -53 -> 65
      //   121: astore 6
      //   123: ldc 75
      //   125: aload 6
      //   127: invokestatic 81	com/google/android/gms/internal/gr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   130: aload_0
      //   131: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   134: invokevirtual 62	com/google/android/gms/internal/cl:isConnected	()Z
      //   137: ifne +13 -> 150
      //   140: aload_0
      //   141: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   144: invokevirtual 65	com/google/android/gms/internal/cl:isConnecting	()Z
      //   147: ifeq +55 -> 202
      //   150: aload_0
      //   151: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   154: invokevirtual 68	com/google/android/gms/internal/cl:disconnect	()V
      //   157: aload_2
      //   158: astore 7
      //   160: goto -95 -> 65
      //   163: astore 4
      //   165: aload_0
      //   166: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   169: invokevirtual 62	com/google/android/gms/internal/cl:isConnected	()Z
      //   172: ifne +13 -> 185
      //   175: aload_0
      //   176: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   179: invokevirtual 65	com/google/android/gms/internal/cl:isConnecting	()Z
      //   182: ifeq +10 -> 192
      //   185: aload_0
      //   186: getfield 34	com/google/android/gms/internal/ck$a:qf	Lcom/google/android/gms/internal/cl;
      //   189: invokevirtual 68	com/google/android/gms/internal/cl:disconnect	()V
      //   192: aload 4
      //   194: athrow
      //   195: astore 5
      //   197: aload_3
      //   198: monitorexit
      //   199: aload 5
      //   201: athrow
      //   202: aload_2
      //   203: astore 7
      //   205: goto -140 -> 65
      //   208: aload_2
      //   209: astore 7
      //   211: goto -173 -> 38
      //
      // Exception table:
      //   from	to	target	type
      //   11	20	79	java/lang/IllegalStateException
      //   25	34	79	java/lang/IllegalStateException
      //   11	20	121	android/os/RemoteException
      //   25	34	121	android/os/RemoteException
      //   11	20	163	finally
      //   25	34	163	finally
      //   81	88	163	finally
      //   123	130	163	finally
      //   38	58	195	finally
      //   58	65	195	finally
      //   65	67	195	finally
      //   88	108	195	finally
      //   108	115	195	finally
      //   130	150	195	finally
      //   150	157	195	finally
      //   165	185	195	finally
      //   185	192	195	finally
      //   192	195	195	finally
      //   197	199	195	finally
    }

    public void onConnectionFailed(ConnectionResult paramConnectionResult)
    {
      this.qe.a(bn.by());
    }

    public void onConnectionSuspended(int paramInt)
    {
      gr.S("Disconnected from remote ad request service.");
    }
  }

  public static abstract interface b
  {
    public abstract void a(Bundle paramBundle);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ck
 * JD-Core Version:    0.6.0
 */