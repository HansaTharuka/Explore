package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.jx;

public class Thing
{
  final Bundle DI;

  Thing(Bundle paramBundle)
  {
    this.DI = paramBundle;
  }

  public Bundle fI()
  {
    return this.DI;
  }

  public static class Builder
  {
    final Bundle DJ = new Bundle();

    public Thing build()
    {
      return new Thing(this.DJ);
    }

    public Builder put(String paramString, Thing paramThing)
    {
      jx.i(paramString);
      if (paramThing != null)
        this.DJ.putParcelable(paramString, paramThing.DI);
      return this;
    }

    public Builder put(String paramString1, String paramString2)
    {
      jx.i(paramString1);
      if (paramString2 != null)
        this.DJ.putString(paramString1, paramString2);
      return this;
    }

    public Builder setDescription(String paramString)
    {
      put("description", paramString);
      return this;
    }

    public Builder setId(String paramString)
    {
      if (paramString != null)
        put("id", paramString);
      return this;
    }

    public Builder setName(String paramString)
    {
      jx.i(paramString);
      put("name", paramString);
      return this;
    }

    public Builder setType(String paramString)
    {
      put("type", paramString);
      return this;
    }

    public Builder setUrl(Uri paramUri)
    {
      jx.i(paramUri);
      put("url", paramUri.toString());
      return this;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appindexing.Thing
 * JD-Core Version:    0.6.0
 */