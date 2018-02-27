package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class ap
{
  private final long Bv;
  private final long Bw;
  private String By;
  private final long arw;

  ap(long paramLong1, long paramLong2, long paramLong3)
  {
    this.Bv = paramLong1;
    this.Bw = paramLong2;
    this.arw = paramLong3;
  }

  void ak(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString.trim())))
      return;
    this.By = paramString;
  }

  long fb()
  {
    return this.Bv;
  }

  long pK()
  {
    return this.arw;
  }

  String pL()
  {
    return this.By;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ap
 * JD-Core Version:    0.6.0
 */