package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

final class qy
{
  final byte[] azi;
  final int tag;

  qy(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.azi = paramArrayOfByte;
  }

  void a(qp paramqp)
    throws IOException
  {
    paramqp.hd(this.tag);
    paramqp.t(this.azi);
  }

  int c()
  {
    return 0 + qp.he(this.tag) + this.azi.length;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    qy localqy;
    do
    {
      return true;
      if (!(paramObject instanceof qy))
        return false;
      localqy = (qy)paramObject;
    }
    while ((this.tag == localqy.tag) && (Arrays.equals(this.azi, localqy.azi)));
    return false;
  }

  public int hashCode()
  {
    return 31 * (527 + this.tag) + Arrays.hashCode(this.azi);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qy
 * JD-Core Version:    0.6.0
 */