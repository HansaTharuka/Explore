package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import org.json.JSONObject;

@ey
public class aj
  implements ah
{
  private final gu mo;

  public aj(Context paramContext, gs paramgs)
  {
    this.mo = gu.a(paramContext, new ay(), false, false, null, paramgs);
  }

  private void runOnUiThread(Runnable paramRunnable)
  {
    if (gq.dB())
    {
      paramRunnable.run();
      return;
    }
    gq.wR.post(paramRunnable);
  }

  public void a(ah.a parama)
  {
    this.mo.dD().a(new gv.a(parama)
    {
      public void a(gu paramgu)
      {
        this.no.aR();
      }
    });
  }

  public void a(t paramt, ds paramds, cb paramcb, dv paramdv, boolean paramBoolean, ce paramce)
  {
    this.mo.dD().a(paramt, paramds, paramcb, paramdv, paramBoolean, paramce, new v(false));
  }

  public void a(String paramString, cd paramcd)
  {
    this.mo.dD().a(paramString, paramcd);
  }

  public void a(String paramString, JSONObject paramJSONObject)
  {
    runOnUiThread(new Runnable(paramString, paramJSONObject)
    {
      public void run()
      {
        aj.a(aj.this).a(this.nl, this.nm);
      }
    });
  }

  public void destroy()
  {
    this.mo.destroy();
  }

  public void f(String paramString)
  {
    runOnUiThread(new Runnable(paramString)
    {
      public void run()
      {
        aj.a(aj.this).loadUrl(this.ni);
      }
    });
  }

  public void g(String paramString)
  {
    this.mo.dD().a(paramString, null);
  }

  public void pause()
  {
    gi.a(this.mo);
  }

  public void resume()
  {
    gi.b(this.mo);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.aj
 * JD-Core Version:    0.6.0
 */