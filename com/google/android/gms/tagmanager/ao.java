package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.d.a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

class ao extends aj
{
  private static final String ID = a.ac.toString();
  private static final String arp = b.bw.toString();
  private static final String arr;
  private static final String arv = b.bn.toString();

  static
  {
    arr = b.de.toString();
  }

  public ao()
  {
    super(str, arrayOfString);
  }

  private byte[] d(String paramString, byte[] paramArrayOfByte)
    throws NoSuchAlgorithmException
  {
    MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
    localMessageDigest.update(paramArrayOfByte);
    return localMessageDigest.digest();
  }

  public d.a B(Map<String, d.a> paramMap)
  {
    d.a locala1 = (d.a)paramMap.get(arp);
    if ((locala1 == null) || (locala1 == di.rb()))
      return di.rb();
    String str1 = di.j(locala1);
    d.a locala2 = (d.a)paramMap.get(arv);
    String str2;
    if (locala2 == null)
      str2 = "MD5";
    while (true)
    {
      d.a locala3 = (d.a)paramMap.get(arr);
      String str3;
      label79: byte[] arrayOfByte;
      if (locala3 == null)
      {
        str3 = "text";
        if (!"text".equals(str3))
          break label134;
        arrayOfByte = str1.getBytes();
      }
      try
      {
        while (true)
        {
          d.a locala4 = di.u(j.d(d(str2, arrayOfByte)));
          return locala4;
          str2 = di.j(locala2);
          break;
          str3 = di.j(locala3);
          break label79;
          label134: if (!"base16".equals(str3))
            break label153;
          arrayOfByte = j.co(str1);
        }
        label153: bh.T("Hash: unknown input format: " + str3);
        return di.rb();
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        bh.T("Hash: unknown algorithm: " + str2);
      }
    }
    return di.rb();
  }

  public boolean pe()
  {
    return true;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.ao
 * JD-Core Version:    0.6.0
 */