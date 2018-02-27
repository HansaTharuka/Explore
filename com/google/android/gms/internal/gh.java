package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ey
public final class gh
{
  private static final ThreadFactory ww = new ThreadFactory()
  {
    private final AtomicInteger wA = new AtomicInteger(1);

    public Thread newThread(Runnable paramRunnable)
    {
      return new Thread(paramRunnable, "AdWorker #" + this.wA.getAndIncrement());
    }
  };
  private static final ExecutorService wx = Executors.newFixedThreadPool(10, ww);

  public static Future<Void> a(Runnable paramRunnable)
  {
    return submit(new Callable(paramRunnable)
    {
      public Void ds()
      {
        this.wy.run();
        return null;
      }
    });
  }

  public static <T> Future<T> submit(Callable<T> paramCallable)
  {
    try
    {
      Future localFuture = wx.submit(new Callable(paramCallable)
      {
        public T call()
          throws Exception
        {
          try
          {
            Process.setThreadPriority(10);
            Object localObject = this.wz.call();
            return localObject;
          }
          catch (Exception localException)
          {
            ga.e(localException);
          }
          return null;
        }
      });
      return localFuture;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      gr.d("Thread execution is rejected.", localRejectedExecutionException);
    }
    return new gk(null);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gh
 * JD-Core Version:    0.6.0
 */