package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;

@ey
public class ex
  implements Thread.UncaughtExceptionHandler
{
  private Context mContext;
  private Thread.UncaughtExceptionHandler tf;
  private Thread.UncaughtExceptionHandler tg;
  private gs th;

  public ex(Context paramContext, gs paramgs, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler1, Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler2)
  {
    this.tf = paramUncaughtExceptionHandler1;
    this.tg = paramUncaughtExceptionHandler2;
    this.mContext = paramContext;
    this.th = paramgs;
  }

  public static ex a(Context paramContext, Thread paramThread, gs paramgs)
  {
    if ((paramContext == null) || (paramThread == null) || (paramgs == null))
      return null;
    ga.bN();
    if (!k(paramContext))
      return null;
    Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = paramThread.getUncaughtExceptionHandler();
    ex localex = new ex(paramContext, paramgs, localUncaughtExceptionHandler, Thread.getDefaultUncaughtExceptionHandler());
    if ((localUncaughtExceptionHandler == null) || (!(localUncaughtExceptionHandler instanceof ex)))
      try
      {
        paramThread.setUncaughtExceptionHandler(localex);
        return localex;
      }
      catch (SecurityException localSecurityException)
      {
        gr.c("Fail to set UncaughtExceptionHandler.", localSecurityException);
        return null;
      }
    return (ex)localUncaughtExceptionHandler;
  }

  private String cD()
  {
    String str1 = Build.MANUFACTURER;
    String str2 = Build.MODEL;
    if (str2.startsWith(str1))
      return str2;
    return str1 + " " + str2;
  }

  private Throwable d(Throwable paramThrowable)
  {
    Bundle localBundle = ga.bN();
    if ((localBundle != null) && (localBundle.getBoolean("gads:sdk_crash_report_full_stacktrace", false)))
      return paramThrowable;
    LinkedList localLinkedList = new LinkedList();
    while (paramThrowable != null)
    {
      localLinkedList.push(paramThrowable);
      paramThrowable = paramThrowable.getCause();
    }
    Object localObject1 = null;
    Throwable localThrowable;
    Object localObject2;
    if (!localLinkedList.isEmpty())
    {
      localThrowable = (Throwable)localLinkedList.pop();
      StackTraceElement[] arrayOfStackTraceElement = localThrowable.getStackTrace();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(new StackTraceElement(localThrowable.getClass().getName(), "<filtered>", "<filtered>", 1));
      int i = arrayOfStackTraceElement.length;
      int j = 0;
      int k = 0;
      if (j < i)
      {
        StackTraceElement localStackTraceElement = arrayOfStackTraceElement[j];
        if (G(localStackTraceElement.getClassName()))
        {
          localArrayList.add(localStackTraceElement);
          k = 1;
        }
        while (true)
        {
          j++;
          break;
          if (H(localStackTraceElement.getClassName()))
          {
            localArrayList.add(localStackTraceElement);
            continue;
          }
          localArrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
        }
      }
      if (k == 0)
        break label276;
      if (localObject1 == null)
      {
        localObject2 = new Throwable(localThrowable.getMessage());
        label230: ((Throwable)localObject2).setStackTrace((StackTraceElement[])localArrayList.toArray(new StackTraceElement[0]));
      }
    }
    while (true)
    {
      localObject1 = localObject2;
      break;
      localObject2 = new Throwable(localThrowable.getMessage(), localObject1);
      break label230;
      return localObject1;
      label276: localObject2 = localObject1;
    }
  }

  private static boolean k(Context paramContext)
  {
    Bundle localBundle = ga.bN();
    if (localBundle == null);
    do
      return false;
    while (!localBundle.getBoolean("gads:sdk_crash_report_enabled", false));
    return true;
  }

  protected boolean G(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      return false;
    if (paramString.startsWith("com.google.android.gms.ads"))
      return true;
    if (paramString.startsWith("com.google.ads"))
      return true;
    try
    {
      boolean bool = Class.forName(paramString).isAnnotationPresent(ey.class);
      return bool;
    }
    catch (Exception localException)
    {
      gr.a("Fail to check class type for class " + paramString, localException);
    }
    return false;
  }

  protected boolean H(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    do
      return false;
    while ((!paramString.startsWith("android.")) && (!paramString.startsWith("java.")));
    return true;
  }

  protected boolean a(Throwable paramThrowable)
  {
    int i = 1;
    if (paramThrowable == null)
      return false;
    int j = 0;
    int k = 0;
    while (paramThrowable != null)
    {
      for (StackTraceElement localStackTraceElement : paramThrowable.getStackTrace())
      {
        if (G(localStackTraceElement.getClassName()))
          k = i;
        if (!getClass().getName().equals(localStackTraceElement.getClassName()))
          continue;
        j = i;
      }
      paramThrowable = paramThrowable.getCause();
    }
    if ((k != 0) && (j == 0));
    while (true)
    {
      return i;
      i = 0;
    }
  }

  public void b(Throwable paramThrowable)
  {
    if (!k(this.mContext));
    Throwable localThrowable;
    do
    {
      return;
      localThrowable = d(paramThrowable);
    }
    while (localThrowable == null);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(c(localThrowable));
    gi.a(this.mContext, this.th.wS, localArrayList, ga.dn());
  }

  protected String c(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    paramThrowable.printStackTrace(new PrintWriter(localStringWriter));
    return new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("device", cD()).appendQueryParameter("js", this.th.wS).appendQueryParameter("appid", this.mContext.getApplicationContext().getPackageName()).appendQueryParameter("stacktrace", localStringWriter.toString()).toString();
  }

  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (a(paramThrowable))
    {
      b(paramThrowable);
      if (Looper.getMainLooper().getThread() == paramThread);
    }
    do
    {
      return;
      if (this.tf == null)
        continue;
      this.tf.uncaughtException(paramThread, paramThrowable);
      return;
    }
    while (this.tg == null);
    this.tg.uncaughtException(paramThread, paramThrowable);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ex
 * JD-Core Version:    0.6.0
 */