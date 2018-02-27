package com.google.android.gms.tagmanager;

import android.util.LruCache;

class bb<K, V>
  implements k<K, V>
{
  private LruCache<K, V> arR;

  bb(int paramInt, l.a<K, V> parama)
  {
    this.arR = new LruCache(paramInt, parama)
    {
      protected int sizeOf(K paramK, V paramV)
      {
        return this.arS.sizeOf(paramK, paramV);
      }
    };
  }

  public void e(K paramK, V paramV)
  {
    this.arR.put(paramK, paramV);
  }

  public V get(K paramK)
  {
    return this.arR.get(paramK);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.bb
 * JD-Core Version:    0.6.0
 */