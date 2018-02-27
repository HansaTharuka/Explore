package com.google.android.gms.fitness;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a
{
  public static String bt(String paramString)
  {
    if (paramString.equals("https://www.googleapis.com/auth/fitness.activity.read"))
      paramString = "https://www.googleapis.com/auth/fitness.activity.write";
    do
    {
      return paramString;
      if (paramString.equals("https://www.googleapis.com/auth/fitness.location.read"))
        return "https://www.googleapis.com/auth/fitness.location.write";
    }
    while (!paramString.equals("https://www.googleapis.com/auth/fitness.body.read"));
    return "https://www.googleapis.com/auth/fitness.body.write";
  }

  public static String[] e(List<String> paramList)
  {
    HashSet localHashSet = new HashSet(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      String str1 = (String)localIterator.next();
      String str2 = bt(str1);
      if ((!str2.equals(str1)) && (paramList.contains(str2)))
        continue;
      localHashSet.add(str1);
    }
    return (String[])localHashSet.toArray(new String[localHashSet.size()]);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.a
 * JD-Core Version:    0.6.0
 */