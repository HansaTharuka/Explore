package com.google.android.gms.common.data;

public abstract interface Freezable<T>
{
  public abstract T freeze();

  public abstract boolean isDataValid();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.data.Freezable
 * JD-Core Version:    0.6.0
 */