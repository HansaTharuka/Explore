package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebSettings;

@ey
public final class go
{
  public static void a(Context paramContext, WebSettings paramWebSettings)
  {
    gm.a(paramContext, paramWebSettings);
    paramWebSettings.setMediaPlaybackRequiresUserGesture(false);
  }

  public static String getDefaultUserAgent(Context paramContext)
  {
    return WebSettings.getDefaultUserAgent(paramContext);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.go
 * JD-Core Version:    0.6.0
 */