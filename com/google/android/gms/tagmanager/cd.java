package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

abstract class cd extends aj
{
  private static final String arp = b.bw.toString();
  private static final String ask = b.bx.toString();

  public cd(String paramString)
  {
    super(paramString, arrayOfString);
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    Iterator localIterator = paramMap.values().iterator();
    while (localIterator.hasNext())
      if ((d.a)localIterator.next() == di.rb())
        return di.u(Boolean.valueOf(false));
    d.a locala1 = (d.a)paramMap.get(arp);
    d.a locala2 = (d.a)paramMap.get(ask);
    if ((locala1 == null) || (locala2 == null));
    for (boolean bool = false; ; bool = a(locala1, locala2, paramMap))
      return di.u(Boolean.valueOf(bool));
  }

  protected abstract boolean a(d.a parama1, d.a parama2, Map<String, d.a> paramMap);

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cd
 * JD-Core Version:    0.6.0
 */