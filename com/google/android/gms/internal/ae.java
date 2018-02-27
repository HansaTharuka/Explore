package com.google.android.gms.internal;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@ey
public final class ae
  implements ag
{
  private final Object mH = new Object();
  private final WeakHashMap<fy, af> mI = new WeakHashMap();
  private final ArrayList<af> mJ = new ArrayList();

  public af a(Context paramContext, ay paramay, fy paramfy, View paramView, gs paramgs)
  {
    synchronized (this.mH)
    {
      if (c(paramfy))
      {
        af localaf2 = (af)this.mI.get(paramfy);
        return localaf2;
      }
      af localaf1 = new af(paramContext, paramay, paramfy, paramView, paramgs);
      localaf1.a(this);
      this.mI.put(paramfy, localaf1);
      this.mJ.add(localaf1);
      return localaf1;
    }
  }

  public af a(ay paramay, fy paramfy)
  {
    return a(paramfy.se.getContext(), paramay, paramfy, paramfy.se, paramfy.se.dG());
  }

  public void a(af paramaf)
  {
    synchronized (this.mH)
    {
      if (!paramaf.aM())
        this.mJ.remove(paramaf);
      return;
    }
  }

  public boolean c(fy paramfy)
  {
    while (true)
    {
      synchronized (this.mH)
      {
        af localaf = (af)this.mI.get(paramfy);
        if ((localaf != null) && (localaf.aM()))
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public void d(fy paramfy)
  {
    synchronized (this.mH)
    {
      af localaf = (af)this.mI.get(paramfy);
      if (localaf != null)
        localaf.aK();
      return;
    }
  }

  public void pause()
  {
    synchronized (this.mH)
    {
      Iterator localIterator = this.mJ.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).pause();
    }
    monitorexit;
  }

  public void resume()
  {
    synchronized (this.mH)
    {
      Iterator localIterator = this.mJ.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).resume();
    }
    monitorexit;
  }

  public void stop()
  {
    synchronized (this.mH)
    {
      Iterator localIterator = this.mJ.iterator();
      if (localIterator.hasNext())
        ((af)localIterator.next()).stop();
    }
    monitorexit;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ae
 * JD-Core Version:    0.6.0
 */