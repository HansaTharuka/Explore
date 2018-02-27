package com.google.android.gms.tagmanager;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.CampaignTrackingService;

public final class InstallReferrerService extends IntentService
{
  CampaignTrackingService arF;
  Context arG;

  public InstallReferrerService()
  {
    super("InstallReferrerService");
  }

  public InstallReferrerService(String paramString)
  {
    super(paramString);
  }

  private void a(Context paramContext, Intent paramIntent)
  {
    if (this.arF == null)
      this.arF = new CampaignTrackingService();
    this.arF.processIntent(paramContext, paramIntent);
  }

  protected void onHandleIntent(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("referrer");
    if (this.arG != null);
    for (Context localContext = this.arG; ; localContext = getApplicationContext())
    {
      ay.d(localContext, str);
      a(localContext, paramIntent);
      return;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.InstallReferrerService
 * JD-Core Version:    0.6.0
 */