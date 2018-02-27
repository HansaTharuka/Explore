package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Map;

class d
  implements DataLayer.b
{
  private final Context lM;

  public d(Context paramContext)
  {
    this.lM = paramContext;
  }

  public void C(Map<String, Object> paramMap)
  {
    Object localObject1 = paramMap.get("gtm.url");
    Object localObject3;
    if (localObject1 == null)
    {
      localObject3 = paramMap.get("gtm");
      if ((localObject3 == null) || (!(localObject3 instanceof Map)));
    }
    for (Object localObject2 = ((Map)localObject3).get("url"); ; localObject2 = localObject1)
    {
      if ((localObject2 == null) || (!(localObject2 instanceof String)));
      String str;
      do
      {
        return;
        str = Uri.parse((String)localObject2).getQueryParameter("referrer");
      }
      while (str == null);
      ay.f(this.lM, str);
      return;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.d
 * JD-Core Version:    0.6.0
 */