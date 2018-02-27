package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@ey
public final class ba extends bf.a
{
  private final AppEventListener os;

  public ba(AppEventListener paramAppEventListener)
  {
    this.os = paramAppEventListener;
  }

  public void onAppEvent(String paramString1, String paramString2)
  {
    this.os.onAppEvent(paramString1, paramString2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ba
 * JD-Core Version:    0.6.0
 */