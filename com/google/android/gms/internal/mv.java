package com.google.android.gms.internal;

import java.io.IOException;

public abstract interface mv
{
  public static final class a extends qq<a>
  {
    public a[] afu;

    public a()
    {
      mW();
    }

    public void a(qp paramqp)
      throws IOException
    {
      if ((this.afu != null) && (this.afu.length > 0))
        for (int i = 0; i < this.afu.length; i++)
        {
          a locala = this.afu[i];
          if (locala == null)
            continue;
          paramqp.a(1, locala);
        }
      super.a(paramqp);
    }

    protected int c()
    {
      int i = super.c();
      if ((this.afu != null) && (this.afu.length > 0))
        for (int j = 0; j < this.afu.length; j++)
        {
          a locala = this.afu[j];
          if (locala == null)
            continue;
          i += qp.c(1, locala);
        }
      return i;
    }

    public boolean equals(Object paramObject)
    {
      int i;
      if (paramObject == this)
        i = 1;
      a locala;
      boolean bool2;
      do
      {
        boolean bool1;
        do
        {
          return i;
          bool1 = paramObject instanceof a;
          i = 0;
        }
        while (!bool1);
        locala = (a)paramObject;
        bool2 = qu.equals(this.afu, locala.afu);
        i = 0;
      }
      while (!bool2);
      return a(locala);
    }

    public int hashCode()
    {
      return 31 * (527 + qu.hashCode(this.afu)) + rQ();
    }

    public a mW()
    {
      this.afu = a.mX();
      this.ayW = null;
      this.azh = -1;
      return this;
    }

    public a n(qo paramqo)
      throws IOException
    {
      while (true)
      {
        int i = paramqo.rz();
        switch (i)
        {
        default:
          if (a(paramqo, i))
            continue;
        case 0:
          return this;
        case 10:
        }
        int j = qz.b(paramqo, 10);
        if (this.afu == null);
        a[] arrayOfa;
        for (int k = 0; ; k = this.afu.length)
        {
          arrayOfa = new a[j + k];
          if (k != 0)
            System.arraycopy(this.afu, 0, arrayOfa, 0, k);
          while (k < -1 + arrayOfa.length)
          {
            arrayOfa[k] = new a();
            paramqo.a(arrayOfa[k]);
            paramqo.rz();
            k++;
          }
        }
        arrayOfa[k] = new a();
        paramqo.a(arrayOfa[k]);
        this.afu = arrayOfa;
      }
    }

    public static final class a extends qq<a>
    {
      private static volatile a[] afv;
      public String afw;
      public String afx;
      public int viewId;

      public a()
      {
        mY();
      }

      public static a[] mX()
      {
        if (afv == null);
        synchronized (qu.azg)
        {
          if (afv == null)
            afv = new a[0];
          return afv;
        }
      }

      public void a(qp paramqp)
        throws IOException
      {
        if (!this.afw.equals(""))
          paramqp.b(1, this.afw);
        if (!this.afx.equals(""))
          paramqp.b(2, this.afx);
        if (this.viewId != 0)
          paramqp.t(3, this.viewId);
        super.a(paramqp);
      }

      protected int c()
      {
        int i = super.c();
        if (!this.afw.equals(""))
          i += qp.j(1, this.afw);
        if (!this.afx.equals(""))
          i += qp.j(2, this.afx);
        if (this.viewId != 0)
          i += qp.v(3, this.viewId);
        return i;
      }

      public boolean equals(Object paramObject)
      {
        int i;
        if (paramObject == this)
          i = 1;
        a locala;
        label47: String str1;
        do
        {
          String str2;
          do
          {
            boolean bool;
            do
            {
              return i;
              bool = paramObject instanceof a;
              i = 0;
            }
            while (!bool);
            locala = (a)paramObject;
            if (this.afw != null)
              break;
            str2 = locala.afw;
            i = 0;
          }
          while (str2 != null);
          if (this.afx != null)
            break label114;
          str1 = locala.afx;
          i = 0;
        }
        while (str1 != null);
        label114: 
        do
        {
          int j = this.viewId;
          int k = locala.viewId;
          i = 0;
          if (j != k)
            break;
          return a(locala);
          if (this.afw.equals(locala.afw))
            break label47;
          return false;
        }
        while (this.afx.equals(locala.afx));
        return false;
      }

      public int hashCode()
      {
        int i;
        int j;
        int k;
        if (this.afw == null)
        {
          i = 0;
          j = 31 * (i + 527);
          String str = this.afx;
          k = 0;
          if (str != null)
            break label62;
        }
        while (true)
        {
          return 31 * (31 * (j + k) + this.viewId) + rQ();
          i = this.afw.hashCode();
          break;
          label62: k = this.afx.hashCode();
        }
      }

      public a mY()
      {
        this.afw = "";
        this.afx = "";
        this.viewId = 0;
        this.ayW = null;
        this.azh = -1;
        return this;
      }

      public a o(qo paramqo)
        throws IOException
      {
        while (true)
        {
          int i = paramqo.rz();
          switch (i)
          {
          default:
            if (a(paramqo, i))
              continue;
          case 0:
            return this;
          case 10:
            this.afw = paramqo.readString();
            break;
          case 18:
            this.afx = paramqo.readString();
            break;
          case 24:
          }
          this.viewId = paramqo.rC();
        }
      }
    }
  }

  public static final class b extends qq<b>
  {
    private static volatile b[] afy;
    public mv.d afz;
    public String name;

    public b()
    {
      na();
    }

    public static b[] mZ()
    {
      if (afy == null);
      synchronized (qu.azg)
      {
        if (afy == null)
          afy = new b[0];
        return afy;
      }
    }

    public void a(qp paramqp)
      throws IOException
    {
      if (!this.name.equals(""))
        paramqp.b(1, this.name);
      if (this.afz != null)
        paramqp.a(2, this.afz);
      super.a(paramqp);
    }

    protected int c()
    {
      int i = super.c();
      if (!this.name.equals(""))
        i += qp.j(1, this.name);
      if (this.afz != null)
        i += qp.c(2, this.afz);
      return i;
    }

    public boolean equals(Object paramObject)
    {
      int i;
      if (paramObject == this)
        i = 1;
      b localb;
      mv.d locald;
      do
      {
        String str;
        do
        {
          boolean bool;
          do
          {
            return i;
            bool = paramObject instanceof b;
            i = 0;
          }
          while (!bool);
          localb = (b)paramObject;
          if (this.name != null)
            break;
          str = localb.name;
          i = 0;
        }
        while (str != null);
        if (this.afz != null)
          break label92;
        locald = localb.afz;
        i = 0;
      }
      while (locald != null);
      label92: 
      do
      {
        return a(localb);
        if (this.name.equals(localb.name))
          break;
        return false;
      }
      while (this.afz.equals(localb.afz));
      return false;
    }

    public int hashCode()
    {
      int i;
      int j;
      int k;
      if (this.name == null)
      {
        i = 0;
        j = 31 * (i + 527);
        mv.d locald = this.afz;
        k = 0;
        if (locald != null)
          break label54;
      }
      while (true)
      {
        return 31 * (j + k) + rQ();
        i = this.name.hashCode();
        break;
        label54: k = this.afz.hashCode();
      }
    }

    public b na()
    {
      this.name = "";
      this.afz = null;
      this.ayW = null;
      this.azh = -1;
      return this;
    }

    public b p(qo paramqo)
      throws IOException
    {
      while (true)
      {
        int i = paramqo.rz();
        switch (i)
        {
        default:
          if (a(paramqo, i))
            continue;
        case 0:
          return this;
        case 10:
          this.name = paramqo.readString();
          break;
        case 18:
        }
        if (this.afz == null)
          this.afz = new mv.d();
        paramqo.a(this.afz);
      }
    }
  }

  public static final class c extends qq<c>
  {
    public mv.b[] afA;
    public String type;

    public c()
    {
      nb();
    }

    public void a(qp paramqp)
      throws IOException
    {
      if (!this.type.equals(""))
        paramqp.b(1, this.type);
      if ((this.afA != null) && (this.afA.length > 0))
        for (int i = 0; i < this.afA.length; i++)
        {
          mv.b localb = this.afA[i];
          if (localb == null)
            continue;
          paramqp.a(2, localb);
        }
      super.a(paramqp);
    }

    protected int c()
    {
      int i = super.c();
      if (!this.type.equals(""))
        i += qp.j(1, this.type);
      if ((this.afA != null) && (this.afA.length > 0))
      {
        int j = i;
        for (int k = 0; k < this.afA.length; k++)
        {
          mv.b localb = this.afA[k];
          if (localb == null)
            continue;
          j += qp.c(2, localb);
        }
        i = j;
      }
      return i;
    }

    public boolean equals(Object paramObject)
    {
      int i;
      if (paramObject == this)
        i = 1;
      c localc;
      String str;
      do
      {
        boolean bool1;
        do
        {
          return i;
          bool1 = paramObject instanceof c;
          i = 0;
        }
        while (!bool1);
        localc = (c)paramObject;
        if (this.type != null)
          break;
        str = localc.type;
        i = 0;
      }
      while (str != null);
      do
      {
        boolean bool2 = qu.equals(this.afA, localc.afA);
        i = 0;
        if (!bool2)
          break;
        return a(localc);
      }
      while (this.type.equals(localc.type));
      return false;
    }

    public int hashCode()
    {
      if (this.type == null);
      for (int i = 0; ; i = this.type.hashCode())
        return 31 * (31 * (i + 527) + qu.hashCode(this.afA)) + rQ();
    }

    public c nb()
    {
      this.type = "";
      this.afA = mv.b.mZ();
      this.ayW = null;
      this.azh = -1;
      return this;
    }

    public c q(qo paramqo)
      throws IOException
    {
      while (true)
      {
        int i = paramqo.rz();
        switch (i)
        {
        default:
          if (a(paramqo, i))
            continue;
        case 0:
          return this;
        case 10:
          this.type = paramqo.readString();
          break;
        case 18:
        }
        int j = qz.b(paramqo, 18);
        if (this.afA == null);
        mv.b[] arrayOfb;
        for (int k = 0; ; k = this.afA.length)
        {
          arrayOfb = new mv.b[j + k];
          if (k != 0)
            System.arraycopy(this.afA, 0, arrayOfb, 0, k);
          while (k < -1 + arrayOfb.length)
          {
            arrayOfb[k] = new mv.b();
            paramqo.a(arrayOfb[k]);
            paramqo.rz();
            k++;
          }
        }
        arrayOfb[k] = new mv.b();
        paramqo.a(arrayOfb[k]);
        this.afA = arrayOfb;
      }
    }
  }

  public static final class d extends qq<d>
  {
    public String NJ;
    public boolean afB;
    public long afC;
    public double afD;
    public mv.c afE;

    public d()
    {
      nc();
    }

    public void a(qp paramqp)
      throws IOException
    {
      if (this.afB)
        paramqp.b(1, this.afB);
      if (!this.NJ.equals(""))
        paramqp.b(2, this.NJ);
      if (this.afC != 0L)
        paramqp.b(3, this.afC);
      if (Double.doubleToLongBits(this.afD) != Double.doubleToLongBits(0.0D))
        paramqp.a(4, this.afD);
      if (this.afE != null)
        paramqp.a(5, this.afE);
      super.a(paramqp);
    }

    protected int c()
    {
      int i = super.c();
      if (this.afB)
        i += qp.c(1, this.afB);
      if (!this.NJ.equals(""))
        i += qp.j(2, this.NJ);
      if (this.afC != 0L)
        i += qp.d(3, this.afC);
      if (Double.doubleToLongBits(this.afD) != Double.doubleToLongBits(0.0D))
        i += qp.b(4, this.afD);
      if (this.afE != null)
        i += qp.c(5, this.afE);
      return i;
    }

    public boolean equals(Object paramObject)
    {
      int i;
      if (paramObject == this)
        i = 1;
      d locald;
      mv.c localc;
      do
      {
        boolean bool5;
        do
        {
          boolean bool4;
          do
          {
            String str;
            do
            {
              boolean bool2;
              boolean bool3;
              do
              {
                boolean bool1;
                do
                {
                  return i;
                  bool1 = paramObject instanceof d;
                  i = 0;
                }
                while (!bool1);
                locald = (d)paramObject;
                bool2 = this.afB;
                bool3 = locald.afB;
                i = 0;
              }
              while (bool2 != bool3);
              if (this.NJ != null)
                break;
              str = locald.NJ;
              i = 0;
            }
            while (str != null);
            bool4 = this.afC < locald.afC;
            i = 0;
          }
          while (bool4);
          bool5 = Double.doubleToLongBits(this.afD) < Double.doubleToLongBits(locald.afD);
          i = 0;
        }
        while (bool5);
        if (this.afE != null)
          break label158;
        localc = locald.afE;
        i = 0;
      }
      while (localc != null);
      label158: 
      do
      {
        return a(locald);
        if (this.NJ.equals(locald.NJ))
          break;
        return false;
      }
      while (this.afE.equals(locald.afE));
      return false;
    }

    public int hashCode()
    {
      int i;
      int k;
      label29: int n;
      int i1;
      if (this.afB)
      {
        i = 1231;
        int j = 31 * (i + 527);
        if (this.NJ != null)
          break label115;
        k = 0;
        int m = 31 * (k + j) + (int)(this.afC ^ this.afC >>> 32);
        long l = Double.doubleToLongBits(this.afD);
        n = 31 * (m * 31 + (int)(l ^ l >>> 32));
        mv.c localc = this.afE;
        i1 = 0;
        if (localc != null)
          break label126;
      }
      while (true)
      {
        return 31 * (n + i1) + rQ();
        i = 1237;
        break;
        label115: k = this.NJ.hashCode();
        break label29;
        label126: i1 = this.afE.hashCode();
      }
    }

    public d nc()
    {
      this.afB = false;
      this.NJ = "";
      this.afC = 0L;
      this.afD = 0.0D;
      this.afE = null;
      this.ayW = null;
      this.azh = -1;
      return this;
    }

    public d r(qo paramqo)
      throws IOException
    {
      while (true)
      {
        int i = paramqo.rz();
        switch (i)
        {
        default:
          if (a(paramqo, i))
            continue;
        case 0:
          return this;
        case 8:
          this.afB = paramqo.rD();
          break;
        case 18:
          this.NJ = paramqo.readString();
          break;
        case 24:
          this.afC = paramqo.rB();
          break;
        case 33:
          this.afD = paramqo.readDouble();
          break;
        case 42:
        }
        if (this.afE == null)
          this.afE = new mv.c();
        paramqo.a(this.afE);
      }
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mv
 * JD-Core Version:    0.6.0
 */