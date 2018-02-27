package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@ey
public final class fq extends fl.a
{
  private static final Object ut = new Object();
  private static fq uu;
  private final Context mContext;
  private final fw uv;
  private final cn uw;
  private final bm ux;

  fq(Context paramContext, bm parambm, cn paramcn, fw paramfw)
  {
    this.mContext = paramContext;
    this.uv = paramfw;
    this.uw = paramcn;
    this.ux = parambm;
  }

  private static gv.a I(String paramString)
  {
    return new gv.a(paramString)
    {
      public void a(gu paramgu)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = "AFMA_buildAdURL";
        arrayOfObject[1] = this.uC;
        String str = String.format("javascript:%s(%s);", arrayOfObject);
        gr.V("About to execute: " + str);
        paramgu.loadUrl(str);
      }
    };
  }

  private static fj a(Context paramContext, bm parambm, cn paramcn, fw paramfw, fh paramfh)
  {
    gr.S("Starting ad request from service.");
    paramcn.init();
    fv localfv = new fv(paramContext);
    if (localfv.vr == -1)
    {
      gr.S("Device is offline.");
      return new fj(2);
    }
    fs localfs = new fs(paramfh.applicationInfo.packageName);
    if (paramfh.tL.extras != null)
    {
      String str4 = paramfh.tL.extras.getString("_ad");
      if (str4 != null)
        return fr.a(paramContext, paramfh, str4);
    }
    Location localLocation = paramcn.a(250L);
    String str1 = parambm.bu();
    String str2 = fr.a(paramfh, localfv, localLocation, parambm.bv(), parambm.bw(), parambm.bx());
    if (str2 == null)
      return new fj(0);
    gv.a locala = I(str2);
    gq.wR.post(new Runnable(paramContext, paramfh, localfs, locala, str1)
    {
      public void run()
      {
        gu localgu = gu.a(this.nf, new ay(), false, false, null, this.uy.lO);
        localgu.setWillNotDraw(true);
        this.uz.b(localgu);
        gv localgv = localgu.dD();
        localgv.a("/invalidRequest", this.uz.uG);
        localgv.a("/loadAdURL", this.uz.uH);
        localgv.a("/log", cc.pX);
        localgv.a(this.uA);
        gr.S("Loading the JS library.");
        localgu.loadUrl(this.uB);
      }
    });
    try
    {
      localfu = (fu)localfs.cR().get(10L, TimeUnit.SECONDS);
      if (localfu == null)
      {
        fj localfj4 = new fj(0);
        return localfj4;
      }
    }
    catch (Exception localException)
    {
      fu localfu;
      fj localfj1 = new fj(0);
      return localfj1;
      if (localfu.getErrorCode() != -2)
      {
        fj localfj2 = new fj(localfu.getErrorCode());
        return localfj2;
      }
      boolean bool = localfu.cV();
      String str3 = null;
      if (bool)
        str3 = paramfw.K(paramfh.tM.packageName);
      fj localfj3 = a(paramContext, paramfh.lO.wS, localfu.getUrl(), str3, localfu);
      return localfj3;
    }
    finally
    {
      gq.wR.post(new Runnable(localfs)
      {
        public void run()
        {
          this.uz.cS();
        }
      });
    }
    throw localObject;
  }

  // ERROR //
  public static fj a(Context paramContext, String paramString1, String paramString2, String paramString3, fu paramfu)
  {
    // Byte code:
    //   0: new 218	com/google/android/gms/internal/ft
    //   3: dup
    //   4: invokespecial 219	com/google/android/gms/internal/ft:<init>	()V
    //   7: astore 5
    //   9: new 221	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   16: ldc 224
    //   18: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   21: aload_2
    //   22: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 54	com/google/android/gms/internal/gr:S	(Ljava/lang/String;)V
    //   31: new 233	java/net/URL
    //   34: dup
    //   35: aload_2
    //   36: invokespecial 234	java/net/URL:<init>	(Ljava/lang/String;)V
    //   39: astore 7
    //   41: invokestatic 240	android/os/SystemClock:elapsedRealtime	()J
    //   44: lstore 8
    //   46: aload 7
    //   48: astore 10
    //   50: iconst_0
    //   51: istore 11
    //   53: aload 10
    //   55: invokevirtual 244	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   58: checkcast 246	java/net/HttpURLConnection
    //   61: astore 12
    //   63: aload_0
    //   64: aload_1
    //   65: iconst_0
    //   66: aload 12
    //   68: invokestatic 251	com/google/android/gms/internal/gi:a	(Landroid/content/Context;Ljava/lang/String;ZLjava/net/HttpURLConnection;)V
    //   71: aload_3
    //   72: invokestatic 257	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   75: ifne +12 -> 87
    //   78: aload 12
    //   80: ldc_w 259
    //   83: aload_3
    //   84: invokevirtual 263	java/net/HttpURLConnection:addRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aload 4
    //   89: ifnull +64 -> 153
    //   92: aload 4
    //   94: invokevirtual 266	com/google/android/gms/internal/fu:cU	()Ljava/lang/String;
    //   97: invokestatic 257	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   100: ifne +53 -> 153
    //   103: aload 12
    //   105: iconst_1
    //   106: invokevirtual 270	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   109: aload 4
    //   111: invokevirtual 266	com/google/android/gms/internal/fu:cU	()Ljava/lang/String;
    //   114: invokevirtual 276	java/lang/String:getBytes	()[B
    //   117: astore 23
    //   119: aload 12
    //   121: aload 23
    //   123: arraylength
    //   124: invokevirtual 279	java/net/HttpURLConnection:setFixedLengthStreamingMode	(I)V
    //   127: new 281	java/io/BufferedOutputStream
    //   130: dup
    //   131: aload 12
    //   133: invokevirtual 285	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   136: invokespecial 288	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   139: astore 24
    //   141: aload 24
    //   143: aload 23
    //   145: invokevirtual 292	java/io/BufferedOutputStream:write	([B)V
    //   148: aload 24
    //   150: invokevirtual 295	java/io/BufferedOutputStream:close	()V
    //   153: aload 12
    //   155: invokevirtual 298	java/net/HttpURLConnection:getResponseCode	()I
    //   158: istore 14
    //   160: aload 12
    //   162: invokevirtual 302	java/net/HttpURLConnection:getHeaderFields	()Ljava/util/Map;
    //   165: astore 15
    //   167: iload 14
    //   169: sipush 200
    //   172: if_icmplt +74 -> 246
    //   175: iload 14
    //   177: sipush 300
    //   180: if_icmpge +66 -> 246
    //   183: aload 10
    //   185: invokevirtual 303	java/net/URL:toString	()Ljava/lang/String;
    //   188: astore 20
    //   190: new 305	java/io/InputStreamReader
    //   193: dup
    //   194: aload 12
    //   196: invokevirtual 309	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   199: invokespecial 312	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   202: invokestatic 315	com/google/android/gms/internal/gi:a	(Ljava/lang/Readable;)Ljava/lang/String;
    //   205: astore 21
    //   207: aload 20
    //   209: aload 15
    //   211: aload 21
    //   213: iload 14
    //   215: invokestatic 318	com/google/android/gms/internal/fq:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   218: aload 5
    //   220: aload 20
    //   222: aload 15
    //   224: aload 21
    //   226: invokevirtual 321	com/google/android/gms/internal/ft:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    //   229: aload 5
    //   231: lload 8
    //   233: invokevirtual 325	com/google/android/gms/internal/ft:i	(J)Lcom/google/android/gms/internal/fj;
    //   236: astore 22
    //   238: aload 12
    //   240: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   243: aload 22
    //   245: areturn
    //   246: aload 10
    //   248: invokevirtual 303	java/net/URL:toString	()Ljava/lang/String;
    //   251: aload 15
    //   253: aconst_null
    //   254: iload 14
    //   256: invokestatic 318	com/google/android/gms/internal/fq:a	(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)V
    //   259: iload 14
    //   261: sipush 300
    //   264: if_icmplt +97 -> 361
    //   267: iload 14
    //   269: sipush 400
    //   272: if_icmpge +89 -> 361
    //   275: aload 12
    //   277: ldc_w 330
    //   280: invokevirtual 333	java/net/HttpURLConnection:getHeaderField	(Ljava/lang/String;)Ljava/lang/String;
    //   283: astore 17
    //   285: aload 17
    //   287: invokestatic 257	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   290: ifeq +27 -> 317
    //   293: ldc_w 335
    //   296: invokestatic 338	com/google/android/gms/internal/gr:W	(Ljava/lang/String;)V
    //   299: new 71	com/google/android/gms/internal/fj
    //   302: dup
    //   303: iconst_0
    //   304: invokespecial 74	com/google/android/gms/internal/fj:<init>	(I)V
    //   307: astore 19
    //   309: aload 12
    //   311: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   314: aload 19
    //   316: areturn
    //   317: new 233	java/net/URL
    //   320: dup
    //   321: aload 17
    //   323: invokespecial 234	java/net/URL:<init>	(Ljava/lang/String;)V
    //   326: astore 10
    //   328: iinc 11 1
    //   331: iload 11
    //   333: iconst_5
    //   334: if_icmple +69 -> 403
    //   337: ldc_w 340
    //   340: invokestatic 338	com/google/android/gms/internal/gr:W	(Ljava/lang/String;)V
    //   343: new 71	com/google/android/gms/internal/fj
    //   346: dup
    //   347: iconst_0
    //   348: invokespecial 74	com/google/android/gms/internal/fj:<init>	(I)V
    //   351: astore 18
    //   353: aload 12
    //   355: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   358: aload 18
    //   360: areturn
    //   361: new 221	java/lang/StringBuilder
    //   364: dup
    //   365: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   368: ldc_w 342
    //   371: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   374: iload 14
    //   376: invokevirtual 345	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   379: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   382: invokestatic 338	com/google/android/gms/internal/gr:W	(Ljava/lang/String;)V
    //   385: new 71	com/google/android/gms/internal/fj
    //   388: dup
    //   389: iconst_0
    //   390: invokespecial 74	com/google/android/gms/internal/fj:<init>	(I)V
    //   393: astore 16
    //   395: aload 12
    //   397: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   400: aload 16
    //   402: areturn
    //   403: aload 5
    //   405: aload 15
    //   407: invokevirtual 349	com/google/android/gms/internal/ft:e	(Ljava/util/Map;)V
    //   410: aload 12
    //   412: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   415: goto -362 -> 53
    //   418: astore 6
    //   420: new 221	java/lang/StringBuilder
    //   423: dup
    //   424: invokespecial 222	java/lang/StringBuilder:<init>	()V
    //   427: ldc_w 351
    //   430: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   433: aload 6
    //   435: invokevirtual 354	java/io/IOException:getMessage	()Ljava/lang/String;
    //   438: invokevirtual 228	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   444: invokestatic 338	com/google/android/gms/internal/gr:W	(Ljava/lang/String;)V
    //   447: new 71	com/google/android/gms/internal/fj
    //   450: dup
    //   451: iconst_2
    //   452: invokespecial 74	com/google/android/gms/internal/fj:<init>	(I)V
    //   455: areturn
    //   456: astore 13
    //   458: aload 12
    //   460: invokevirtual 328	java/net/HttpURLConnection:disconnect	()V
    //   463: aload 13
    //   465: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   0	46	418	java/io/IOException
    //   53	63	418	java/io/IOException
    //   238	243	418	java/io/IOException
    //   309	314	418	java/io/IOException
    //   353	358	418	java/io/IOException
    //   395	400	418	java/io/IOException
    //   410	415	418	java/io/IOException
    //   458	466	418	java/io/IOException
    //   63	87	456	finally
    //   92	153	456	finally
    //   153	167	456	finally
    //   183	238	456	finally
    //   246	259	456	finally
    //   275	309	456	finally
    //   317	328	456	finally
    //   337	353	456	finally
    //   361	395	456	finally
    //   403	410	456	finally
  }

  public static fq a(Context paramContext, bm parambm, cn paramcn, fw paramfw)
  {
    synchronized (ut)
    {
      if (uu == null)
        uu = new fq(paramContext.getApplicationContext(), parambm, paramcn, paramfw);
      fq localfq = uu;
      return localfq;
    }
  }

  private static void a(String paramString1, Map<String, List<String>> paramMap, String paramString2, int paramInt)
  {
    if (gr.v(2))
    {
      gr.V("Http Response: {\n  URL:\n    " + paramString1 + "\n  Headers:");
      if (paramMap != null)
      {
        Iterator localIterator1 = paramMap.keySet().iterator();
        while (localIterator1.hasNext())
        {
          String str1 = (String)localIterator1.next();
          gr.V("    " + str1 + ":");
          Iterator localIterator2 = ((List)paramMap.get(str1)).iterator();
          while (localIterator2.hasNext())
          {
            String str2 = (String)localIterator2.next();
            gr.V("      " + str2);
          }
        }
      }
      gr.V("  Body:");
      if (paramString2 != null)
        for (int i = 0; i < Math.min(paramString2.length(), 100000); i += 1000)
          gr.V(paramString2.substring(i, Math.min(paramString2.length(), i + 1000)));
      gr.V("    null");
      gr.V("  Response Code:\n    " + paramInt + "\n}");
    }
  }

  public fj b(fh paramfh)
  {
    return a(this.mContext, this.ux, this.uw, this.uv, paramfh);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fq
 * JD-Core Version:    0.6.0
 */