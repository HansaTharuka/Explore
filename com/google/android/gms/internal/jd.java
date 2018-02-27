package com.google.android.gms.internal;

import android.accounts.Account;
import android.text.TextUtils;

public class jd extends jq.a
{
  private Account CR;

  public jd(Account paramAccount)
  {
    this.CR = paramAccount;
  }

  public static jd aT(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    for (Account localAccount = null; ; localAccount = new Account(paramString, "com.google"))
      return new jd(localAccount);
  }

  public Account hk()
  {
    return this.CR;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jd
 * JD-Core Version:    0.6.0
 */