package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@ey
public final class ed extends em.a
{
  private Context mContext;
  private String mG;
  private String sM;
  private ArrayList<String> sN;

  public ed(String paramString1, ArrayList<String> paramArrayList, Context paramContext, String paramString2)
  {
    this.sM = paramString1;
    this.sN = paramArrayList;
    this.mG = paramString2;
    this.mContext = paramContext;
  }

  private void cz()
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.google.ads.conversiontracking.IAPConversionReporter");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Context.class;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = Boolean.TYPE;
      Method localMethod = localClass.getDeclaredMethod("reportWithProductId", arrayOfClass);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = this.mContext;
      arrayOfObject[1] = this.sM;
      arrayOfObject[2] = "";
      arrayOfObject[3] = Boolean.valueOf(true);
      localMethod.invoke(null, arrayOfObject);
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      gr.W("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      gr.W("Google Conversion Tracking SDK 1.2.0 or above is required to report a conversion.");
      return;
    }
    catch (Exception localException)
    {
      gr.d("Fail to report a conversion.", localException);
    }
  }

  protected String a(String paramString, HashMap<String, String> paramHashMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	com/google/android/gms/internal/ed:mContext	Landroid/content/Context;
    //   4: invokevirtual 99	android/content/Context:getPackageName	()Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: getfield 26	com/google/android/gms/internal/ed:mContext	Landroid/content/Context;
    //   12: invokevirtual 103	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   15: aload_3
    //   16: iconst_0
    //   17: invokevirtual 109	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   20: getfield 114	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   23: astore 23
    //   25: aload 23
    //   27: astore 5
    //   29: invokestatic 120	android/os/SystemClock:elapsedRealtime	()J
    //   32: invokestatic 126	com/google/android/gms/internal/ga:dh	()Lcom/google/android/gms/internal/gb;
    //   35: invokevirtual 131	com/google/android/gms/internal/gb:dq	()J
    //   38: lsub
    //   39: lstore 6
    //   41: aload_2
    //   42: invokevirtual 137	java/util/HashMap:keySet	()Ljava/util/Set;
    //   45: invokeinterface 143 1 0
    //   50: astore 8
    //   52: aload 8
    //   54: invokeinterface 149 1 0
    //   59: ifeq +80 -> 139
    //   62: aload 8
    //   64: invokeinterface 153 1 0
    //   69: checkcast 51	java/lang/String
    //   72: astore 20
    //   74: ldc 155
    //   76: iconst_1
    //   77: anewarray 65	java/lang/Object
    //   80: dup
    //   81: iconst_0
    //   82: aload 20
    //   84: aastore
    //   85: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   88: astore 21
    //   90: iconst_1
    //   91: anewarray 65	java/lang/Object
    //   94: astore 22
    //   96: aload 22
    //   98: iconst_0
    //   99: aload_2
    //   100: aload 20
    //   102: invokevirtual 163	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   105: aastore
    //   106: aload_1
    //   107: aload 21
    //   109: ldc 165
    //   111: aload 22
    //   113: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   116: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   119: astore_1
    //   120: goto -68 -> 52
    //   123: astore 4
    //   125: ldc 171
    //   127: aload 4
    //   129: invokestatic 91	com/google/android/gms/internal/gr:d	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   132: ldc 67
    //   134: astore 5
    //   136: goto -107 -> 29
    //   139: ldc 155
    //   141: iconst_1
    //   142: anewarray 65	java/lang/Object
    //   145: dup
    //   146: iconst_0
    //   147: ldc 173
    //   149: aastore
    //   150: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   153: astore 9
    //   155: iconst_1
    //   156: anewarray 65	java/lang/Object
    //   159: astore 10
    //   161: aload 10
    //   163: iconst_0
    //   164: getstatic 176	com/google/android/gms/internal/ga:vY	Ljava/lang/String;
    //   167: aastore
    //   168: aload_1
    //   169: aload 9
    //   171: ldc 165
    //   173: aload 10
    //   175: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   178: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   181: ldc 155
    //   183: iconst_1
    //   184: anewarray 65	java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: ldc 178
    //   191: aastore
    //   192: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   195: ldc 165
    //   197: iconst_1
    //   198: anewarray 65	java/lang/Object
    //   201: dup
    //   202: iconst_0
    //   203: aload_3
    //   204: aastore
    //   205: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   208: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   211: astore 11
    //   213: ldc 155
    //   215: iconst_1
    //   216: anewarray 65	java/lang/Object
    //   219: dup
    //   220: iconst_0
    //   221: ldc 180
    //   223: aastore
    //   224: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   227: astore 12
    //   229: iconst_1
    //   230: anewarray 65	java/lang/Object
    //   233: astore 13
    //   235: aload 13
    //   237: iconst_0
    //   238: getstatic 186	android/os/Build$VERSION:SDK_INT	I
    //   241: invokestatic 189	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   244: aastore
    //   245: aload 11
    //   247: aload 12
    //   249: ldc 165
    //   251: aload 13
    //   253: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   256: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   259: astore 14
    //   261: ldc 155
    //   263: iconst_1
    //   264: anewarray 65	java/lang/Object
    //   267: dup
    //   268: iconst_0
    //   269: ldc 191
    //   271: aastore
    //   272: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   275: astore 15
    //   277: iconst_1
    //   278: anewarray 65	java/lang/Object
    //   281: astore 16
    //   283: aload 16
    //   285: iconst_0
    //   286: aload_0
    //   287: getfield 24	com/google/android/gms/internal/ed:mG	Ljava/lang/String;
    //   290: aastore
    //   291: aload 14
    //   293: aload 15
    //   295: ldc 165
    //   297: aload 16
    //   299: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   302: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   305: ldc 155
    //   307: iconst_1
    //   308: anewarray 65	java/lang/Object
    //   311: dup
    //   312: iconst_0
    //   313: ldc 193
    //   315: aastore
    //   316: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   319: ldc 165
    //   321: iconst_1
    //   322: anewarray 65	java/lang/Object
    //   325: dup
    //   326: iconst_0
    //   327: aload 5
    //   329: aastore
    //   330: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   333: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   336: astore 17
    //   338: ldc 155
    //   340: iconst_1
    //   341: anewarray 65	java/lang/Object
    //   344: dup
    //   345: iconst_0
    //   346: ldc 195
    //   348: aastore
    //   349: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   352: astore 18
    //   354: iconst_1
    //   355: anewarray 65	java/lang/Object
    //   358: astore 19
    //   360: aload 19
    //   362: iconst_0
    //   363: lload 6
    //   365: invokestatic 198	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   368: aastore
    //   369: aload 17
    //   371: aload 18
    //   373: ldc 165
    //   375: aload 19
    //   377: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   380: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   383: ldc 155
    //   385: iconst_1
    //   386: anewarray 65	java/lang/Object
    //   389: dup
    //   390: iconst_0
    //   391: ldc 200
    //   393: aastore
    //   394: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   397: ldc 165
    //   399: iconst_1
    //   400: anewarray 65	java/lang/Object
    //   403: dup
    //   404: iconst_0
    //   405: ldc 67
    //   407: aastore
    //   408: invokestatic 159	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   411: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   414: ldc 202
    //   416: ldc 204
    //   418: invokevirtual 169	java/lang/String:replaceAll	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   421: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   8	25	123	android/content/pm/PackageManager$NameNotFoundException
  }

  public String getProductId()
  {
    return this.sM;
  }

  protected int p(int paramInt)
  {
    if (paramInt == 0)
      return 1;
    if (paramInt == 1)
      return 2;
    if (paramInt == 4)
      return 3;
    return 0;
  }

  public void recordPlayBillingResolution(int paramInt)
  {
    if (paramInt == 0)
      cz();
    HashMap localHashMap = new HashMap();
    localHashMap.put("google_play_status", String.valueOf(paramInt));
    localHashMap.put("sku", this.sM);
    localHashMap.put("status", String.valueOf(p(paramInt)));
    Iterator localIterator = this.sN.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new gp(this.mContext, this.mG, a(str, localHashMap)).start();
    }
  }

  public void recordResolution(int paramInt)
  {
    if (paramInt == 1)
      cz();
    HashMap localHashMap = new HashMap();
    localHashMap.put("status", String.valueOf(paramInt));
    localHashMap.put("sku", this.sM);
    Iterator localIterator = this.sN.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      new gp(this.mContext, this.mG, a(str, localHashMap)).start();
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ed
 * JD-Core Version:    0.6.0
 */