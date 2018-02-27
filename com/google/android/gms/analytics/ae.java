package com.google.android.gms.analytics;

public class ae
{
  private static GoogleAnalytics BL;
  private static volatile boolean BM = false;
  private static Logger BN;

  public static void T(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.error(paramString);
  }

  public static void U(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.info(paramString);
  }

  public static void V(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.verbose(paramString);
  }

  public static void W(String paramString)
  {
    Logger localLogger = getLogger();
    if (localLogger != null)
      localLogger.warn(paramString);
  }

  public static boolean ff()
  {
    Logger localLogger = getLogger();
    int i = 0;
    if (localLogger != null)
    {
      int j = getLogger().getLogLevel();
      i = 0;
      if (j == 0)
        i = 1;
    }
    return i;
  }

  static Logger getLogger()
  {
    monitorenter;
    try
    {
      if (BM)
      {
        if (BN == null)
          BN = new p();
        Logger localLogger2 = BN;
        return localLogger2;
      }
      if (BL == null)
        BL = GoogleAnalytics.eY();
      if (BL != null)
      {
        Logger localLogger1 = BL.getLogger();
        return localLogger1;
      }
    }
    finally
    {
      monitorexit;
    }
    monitorexit;
    return null;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.ae
 * JD-Core Version:    0.6.0
 */