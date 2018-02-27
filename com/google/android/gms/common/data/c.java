package com.google.android.gms.common.data;

import com.google.android.gms.internal.jx;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class c<T>
  implements Iterator<T>
{
  protected final DataBuffer<T> KW;
  protected int KX;

  public c(DataBuffer<T> paramDataBuffer)
  {
    this.KW = ((DataBuffer)jx.i(paramDataBuffer));
    this.KX = -1;
  }

  public boolean hasNext()
  {
    return this.KX < -1 + this.KW.getCount();
  }

  public T next()
  {
    if (!hasNext())
      throw new NoSuchElementException("Cannot advance the iterator beyond " + this.KX);
    DataBuffer localDataBuffer = this.KW;
    int i = 1 + this.KX;
    this.KX = i;
    return localDataBuffer.get(i);
  }

  public void remove()
  {
    throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.c
 * JD-Core Version:    0.6.0
 */