package com.google.android.gms.deviceconnection.features;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.jv.a;

public final class a extends d
  implements DeviceFeature
{
  public a(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }

  public String getFeatureName()
  {
    return getString("feature_name");
  }

  public long getLastConnectionTimestampMillis()
  {
    return getLong("last_connection_timestamp");
  }

  public String toString()
  {
    return jv.h(this).a("FeatureName", getFeatureName()).a("Timestamp", Long.valueOf(getLastConnectionTimestampMillis())).toString();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.deviceconnection.features.a
 * JD-Core Version:    0.6.0
 */