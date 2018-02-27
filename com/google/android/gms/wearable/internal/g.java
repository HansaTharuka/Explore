package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class g
  implements DataEvent
{
  private int Gt;
  private DataItem axE;

  public g(DataEvent paramDataEvent)
  {
    this.Gt = paramDataEvent.getType();
    this.axE = ((DataItem)paramDataEvent.getDataItem().freeze());
  }

  public DataItem getDataItem()
  {
    return this.axE;
  }

  public int getType()
  {
    return this.Gt;
  }

  public boolean isDataValid()
  {
    return true;
  }

  public DataEvent rn()
  {
    return this;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.g
 * JD-Core Version:    0.6.0
 */