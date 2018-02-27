package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class qt
{
  private qr<?, ?> azd;
  private Object aze;
  private List<qy> azf = new ArrayList();

  private byte[] toByteArray()
    throws IOException
  {
    byte[] arrayOfByte = new byte[c()];
    a(qp.q(arrayOfByte));
    return arrayOfByte;
  }

  void a(qp paramqp)
    throws IOException
  {
    if (this.aze != null)
      this.azd.a(this.aze, paramqp);
    while (true)
    {
      return;
      Iterator localIterator = this.azf.iterator();
      while (localIterator.hasNext())
        ((qy)localIterator.next()).a(paramqp);
    }
  }

  void a(qy paramqy)
  {
    this.azf.add(paramqy);
  }

  <T> T b(qr<?, T> paramqr)
  {
    if (this.aze != null)
    {
      if (this.azd != paramqr)
        throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
    }
    else
    {
      this.azd = paramqr;
      this.aze = paramqr.m(this.azf);
      this.azf = null;
    }
    return this.aze;
  }

  int c()
  {
    int i;
    if (this.aze != null)
      i = this.azd.B(this.aze);
    while (true)
    {
      return i;
      Iterator localIterator = this.azf.iterator();
      i = 0;
      while (localIterator.hasNext())
        i += ((qy)localIterator.next()).c();
    }
  }

  public boolean equals(Object paramObject)
  {
    int i;
    if (paramObject == this)
      i = 1;
    qt localqt;
    while (true)
    {
      return i;
      boolean bool1 = paramObject instanceof qt;
      i = 0;
      if (!bool1)
        continue;
      localqt = (qt)paramObject;
      if ((this.aze == null) || (localqt.aze == null))
        break;
      qr localqr1 = this.azd;
      qr localqr2 = localqt.azd;
      i = 0;
      if (localqr1 != localqr2)
        continue;
      if (!this.azd.ayX.isArray())
        return this.aze.equals(localqt.aze);
      if ((this.aze instanceof byte[]))
        return Arrays.equals((byte[])(byte[])this.aze, (byte[])(byte[])localqt.aze);
      if ((this.aze instanceof int[]))
        return Arrays.equals((int[])(int[])this.aze, (int[])(int[])localqt.aze);
      if ((this.aze instanceof long[]))
        return Arrays.equals((long[])(long[])this.aze, (long[])(long[])localqt.aze);
      if ((this.aze instanceof float[]))
        return Arrays.equals((float[])(float[])this.aze, (float[])(float[])localqt.aze);
      if ((this.aze instanceof double[]))
        return Arrays.equals((double[])(double[])this.aze, (double[])(double[])localqt.aze);
      if ((this.aze instanceof boolean[]))
        return Arrays.equals((boolean[])(boolean[])this.aze, (boolean[])(boolean[])localqt.aze);
      return Arrays.deepEquals((Object[])(Object[])this.aze, (Object[])(Object[])localqt.aze);
    }
    if ((this.azf != null) && (localqt.azf != null))
      return this.azf.equals(localqt.azf);
    try
    {
      boolean bool2 = Arrays.equals(toByteArray(), localqt.toByteArray());
      return bool2;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }

  public int hashCode()
  {
    try
    {
      int i = Arrays.hashCode(toByteArray());
      return i + 527;
    }
    catch (IOException localIOException)
    {
    }
    throw new IllegalStateException(localIOException);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.qt
 * JD-Core Version:    0.6.0
 */