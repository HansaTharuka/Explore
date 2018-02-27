package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import com.google.android.gms.wearable.DataItemAsset;

public class DataItemAssetParcelable
  implements SafeParcelable, DataItemAsset
{
  public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new j();
  private final String CE;
  final int CK;
  private final String KP;

  DataItemAssetParcelable(int paramInt, String paramString1, String paramString2)
  {
    this.CK = paramInt;
    this.CE = paramString1;
    this.KP = paramString2;
  }

  public DataItemAssetParcelable(DataItemAsset paramDataItemAsset)
  {
    this.CK = 1;
    this.CE = ((String)jx.i(paramDataItemAsset.getId()));
    this.KP = ((String)jx.i(paramDataItemAsset.getDataItemKey()));
  }

  public int describeContents()
  {
    return 0;
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
    localStringBuilder.append("DataItemAssetParcelable[");
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

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    j.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.DataItemAssetParcelable
 * JD-Core Version:    0.6.0
 */