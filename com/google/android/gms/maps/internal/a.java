package com.google.android.gms.maps.internal;

public final class a
{
  public static Boolean a(byte paramByte)
  {
    switch (paramByte)
    {
    default:
      return null;
    case 1:
      return Boolean.TRUE;
    case 0:
    }
    return Boolean.FALSE;
  }

  public static byte c(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      if (paramBoolean.booleanValue())
        return 1;
      return 0;
    }
    return -1;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.maps.internal.a
 * JD-Core Version:    0.6.0
 */