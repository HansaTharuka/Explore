package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.request.Requests.LoadRequestSummariesResult;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import com.google.android.gms.games.request.Requests.SendRequestResult;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class RequestsImpl
  implements Requests
{
  public PendingResult<Requests.UpdateRequestsResult> acceptRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    return acceptRequests(paramGoogleApiClient, localArrayList);
  }

  public PendingResult<Requests.UpdateRequestsResult> acceptRequests(GoogleApiClient paramGoogleApiClient, List<String> paramList)
  {
    if (paramList == null);
    for (String[] arrayOfString = null; ; arrayOfString = (String[])paramList.toArray(new String[paramList.size()]))
      return paramGoogleApiClient.b(new UpdateRequestsImpl(paramGoogleApiClient, arrayOfString)
      {
        protected void a(GamesClientImpl paramGamesClientImpl)
        {
          paramGamesClientImpl.b(this, this.abt);
        }
      });
  }

  public PendingResult<Requests.UpdateRequestsResult> dismissRequest(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramString);
    return dismissRequests(paramGoogleApiClient, localArrayList);
  }

  public PendingResult<Requests.UpdateRequestsResult> dismissRequests(GoogleApiClient paramGoogleApiClient, List<String> paramList)
  {
    if (paramList == null);
    for (String[] arrayOfString = null; ; arrayOfString = (String[])paramList.toArray(new String[paramList.size()]))
      return paramGoogleApiClient.b(new UpdateRequestsImpl(paramGoogleApiClient, arrayOfString)
      {
        protected void a(GamesClientImpl paramGamesClientImpl)
        {
          paramGamesClientImpl.c(this, this.abt);
        }
      });
  }

  public ArrayList<GameRequest> getGameRequestsFromBundle(Bundle paramBundle)
  {
    if ((paramBundle == null) || (!paramBundle.containsKey("requests")))
      return new ArrayList();
    ArrayList localArrayList1 = (ArrayList)paramBundle.get("requests");
    ArrayList localArrayList2 = new ArrayList();
    int i = localArrayList1.size();
    for (int j = 0; j < i; j++)
      localArrayList2.add((GameRequest)localArrayList1.get(j));
    return localArrayList2;
  }

  public ArrayList<GameRequest> getGameRequestsFromInboxResponse(Intent paramIntent)
  {
    if (paramIntent == null)
      return new ArrayList();
    return getGameRequestsFromBundle(paramIntent.getExtras());
  }

  public Intent getInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).ly();
  }

  public int getMaxLifetimeDays(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lA();
  }

  public int getMaxPayloadSize(GoogleApiClient paramGoogleApiClient)
  {
    return Games.d(paramGoogleApiClient).lz();
  }

  public Intent getSendIntent(GoogleApiClient paramGoogleApiClient, int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString)
  {
    return Games.d(paramGoogleApiClient).a(paramInt1, paramArrayOfByte, paramInt2, paramBitmap, paramString);
  }

  public PendingResult<Requests.LoadRequestsResult> loadRequests(GoogleApiClient paramGoogleApiClient, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramGoogleApiClient.a(new LoadRequestsImpl(paramGoogleApiClient, paramInt1, paramInt2, paramInt3)
    {
      protected void a(GamesClientImpl paramGamesClientImpl)
      {
        paramGamesClientImpl.a(this, this.abv, this.abw, this.aaA);
      }
    });
  }

  public void registerRequestListener(GoogleApiClient paramGoogleApiClient, OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    d locald = paramGoogleApiClient.d(paramOnRequestReceivedListener);
    Games.d(paramGoogleApiClient).d(locald);
  }

  public void unregisterRequestListener(GoogleApiClient paramGoogleApiClient)
  {
    Games.d(paramGoogleApiClient).ls();
  }

  private static abstract class LoadRequestSummariesImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestSummariesResult>
  {
    public Requests.LoadRequestSummariesResult ak(Status paramStatus)
    {
      return new Requests.LoadRequestSummariesResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }

        public void release()
        {
        }
      };
    }
  }

  private static abstract class LoadRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.LoadRequestsResult>
  {
    private LoadRequestsImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Requests.LoadRequestsResult al(Status paramStatus)
    {
      return new Requests.LoadRequestsResult(paramStatus)
      {
        public GameRequestBuffer getRequests(int paramInt)
        {
          return new GameRequestBuffer(DataHolder.av(this.DS.getStatusCode()));
        }

        public Status getStatus()
        {
          return this.DS;
        }

        public void release()
        {
        }
      };
    }
  }

  private static abstract class SendRequestImpl extends Games.BaseGamesApiMethodImpl<Requests.SendRequestResult>
  {
    public Requests.SendRequestResult am(Status paramStatus)
    {
      return new Requests.SendRequestResult(paramStatus)
      {
        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class UpdateRequestsImpl extends Games.BaseGamesApiMethodImpl<Requests.UpdateRequestsResult>
  {
    private UpdateRequestsImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Requests.UpdateRequestsResult an(Status paramStatus)
    {
      return new Requests.UpdateRequestsResult(paramStatus)
      {
        public Set<String> getRequestIds()
        {
          return null;
        }

        public int getRequestOutcome(String paramString)
        {
          throw new IllegalArgumentException("Unknown request ID " + paramString);
        }

        public Status getStatus()
        {
          return this.DS;
        }

        public void release()
        {
        }
      };
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.internal.api.RequestsImpl
 * JD-Core Version:    0.6.0
 */