package com.mojang.minecraftpe;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.NativeActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.InputDevice;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.ads.AdPlus;
import com.mojang.android.StringValue;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainActivity extends NativeActivity
{
  private static boolean c = false;
  private boolean a = true;
  AdPlus ad;
  private int b = 2;
  private int d = -1;
  private String[] e = null;
  private ArrayList f = new ArrayList();
  private AlertDialog g;
  private final DateFormat h = new SimpleDateFormat();

  static
  {
    System.loadLibrary("minecraftpe");
  }

  private void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("");
    if (paramBoolean3)
      localBuilder.setCancelable(false);
    localBuilder.setOnCancelListener(new c(this));
    if (paramBoolean1)
      localBuilder.setPositiveButton("Ok", new d(this));
    if (paramBoolean2)
      localBuilder.setNegativeButton("Cancel", new e(this));
    this.g = localBuilder.create();
    this.g.setOwnerActivity(this);
  }

  public static boolean a()
  {
    return c;
  }

  public static boolean b()
  {
    int i = 1;
    String[] arrayOfString = new String[3];
    arrayOfString[0] = Build.MODEL;
    arrayOfString[i] = Build.DEVICE;
    arrayOfString[2] = Build.PRODUCT;
    int j = arrayOfString.length;
    for (int k = 0; ; k++)
    {
      if (k >= j)
        i = 0;
      String str;
      do
      {
        return i;
        str = arrayOfString[k].toLowerCase();
      }
      while ((str.indexOf("r800") >= 0) || (str.indexOf("so-01d") >= 0) || ((str.indexOf("xperia") >= 0) && (str.indexOf("play") >= 0)));
    }
  }

  private void d()
  {
    this.d = 0;
  }

  private void e()
  {
    int i = this.f.size();
    this.e = new String[i];
    int j = 0;
    String[] arrayOfString;
    int k;
    if (j >= i)
    {
      arrayOfString = this.e;
      k = arrayOfString.length;
    }
    for (int m = 0; ; m++)
    {
      if (m >= k)
      {
        this.d = 1;
        ((InputMethodManager)getSystemService("input_method")).showSoftInput(getCurrentFocus(), 1);
        return;
        this.e[j] = ((StringValue)this.f.get(j)).a();
        j++;
        break;
      }
      String str = arrayOfString[m];
      System.out.println("js: " + str);
    }
  }

  // ERROR //
  public static void saveScreenshot(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: iload_1
    //   2: iload_2
    //   3: getstatic 207	android/graphics/Bitmap$Config:ARGB_8888	Landroid/graphics/Bitmap$Config;
    //   6: invokestatic 213	android/graphics/Bitmap:createBitmap	([IIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    //   9: astore 4
    //   11: new 215	java/io/FileOutputStream
    //   14: dup
    //   15: aload_0
    //   16: invokespecial 216	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   19: astore 5
    //   21: aload 4
    //   23: getstatic 222	android/graphics/Bitmap$CompressFormat:JPEG	Landroid/graphics/Bitmap$CompressFormat;
    //   26: bipush 85
    //   28: aload 5
    //   30: invokevirtual 226	android/graphics/Bitmap:compress	(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    //   33: pop
    //   34: aload 5
    //   36: invokevirtual 229	java/io/FileOutputStream:flush	()V
    //   39: aload 5
    //   41: invokevirtual 232	java/io/FileOutputStream:close	()V
    //   44: return
    //   45: astore 8
    //   47: aload 8
    //   49: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   52: goto -13 -> 39
    //   55: astore 6
    //   57: getstatic 238	java/lang/System:err	Ljava/io/PrintStream;
    //   60: new 179	java/lang/StringBuilder
    //   63: dup
    //   64: ldc 240
    //   66: invokespecial 183	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_0
    //   70: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokevirtual 195	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   79: aload 6
    //   81: invokevirtual 241	java/io/FileNotFoundException:printStackTrace	()V
    //   84: return
    //   85: astore 9
    //   87: aload 9
    //   89: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   92: return
    //
    // Exception table:
    //   from	to	target	type
    //   34	39	45	java/io/IOException
    //   11	34	55	java/io/FileNotFoundException
    //   34	39	55	java/io/FileNotFoundException
    //   39	44	55	java/io/FileNotFoundException
    //   47	52	55	java/io/FileNotFoundException
    //   87	92	55	java/io/FileNotFoundException
    //   39	44	85	java/io/IOException
  }

  void a(int paramInt, int[] paramArrayOfInt)
  {
    a(paramInt, paramArrayOfInt, true);
  }

  void a(int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    a(paramInt, paramArrayOfInt, paramBoolean, true);
  }

  void a(int paramInt1, int[] paramArrayOfInt, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this.f.clear();
    runOnUiThread(new g(this, paramInt2, paramInt3, paramBoolean, paramInt1, paramArrayOfInt));
  }

  void a(int paramInt, int[] paramArrayOfInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1);
    for (int i = 0; ; i = -1)
    {
      a(paramInt, paramArrayOfInt, paramBoolean2, 0, i);
      return;
    }
  }

  public void buyGame()
  {
  }

  protected boolean c()
  {
    return false;
  }

  public int checkLicense()
  {
    return 0;
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 1))
      return false;
    return super.dispatchKeyEvent(paramKeyEvent);
  }

  public void displayDialog(int paramInt)
  {
    if (paramInt == 1)
      a(2130903040, new int[] { 2131099655, 2131099665, 2131099658 }, false, 2131099652, 2131099650);
    do
    {
      return;
      if (paramInt != 3)
        continue;
      Intent localIntent = new Intent(this, MainMenuOptionsActivity.class);
      localIntent.putExtra("preferenceId", 2130968576);
      startActivityForResult(localIntent, paramInt);
      this.ad.showInterstitialAd();
      return;
    }
    while (paramInt != 4);
    a(2130903044, new int[] { 2131099675 }, false);
  }

  public String getDateString(int paramInt)
  {
    return this.h.format(new Date(1000L * paramInt));
  }

  // ERROR //
  public byte[] getFileDataBytes(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 333	com/mojang/minecraftpe/MainActivity:getAssets	()Landroid/content/res/AssetManager;
    //   4: astore_2
    //   5: new 335	java/io/BufferedInputStream
    //   8: dup
    //   9: aload_2
    //   10: aload_1
    //   11: invokevirtual 341	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   14: invokespecial 344	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   17: astore_3
    //   18: new 346	java/io/ByteArrayOutputStream
    //   21: dup
    //   22: iconst_0
    //   23: invokespecial 348	java/io/ByteArrayOutputStream:<init>	(I)V
    //   26: astore 4
    //   28: iconst_0
    //   29: newarray byte
    //   31: astore 5
    //   33: aload_3
    //   34: aload 5
    //   36: invokevirtual 352	java/io/BufferedInputStream:read	([B)I
    //   39: istore 10
    //   41: iload 10
    //   43: ifle +46 -> 89
    //   46: aload 4
    //   48: aload 5
    //   50: iconst_0
    //   51: iload 10
    //   53: invokevirtual 356	java/io/ByteArrayOutputStream:write	([BII)V
    //   56: goto -23 -> 33
    //   59: astore 8
    //   61: aload_3
    //   62: invokevirtual 357	java/io/BufferedInputStream:close	()V
    //   65: aload 4
    //   67: invokevirtual 361	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   70: areturn
    //   71: astore 12
    //   73: aload 12
    //   75: invokevirtual 235	java/io/IOException:printStackTrace	()V
    //   78: aconst_null
    //   79: areturn
    //   80: astore 6
    //   82: aload_3
    //   83: invokevirtual 357	java/io/BufferedInputStream:close	()V
    //   86: aload 6
    //   88: athrow
    //   89: aload_3
    //   90: invokevirtual 357	java/io/BufferedInputStream:close	()V
    //   93: goto -28 -> 65
    //   96: astore 11
    //   98: goto -33 -> 65
    //   101: astore 9
    //   103: goto -38 -> 65
    //   106: astore 7
    //   108: goto -22 -> 86
    //
    // Exception table:
    //   from	to	target	type
    //   33	41	59	java/io/IOException
    //   46	56	59	java/io/IOException
    //   5	18	71	java/io/IOException
    //   33	41	80	finally
    //   46	56	80	finally
    //   89	93	96	java/io/IOException
    //   61	65	101	java/io/IOException
    //   82	86	106	java/io/IOException
  }

  // ERROR //
  public int[] getImageData(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 333	com/mojang/minecraftpe/MainActivity:getAssets	()Landroid/content/res/AssetManager;
    //   4: astore_2
    //   5: aload_2
    //   6: ldc_w 365
    //   9: invokevirtual 369	android/content/res/AssetManager:list	(Ljava/lang/String;)[Ljava/lang/String;
    //   12: pop
    //   13: aload_2
    //   14: aload_1
    //   15: invokevirtual 341	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore 6
    //   20: aload 6
    //   22: invokestatic 375	android/graphics/BitmapFactory:decodeStream	(Ljava/io/InputStream;)Landroid/graphics/Bitmap;
    //   25: astore 7
    //   27: aload 7
    //   29: invokevirtual 378	android/graphics/Bitmap:getWidth	()I
    //   32: istore 8
    //   34: aload 7
    //   36: invokevirtual 381	android/graphics/Bitmap:getHeight	()I
    //   39: istore 9
    //   41: iconst_2
    //   42: iload 8
    //   44: iload 9
    //   46: imul
    //   47: iadd
    //   48: newarray int
    //   50: astore 10
    //   52: aload 10
    //   54: iconst_0
    //   55: iload 8
    //   57: iastore
    //   58: aload 10
    //   60: iconst_1
    //   61: iload 9
    //   63: iastore
    //   64: aload 7
    //   66: aload 10
    //   68: iconst_2
    //   69: iload 8
    //   71: iconst_0
    //   72: iconst_0
    //   73: iload 8
    //   75: iload 9
    //   77: invokevirtual 385	android/graphics/Bitmap:getPixels	([IIIIIII)V
    //   80: aload 10
    //   82: areturn
    //   83: astore_3
    //   84: getstatic 238	java/lang/System:err	Ljava/io/PrintStream;
    //   87: ldc_w 387
    //   90: invokevirtual 195	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   93: aconst_null
    //   94: areturn
    //   95: astore 5
    //   97: getstatic 238	java/lang/System:err	Ljava/io/PrintStream;
    //   100: new 179	java/lang/StringBuilder
    //   103: dup
    //   104: ldc_w 389
    //   107: invokespecial 183	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   110: aload_1
    //   111: invokevirtual 187	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 190	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokevirtual 195	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   120: aconst_null
    //   121: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   5	13	83	java/io/IOException
    //   13	20	95	java/io/IOException
  }

  public int getKeyFromKeyCode(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 < 0)
    {
      int[] arrayOfInt = InputDevice.getDeviceIds();
      int i = arrayOfInt.length;
      int j = 0;
      if (i > 0)
        j = InputDevice.getDevice(arrayOfInt[0]).getKeyCharacterMap().get(paramInt1, paramInt2);
      return j;
    }
    return InputDevice.getDevice(paramInt3).getKeyCharacterMap().get(paramInt1, paramInt2);
  }

  public String[] getOptionStrings()
  {
    int i = 0;
    Map localMap = PreferenceManager.getDefaultSharedPreferences(this).getAll();
    String[] arrayOfString1 = new String[2 * localMap.size()];
    Iterator localIterator = localMap.entrySet().iterator();
    int j = 0;
    String[] arrayOfString2;
    String str1;
    String str2;
    boolean bool;
    label138: int n;
    label174: String str3;
    if (!localIterator.hasNext())
    {
      arrayOfString2 = new String[j];
      if (i >= j)
        return arrayOfString2;
    }
    else
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      str1 = (String)localEntry.getKey();
      str2 = localEntry.getValue().toString();
      if (str1.equals("ctrl_usetouchscreen"))
      {
        if ((b()) && (!((Boolean)localEntry.getValue()).booleanValue()))
        {
          bool = false;
          this.a = bool;
        }
      }
      else
      {
        if (str1.equals("gfx_lowquality"))
        {
          if (!((Boolean)localEntry.getValue()).booleanValue())
            break label291;
          n = 3;
          this.b = n;
        }
        if (!str1.equals("game_difficultypeaceful"))
          break label323;
        str3 = "game_difficulty";
        if (!((Boolean)localEntry.getValue()).booleanValue())
          break label297;
      }
    }
    for (Object localObject = "0"; ; localObject = str2)
    {
      try
      {
        while (true)
        {
          if (str3.equals("ctrl_sensitivity"))
          {
            String str4 = new Double(0.01D * Integer.parseInt((String)localObject)).toString();
            localObject = str4;
          }
          label254: int k = j + 1;
          arrayOfString1[j] = str3;
          int m = k + 1;
          arrayOfString1[k] = localObject;
          j = m;
          break;
          bool = true;
          break label138;
          label291: n = 2;
          break label174;
          label297: localObject = "2";
        }
        arrayOfString2[i] = arrayOfString1[i];
        i++;
      }
      catch (Exception localException)
      {
        break label254;
      }
      label323: str3 = str1;
    }
  }

  public float getPixelsPerMillimeter()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    return 0.5F * (localDisplayMetrics.xdpi + localDisplayMetrics.ydpi) / 25.4F;
  }

  public String getPlatformStringVar(int paramInt)
  {
    if (paramInt == 0)
      return Build.MODEL;
    return null;
  }

  public int getScreenHeight()
  {
    Display localDisplay = ((WindowManager)getSystemService("window")).getDefaultDisplay();
    int i = Math.min(localDisplay.getWidth(), localDisplay.getHeight());
    System.out.println("getheight: " + i);
    return i;
  }

  public int getScreenWidth()
  {
    Display localDisplay = ((WindowManager)getSystemService("window")).getDefaultDisplay();
    int i = Math.max(localDisplay.getWidth(), localDisplay.getHeight());
    System.out.println("getwidth: " + i);
    return i;
  }

  public int getUserInputStatus()
  {
    return this.d;
  }

  public String[] getUserInputString()
  {
    return this.e;
  }

  public boolean hasBuyButtonWhenInvalidLicense()
  {
    return true;
  }

  public void initiateUserInput(int paramInt)
  {
    this.e = null;
    this.d = -1;
  }

  public boolean isNetworkEnabled(boolean paramBoolean)
  {
    return true;
  }

  public boolean isTouchscreen()
  {
    return this.a;
  }

  native void nativeRegisterThis();

  native void nativeStopThis();

  native void nativeUnregisterThis();

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 3)
      this.d = 1;
  }

  public void onBackPressed()
  {
  }

  public void onCreate(Bundle paramBundle)
  {
    getOptionStrings();
    setVolumeControlStream(3);
    super.onCreate(paramBundle);
    nativeRegisterThis();
    this.ad = new AdPlus(getApplicationContext());
  }

  protected void onDestroy()
  {
    System.out.println("onDestroy");
    nativeUnregisterThis();
    this.ad.destroy();
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      onBackPressed();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    this.ad.pause();
  }

  protected void onResume()
  {
    super.onResume();
    this.ad.resume();
  }

  protected void onStart()
  {
    super.onStart();
  }

  protected void onStop()
  {
    nativeStopThis();
    super.onStop();
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
  }

  public void postScreenshotToFacebook(String paramString, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
  }

  public void quit()
  {
    runOnUiThread(new f(this));
  }

  public void setIsPowerVR(boolean paramBoolean)
  {
    c = paramBoolean;
  }

  public void tick()
  {
  }

  public void vibrate(int paramInt)
  {
    ((Vibrator)getSystemService("vibrator")).vibrate(paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.mojang.minecraftpe.MainActivity
 * JD-Core Version:    0.6.0
 */