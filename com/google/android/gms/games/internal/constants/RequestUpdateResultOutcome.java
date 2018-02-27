package com.google.android.gms.games.internal.constants;

public final class RequestUpdateResultOutcome
{
  public static boolean isValid(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 0:
    case 1:
    case 2:
    case 3:
    }
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.constants.RequestUpdateResultOutcome
 * JD-Core Version:    0.6.0
 */