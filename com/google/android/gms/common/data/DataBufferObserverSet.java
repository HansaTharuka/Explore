package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet
  implements DataBufferObserver.Observable, DataBufferObserver
{
  private HashSet<DataBufferObserver> KY = new HashSet();

  public void addObserver(DataBufferObserver paramDataBufferObserver)
  {
    this.KY.add(paramDataBufferObserver);
  }

  public void clear()
  {
    this.KY.clear();
  }

  public boolean hasObservers()
  {
    return !this.KY.isEmpty();
  }

  public void onDataChanged()
  {
    Iterator localIterator = this.KY.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver)localIterator.next()).onDataChanged();
  }

  public void onDataRangeChanged(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.KY.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver)localIterator.next()).onDataRangeChanged(paramInt1, paramInt2);
  }

  public void onDataRangeInserted(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.KY.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver)localIterator.next()).onDataRangeInserted(paramInt1, paramInt2);
  }

  public void onDataRangeMoved(int paramInt1, int paramInt2, int paramInt3)
  {
    Iterator localIterator = this.KY.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver)localIterator.next()).onDataRangeMoved(paramInt1, paramInt2, paramInt3);
  }

  public void onDataRangeRemoved(int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.KY.iterator();
    while (localIterator.hasNext())
      ((DataBufferObserver)localIterator.next()).onDataRangeRemoved(paramInt1, paramInt2);
  }

  public void removeObserver(DataBufferObserver paramDataBufferObserver)
  {
    this.KY.remove(paramDataBufferObserver);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBufferObserverSet
 * JD-Core Version:    0.6.0
 */