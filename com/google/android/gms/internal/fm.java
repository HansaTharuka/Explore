package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ey
public class fm extends gf
{
  private final Object mH = new Object();
  private final fc.a tA;
  private final fy.a tB;
  private final fj tn;
  private final fn ui;
  private Future<fy> uj;

  public fm(Context paramContext, u paramu, ai paramai, fy.a parama, fc.a parama1)
  {
    this(parama, parama1, new fn(paramContext, paramu, paramai, new gn(), parama));
  }

  fm(fy.a parama, fc.a parama1, fn paramfn)
  {
    this.tB = parama;
    this.tn = parama.vK;
    this.tA = parama1;
    this.ui = paramfn;
  }

  private fy s(int paramInt)
  {
    return new fy(this.tB.vJ.tL, null, null, paramInt, null, null, this.tn.orientation, this.tn.qA, this.tB.vJ.tO, false, null, null, null, null, null, this.tn.tX, this.tB.lS, this.tn.tV, this.tB.vG, this.tn.ua, this.tn.ub, this.tB.vD, null);
  }

  public void cx()
  {
    try
    {
      synchronized (this.mH)
      {
        this.uj = gh.submit(this.ui);
        localfy = (fy)this.uj.get(60000L, TimeUnit.MILLISECONDS);
        i = -2;
        if (localfy != null)
        {
          gq.wR.post(new Runnable(localfy)
          {
            public void run()
            {
              fm.a(fm.this).a(this.tG);
            }
          });
          return;
        }
      }
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
      {
        gr.W("Timed out waiting for native ad.");
        i = 2;
        localfy = null;
      }
    }
    catch (ExecutionException localExecutionException)
    {
      while (true)
      {
        localfy = null;
        i = 0;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        i = -1;
        localfy = null;
      }
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
      {
        int i = -1;
        fy localfy = null;
        continue;
        localfy = s(i);
      }
    }
  }

  public void onStop()
  {
    synchronized (this.mH)
    {
      if (this.uj != null)
        this.uj.cancel(true);
      return;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fm
 * JD-Core Version:    0.6.0
 */