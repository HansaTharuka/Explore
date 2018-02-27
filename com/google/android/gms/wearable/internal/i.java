package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataItemAsset;

public class i
  implements DataItemAsset
{
  private final String CE;
  private final String KP;

  public i(DataItemAsset paramDataItemAsset)
  {
    this.CE = paramDataItemAsset.getId();
    this.KP = paramDataItemAsset.getDataItemKey();
  }

  public String getDataItemKey()
  {
    return this.KP;
  }

  public String getId()
  {
    return this.CE;
  }

  public boolean isDataValid()
  {
    return true;
  }

  public DataItemAsset ro()
  {
    return this;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("DataItemAssetEntity[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    if (this.CE == null)
      localStringBuilder.append(",noid");
    while (true)
    {
      localStringBuilder.append(", key=");
      localStringBuilder.append(this.KP);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
      localStringBuilder.append(",");
      localStringBuilder.append(this.CE);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.i
 * JD-Core Version:    0.6.0
 */