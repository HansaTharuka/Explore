package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.d.a;
import java.util.Map;

class bl extends aj
{
  private static final String ID = a.af.toString();
  private final Context mContext;

  public bl(Context paramContext)
  {
    super(ID, new String[0]);
    this.mContext = paramContext;
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    String str = Y(this.mContext);
    if (str == null)
      return di.rb();
    return di.u(str);
  }

  protected String Y(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.bl
 * JD-Core Version:    0.6.0
 */