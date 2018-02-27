package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

@ey
class x
  implements g, Runnable
{
  private u.b lB;
  private final List<Object[]> mp = new Vector();
  private final AtomicReference<g> mq = new AtomicReference();
  CountDownLatch mr = new CountDownLatch(1);

  public x(u.b paramb)
  {
    this.lB = paramb;
    if (gq.dB())
    {
      gh.a(this);
      return;
    }
    run();
  }

  private void aB()
  {
    if (this.mp.isEmpty());
    while (true)
    {
      return;
      Iterator localIterator = this.mp.iterator();
      while (localIterator.hasNext())
      {
        Object[] arrayOfObject = (Object[])localIterator.next();
        if (arrayOfObject.length == 1)
        {
          ((Runnable)this.mq.get()).a((MotionEvent)arrayOfObject[0]);
          continue;
        }
        if (arrayOfObject.length != 3)
          continue;
        ((Runnable)this.mq.get()).a(((Integer)arrayOfObject[0]).intValue(), ((Integer)arrayOfObject[1]).intValue(), ((Integer)arrayOfObject[2]).intValue());
      }
    }
  }

  private Context i(Context paramContext)
  {
    if (!aC());
    Context localContext;
    do
    {
      return paramContext;
      localContext = paramContext.getApplicationContext();
    }
    while (localContext == null);
    return localContext;
  }

  public String a(Context paramContext)
  {
    if (aA())
    {
      g localg = (Runnable)this.mq.get();
      if (localg != null)
      {
        aB();
        return localg.a(i(paramContext));
      }
    }
    return "";
  }

  public String a(Context paramContext, String paramString)
  {
    if (aA())
    {
      g localg = (Runnable)this.mq.get();
      if (localg != null)
      {
        aB();
        return localg.a(i(paramContext), paramString);
      }
    }
    return "";
  }

  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    g localg = (Runnable)this.mq.get();
    if (localg != null)
    {
      aB();
      localg.a(paramInt1, paramInt2, paramInt3);
      return;
    }
    List localList = this.mp;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    localList.add(arrayOfObject);
  }

  public void a(MotionEvent paramMotionEvent)
  {
    g localg = (Runnable)this.mq.get();
    if (localg != null)
    {
      aB();
      localg.a(paramMotionEvent);
      return;
    }
    this.mp.add(new Object[] { paramMotionEvent });
  }

  protected void a(g paramg)
  {
    this.mq.set(paramg);
  }

  protected boolean aA()
  {
    try
    {
      this.mr.await();
      return true;
    }
    catch (InterruptedException localInterruptedException)
    {
      gr.d("Interrupted during GADSignals creation.", localInterruptedException);
    }
    return false;
  }

  protected boolean aC()
  {
    return ga.bN().getBoolean("gads:spam_app_context:enabled", false);
  }

  public void run()
  {
    try
    {
      a(j.a(this.lB.lO.wS, i(this.lB.lM)));
      return;
    }
    finally
    {
      this.mr.countDown();
      this.lB = null;
    }
    throw localObject;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.x
 * JD-Core Version:    0.6.0
 */