package com.google.android.gms.drive.metadata.internal;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.a;

public class l extends a<String>
{
  public l(String paramString, int paramInt)
  {
    super(paramString, paramInt);
  }

  protected void a(Bundle paramBundle, String paramString)
  {
    paramBundle.putString(getName(), paramString);
  }

  protected String i(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    return paramDataHolder.c(getName(), paramInt1, paramInt2);
  }

  protected String p(Bundle paramBundle)
  {
    return paramBundle.getString(getName());
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.metadata.internal.l
 * JD-Core Version:    0.6.0
 */