package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class GoogleCloudMessaging
{
  public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
  public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
  public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
  public static final String MESSAGE_TYPE_MESSAGE = "gcm";
  public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
  static GoogleCloudMessaging afo;
  private PendingIntent afp;
  final BlockingQueue<Intent> afq = new LinkedBlockingQueue();
  private Handler afr = new Handler(Looper.getMainLooper())
  {
    public void handleMessage(Message paramMessage)
    {
      Intent localIntent = (Intent)paramMessage.obj;
      GoogleCloudMessaging.this.afq.add(localIntent);
    }
  };
  private Messenger afs = new Messenger(this.afr);
  private Context lM;

  private void a(String paramString1, String paramString2, long paramLong, int paramInt, Bundle paramBundle)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    if (paramString1 == null)
      throw new IllegalArgumentException("Missing 'to'");
    Intent localIntent = new Intent("com.google.android.gcm.intent.SEND");
    localIntent.putExtras(paramBundle);
    j(localIntent);
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.to", paramString1);
    localIntent.putExtra("google.message_id", paramString2);
    localIntent.putExtra("google.ttl", Long.toString(paramLong));
    localIntent.putExtra("google.delay", Integer.toString(paramInt));
    this.lM.sendOrderedBroadcast(localIntent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
  }

  private void e(String[] paramArrayOfString)
  {
    String str = f(paramArrayOfString);
    Intent localIntent = new Intent("com.google.android.c2dm.intent.REGISTER");
    localIntent.setPackage("com.google.android.gms");
    localIntent.putExtra("google.messenger", this.afs);
    j(localIntent);
    localIntent.putExtra("sender", str);
    this.lM.startService(localIntent);
  }

  public static GoogleCloudMessaging getInstance(Context paramContext)
  {
    monitorenter;
    try
    {
      if (afo == null)
      {
        afo = new GoogleCloudMessaging();
        afo.lM = paramContext.getApplicationContext();
      }
      GoogleCloudMessaging localGoogleCloudMessaging = afo;
      return localGoogleCloudMessaging;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  private void mU()
  {
    Intent localIntent = new Intent("com.google.android.c2dm.intent.UNREGISTER");
    localIntent.setPackage("com.google.android.gms");
    this.afq.clear();
    localIntent.putExtra("google.messenger", this.afs);
    j(localIntent);
    this.lM.startService(localIntent);
  }

  public void close()
  {
    mV();
  }

  String f(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0))
      throw new IllegalArgumentException("No senderIds");
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfString[0]);
    for (int i = 1; i < paramArrayOfString.length; i++)
      localStringBuilder.append(',').append(paramArrayOfString[i]);
    return localStringBuilder.toString();
  }

  public String getMessageType(Intent paramIntent)
  {
    String str;
    if (!"com.google.android.c2dm.intent.RECEIVE".equals(paramIntent.getAction()))
      str = null;
    do
    {
      return str;
      str = paramIntent.getStringExtra("message_type");
    }
    while (str != null);
    return "gcm";
  }

  void j(Intent paramIntent)
  {
    monitorenter;
    try
    {
      if (this.afp == null)
      {
        Intent localIntent = new Intent();
        localIntent.setPackage("com.google.example.invalidpackage");
        this.afp = PendingIntent.getBroadcast(this.lM, 0, localIntent, 0);
      }
      paramIntent.putExtra("app", this.afp);
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void mV()
  {
    monitorenter;
    try
    {
      if (this.afp != null)
      {
        this.afp.cancel();
        this.afp = null;
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  public String register(String[] paramArrayOfString)
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    this.afq.clear();
    e(paramArrayOfString);
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.afq.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null)
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    String str1 = localIntent.getStringExtra("registration_id");
    if (str1 != null)
      return str1;
    localIntent.getStringExtra("error");
    String str2 = localIntent.getStringExtra("error");
    if (str2 != null)
      throw new IOException(str2);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }

  public void send(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
    throws IOException
  {
    a(paramString1, paramString2, paramLong, -1, paramBundle);
  }

  public void send(String paramString1, String paramString2, Bundle paramBundle)
    throws IOException
  {
    send(paramString1, paramString2, -1L, paramBundle);
  }

  public void unregister()
    throws IOException
  {
    if (Looper.getMainLooper() == Looper.myLooper())
      throw new IOException("MAIN_THREAD");
    mU();
    Intent localIntent;
    try
    {
      localIntent = (Intent)this.afq.poll(5000L, TimeUnit.MILLISECONDS);
      if (localIntent == null)
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
    catch (InterruptedException localInterruptedException)
    {
      throw new IOException(localInterruptedException.getMessage());
    }
    if (localIntent.getStringExtra("unregistered") != null)
      return;
    String str = localIntent.getStringExtra("error");
    if (str != null)
      throw new IOException(str);
    throw new IOException("SERVICE_NOT_AVAILABLE");
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.gcm.GoogleCloudMessaging
 * JD-Core Version:    0.6.0
 */