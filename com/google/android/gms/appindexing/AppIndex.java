package com.google.android.gms.appindexing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.internal.hc;
import com.google.android.gms.internal.hz;

public final class AppIndex
{
  public static final Api<Api.ApiOptions.NoOptions> API = hc.CI;
  public static final Api<Api.ApiOptions.NoOptions> APP_INDEX_API = hc.CI;
  public static final AppIndexApi AppIndexApi = new hz();
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appindexing.AppIndex
 * JD-Core Version:    0.6.0
 */