package com.google.android.gms.plus.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.plus.PlusOneDummyView;

public final class g extends com.google.android.gms.dynamic.g<c>
{
  private static final g anP = new g();

  private g()
  {
    super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
  }

  public static View a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    if (paramString == null)
      try
      {
        throw new NullPointerException();
      }
      catch (Exception localException)
      {
        return new PlusOneDummyView(paramContext, paramInt1);
      }
    View localView = (View)e.f(((c)anP.L(paramContext)).a(e.k(paramContext), paramInt1, paramInt2, paramString, paramInt3));
    return localView;
  }

  protected c bO(IBinder paramIBinder)
  {
    return c.a.bL(paramIBinder);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.internal.g
 * JD-Core Version:    0.6.0
 */