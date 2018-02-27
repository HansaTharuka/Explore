package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Log;

public class is
{
  private static boolean HN = false;
  private boolean HO;
  private boolean HP;
  private String HQ;
  protected final String mTag;

  public is(String paramString)
  {
    this(paramString, go());
  }

  public is(String paramString, boolean paramBoolean)
  {
    this.mTag = paramString;
    this.HO = paramBoolean;
    this.HP = false;
  }

  public static boolean go()
  {
    return HN;
  }

  public void a(String paramString, Object[] paramArrayOfObject)
  {
    if (gn())
      Log.v(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void a(Throwable paramThrowable, String paramString, Object[] paramArrayOfObject)
  {
    if ((gm()) || (HN))
      Log.d(this.mTag, e(paramString, paramArrayOfObject), paramThrowable);
  }

  public void aK(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    for (String str = null; ; str = String.format("[%s] ", new Object[] { paramString }))
    {
      this.HQ = str;
      return;
    }
  }

  public void b(String paramString, Object[] paramArrayOfObject)
  {
    if ((gm()) || (HN))
      Log.d(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void c(String paramString, Object[] paramArrayOfObject)
  {
    Log.i(this.mTag, e(paramString, paramArrayOfObject));
  }

  public void d(String paramString, Object[] paramArrayOfObject)
  {
    Log.w(this.mTag, e(paramString, paramArrayOfObject));
  }

  protected String e(String paramString, Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject.length == 0);
    while (true)
    {
      if (!TextUtils.isEmpty(this.HQ))
        paramString = this.HQ + paramString;
      return paramString;
      paramString = String.format(paramString, paramArrayOfObject);
    }
  }

  public boolean gm()
  {
    return this.HO;
  }

  public boolean gn()
  {
    return this.HP;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.is
 * JD-Core Version:    0.6.0
 */