package com.google.android.gms.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class x extends Thread
  implements f
{
  private static x zM;
  private volatile boolean mClosed = false;
  private final Context mContext;
  private final LinkedBlockingQueue<Runnable> zJ = new LinkedBlockingQueue();
  private volatile boolean zK = false;
  private volatile String zL;
  private volatile ak zN;
  private final Lock zO;
  private final List<ha> zP = new ArrayList();

  private x(Context paramContext)
  {
    super("GAThread");
    if (paramContext != null);
    for (this.mContext = paramContext.getApplicationContext(); ; this.mContext = paramContext)
    {
      this.zP.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
      this.zO = new ReentrantLock();
      start();
      return;
    }
  }

  static x A(Context paramContext)
  {
    if (zM == null)
      zM = new x(paramContext);
    return zM;
  }

  static String B(Context paramContext)
  {
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput("gaInstallData");
      arrayOfByte = new byte[8192];
      i = localFileInputStream.read(arrayOfByte, 0, 8192);
      if (localFileInputStream.available() > 0)
      {
        ae.T("Too much campaign data, ignoring it.");
        localFileInputStream.close();
        paramContext.deleteFile("gaInstallData");
        return null;
      }
      localFileInputStream.close();
      paramContext.deleteFile("gaInstallData");
      if (i <= 0)
      {
        ae.W("Campaign file is empty.");
        return null;
      }
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      byte[] arrayOfByte;
      int i;
      ae.U("No campaign data found.");
      return null;
      String str = new String(arrayOfByte, 0, i);
      ae.U("Campaign found: " + str);
      return str;
    }
    catch (IOException localIOException)
    {
      ae.T("Error reading campaign data.");
      paramContext.deleteFile("gaInstallData");
    }
    return null;
  }

  static int ah(String paramString)
  {
    int i = 1;
    if (!TextUtils.isEmpty(paramString))
    {
      int j = -1 + paramString.length();
      i = 0;
      for (int k = j; k >= 0; k--)
      {
        int m = paramString.charAt(k);
        i = m + (0xFFFFFFF & i << 6) + (m << 14);
        int n = 0xFE00000 & i;
        if (n == 0)
          continue;
        i ^= n >> 21;
      }
    }
    return i;
  }

  private void b(Runnable paramRunnable)
  {
    this.zJ.add(paramRunnable);
  }

  private String g(Throwable paramThrowable)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    PrintStream localPrintStream = new PrintStream(localByteArrayOutputStream);
    paramThrowable.printStackTrace(localPrintStream);
    localPrintStream.flush();
    return new String(localByteArrayOutputStream.toByteArray());
  }

  public void dQ()
  {
    b(new a(null));
  }

  public void dW()
  {
    b(new c(null));
  }

  public LinkedBlockingQueue<Runnable> dX()
  {
    return this.zJ;
  }

  public void dY()
  {
    init();
    ArrayList localArrayList = new ArrayList();
    this.zJ.drainTo(localArrayList);
    this.zO.lock();
    try
    {
      this.zK = true;
      Iterator localIterator = localArrayList.iterator();
      while (true)
        if (localIterator.hasNext())
        {
          Runnable localRunnable = (Runnable)localIterator.next();
          try
          {
            localRunnable.run();
          }
          catch (Throwable localThrowable)
          {
            ae.T("Error dispatching all events on exit, giving up: " + g(localThrowable));
          }
        }
      return;
    }
    finally
    {
      this.zO.unlock();
    }
    throw localObject;
  }

  public void dispatch()
  {
    b(new b(null));
  }

  public Thread getThread()
  {
    return this;
  }

  protected void init()
  {
    monitorenter;
    try
    {
      ak localak = this.zN;
      if (localak != null);
      while (true)
      {
        return;
        this.zN = new w(this.mContext, this);
        this.zN.eB();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  // ERROR //
  public void run()
  {
    // Byte code:
    //   0: bipush 10
    //   2: invokestatic 292	android/os/Process:setThreadPriority	(I)V
    //   5: ldc2_w 293
    //   8: invokestatic 298	java/lang/Thread:sleep	(J)V
    //   11: aload_0
    //   12: invokevirtual 233	com/google/android/gms/analytics/x:init	()V
    //   15: aload_0
    //   16: aload_0
    //   17: getfield 56	com/google/android/gms/analytics/x:mContext	Landroid/content/Context;
    //   20: invokestatic 300	com/google/android/gms/analytics/x:B	(Landroid/content/Context;)Ljava/lang/String;
    //   23: putfield 162	com/google/android/gms/analytics/x:zL	Ljava/lang/String;
    //   26: ldc_w 302
    //   29: invokestatic 305	com/google/android/gms/analytics/ae:V	(Ljava/lang/String;)V
    //   32: aload_0
    //   33: getfield 43	com/google/android/gms/analytics/x:mClosed	Z
    //   36: ifne +171 -> 207
    //   39: aload_0
    //   40: getfield 39	com/google/android/gms/analytics/x:zJ	Ljava/util/concurrent/LinkedBlockingQueue;
    //   43: invokevirtual 308	java/util/concurrent/LinkedBlockingQueue:take	()Ljava/lang/Object;
    //   46: checkcast 258	java/lang/Runnable
    //   49: astore 5
    //   51: aload_0
    //   52: getfield 84	com/google/android/gms/analytics/x:zO	Ljava/util/concurrent/locks/Lock;
    //   55: invokeinterface 242 1 0
    //   60: aload_0
    //   61: getfield 41	com/google/android/gms/analytics/x:zK	Z
    //   64: ifne +10 -> 74
    //   67: aload 5
    //   69: invokeinterface 261 1 0
    //   74: aload_0
    //   75: getfield 84	com/google/android/gms/analytics/x:zO	Ljava/util/concurrent/locks/Lock;
    //   78: invokeinterface 268 1 0
    //   83: goto -51 -> 32
    //   86: astore 4
    //   88: aload 4
    //   90: invokevirtual 309	java/lang/InterruptedException:toString	()Ljava/lang/String;
    //   93: invokestatic 139	com/google/android/gms/analytics/ae:U	(Ljava/lang/String;)V
    //   96: goto -64 -> 32
    //   99: astore_3
    //   100: new 144	java/lang/StringBuilder
    //   103: dup
    //   104: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   107: ldc_w 311
    //   110: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: aload_0
    //   114: aload_3
    //   115: invokespecial 265	com/google/android/gms/analytics/x:g	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   118: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 122	com/google/android/gms/analytics/ae:T	(Ljava/lang/String;)V
    //   127: ldc_w 313
    //   130: invokestatic 122	com/google/android/gms/analytics/ae:T	(Ljava/lang/String;)V
    //   133: aload_0
    //   134: iconst_1
    //   135: putfield 41	com/google/android/gms/analytics/x:zK	Z
    //   138: goto -106 -> 32
    //   141: astore_1
    //   142: ldc_w 315
    //   145: invokestatic 134	com/google/android/gms/analytics/ae:W	(Ljava/lang/String;)V
    //   148: goto -137 -> 11
    //   151: astore_2
    //   152: new 144	java/lang/StringBuilder
    //   155: dup
    //   156: invokespecial 145	java/lang/StringBuilder:<init>	()V
    //   159: ldc_w 317
    //   162: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_0
    //   166: aload_2
    //   167: invokespecial 265	com/google/android/gms/analytics/x:g	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   170: invokevirtual 151	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   173: invokevirtual 155	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: invokestatic 122	com/google/android/gms/analytics/ae:T	(Ljava/lang/String;)V
    //   179: ldc_w 319
    //   182: invokestatic 122	com/google/android/gms/analytics/ae:T	(Ljava/lang/String;)V
    //   185: aload_0
    //   186: iconst_1
    //   187: putfield 41	com/google/android/gms/analytics/x:zK	Z
    //   190: goto -158 -> 32
    //   193: astore 6
    //   195: aload_0
    //   196: getfield 84	com/google/android/gms/analytics/x:zO	Ljava/util/concurrent/locks/Lock;
    //   199: invokeinterface 268 1 0
    //   204: aload 6
    //   206: athrow
    //   207: return
    //
    // Exception table:
    //   from	to	target	type
    //   39	60	86	java/lang/InterruptedException
    //   74	83	86	java/lang/InterruptedException
    //   195	207	86	java/lang/InterruptedException
    //   39	60	99	java/lang/Throwable
    //   74	83	99	java/lang/Throwable
    //   88	96	99	java/lang/Throwable
    //   195	207	99	java/lang/Throwable
    //   5	11	141	java/lang/InterruptedException
    //   11	32	151	java/lang/Throwable
    //   60	74	193	finally
  }

  public void u(Map<String, String> paramMap)
  {
    b(new d(paramMap));
  }

  private class a
    implements Runnable
  {
    private a()
    {
    }

    public void run()
    {
      x.d(x.this).dQ();
    }
  }

  private class b
    implements Runnable
  {
    private b()
    {
    }

    public void run()
    {
      x.d(x.this).dispatch();
    }
  }

  private class c
    implements Runnable
  {
    private c()
    {
    }

    public void run()
    {
      x.d(x.this).dW();
    }
  }

  private class d
    implements Runnable
  {
    private final Map<String, String> zR;

    d()
    {
      Map localMap;
      this.zR = new HashMap(localMap);
      String str = (String)localMap.get("&ht");
      if (str != null);
      try
      {
        Long.valueOf(str);
        if (str == null)
        {
          long l = System.currentTimeMillis();
          this.zR.put("&ht", Long.toString(l));
        }
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
          str = null;
      }
    }

    private String v(Map<String, String> paramMap)
    {
      if (paramMap.containsKey("useSecure"))
      {
        if (an.f((String)paramMap.get("useSecure"), true))
          return "https:";
        return "http:";
      }
      return "https:";
    }

    private void w(Map<String, String> paramMap)
    {
      q localq = a.w(x.a(x.this));
      an.a(paramMap, "&adid", localq);
      an.a(paramMap, "&ate", localq);
    }

    private void x(Map<String, String> paramMap)
    {
      g localg = g.dZ();
      an.a(paramMap, "&an", localg);
      an.a(paramMap, "&av", localg);
      an.a(paramMap, "&aid", localg);
      an.a(paramMap, "&aiid", localg);
      paramMap.put("&v", "1");
    }

    private boolean y(Map<String, String> paramMap)
    {
      if (paramMap.get("&sf") == null)
        return false;
      double d = an.a((String)paramMap.get("&sf"), 100.0D);
      if (d >= 100.0D)
        return false;
      if (x.ah((String)paramMap.get("&cid")) % 10000 >= d * 100.0D)
      {
        if (paramMap.get("&t") == null);
        for (String str = "unknown"; ; str = (String)paramMap.get("&t"))
        {
          ae.V(String.format("%s hit sampled out", new Object[] { str }));
          return true;
        }
      }
      return false;
    }

    public void run()
    {
      w(this.zR);
      if (TextUtils.isEmpty((CharSequence)this.zR.get("&cid")))
        this.zR.put("&cid", k.el().getValue("&cid"));
      if ((GoogleAnalytics.getInstance(x.a(x.this)).getAppOptOut()) || (y(this.zR)))
        return;
      if (!TextUtils.isEmpty(x.b(x.this)))
      {
        y.eK().D(true);
        this.zR.putAll(new HitBuilders.HitBuilder().setCampaignParamsFromUrl(x.b(x.this)).build());
        y.eK().D(false);
        x.a(x.this, null);
      }
      x(this.zR);
      Map localMap = ac.z(this.zR);
      x.d(x.this).b(localMap, Long.valueOf((String)this.zR.get("&ht")).longValue(), v(this.zR), x.c(x.this));
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.x
 * JD-Core Version:    0.6.0
 */