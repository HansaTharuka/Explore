package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Future;

@ey
public class ai
{
  protected ah a(Context paramContext, gs paramgs, gj<ah> paramgj)
  {
    aj localaj = new aj(paramContext, paramgs);
    localaj.a(new ah.a(paramgj, localaj)
    {
      public void aR()
      {
        this.nh.a(this.nk);
      }
    });
    return localaj;
  }

  public Future<ah> a(Context paramContext, gs paramgs, String paramString)
  {
    gj localgj = new gj();
    gq.wR.post(new Runnable(paramContext, paramgs, localgj, paramString)
    {
      public void run()
      {
        ai.this.a(this.nf, this.ng, this.nh).f(this.ni);
      }
    });
    return localgj;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ai
 * JD-Core Version:    0.6.0
 */