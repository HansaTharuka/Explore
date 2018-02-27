package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.it;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.iv;
import java.io.IOException;
import org.json.JSONObject;

public class RemoteMediaPlayer
  implements Cast.MessageReceivedCallback
{
  public static final int RESUME_STATE_PAUSE = 2;
  public static final int RESUME_STATE_PLAY = 1;
  public static final int RESUME_STATE_UNCHANGED = 0;
  public static final int STATUS_CANCELED = 2101;
  public static final int STATUS_FAILED = 2100;
  public static final int STATUS_REPLACED = 2103;
  public static final int STATUS_SUCCEEDED = 0;
  public static final int STATUS_TIMED_OUT = 2102;
  private final it Gw = new it()
  {
    protected void onMetadataUpdated()
    {
      RemoteMediaPlayer.b(RemoteMediaPlayer.this);
    }

    protected void onStatusUpdated()
    {
      RemoteMediaPlayer.a(RemoteMediaPlayer.this);
    }
  };
  private final a Gx = new a();
  private OnMetadataUpdatedListener Gy;
  private OnStatusUpdatedListener Gz;
  private final Object mH = new Object();

  public RemoteMediaPlayer()
  {
    this.Gw.a(this.Gx);
  }

  private void onMetadataUpdated()
  {
    if (this.Gy != null)
      this.Gy.onMetadataUpdated();
  }

  private void onStatusUpdated()
  {
    if (this.Gz != null)
      this.Gz.onStatusUpdated();
  }

  public long getApproximateStreamPosition()
  {
    synchronized (this.mH)
    {
      long l = this.Gw.getApproximateStreamPosition();
      return l;
    }
  }

  public MediaInfo getMediaInfo()
  {
    synchronized (this.mH)
    {
      MediaInfo localMediaInfo = this.Gw.getMediaInfo();
      return localMediaInfo;
    }
  }

  public MediaStatus getMediaStatus()
  {
    synchronized (this.mH)
    {
      MediaStatus localMediaStatus = this.Gw.getMediaStatus();
      return localMediaStatus;
    }
  }

  public String getNamespace()
  {
    return this.Gw.getNamespace();
  }

  public long getStreamDuration()
  {
    synchronized (this.mH)
    {
      long l = this.Gw.getStreamDuration();
      return l;
    }
  }

  public PendingResult<MediaChannelResult> load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo)
  {
    return load(paramGoogleApiClient, paramMediaInfo, true, 0L, null, null);
  }

  public PendingResult<MediaChannelResult> load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, 0L, null, null);
  }

  public PendingResult<MediaChannelResult> load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, null);
  }

  public PendingResult<MediaChannelResult> load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, JSONObject paramJSONObject)
  {
    return load(paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, null, paramJSONObject);
  }

  public PendingResult<MediaChannelResult> load(GoogleApiClient paramGoogleApiClient, MediaInfo paramMediaInfo, boolean paramBoolean, long paramLong, long[] paramArrayOfLong, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramMediaInfo, paramBoolean, paramLong, paramArrayOfLong, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GE, this.GF, this.GG, this.GH, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public void onMessageReceived(CastDevice paramCastDevice, String paramString1, String paramString2)
  {
    this.Gw.aD(paramString2);
  }

  public PendingResult<MediaChannelResult> pause(GoogleApiClient paramGoogleApiClient)
  {
    return pause(paramGoogleApiClient, null);
  }

  public PendingResult<MediaChannelResult> pause(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> play(GoogleApiClient paramGoogleApiClient)
  {
    return play(paramGoogleApiClient, null);
  }

  public PendingResult<MediaChannelResult> play(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).c(this.GR, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> requestStatus(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> seek(GoogleApiClient paramGoogleApiClient, long paramLong)
  {
    return seek(paramGoogleApiClient, paramLong, 0, null);
  }

  public PendingResult<MediaChannelResult> seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt)
  {
    return seek(paramGoogleApiClient, paramLong, paramInt, null);
  }

  public PendingResult<MediaChannelResult> seek(GoogleApiClient paramGoogleApiClient, long paramLong, int paramInt, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramLong, paramInt, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GJ, this.GK, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> setActiveMediaTracks(GoogleApiClient paramGoogleApiClient, long[] paramArrayOfLong)
  {
    if ((paramArrayOfLong == null) || (paramArrayOfLong.length == 0))
      throw new IllegalArgumentException("trackIds cannot be null or empty");
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramArrayOfLong)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GC);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public void setOnMetadataUpdatedListener(OnMetadataUpdatedListener paramOnMetadataUpdatedListener)
  {
    this.Gy = paramOnMetadataUpdatedListener;
  }

  public void setOnStatusUpdatedListener(OnStatusUpdatedListener paramOnStatusUpdatedListener)
  {
    this.Gz = paramOnStatusUpdatedListener;
  }

  public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    return setStreamMute(paramGoogleApiClient, paramBoolean, null);
  }

  public PendingResult<MediaChannelResult> setStreamMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramBoolean, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GM, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble)
    throws IllegalArgumentException
  {
    return setStreamVolume(paramGoogleApiClient, paramDouble, null);
  }

  public PendingResult<MediaChannelResult> setStreamVolume(GoogleApiClient paramGoogleApiClient, double paramDouble, JSONObject paramJSONObject)
    throws IllegalArgumentException
  {
    if ((Double.isInfinite(paramDouble)) || (Double.isNaN(paramDouble)))
      throw new IllegalArgumentException("Volume cannot be " + paramDouble);
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramDouble, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GL, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IllegalStateException localIllegalStateException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> setTextTrackStyle(GoogleApiClient paramGoogleApiClient, TextTrackStyle paramTextTrackStyle)
  {
    if (paramTextTrackStyle == null)
      throw new IllegalArgumentException("trackStyle cannot be null");
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramTextTrackStyle)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).a(this.GR, this.GD);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public PendingResult<MediaChannelResult> stop(GoogleApiClient paramGoogleApiClient)
  {
    return stop(paramGoogleApiClient, null);
  }

  public PendingResult<MediaChannelResult> stop(GoogleApiClient paramGoogleApiClient, JSONObject paramJSONObject)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramGoogleApiClient, paramJSONObject)
    {
      protected void a(im paramim)
      {
        synchronized (RemoteMediaPlayer.c(RemoteMediaPlayer.this))
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(this.GB);
        }
        try
        {
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).b(this.GR, this.GI);
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          monitorexit;
          return;
        }
        catch (IOException localIOException)
        {
          while (true)
          {
            b(k(new Status(2100)));
            RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
          }
          localObject2 = finally;
          monitorexit;
          throw localObject2;
        }
        finally
        {
          RemoteMediaPlayer.d(RemoteMediaPlayer.this).b(null);
        }
        throw localObject3;
      }
    });
  }

  public static abstract interface MediaChannelResult extends Result
  {
    public abstract JSONObject getCustomData();
  }

  public static abstract interface OnMetadataUpdatedListener
  {
    public abstract void onMetadataUpdated();
  }

  public static abstract interface OnStatusUpdatedListener
  {
    public abstract void onStatusUpdated();
  }

  private class a
    implements iu
  {
    private GoogleApiClient GN;
    private long GO = 0L;

    public a()
    {
    }

    public void a(String paramString1, String paramString2, long paramLong, String paramString3)
      throws IOException
    {
      if (this.GN == null)
        throw new IOException("No GoogleApiClient available");
      Cast.CastApi.sendMessage(this.GN, paramString1, paramString2).setResultCallback(new a(paramLong));
    }

    public void b(GoogleApiClient paramGoogleApiClient)
    {
      this.GN = paramGoogleApiClient;
    }

    public long fS()
    {
      long l = 1L + this.GO;
      this.GO = l;
      return l;
    }

    private final class a
      implements ResultCallback<Status>
    {
      private final long GP;

      a(long arg2)
      {
        Object localObject;
        this.GP = localObject;
      }

      public void j(Status paramStatus)
      {
        if (!paramStatus.isSuccess())
          RemoteMediaPlayer.e(RemoteMediaPlayer.this).b(this.GP, paramStatus.getStatusCode());
      }
    }
  }

  private static abstract class b extends Cast.a<RemoteMediaPlayer.MediaChannelResult>
  {
    iv GR = new iv()
    {
      public void a(long paramLong, int paramInt, JSONObject paramJSONObject)
      {
        RemoteMediaPlayer.b.this.b(new RemoteMediaPlayer.c(new Status(paramInt), paramJSONObject));
      }

      public void n(long paramLong)
      {
        RemoteMediaPlayer.b.this.b(RemoteMediaPlayer.b.this.k(new Status(2103)));
      }
    };

    b(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public RemoteMediaPlayer.MediaChannelResult k(Status paramStatus)
    {
      return new RemoteMediaPlayer.MediaChannelResult(paramStatus)
      {
        public JSONObject getCustomData()
        {
          return null;
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static final class c
    implements RemoteMediaPlayer.MediaChannelResult
  {
    private final Status Eb;
    private final JSONObject Ga;

    c(Status paramStatus, JSONObject paramJSONObject)
    {
      this.Eb = paramStatus;
      this.Ga = paramJSONObject;
    }

    public JSONObject getCustomData()
    {
      return this.Ga;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.cast.RemoteMediaPlayer
 * JD-Core Version:    0.6.0
 */