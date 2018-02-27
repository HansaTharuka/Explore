package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.internal.jx;

public abstract class g<T>
{
  private final String TI;
  private T TJ;

  protected g(String paramString)
  {
    this.TI = paramString;
  }

  protected final T L(Context paramContext)
    throws g.a
  {
    ClassLoader localClassLoader;
    if (this.TJ == null)
    {
      jx.i(paramContext);
      Context localContext = GooglePlayServicesUtil.getRemoteContext(paramContext);
      if (localContext == null)
        throw new a("Could not get remote context.");
      localClassLoader = localContext.getClassLoader();
    }
    try
    {
      this.TJ = d((IBinder)localClassLoader.loadClass(this.TI).newInstance());
      return this.TJ;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new a("Could not load creator class.", localClassNotFoundException);
    }
    catch (InstantiationException localInstantiationException)
    {
      throw new a("Could not instantiate creator.", localInstantiationException);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
    }
    throw new a("Could not access creator.", localIllegalAccessException);
  }

  protected abstract T d(IBinder paramIBinder);

  public static class a extends Exception
  {
    public a(String paramString)
    {
      super();
    }

    public a(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.g
 * JD-Core Version:    0.6.0
 */