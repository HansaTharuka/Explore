package com.google.android.gms.games.internal.constants;

import com.google.android.gms.games.internal.GamesLog;

public final class RequestType
{
  public static String dZ(int paramInt)
  {
    switch (paramInt)
    {
    default:
      GamesLog.p("RequestType", "Unknown request type: " + paramInt);
      return "UNKNOWN_TYPE";
    case 1:
      return "GIFT";
    case 2:
    }
    return "WISH";
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.RequestType
 * JD-Core Version:    0.6.0
 */