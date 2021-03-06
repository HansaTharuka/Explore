package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public abstract class DataBuffer<T>
  implements Releasable, Iterable<T>
{
  protected final DataHolder JG;

  protected DataBuffer(DataHolder paramDataHolder)
  {
    this.JG = paramDataHolder;
    if (this.JG != null)
      this.JG.e(this);
  }

  @Deprecated
  public final void close()
  {
    release();
  }

  public int describeContents()
  {
    return 0;
  }

  public Bundle gV()
  {
    return this.JG.gV();
  }

  public abstract T get(int paramInt);

  public int getCount()
  {
    if (this.JG == null)
      return 0;
    return this.JG.getCount();
  }

  @Deprecated
  public boolean isClosed()
  {
    if (this.JG == null)
      return true;
    return this.JG.isClosed();
  }

  public Iterator<T> iterator()
  {
    return new c(this);
  }

  public void release()
  {
    if (this.JG != null)
      this.JG.close();
  }

  public Iterator<T> singleRefIterator()
  {
    return new h(this);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.DataBuffer
 * JD-Core Version:    0.6.0
 */