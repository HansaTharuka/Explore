package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

class ay
{
  private static String arH;
  static Map<String, String> arI = new HashMap();

  static void cH(String paramString)
  {
    monitorenter;
    try
    {
      arH = paramString;
      return;
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static void d(Context paramContext, String paramString)
  {
    cz.a(paramContext, "gtm_install_referrer", "referrer", paramString);
    f(paramContext, paramString);
  }

  static String e(Context paramContext, String paramString)
  {
    if (arH == null)
      monitorenter;
    try
    {
      if (arH == null)
      {
        SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("gtm_install_referrer", 0);
        if (localSharedPreferences == null)
          break label51;
        arH = localSharedPreferences.getString("referrer", "");
      }
      while (true)
      {
        return w(arH, paramString);
        label51: arH = "";
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  static String f(Context paramContext, String paramString1, String paramString2)
  {
    String str = (String)arI.get(paramString1);
    SharedPreferences localSharedPreferences;
    if (str == null)
    {
      localSharedPreferences = paramContext.getSharedPreferences("gtm_click_referrers", 0);
      if (localSharedPreferences == null)
        break label59;
    }
    label59: for (str = localSharedPreferences.getString(paramString1, ""); ; str = "")
    {
      arI.put(paramString1, str);
      return w(str, paramString2);
    }
  }

  static void f(Context paramContext, String paramString)
  {
    String str = w(paramString, "conv");
    if ((str != null) && (str.length() > 0))
    {
      arI.put(str, paramString);
      cz.a(paramContext, "gtm_click_referrers", str, paramString);
    }
  }

  static String w(String paramString1, String paramString2)
  {
    if (paramString2 == null)
    {
      if (paramString1.length() > 0)
        return paramString1;
      return null;
    }
    return Uri.parse("http://hostname/?" + paramString1).getQueryParameter(paramString2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ay
 * JD-Core Version:    0.6.0
 */