package com.google.android.gms.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class ao
{
  private static MessageDigest nS = null;
  protected Object mH = new Object();

  protected MessageDigest bf()
  {
    while (true)
    {
      int i;
      synchronized (this.mH)
      {
        if (nS == null)
          continue;
        MessageDigest localMessageDigest2 = nS;
        return localMessageDigest2;
        i = 0;
        if (i >= 2);
      }
      try
      {
        nS = MessageDigest.getInstance("MD5");
        label38: i++;
        continue;
        MessageDigest localMessageDigest1 = nS;
        monitorexit;
        return localMessageDigest1;
        localObject2 = finally;
        monitorexit;
        throw localObject2;
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        break label38;
      }
    }
  }

  abstract byte[] l(String paramString);
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ao
 * JD-Core Version:    0.6.0
 */