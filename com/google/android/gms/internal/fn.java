package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ey
public class fn
  implements Callable<fy>
{
  private final Context mContext;
  private final Object mH = new Object();
  private final u pM;
  private final fy.a tB;
  private int tq;
  private final gn ul;
  private final ai um;
  private boolean un;
  private List<String> uo;

  public fn(Context paramContext, u paramu, ai paramai, gn paramgn, fy.a parama)
  {
    this.mContext = paramContext;
    this.pM = paramu;
    this.ul = paramgn;
    this.um = paramai;
    this.tB = parama;
    this.un = false;
    this.tq = -2;
    this.uo = null;
  }

  private bv.a a(ah paramah, a parama, JSONObject paramJSONObject)
    throws ExecutionException, InterruptedException, JSONException
  {
    if (cO())
      return null;
    String[] arrayOfString = b(paramJSONObject.getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
    if (arrayOfString == null);
    bv.a locala;
    for (List localList = null; ; localList = Arrays.asList(arrayOfString))
    {
      this.uo = localList;
      locala = parama.a(this, paramJSONObject);
      if (locala != null)
        break;
      gr.T("Failed to retrieve ad assets.");
      return null;
    }
    locala.a(new bv(this.pM, paramah, paramJSONObject));
    return locala;
  }

  private fy a(bv.a parama)
  {
    while (true)
    {
      synchronized (this.mH)
      {
        int i = this.tq;
        if ((parama != null) || (this.tq != -2))
          continue;
        i = 0;
        if (i != -2)
        {
          locala = null;
          return new fy(this.tB.vJ.tL, null, this.tB.vK.qw, i, this.tB.vK.qx, this.uo, this.tB.vK.orientation, this.tB.vK.qA, this.tB.vJ.tO, false, null, null, null, null, null, 0L, this.tB.lS, this.tB.vK.tV, this.tB.vG, this.tB.vH, this.tB.vK.ub, this.tB.vD, locala);
        }
      }
      bv.a locala = parama;
    }
  }

  private String[] b(JSONObject paramJSONObject, String paramString)
    throws JSONException
  {
    JSONArray localJSONArray = paramJSONObject.optJSONArray(paramString);
    if (localJSONArray == null)
      return null;
    String[] arrayOfString = new String[localJSONArray.length()];
    for (int i = 0; i < localJSONArray.length(); i++)
      arrayOfString[i] = localJSONArray.getString(i);
    return arrayOfString;
  }

  private JSONObject c(ah paramah)
    throws TimeoutException, JSONException
  {
    if (cO())
      return null;
    gj localgj = new gj();
    paramah.a("/nativeAdPreProcess", new cd(paramah, localgj)
    {
      public void a(gu paramgu, Map<String, String> paramMap)
      {
        this.up.g("/nativeAdPreProcess");
        try
        {
          String str = (String)paramMap.get("success");
          if (!TextUtils.isEmpty(str))
          {
            this.uq.a(new JSONObject(str).getJSONArray("ads").getJSONObject(0));
            return;
          }
        }
        catch (JSONException localJSONException)
        {
          gr.b("Malformed native JSON response.", localJSONException);
          fn.this.t(0);
          jx.a(fn.this.cO(), "Unable to set the ad state error!");
          this.uq.a(null);
        }
      }
    });
    paramah.a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(this.tB.vK.tU));
    return (JSONObject)localgj.get();
  }

  private ah cN()
    throws CancellationException, ExecutionException, InterruptedException, TimeoutException
  {
    if (cO())
      return null;
    ah localah = (ah)this.um.a(this.mContext, this.tB.vJ.lO, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/native_ads.html").get();
    localah.a(this.pM, this.pM, this.pM, this.pM, false, this.pM);
    return localah;
  }

  public Future<Drawable> a(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
    throws JSONException
  {
    JSONObject localJSONObject;
    if (paramBoolean)
    {
      localJSONObject = paramJSONObject.getJSONObject(paramString);
      if (localJSONObject == null)
        localJSONObject = new JSONObject();
      if (!paramBoolean)
        break label71;
    }
    label71: for (String str = localJSONObject.getString("url"); ; str = localJSONObject.optString("url"))
    {
      if (!TextUtils.isEmpty(str))
        break label83;
      a(0, paramBoolean);
      return new gk(null);
      localJSONObject = paramJSONObject.optJSONObject(paramString);
      break;
    }
    label83: return this.ul.a(str, new gn.a(paramBoolean)
    {
      public Drawable a(InputStream paramInputStream)
      {
        Bitmap localBitmap;
        try
        {
          byte[] arrayOfByte2 = lh.d(paramInputStream);
          arrayOfByte1 = arrayOfByte2;
          if (arrayOfByte1 == null)
          {
            fn.this.a(2, this.us);
            return null;
          }
        }
        catch (IOException localIOException)
        {
          byte[] arrayOfByte1;
          while (true)
            arrayOfByte1 = null;
          localBitmap = BitmapFactory.decodeByteArray(arrayOfByte1, 0, arrayOfByte1.length);
          if (localBitmap == null)
          {
            fn.this.a(2, this.us);
            return null;
          }
        }
        return new BitmapDrawable(Resources.getSystem(), localBitmap);
      }

      public Drawable cP()
      {
        fn.this.a(2, this.us);
        return null;
      }
    });
  }

  public void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      t(paramInt);
  }

  protected a b(JSONObject paramJSONObject)
    throws JSONException
  {
    if (cO())
      return null;
    String str = paramJSONObject.getString("template_id");
    if ("2".equals(str))
      return new fo();
    if ("1".equals(str))
      return new fp();
    t(0);
    return null;
  }

  public fy cM()
  {
    try
    {
      ah localah = cN();
      JSONObject localJSONObject = c(localah);
      fy localfy = a(a(localah, b(localJSONObject), localJSONObject));
      return localfy;
    }
    catch (JSONException localJSONException)
    {
      gr.d("Malformed native JSON response.", localJSONException);
      if (!this.un)
        t(0);
      return a(null);
    }
    catch (TimeoutException localTimeoutException)
    {
      while (true)
        gr.d("Timeout when loading native ad.", localTimeoutException);
    }
    catch (InterruptedException localInterruptedException)
    {
      break label47;
    }
    catch (ExecutionException localExecutionException)
    {
      break label47;
    }
    catch (CancellationException localCancellationException)
    {
      label47: break label47;
    }
  }

  public boolean cO()
  {
    synchronized (this.mH)
    {
      boolean bool = this.un;
      return bool;
    }
  }

  public void t(int paramInt)
  {
    synchronized (this.mH)
    {
      this.un = true;
      this.tq = paramInt;
      return;
    }
  }

  public static abstract interface a<T extends bv.a>
  {
    public abstract T a(fn paramfn, JSONObject paramJSONObject)
      throws JSONException, InterruptedException, ExecutionException;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fn
 * JD-Core Version:    0.6.0
 */