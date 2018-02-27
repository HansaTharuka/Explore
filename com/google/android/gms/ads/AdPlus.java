package com.google.android.gms.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.provider.Settings.Secure;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

public class AdPlus
{
  private static final int DELAY_FROM_REQUEST = 59220;
  private static final long DELAY_FROM_RESHOW = 179220L;
  private static final int FIRST_LOAD_DELAY = 14997;
  private static final String TAG = "AdmobPlus";
  private static final int WIN_SIZE = -2;
  private AdRequest adRequest;
  private AdView adView;
  private String ad_bann_id;
  private String ad_interstitial_id;
  Context ctxt;
  private Handler handler;
  private InterstitialAd interstitialAd;
  private boolean is_closed = false;
  private Runnable reShowBannRun;
  private Runnable reloadBannRun;
  private Runnable reloadInterstRun;
  private boolean test = false;
  private String[] test_devices_id;
  private WindowManager windowManager;
  private FrameL windowView;
  private int x;
  private int y;

  public AdPlus(Context paramContext)
  {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = AdRequest.DEVICE_ID_EMULATOR;
    this.test_devices_id = arrayOfString;
    this.ad_bann_id = "ca-app-pub-3687861985613956/1097263028";
    this.ad_interstitial_id = "ca-app-pub-3687861985613956/4050729423";
    this.reloadBannRun = new Runnable()
    {
      public void run()
      {
        L.d("AdmobPlus", "reloadBannRun().run()");
        AdPlus.this.loadBanner();
      }
    };
    this.reShowBannRun = new Runnable()
    {
      public void run()
      {
        L.d("AdmobPlus", "reShowBannRun().run()");
        AdPlus.this.is_closed = false;
        AdPlus.this.adView.setVisibility(0);
      }
    };
    this.reloadInterstRun = new Runnable()
    {
      public void run()
      {
        L.d("AdmobPlus", "reloadInterstRun().run()");
        AdPlus.this.loadInterstitial();
      }
    };
    this.x = 0;
    this.y = 0;
    this.ctxt = paramContext;
    this.handler = new Handler();
    initRequest();
    initBann();
    this.handler.postDelayed(new Runnable()
    {
      public void run()
      {
        AdPlus.this.loadBanner();
      }
    }
    , 14997L);
    initInterstit();
    loadInterstitial();
  }

  private void createWindow()
  {
    WindowManager.LayoutParams localLayoutParams = new WindowManager.LayoutParams(-3, -3, 2002, 40, -3);
    localLayoutParams.gravity = 40;
    localLayoutParams.gravity = 40;
    this.windowView.setOnTouchListener(new View.OnTouchListener(localLayoutParams)
    {
      public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
      {
        AdPlus.this.x = ((int)paramMotionEvent.getX() + this.val$params.x - paramView.getWidth() / 2);
        AdPlus.this.y = ((int)paramMotionEvent.getY() + this.val$params.y - paramView.getHeight() / 2);
        Display localDisplay = AdPlus.this.windowManager.getDefaultDisplay();
        int i = localDisplay.getWidth() / 2;
        int j = localDisplay.getHeight() / 2;
        if (AdPlus.this.x > i)
          AdPlus.this.x = i;
        if (AdPlus.this.x < -i)
          AdPlus.this.x = (-i);
        if (AdPlus.this.y > j)
          AdPlus.this.y = j;
        if (AdPlus.this.y < -j)
          AdPlus.this.y = (-j);
        this.val$params.x = AdPlus.this.x;
        this.val$params.y = AdPlus.this.y;
        return false;
      }
    });
    this.windowManager.addView(this.windowView, localLayoutParams);
  }

  private void destroyWindow()
  {
    this.windowView.setOnTouchListener(null);
    this.windowManager.removeView(this.windowView);
  }

  private String getDescriptionFromError(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return "";
    case 0:
      return "internal error";
    case 1:
      return "invalid request";
    case 2:
      return "network error";
    case 3:
    }
    return "code no fill";
  }

  private void initBann()
  {
    this.windowManager = ((WindowManager)this.ctxt.getSystemService("window"));
    this.windowView = new FrameL(this.ctxt);
    this.adView = new AdView(this.ctxt);
    this.windowView.addView(this.adView);
    this.adView.setAdSize(AdSize.BANNER);
    this.adView.setAdUnitId(this.ad_bann_id);
    this.adView.setAdListener(new AdListener()
    {
      public void onAdClosed()
      {
        L.d("AdmobPlus", "onAdClosed() banner");
        AdPlus.this.is_closed = true;
        AdPlus.this.adView.setVisibility(8);
        AdPlus.this.postReShowBanner();
        super.onAdClosed();
      }

      public void onAdFailedToLoad(int paramInt)
      {
        String str = AdPlus.this.getDescriptionFromError(paramInt);
        L.e("AdmobPlus", "onAdFailedToLoad() banner. ErrorCode = " + paramInt + ": " + str);
        AdPlus.this.postReLoadBanner();
        super.onAdFailedToLoad(paramInt);
      }

      public void onAdLeftApplication()
      {
        L.d("AdmobPlus", "onAdLeftApplication() banner");
        super.onAdLeftApplication();
      }

      public void onAdLoaded()
      {
        L.d("AdmobPlus", "onAdLoaded() banner");
        if (!AdPlus.this.is_closed)
          AdPlus.this.adView.setVisibility(0);
        super.onAdLoaded();
      }

      public void onAdOpened()
      {
        L.d("AdmobPlus", "onAdOpened() banner");
        super.onAdOpened();
      }
    });
  }

  private void initInterstit()
  {
    this.interstitialAd = new InterstitialAd(this.ctxt);
    this.interstitialAd.setAdUnitId(this.ad_interstitial_id);
    this.interstitialAd.setAdListener(new AdListener()
    {
      public void onAdClosed()
      {
        super.onAdClosed();
        L.d("AdmobPlus", "onAdClosed InterstitialAd");
        AdPlus.this.loadInterstitial();
      }

      public void onAdFailedToLoad(int paramInt)
      {
        super.onAdFailedToLoad(paramInt);
        String str = AdPlus.this.getDescriptionFromError(paramInt);
        L.e("AdmobPlus", "onAdFailedToLoad InterstitialAderrorCode = " + paramInt + ": " + str);
        AdPlus.this.postReLoadInterstitial();
      }

      public void onAdLoaded()
      {
        super.onAdLoaded();
        L.d("AdmobPlus", "onAdLoaded InterstitialAd");
      }
    });
  }

  private void initRequest()
  {
    AdRequest.Builder localBuilder = new AdRequest.Builder();
    if (this.test)
      if (this.test_devices_id == null);
    for (int i = 0; ; i++)
    {
      if (i >= this.test_devices_id.length)
      {
        String str1 = Settings.Secure.getString(this.ctxt.getContentResolver(), "android_id");
        if (str1 != null)
        {
          String str2 = MD5.calculate(str1).toUpperCase();
          if (str2 != null)
            localBuilder.addTestDevice(str2);
        }
        this.adRequest = localBuilder.build();
        return;
      }
      localBuilder.addTestDevice(this.test_devices_id[i]);
    }
  }

  private void loadBanner()
  {
    L.d("AdmobPlus", "loadBanner()... isTestDevice = " + this.adRequest.isTestDevice(this.ctxt));
    this.adView.setVisibility(8);
    this.adView.loadAd(this.adRequest);
  }

  private void loadInterstitial()
  {
    L.d("AdmobPlus", "loadInterstitial()... ");
    this.interstitialAd.loadAd(this.adRequest);
  }

  private void openOptionsActivity()
  {
    try
    {
      Intent localIntent = new Intent("android.intent.action.MAIN");
      localIntent.setComponent(new ComponentName("com.mojang.minecraftpe", "com.mojang.minecraftpe.MainMenuOptionsActivity"));
      this.ctxt.startActivity(localIntent);
      return;
    }
    catch (Exception localException)
    {
      L.e("AdmobPlus", localException.toString());
    }
  }

  private void postReLoadBanner()
  {
    this.handler.removeCallbacks(this.reloadBannRun);
    this.handler.postDelayed(this.reloadBannRun, 59220L);
  }

  private void postReLoadInterstitial()
  {
    this.handler.removeCallbacks(this.reloadInterstRun);
    this.handler.postDelayed(this.reloadInterstRun, 59220L);
  }

  public void destroy()
  {
    L.d("AdmobPlus", "destroy()");
    this.handler.removeCallbacks(this.reloadBannRun);
    this.handler.removeCallbacks(this.reloadInterstRun);
    this.handler.removeCallbacks(this.reShowBannRun);
    this.adView.setAdListener(null);
    this.interstitialAd.setAdListener(null);
    this.adView.destroy();
  }

  public void pause()
  {
    L.d("AdmobPlus", "pause()");
    this.adView.pause();
    destroyWindow();
  }

  protected void postReShowBanner()
  {
    this.handler.removeCallbacks(this.reShowBannRun);
    this.handler.postDelayed(this.reShowBannRun, 179220L);
  }

  public void resume()
  {
    L.d("AdmobPlus", "resume()");
    this.adView.resume();
    createWindow();
  }

  public void showInterstitialAd()
  {
    this.handler.post(new Runnable()
    {
      public void run()
      {
        if ((AdPlus.this.interstitialAd != null) && (AdPlus.this.interstitialAd.isLoaded()))
          AdPlus.this.interstitialAd.show();
      }
    });
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.AdPlus
 * JD-Core Version:    0.6.0
 */