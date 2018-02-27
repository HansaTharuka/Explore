package com.google.android.gms.analytics;

import android.os.Build.VERSION;
import java.io.File;

public class t
{
  public static boolean ag(String paramString)
  {
    if (version() < 9)
      return false;
    File localFile = new File(paramString);
    localFile.setReadable(false, false);
    localFile.setWritable(false, false);
    localFile.setReadable(true, true);
    localFile.setWritable(true, true);
    return true;
  }

  public static int version()
  {
    try
    {
      int i = Integer.parseInt(Build.VERSION.SDK);
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      ae.T("Invalid version number: " + Build.VERSION.SDK);
    }
    return 0;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.t
 * JD-Core Version:    0.6.0
 */