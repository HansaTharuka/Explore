package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.g;
import com.google.android.gms.dynamic.g.a;

public final class jy extends g<ju>
{
  private static final jy Nt = new jy();

  private jy()
  {
    super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
  }

  public static View b(Context paramContext, int paramInt1, int paramInt2)
    throws g.a
  {
    return Nt.c(paramContext, paramInt1, paramInt2);
  }

  private View c(Context paramContext, int paramInt1, int paramInt2)
    throws g.a
  {
    try
    {
      d locald = e.k(paramContext);
      View localView = (View)e.f(((ju)L(paramContext)).a(locald, paramInt1, paramInt2));
      return localView;
    }
    catch (Exception localException)
    {
    }
    throw new g.a("Could not get button with size " + paramInt1 + " and color " + paramInt2, localException);
  }

  public ju S(IBinder paramIBinder)
  {
    return ju.a.R(paramIBinder);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jy
 * JD-Core Version:    0.6.0
 */