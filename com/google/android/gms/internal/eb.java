package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.Method;

@ey
public class eb
{
  private final Context mContext;
  private Object sC;

  public eb(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public Bundle a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[5];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      arrayOfClass[4] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getBuyIntent", arrayOfClass);
      Object localObject = localClass.cast(this.sC);
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      arrayOfObject[3] = "inapp";
      arrayOfObject[4] = paramString3;
      Bundle localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      gr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }

  public int c(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[3];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      Method localMethod = localClass.getDeclaredMethod("consumePurchase", arrayOfClass);
      Object localObject = localClass.cast(this.sC);
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = paramString2;
      int i = ((Integer)localMethod.invoke(localObject, arrayOfObject)).intValue();
      return i;
    }
    catch (Exception localException)
    {
      gr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return 5;
  }

  public Bundle d(String paramString1, String paramString2)
  {
    try
    {
      Class localClass = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService");
      Class[] arrayOfClass = new Class[4];
      arrayOfClass[0] = Integer.TYPE;
      arrayOfClass[1] = String.class;
      arrayOfClass[2] = String.class;
      arrayOfClass[3] = String.class;
      Method localMethod = localClass.getDeclaredMethod("getPurchases", arrayOfClass);
      Object localObject = localClass.cast(this.sC);
      Object[] arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(3);
      arrayOfObject[1] = paramString1;
      arrayOfObject[2] = "inapp";
      arrayOfObject[3] = paramString2;
      Bundle localBundle = (Bundle)localMethod.invoke(localObject, arrayOfObject);
      return localBundle;
    }
    catch (Exception localException)
    {
      gr.d("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.", localException);
    }
    return null;
  }

  public void destroy()
  {
    this.sC = null;
  }

  public void t(IBinder paramIBinder)
  {
    try
    {
      this.sC = this.mContext.getClassLoader().loadClass("com.android.vending.billing.IInAppBillingService$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { paramIBinder });
      return;
    }
    catch (Exception localException)
    {
      gr.W("IInAppBillingService is not available, please add com.android.vending.billing.IInAppBillingService to project.");
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.eb
 * JD-Core Version:    0.6.0
 */