package com.google.android.gms.common.api;

import com.google.android.gms.common.data.DataHolder;

public abstract class a<L>
  implements d.b<L>
{
  private final DataHolder JG;

  protected a(DataHolder paramDataHolder)
  {
    this.JG = paramDataHolder;
  }

  protected abstract void a(L paramL, DataHolder paramDataHolder);

  public final void c(L paramL)
  {
    a(paramL, this.JG);
  }

  public void gG()
  {
    if (this.JG != null)
      this.JG.close();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.a
 * JD-Core Version:    0.6.0
 */