package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;

class db
  implements ab
{
  private final String atQ;
  private final HttpClient atR;
  private a atS;
  private final Context atz;

  db(HttpClient paramHttpClient, Context paramContext, a parama)
  {
    this.atz = paramContext.getApplicationContext();
    this.atQ = a("GoogleTagManager", "4.00", Build.VERSION.RELEASE, c(Locale.getDefault()), Build.MODEL, Build.ID);
    this.atR = paramHttpClient;
    this.atS = parama;
  }

  // ERROR //
  private HttpEntityEnclosingRequest a(URL paramURL)
  {
    // Byte code:
    //   0: new 69	org/apache/http/message/BasicHttpEntityEnclosingRequest
    //   3: dup
    //   4: ldc 71
    //   6: aload_1
    //   7: invokevirtual 77	java/net/URL:toURI	()Ljava/net/URI;
    //   10: invokevirtual 83	java/net/URI:toString	()Ljava/lang/String;
    //   13: invokespecial 86	org/apache/http/message/BasicHttpEntityEnclosingRequest:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: astore_2
    //   17: aload_2
    //   18: ldc 88
    //   20: aload_0
    //   21: getfield 60	com/google/android/gms/tagmanager/db:atQ	Ljava/lang/String;
    //   24: invokeinterface 93 3 0
    //   29: aload_2
    //   30: areturn
    //   31: astore 4
    //   33: aconst_null
    //   34: astore_2
    //   35: aload 4
    //   37: astore_3
    //   38: new 95	java/lang/StringBuilder
    //   41: dup
    //   42: invokespecial 96	java/lang/StringBuilder:<init>	()V
    //   45: ldc 98
    //   47: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: aload_3
    //   51: invokevirtual 106	java/lang/Object:getClass	()Ljava/lang/Class;
    //   54: invokevirtual 111	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   57: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   60: invokevirtual 112	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   63: invokestatic 118	com/google/android/gms/tagmanager/bh:W	(Ljava/lang/String;)V
    //   66: aload_3
    //   67: invokevirtual 121	java/net/URISyntaxException:getMessage	()Ljava/lang/String;
    //   70: invokestatic 118	com/google/android/gms/tagmanager/bh:W	(Ljava/lang/String;)V
    //   73: aload_2
    //   74: areturn
    //   75: astore_3
    //   76: goto -38 -> 38
    //
    // Exception table:
    //   from	to	target	type
    //   0	17	31	java/net/URISyntaxException
    //   17	29	75	java/net/URISyntaxException
  }

  private void a(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    Header[] arrayOfHeader = paramHttpEntityEnclosingRequest.getAllHeaders();
    int i = arrayOfHeader.length;
    for (int j = 0; j < i; j++)
      localStringBuffer.append(arrayOfHeader[j].toString()).append("\n");
    localStringBuffer.append(paramHttpEntityEnclosingRequest.getRequestLine().toString()).append("\n");
    if (paramHttpEntityEnclosingRequest.getEntity() != null);
    try
    {
      InputStream localInputStream = paramHttpEntityEnclosingRequest.getEntity().getContent();
      if (localInputStream != null)
      {
        int k = localInputStream.available();
        if (k > 0)
        {
          byte[] arrayOfByte = new byte[k];
          localInputStream.read(arrayOfByte);
          localStringBuffer.append("POST:\n");
          localStringBuffer.append(new String(arrayOfByte)).append("\n");
        }
      }
      bh.V(localStringBuffer.toString());
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
        bh.V("Error Writing hit to log...");
    }
  }

  static String c(Locale paramLocale)
  {
    if (paramLocale == null);
    do
      return null;
    while ((paramLocale.getLanguage() == null) || (paramLocale.getLanguage().length() == 0));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLocale.getLanguage().toLowerCase());
    if ((paramLocale.getCountry() != null) && (paramLocale.getCountry().length() != 0))
      localStringBuilder.append("-").append(paramLocale.getCountry().toLowerCase());
    return localStringBuilder.toString();
  }

  String a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
  }

  URL d(ap paramap)
  {
    String str = paramap.pL();
    try
    {
      URL localURL = new URL(str);
      return localURL;
    }
    catch (MalformedURLException localMalformedURLException)
    {
      bh.T("Error trying to parse the GTM url.");
    }
    return null;
  }

  public boolean ea()
  {
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.atz.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
    {
      bh.V("...no network connectivity");
      return false;
    }
    return true;
  }

  public void k(List<ap> paramList)
  {
    int i = Math.min(paramList.size(), 40);
    int j = 1;
    int k = 0;
    ap localap;
    URL localURL;
    int m;
    if (k < i)
    {
      localap = (ap)paramList.get(k);
      localURL = d(localap);
      if (localURL == null)
      {
        bh.W("No destination: discarding hit.");
        this.atS.b(localap);
        m = j;
      }
    }
    while (true)
    {
      k++;
      j = m;
      break;
      HttpEntityEnclosingRequest localHttpEntityEnclosingRequest = a(localURL);
      if (localHttpEntityEnclosingRequest == null)
      {
        this.atS.b(localap);
        m = j;
        continue;
      }
      HttpHost localHttpHost = new HttpHost(localURL.getHost(), localURL.getPort(), localURL.getProtocol());
      localHttpEntityEnclosingRequest.addHeader("Host", localHttpHost.toHostString());
      a(localHttpEntityEnclosingRequest);
      if (j != 0);
      try
      {
        bo.aa(this.atz);
        j = 0;
        HttpResponse localHttpResponse = this.atR.execute(localHttpHost, localHttpEntityEnclosingRequest);
        int n = localHttpResponse.getStatusLine().getStatusCode();
        HttpEntity localHttpEntity = localHttpResponse.getEntity();
        if (localHttpEntity != null)
          localHttpEntity.consumeContent();
        if (n != 200)
        {
          bh.W("Bad response: " + localHttpResponse.getStatusLine().getStatusCode());
          this.atS.c(localap);
          break label367;
        }
        this.atS.a(localap);
      }
      catch (ClientProtocolException localClientProtocolException)
      {
        bh.W("ClientProtocolException sending hit; discarding hit...");
        this.atS.b(localap);
        m = j;
        continue;
      }
      catch (IOException localIOException)
      {
        bh.W("Exception sending hit: " + localIOException.getClass().getSimpleName());
        bh.W(localIOException.getMessage());
        this.atS.c(localap);
        m = j;
      }
      continue;
      return;
      label367: m = j;
    }
  }

  public static abstract interface a
  {
    public abstract void a(ap paramap);

    public abstract void b(ap paramap);

    public abstract void c(ap paramap);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.db
 * JD-Core Version:    0.6.0
 */