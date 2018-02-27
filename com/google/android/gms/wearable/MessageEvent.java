package com.google.android.gms.wearable;

public abstract interface MessageEvent
{
  public abstract byte[] getData();

  public abstract String getPath();

  public abstract int getRequestId();

  public abstract String getSourceNodeId();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.MessageEvent
 * JD-Core Version:    0.6.0
 */