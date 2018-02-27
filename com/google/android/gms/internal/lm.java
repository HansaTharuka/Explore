package com.google.android.gms.internal;

import com.google.android.gms.common.api.Scope;

public class lm
{
  public static Scope[] d(String[] paramArrayOfString)
  {
    jx.b(paramArrayOfString, "scopeStrings can't be null.");
    Scope[] arrayOfScope = new Scope[paramArrayOfString.length];
    for (int i = 0; i < paramArrayOfString.length; i++)
      arrayOfScope[i] = new Scope(paramArrayOfString[i]);
    return arrayOfScope;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lm
 * JD-Core Version:    0.6.0
 */