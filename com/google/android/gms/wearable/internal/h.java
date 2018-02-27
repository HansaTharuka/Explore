package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public final class h extends d
  implements DataEvent
{
  private final int Ya;

  public h(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    super(paramDataHolder, paramInt1);
    this.Ya = paramInt2;
  }

  public DataItem getDataItem()
  {
    return new o(this.JG, this.KZ, this.Ya);
  }

  public int getType()
  {
    return getInteger("event_type");
  }

  public DataEvent rn()
  {
    return new g(this);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.h
 * JD-Core Version:    0.6.0
 */