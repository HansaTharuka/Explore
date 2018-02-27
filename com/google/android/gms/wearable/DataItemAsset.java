package com.google.android.gms.wearable;

import com.google.android.gms.common.data.Freezable;

public abstract interface DataItemAsset extends Freezable<DataItemAsset>
{
  public abstract String getDataItemKey();

  public abstract String getId();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.DataItemAsset
 * JD-Core Version:    0.6.0
 */