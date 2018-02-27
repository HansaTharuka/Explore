package com.google.android.gms.deviceconnection.features;

import com.google.android.gms.common.data.DataBuffer;

public class DeviceFeatureBuffer extends DataBuffer<DeviceFeature>
{
  public DeviceFeature get(int paramInt)
  {
    return new a(this.JG, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.deviceconnection.features.DeviceFeatureBuffer
 * JD-Core Version:    0.6.0
 */