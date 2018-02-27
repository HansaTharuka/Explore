package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

@ey
public class ch
  implements cd
{
  static final Map<String, Integer> qb = new HashMap();

  static
  {
    qb.put("resize", Integer.valueOf(1));
    qb.put("playVideo", Integer.valueOf(2));
    qb.put("storePicture", Integer.valueOf(3));
    qb.put("createCalendarEvent", Integer.valueOf(4));
  }

  public void a(gu paramgu, Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("a");
    switch (((Integer)qb.get(str)).intValue())
    {
    case 2:
    default:
      gr.U("Unknown MRAID command called.");
      return;
    case 1:
      new di(paramgu, paramMap).execute();
      return;
    case 4:
      new dh(paramgu, paramMap).execute();
      return;
    case 3:
    }
    new dj(paramgu, paramMap).execute();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ch
 * JD-Core Version:    0.6.0
 */