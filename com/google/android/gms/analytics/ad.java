package com.google.android.gms.analytics;

class ad
  implements ah
{
  private final long BF;
  private final int BG;
  private double BH;
  private long BI;
  private final Object BJ = new Object();
  private final String BK;

  public ad(int paramInt, long paramLong, String paramString)
  {
    this.BG = paramInt;
    this.BH = this.BG;
    this.BF = paramLong;
    this.BK = paramString;
  }

  public ad(String paramString)
  {
    this(60, 2000L, paramString);
  }

  public boolean fe()
  {
    synchronized (this.BJ)
    {
      long l = System.currentTimeMillis();
      if (this.BH < this.BG)
      {
        double d = (l - this.BI) / this.BF;
        if (d > 0.0D)
          this.BH = Math.min(this.BG, d + this.BH);
      }
      this.BI = l;
      if (this.BH >= 1.0D)
      {
        this.BH -= 1.0D;
        return true;
      }
      ae.W("Excessive " + this.BK + " detected; call ignored.");
      return false;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.ad
 * JD-Core Version:    0.6.0
 */