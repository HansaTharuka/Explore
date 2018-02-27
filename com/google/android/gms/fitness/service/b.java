package com.google.android.gms.fitness.service;

import android.os.RemoteException;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.internal.jx;
import java.util.Iterator;
import java.util.List;

class b
  implements SensorEventDispatcher
{
  private final k VW;

  b(k paramk)
  {
    this.VW = ((k)jx.i(paramk));
  }

  public void publish(DataPoint paramDataPoint)
    throws RemoteException
  {
    this.VW.c(paramDataPoint);
  }

  public void publish(List<DataPoint> paramList)
    throws RemoteException
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      publish((DataPoint)localIterator.next());
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.service.b
 * JD-Core Version:    0.6.0
 */