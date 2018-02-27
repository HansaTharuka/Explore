package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.plus.internal.e;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.PersonBuffer;
import java.util.Collection;

@Deprecated
public class PlusClient
  implements GooglePlayServicesClient
{
  final e ant;

  @Deprecated
  public void clearDefaultAccount()
  {
    this.ant.clearDefaultAccount();
  }

  @Deprecated
  public void connect()
  {
    this.ant.connect();
  }

  @Deprecated
  public void disconnect()
  {
    this.ant.disconnect();
  }

  @Deprecated
  public String getAccountName()
  {
    return this.ant.getAccountName();
  }

  @Deprecated
  public Person getCurrentPerson()
  {
    return this.ant.getCurrentPerson();
  }

  @Deprecated
  public boolean isConnected()
  {
    return this.ant.isConnected();
  }

  @Deprecated
  public boolean isConnecting()
  {
    return this.ant.isConnecting();
  }

  @Deprecated
  public boolean isConnectionCallbacksRegistered(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    return this.ant.isConnectionCallbacksRegistered(paramConnectionCallbacks);
  }

  @Deprecated
  public boolean isConnectionFailedListenerRegistered(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    return this.ant.isConnectionFailedListenerRegistered(paramOnConnectionFailedListener);
  }

  @Deprecated
  public void loadMoments(OnMomentsLoadedListener paramOnMomentsLoadedListener)
  {
    this.ant.j(new BaseImplementation.b(paramOnMomentsLoadedListener)
    {
      public void a(Moments.LoadMomentsResult paramLoadMomentsResult)
      {
        this.anu.onMomentsLoaded(paramLoadMomentsResult.getStatus().gQ(), paramLoadMomentsResult.getMomentBuffer(), paramLoadMomentsResult.getNextPageToken(), paramLoadMomentsResult.getUpdated());
      }
    });
  }

  @Deprecated
  public void loadMoments(OnMomentsLoadedListener paramOnMomentsLoadedListener, int paramInt, String paramString1, Uri paramUri, String paramString2, String paramString3)
  {
    this.ant.a(new BaseImplementation.b(paramOnMomentsLoadedListener)
    {
      public void a(Moments.LoadMomentsResult paramLoadMomentsResult)
      {
        this.anu.onMomentsLoaded(paramLoadMomentsResult.getStatus().gQ(), paramLoadMomentsResult.getMomentBuffer(), paramLoadMomentsResult.getNextPageToken(), paramLoadMomentsResult.getUpdated());
      }
    }
    , paramInt, paramString1, paramUri, paramString2, paramString3);
  }

  @Deprecated
  public void loadPeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, Collection<String> paramCollection)
  {
    this.ant.a(new BaseImplementation.b(paramOnPeopleLoadedListener)
    {
      public void a(People.LoadPeopleResult paramLoadPeopleResult)
      {
        this.anw.onPeopleLoaded(paramLoadPeopleResult.getStatus().gQ(), paramLoadPeopleResult.getPersonBuffer(), paramLoadPeopleResult.getNextPageToken());
      }
    }
    , paramCollection);
  }

  @Deprecated
  public void loadPeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, String[] paramArrayOfString)
  {
    this.ant.d(new BaseImplementation.b(paramOnPeopleLoadedListener)
    {
      public void a(People.LoadPeopleResult paramLoadPeopleResult)
      {
        this.anw.onPeopleLoaded(paramLoadPeopleResult.getStatus().gQ(), paramLoadPeopleResult.getPersonBuffer(), paramLoadPeopleResult.getNextPageToken());
      }
    }
    , paramArrayOfString);
  }

  @Deprecated
  public void loadVisiblePeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, int paramInt, String paramString)
  {
    this.ant.a(new BaseImplementation.b(paramOnPeopleLoadedListener)
    {
      public void a(People.LoadPeopleResult paramLoadPeopleResult)
      {
        this.anw.onPeopleLoaded(paramLoadPeopleResult.getStatus().gQ(), paramLoadPeopleResult.getPersonBuffer(), paramLoadPeopleResult.getNextPageToken());
      }
    }
    , paramInt, paramString);
  }

  @Deprecated
  public void loadVisiblePeople(OnPeopleLoadedListener paramOnPeopleLoadedListener, String paramString)
  {
    this.ant.q(new BaseImplementation.b(paramOnPeopleLoadedListener)
    {
      public void a(People.LoadPeopleResult paramLoadPeopleResult)
      {
        this.anw.onPeopleLoaded(paramLoadPeopleResult.getStatus().gQ(), paramLoadPeopleResult.getPersonBuffer(), paramLoadPeopleResult.getNextPageToken());
      }
    }
    , paramString);
  }

  e os()
  {
    return this.ant;
  }

  @Deprecated
  public void registerConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.ant.registerConnectionCallbacks(paramConnectionCallbacks);
  }

  @Deprecated
  public void registerConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ant.registerConnectionFailedListener(paramOnConnectionFailedListener);
  }

  @Deprecated
  public void removeMoment(String paramString)
  {
    this.ant.removeMoment(paramString);
  }

  @Deprecated
  public void revokeAccessAndDisconnect(OnAccessRevokedListener paramOnAccessRevokedListener)
  {
    this.ant.l(new BaseImplementation.b(paramOnAccessRevokedListener)
    {
      public void az(Status paramStatus)
      {
        this.anx.onAccessRevoked(paramStatus.getStatus().gQ());
      }
    });
  }

  @Deprecated
  public void unregisterConnectionCallbacks(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.ant.unregisterConnectionCallbacks(paramConnectionCallbacks);
  }

  @Deprecated
  public void unregisterConnectionFailedListener(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.ant.unregisterConnectionFailedListener(paramOnConnectionFailedListener);
  }

  @Deprecated
  public void writeMoment(Moment paramMoment)
  {
    this.ant.a(null, paramMoment);
  }

  @Deprecated
  public static abstract interface OnAccessRevokedListener
  {
    public abstract void onAccessRevoked(ConnectionResult paramConnectionResult);
  }

  @Deprecated
  public static abstract interface OnMomentsLoadedListener
  {
    @Deprecated
    public abstract void onMomentsLoaded(ConnectionResult paramConnectionResult, MomentBuffer paramMomentBuffer, String paramString1, String paramString2);
  }

  @Deprecated
  public static abstract interface OnPeopleLoadedListener
  {
    public abstract void onPeopleLoaded(ConnectionResult paramConnectionResult, PersonBuffer paramPersonBuffer, String paramString);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.plus.PlusClient
 * JD-Core Version:    0.6.0
 */