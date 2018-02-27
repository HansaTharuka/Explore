package com.google.android.gms.tagmanager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class aw
  implements bm
{
  private HttpURLConnection arE;

  private InputStream a(HttpURLConnection paramHttpURLConnection)
    throws IOException
  {
    int i = paramHttpURLConnection.getResponseCode();
    if (i == 200)
      return paramHttpURLConnection.getInputStream();
    String str = "Bad response: " + i;
    if (i == 404)
      throw new FileNotFoundException(str);
    throw new IOException(str);
  }

  private void b(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null)
      paramHttpURLConnection.disconnect();
  }

  public InputStream cF(String paramString)
    throws IOException
  {
    this.arE = cG(paramString);
    return a(this.arE);
  }

  HttpURLConnection cG(String paramString)
    throws IOException
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString).openConnection();
    localHttpURLConnection.setReadTimeout(20000);
    localHttpURLConnection.setConnectTimeout(20000);
    return localHttpURLConnection;
  }

  public void close()
  {
    b(this.arE);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.aw
 * JD-Core Version:    0.6.0
 */