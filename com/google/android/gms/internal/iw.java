package com.google.android.gms.internal;

import android.os.SystemClock;
import org.json.JSONObject;

public final class iw
{
  private static final is Hh = new is("RequestTracker");
  public static final Object Ip = new Object();
  private long Il;
  private long Im;
  private long In;
  private iv Io;

  public iw(long paramLong)
  {
    this.Il = paramLong;
    this.Im = -1L;
    this.In = 0L;
  }

  private void gq()
  {
    this.Im = -1L;
    this.Io = null;
    this.In = 0L;
  }

  public void a(long paramLong, iv paramiv)
  {
    synchronized (Ip)
    {
      iv localiv = this.Io;
      long l = this.Im;
      this.Im = paramLong;
      this.Io = paramiv;
      this.In = SystemClock.elapsedRealtime();
      if (localiv != null)
        localiv.n(l);
      return;
    }
  }

  public boolean b(long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    for (int i = 1; ; i = 0)
    {
      synchronized (Ip)
      {
        if ((this.Im != -1L) && (this.Im == paramLong))
        {
          is localis = Hh;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.Im);
          localis.b("request %d completed", arrayOfObject);
          localiv = this.Io;
          gq();
          if (localiv != null)
            localiv.a(paramLong, paramInt, paramJSONObject);
          return i;
        }
      }
      iv localiv = null;
    }
  }

  public void clear()
  {
    synchronized (Ip)
    {
      if (this.Im != -1L)
        gq();
      return;
    }
  }

  public boolean d(long paramLong, int paramInt)
  {
    return b(paramLong, paramInt, null);
  }

  public boolean e(long paramLong, int paramInt)
  {
    int i = 1;
    long l = 0L;
    while (true)
    {
      synchronized (Ip)
      {
        if ((this.Im != -1L) && (paramLong - this.In >= this.Il))
        {
          is localis = Hh;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = Long.valueOf(this.Im);
          localis.b("request %d timed out", arrayOfObject);
          l = this.Im;
          localiv = this.Io;
          gq();
          if (localiv == null)
            continue;
          localiv.a(l, paramInt, null);
          return i;
        }
      }
      iv localiv = null;
      i = 0;
    }
  }

  public boolean gr()
  {
    while (true)
    {
      synchronized (Ip)
      {
        if (this.Im != -1L)
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }

  public boolean p(long paramLong)
  {
    while (true)
    {
      synchronized (Ip)
      {
        if ((this.Im != -1L) && (this.Im == paramLong))
        {
          i = 1;
          return i;
        }
      }
      int i = 0;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iw
 * JD-Core Version:    0.6.0
 */