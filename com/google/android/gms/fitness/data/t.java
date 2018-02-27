package com.google.android.gms.fitness.data;

import java.util.List;

public class t
{
  public static <T> int a(T paramT, List<T> paramList)
  {
    int i;
    if (paramT == null)
      i = -1;
    do
    {
      return i;
      i = paramList.indexOf(paramT);
    }
    while (i >= 0);
    paramList.add(paramT);
    return -1 + paramList.size();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.data.t
 * JD-Core Version:    0.6.0
 */