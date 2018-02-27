package com.google.android.gms.analytics;

import android.text.TextUtils;

public class ab
{
  private String Bu;
  private final long Bv;
  private final long Bw;
  private final String Bx;
  private String By;
  private String Bz = "https:";

  public ab(String paramString1, long paramLong1, long paramLong2, String paramString2)
  {
    this.Bu = paramString1;
    this.Bv = paramLong1;
    this.Bw = paramLong2;
    this.Bx = paramString2;
  }

  public void aj(String paramString)
  {
    this.Bu = paramString;
  }

  public void ak(String paramString)
  {
    if ((paramString == null) || (TextUtils.isEmpty(paramString.trim())));
    do
    {
      return;
      this.By = paramString;
    }
    while (!paramString.toLowerCase().startsWith("http:"));
    this.Bz = "http:";
  }

  public String fa()
  {
    return this.Bu;
  }

  public long fb()
  {
    return this.Bv;
  }

  public long fc()
  {
    return this.Bw;
  }

  public String fd()
  {
    return this.Bz;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.ab
 * JD-Core Version:    0.6.0
 */