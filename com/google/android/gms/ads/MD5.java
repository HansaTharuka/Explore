package com.google.android.gms.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5
{
  private static final String TAG = "AdPlus MD5";

  public static final String calculate(String paramString)
  {
    if (paramString == null)
      return null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      byte[] arrayOfByte = localMessageDigest.digest();
      StringBuffer localStringBuffer = new StringBuffer();
      for (int i = 0; ; i++)
      {
        if (i >= arrayOfByte.length)
          return localStringBuffer.toString();
        String str = Integer.toHexString(0xFF & arrayOfByte[i]);
        if (str.length() < 2)
          str = "0" + str;
        localStringBuffer.append(str);
      }
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      L.e("AdPlus MD5", localNoSuchAlgorithmException.toString());
    }
    return null;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.MD5
 * JD-Core Version:    0.6.0
 */