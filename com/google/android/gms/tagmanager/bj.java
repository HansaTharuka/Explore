package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.util.Map;

class bj extends aj
{
  private static final String ID = a.ai.toString();
  private static final String arp = b.bw.toString();

  public bj()
  {
    super(str, arrayOfString);
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    return di.u(di.j((d.a)paramMap.get(arp)).toLowerCase());
  }

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.bj
 * JD-Core Version:    0.6.0
 */