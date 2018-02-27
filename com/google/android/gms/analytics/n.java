package com.google.android.gms.analytics;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

abstract class n<T extends m>
{
  Context mContext;
  a<T> yL;

  public n(Context paramContext, a<T> parama)
  {
    this.mContext = paramContext;
    this.yL = parama;
  }

  private T a(XmlResourceParser paramXmlResourceParser)
  {
    try
    {
      paramXmlResourceParser.next();
      int i = paramXmlResourceParser.getEventType();
      if (i != 1)
      {
        if (paramXmlResourceParser.getEventType() == 2)
        {
          str1 = paramXmlResourceParser.getName().toLowerCase();
          if (!str1.equals("screenname"))
            break label114;
          String str8 = paramXmlResourceParser.getAttributeValue(null, "name");
          String str9 = paramXmlResourceParser.nextText().trim();
          if ((!TextUtils.isEmpty(str8)) && (!TextUtils.isEmpty(str9)))
            this.yL.e(str8, str9);
        }
        while (true)
        {
          i = paramXmlResourceParser.next();
          break;
          label114: if (!str1.equals("string"))
            break label208;
          String str6 = paramXmlResourceParser.getAttributeValue(null, "name");
          String str7 = paramXmlResourceParser.nextText().trim();
          if ((TextUtils.isEmpty(str6)) || (str7 == null))
            continue;
          this.yL.f(str6, str7);
        }
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      while (true)
      {
        ae.T("Error parsing tracker configuration file: " + localXmlPullParserException);
        return this.yL.er();
        if (!str1.equals("bool"))
          break;
        String str4 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str5 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str4))
          continue;
        boolean bool2 = TextUtils.isEmpty(str5);
        if (bool2)
          continue;
        try
        {
          boolean bool3 = Boolean.parseBoolean(str5);
          this.yL.e(str4, bool3);
        }
        catch (NumberFormatException localNumberFormatException2)
        {
          ae.T("Error parsing bool configuration value: " + str5);
        }
      }
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        String str1;
        label208: ae.T("Error parsing tracker configuration file: " + localIOException);
        continue;
        if (!str1.equals("integer"))
          continue;
        String str2 = paramXmlResourceParser.getAttributeValue(null, "name");
        String str3 = paramXmlResourceParser.nextText().trim();
        if (TextUtils.isEmpty(str2))
          continue;
        boolean bool1 = TextUtils.isEmpty(str3);
        if (bool1)
          continue;
        try
        {
          int j = Integer.parseInt(str3);
          this.yL.c(str2, j);
        }
        catch (NumberFormatException localNumberFormatException1)
        {
          ae.T("Error parsing int configuration value: " + str3);
        }
      }
    }
  }

  public T x(int paramInt)
  {
    try
    {
      m localm = a(this.mContext.getResources().getXml(paramInt));
      return localm;
    }
    catch (Resources.NotFoundException localNotFoundException)
    {
      ae.W("inflate() called with unknown resourceId: " + localNotFoundException);
    }
    return null;
  }

  public static abstract interface a<U extends m>
  {
    public abstract void c(String paramString, int paramInt);

    public abstract void e(String paramString1, String paramString2);

    public abstract void e(String paramString, boolean paramBoolean);

    public abstract U er();

    public abstract void f(String paramString1, String paramString2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.analytics.n
 * JD-Core Version:    0.6.0
 */