package com.google.android.gms.deviceconnection.features;

public abstract interface DeviceFeature
{
  public abstract String getFeatureName();

  public abstract long getLastConnectionTimestampMillis();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.deviceconnection.features.DeviceFeature
 * JD-Core Version:    0.6.0
 */