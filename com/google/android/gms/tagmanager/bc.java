package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.d.a;
import java.util.Locale;
import java.util.Map;

class bc extends aj
{
  private static final String ID = a.N.toString();

  public bc()
  {
    super(ID, new String[0]);
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    Locale localLocale = Locale.getDefault();
    if (localLocale == null)
      return di.rb();
    String str = localLocale.getLanguage();
    if (str == null)
      return di.rb();
    return di.u(str.toLowerCase());
  }

  public boolean pe()
  {
    return false;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.bc
 * JD-Core Version:    0.6.0
 */