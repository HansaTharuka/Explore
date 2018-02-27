package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class b
  implements Releasable, Result
{
  protected final Status Eb;
  protected final DataHolder JG;

  protected b(DataHolder paramDataHolder)
  {
    this.Eb = new Status(paramDataHolder.getStatusCode());
    this.JG = paramDataHolder;
  }

  public Status getStatus()
  {
    return this.Eb;
  }

  public void release()
  {
    if (this.JG != null)
      this.JG.close();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.b
 * JD-Core Version:    0.6.0
 */