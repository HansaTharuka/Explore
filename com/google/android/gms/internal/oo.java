package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

public class oo
  implements op.a
{
  private final op amS;
  private boolean amT;

  public oo(Context paramContext, int paramInt)
  {
    this(paramContext, paramInt, null);
  }

  public oo(Context paramContext, int paramInt, String paramString)
  {
    this(paramContext, paramInt, paramString, null, true);
  }

  public oo(Context paramContext, int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.amS = new op(paramContext, paramInt, paramString1, paramString2, this, paramBoolean);
    this.amT = true;
  }

  private void om()
  {
    if (!this.amT)
      throw new IllegalStateException("Cannot reuse one-time logger after sending.");
  }

  public void a(String paramString, byte[] paramArrayOfByte, String[] paramArrayOfString)
  {
    om();
    this.amS.b(paramString, paramArrayOfByte, paramArrayOfString);
  }

  public void d(PendingIntent paramPendingIntent)
  {
    Log.w("OneTimePlayLogger", "logger connection failed: " + paramPendingIntent);
  }

  public void on()
  {
    this.amS.stop();
  }

  public void oo()
  {
    Log.w("OneTimePlayLogger", "logger connection failed");
  }

  public void send()
  {
    om();
    this.amS.start();
    this.amT = false;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.oo
 * JD-Core Version:    0.6.0
 */