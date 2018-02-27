package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.d.a;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

abstract class aj
{
  private final Set<String> art;
  private final String aru;

  public aj(String paramString, String[] paramArrayOfString)
  {
    this.aru = paramString;
    this.art = new HashSet(paramArrayOfString.length);
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      this.art.add(str);
    }
  }

  public abstract d.a B(Map<String, d.a> paramMap);

  boolean a(Set<String> paramSet)
  {
    return paramSet.containsAll(this.art);
  }

  public String pI()
  {
    return this.aru;
  }

  public Set<String> pJ()
  {
    return this.art;
  }

  public abstract boolean pe();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.aj
 * JD-Core Version:    0.6.0
 */