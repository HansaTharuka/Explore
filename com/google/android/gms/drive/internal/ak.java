package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.qo;
import com.google.android.gms.internal.qp;
import com.google.android.gms.internal.qq;
import com.google.android.gms.internal.qv;
import com.google.android.gms.internal.qw;
import java.io.IOException;

public final class ak extends qq<ak>
{
  public String QG;
  public long QH;
  public long QI;
  public int versionCode;

  public ak()
  {
    iK();
  }

  public static ak g(byte[] paramArrayOfByte)
    throws qv
  {
    return (ak)qw.a(new ak(), paramArrayOfByte);
  }

  public void a(qp paramqp)
    throws IOException
  {
    paramqp.t(1, this.versionCode);
    paramqp.b(2, this.QG);
    paramqp.c(3, this.QH);
    paramqp.c(4, this.QI);
    super.a(paramqp);
  }

  protected int c()
  {
    return super.c() + qp.v(1, this.versionCode) + qp.j(2, this.QG) + qp.e(3, this.QH) + qp.e(4, this.QI);
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (paramObject == this)
      i = 1;
    ak localak;
    String str;
    do
    {
      int j;
      int k;
      do
      {
        boolean bool1;
        do
        {
          return i;
          bool1 = paramObject instanceof ak;
          i = 0;
        }
        while (!bool1);
        localak = (ak)paramObject;
        j = this.versionCode;
        k = localak.versionCode;
        i = 0;
      }
      while (j != k);
      if (this.QG != null)
        break;
      str = localak.QG;
      i = 0;
    }
    while (str != null);
    do
    {
      boolean bool2 = this.QH < localak.QH;
      i = 0;
      if (bool2)
        break;
      boolean bool3 = this.QI < localak.QI;
      i = 0;
      if (bool3)
        break;
      return a(localak);
    }
    while (this.QG.equals(localak.QG));
    return false;
  }

  public int hashCode()
  {
    int i = 31 * (527 + this.versionCode);
    if (this.QG == null);
    for (int j = 0; ; j = this.QG.hashCode())
      return 31 * (31 * (31 * (j + i) + (int)(this.QH ^ this.QH >>> 32)) + (int)(this.QI ^ this.QI >>> 32)) + rQ();
  }

  public ak iK()
  {
    this.versionCode = 1;
    this.QG = "";
    this.QH = -1L;
    this.QI = -1L;
    this.ayW = null;
    this.azh = -1;
    return this;
  }

  public ak m(qo paramqo)
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
        this.versionCode = paramqo.rC();
        break;
      case 18:
        this.QG = paramqo.readString();
        break;
      case 24:
        this.QH = paramqo.rF();
        break;
      case 32:
      }
      this.QI = paramqo.rF();
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.ak
 * JD-Core Version:    0.6.0
 */