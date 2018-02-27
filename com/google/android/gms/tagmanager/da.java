package com.google.android.gms.tagmanager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class da<K, V>
  implements k<K, V>
{
  private final Map<K, V> atM = new HashMap();
  private final int atN;
  private final l.a<K, V> atO;
  private int atP;

  da(int paramInt, l.a<K, V> parama)
  {
    this.atN = paramInt;
    this.atO = parama;
  }

  public void e(K paramK, V paramV)
  {
    monitorenter;
    if ((paramK == null) || (paramV == null))
      try
      {
        throw new NullPointerException("key == null || value == null");
      }
      finally
      {
        monitorexit;
      }
    this.atP += this.atO.sizeOf(paramK, paramV);
    if (this.atP > this.atN)
    {
      Iterator localIterator = this.atM.entrySet().iterator();
      do
      {
        if (!localIterator.hasNext())
          break;
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        this.atP -= this.atO.sizeOf(localEntry.getKey(), localEntry.getValue());
        localIterator.remove();
      }
      while (this.atP > this.atN);
    }
    this.atM.put(paramK, paramV);
    monitorexit;
  }

  public V get(K paramK)
  {
    monitorenter;
    try
    {
      Object localObject2 = this.atM.get(paramK);
      monitorexit;
      return localObject2;
    }
    finally
    {
      localObject1 = finally;
      monitorexit;
    }
    throw localObject1;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.da
 * JD-Core Version:    0.6.0
 */