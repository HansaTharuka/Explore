package com.google.android.gms.drive.events;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.internal.OnEventResponse;
import com.google.android.gms.drive.internal.ag.a;
import com.google.android.gms.drive.internal.w;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service
  implements ChangeListener, CompletionListener
{
  public static final String ACTION_HANDLE_EVENT = "com.google.android.gms.drive.events.HANDLE_EVENT";
  private CountDownLatch Pg;
  a Ph;
  boolean Pi = false;
  int Pj = -1;
  private final String mName;

  protected DriveEventService()
  {
    this("DriveEventService");
  }

  protected DriveEventService(String paramString)
  {
    this.mName = paramString;
  }

  private void a(OnEventResponse paramOnEventResponse)
  {
    DriveEvent localDriveEvent = paramOnEventResponse.iQ();
    w.m("DriveEventService", "handleEventMessage: " + localDriveEvent);
    try
    {
      switch (localDriveEvent.getType())
      {
      default:
        w.o(this.mName, "Unhandled event: " + localDriveEvent);
        return;
      case 1:
        onChange((ChangeEvent)localDriveEvent);
        return;
      case 2:
      }
    }
    catch (Exception localException)
    {
      w.a(this.mName, localException, "Error handling event: " + localDriveEvent);
      return;
    }
    onCompletion((CompletionEvent)localDriveEvent);
  }

  private boolean bh(int paramInt)
  {
    String[] arrayOfString = getPackageManager().getPackagesForUid(paramInt);
    int i = 0;
    int j;
    if (arrayOfString != null)
      j = arrayOfString.length;
    for (int k = 0; ; k++)
    {
      i = 0;
      if (k < j)
      {
        if (!"com.google.android.gms".equals(arrayOfString[k]))
          continue;
        i = 1;
      }
      return i;
    }
  }

  private void iD()
    throws SecurityException
  {
    int i = getCallingUid();
    if (i == this.Pj)
      return;
    if ((GooglePlayServicesUtil.b(getPackageManager(), "com.google.android.gms")) && (bh(i)))
    {
      this.Pj = i;
      return;
    }
    throw new SecurityException("Caller is not GooglePlayServices");
  }

  protected int getCallingUid()
  {
    return Binder.getCallingUid();
  }

  public final IBinder onBind(Intent paramIntent)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if ("com.google.android.gms.drive.events.HANDLE_EVENT".equals(paramIntent.getAction()))
        {
          if ((this.Ph != null) || (this.Pi))
            continue;
          this.Pi = true;
          CountDownLatch localCountDownLatch = new CountDownLatch(1);
          this.Pg = new CountDownLatch(1);
          new Thread(localCountDownLatch)
          {
            public void run()
            {
              try
              {
                Looper.prepare();
                DriveEventService.this.Ph = new DriveEventService.a(DriveEventService.this);
                DriveEventService.this.Pi = false;
                this.Pk.countDown();
                w.m("DriveEventService", "Bound and starting loop");
                Looper.loop();
                w.m("DriveEventService", "Finished loop");
                return;
              }
              finally
              {
                if (DriveEventService.b(DriveEventService.this) != null)
                  DriveEventService.b(DriveEventService.this).countDown();
              }
              throw localObject;
            }
          }
          .start();
          try
          {
            if (localCountDownLatch.await(5000L, TimeUnit.MILLISECONDS))
              continue;
            w.p("DriveEventService", "Failed to synchronously initialize event handler.");
            IBinder localIBinder2 = new b().asBinder();
            localIBinder1 = localIBinder2;
            monitorexit;
            return localIBinder1;
          }
          catch (InterruptedException localInterruptedException)
          {
            throw new RuntimeException("Unable to start event handler", localInterruptedException);
          }
        }
      }
      finally
      {
        monitorexit;
      }
      IBinder localIBinder1 = null;
    }
  }

  public void onChange(ChangeEvent paramChangeEvent)
  {
    w.o(this.mName, "Unhandled change event: " + paramChangeEvent);
  }

  public void onCompletion(CompletionEvent paramCompletionEvent)
  {
    w.o(this.mName, "Unhandled completion event: " + paramCompletionEvent);
  }

  // ERROR //
  public void onDestroy()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 25
    //   4: ldc 207
    //   6: invokestatic 77	com/google/android/gms/drive/internal/w:m	(Ljava/lang/String;Ljava/lang/String;)V
    //   9: aload_0
    //   10: getfield 156	com/google/android/gms/drive/events/DriveEventService:Ph	Lcom/google/android/gms/drive/events/DriveEventService$a;
    //   13: ifnull +53 -> 66
    //   16: aload_0
    //   17: getfield 156	com/google/android/gms/drive/events/DriveEventService:Ph	Lcom/google/android/gms/drive/events/DriveEventService$a;
    //   20: invokestatic 212	com/google/android/gms/drive/events/DriveEventService$a:a	(Lcom/google/android/gms/drive/events/DriveEventService$a;)Landroid/os/Message;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield 156	com/google/android/gms/drive/events/DriveEventService:Ph	Lcom/google/android/gms/drive/events/DriveEventService$a;
    //   28: aload_2
    //   29: invokevirtual 216	com/google/android/gms/drive/events/DriveEventService$a:sendMessage	(Landroid/os/Message;)Z
    //   32: pop
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 156	com/google/android/gms/drive/events/DriveEventService:Ph	Lcom/google/android/gms/drive/events/DriveEventService$a;
    //   38: aload_0
    //   39: getfield 109	com/google/android/gms/drive/events/DriveEventService:Pg	Ljava/util/concurrent/CountDownLatch;
    //   42: ldc2_w 170
    //   45: getstatic 177	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   48: invokevirtual 181	java/util/concurrent/CountDownLatch:await	(JLjava/util/concurrent/TimeUnit;)Z
    //   51: ifne +10 -> 61
    //   54: ldc 25
    //   56: ldc 218
    //   58: invokestatic 88	com/google/android/gms/drive/internal/w:o	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 109	com/google/android/gms/drive/events/DriveEventService:Pg	Ljava/util/concurrent/CountDownLatch;
    //   66: aload_0
    //   67: invokespecial 220	android/app/Service:onDestroy	()V
    //   70: aload_0
    //   71: monitorexit
    //   72: return
    //   73: astore_1
    //   74: aload_0
    //   75: monitorexit
    //   76: aload_1
    //   77: athrow
    //   78: astore 4
    //   80: goto -19 -> 61
    //
    // Exception table:
    //   from	to	target	type
    //   2	38	73	finally
    //   38	61	73	finally
    //   61	66	73	finally
    //   66	70	73	finally
    //   38	61	78	java/lang/InterruptedException
  }

  public boolean onUnbind(Intent paramIntent)
  {
    return true;
  }

  final class a extends Handler
  {
    a()
    {
    }

    private Message b(OnEventResponse paramOnEventResponse)
    {
      return obtainMessage(1, paramOnEventResponse);
    }

    private Message iE()
    {
      return obtainMessage(2);
    }

    public void handleMessage(Message paramMessage)
    {
      w.m("DriveEventService", "handleMessage message type:" + paramMessage.what);
      switch (paramMessage.what)
      {
      default:
        w.o("DriveEventService", "Unexpected message type:" + paramMessage.what);
        return;
      case 1:
        DriveEventService.a(DriveEventService.this, (OnEventResponse)paramMessage.obj);
        return;
      case 2:
      }
      getLooper().quit();
    }
  }

  final class b extends ag.a
  {
    b()
    {
    }

    public void c(OnEventResponse paramOnEventResponse)
      throws RemoteException
    {
      synchronized (DriveEventService.this)
      {
        w.m("DriveEventService", "onEvent: " + paramOnEventResponse);
        DriveEventService.a(DriveEventService.this);
        if (DriveEventService.this.Ph != null)
        {
          Message localMessage = DriveEventService.a.a(DriveEventService.this.Ph, paramOnEventResponse);
          DriveEventService.this.Ph.sendMessage(localMessage);
          return;
        }
        w.p("DriveEventService", "Receiving event before initialize is completed.");
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.events.DriveEventService
 * JD-Core Version:    0.6.0
 */