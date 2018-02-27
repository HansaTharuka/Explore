package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

public final class jc extends kj<a, Drawable>
{
  public jc()
  {
    super(10);
  }

  public static final class a
  {
    public final int Mt;
    public final int Mu;

    public a(int paramInt1, int paramInt2)
    {
      this.Mt = paramInt1;
      this.Mu = paramInt2;
    }

    public boolean equals(Object paramObject)
    {
      int i = 1;
      if (!(paramObject instanceof a))
        i = 0;
      a locala;
      do
      {
        do
          return i;
        while (this == paramObject);
        locala = (a)paramObject;
      }
      while ((locala.Mt == this.Mt) && (locala.Mu == this.Mu));
      return false;
    }

    public int hashCode()
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(this.Mt);
      arrayOfObject[1] = Integer.valueOf(this.Mu);
      return jv.hashCode(arrayOfObject);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jc
 * JD-Core Version:    0.6.0
 */