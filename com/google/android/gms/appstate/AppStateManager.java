package com.google.android.gms.appstate;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.NoOptions;
import com.google.android.gms.common.api.Api.b;
import com.google.android.gms.common.api.Api.c;
import com.google.android.gms.common.api.BaseImplementation.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ib;
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.List;

@Deprecated
public final class AppStateManager
{
  public static final Api<Api.ApiOptions.NoOptions> API;
  static final Api.c<ib> DQ = new Api.c();
  private static final Api.b<ib, Api.ApiOptions.NoOptions> DR = new Api.b()
  {
    public ib b(Context paramContext, Looper paramLooper, jg paramjg, Api.ApiOptions.NoOptions paramNoOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
    {
      return new ib(paramContext, paramLooper, paramConnectionCallbacks, paramOnConnectionFailedListener, paramjg.hm(), (String[])paramjg.ho().toArray(new String[0]));
    }

    public int getPriority()
    {
      return 2147483647;
    }
  };
  public static final Scope SCOPE_APP_STATE = new Scope("https://www.googleapis.com/auth/appstate");

  static
  {
    Api.b localb = DR;
    Api.c localc = DQ;
    Scope[] arrayOfScope = new Scope[1];
    arrayOfScope[0] = SCOPE_APP_STATE;
    API = new Api(localb, localc, arrayOfScope);
  }

  public static ib a(GoogleApiClient paramGoogleApiClient)
  {
    boolean bool1 = true;
    boolean bool2;
    ib localib;
    if (paramGoogleApiClient != null)
    {
      bool2 = bool1;
      jx.b(bool2, "GoogleApiClient parameter is required.");
      jx.a(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      localib = (ib)paramGoogleApiClient.a(DQ);
      if (localib == null)
        break label55;
    }
    while (true)
    {
      jx.a(bool1, "GoogleApiClient is not configured to use the AppState API. Pass AppStateManager.API into GoogleApiClient.Builder#addApi() to use this feature.");
      return localib;
      bool2 = false;
      break;
      label55: bool1 = false;
    }
  }

  private static StateResult d(Status paramStatus)
  {
    return new StateResult(paramStatus)
    {
      public AppStateManager.StateConflictResult getConflictResult()
      {
        return null;
      }

      public AppStateManager.StateLoadedResult getLoadedResult()
      {
        return null;
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

  public static PendingResult<StateDeletedResult> delete(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.b(new b(paramGoogleApiClient, paramInt)
    {
      protected void a(ib paramib)
      {
        paramib.a(this, this.DT);
      }

      public AppStateManager.StateDeletedResult f(Status paramStatus)
      {
        return new AppStateManager.StateDeletedResult(paramStatus)
        {
          public int getStateKey()
          {
            return AppStateManager.5.this.DT;
          }

          public Status getStatus()
          {
            return this.DS;
          }
        };
      }
    });
  }

  public static int getMaxNumKeys(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).fM();
  }

  public static int getMaxStateSize(GoogleApiClient paramGoogleApiClient)
  {
    return a(paramGoogleApiClient).fL();
  }

  public static PendingResult<StateListResult> list(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new c(paramGoogleApiClient)
    {
      protected void a(ib paramib)
      {
        paramib.a(this);
      }
    });
  }

  public static PendingResult<StateResult> load(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    return paramGoogleApiClient.a(new e(paramGoogleApiClient, paramInt)
    {
      protected void a(ib paramib)
      {
        paramib.b(this, this.DT);
      }
    });
  }

  public static PendingResult<StateResult> resolve(GoogleApiClient paramGoogleApiClient, int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new e(paramGoogleApiClient, paramInt, paramString, paramArrayOfByte)
    {
      protected void a(ib paramib)
      {
        paramib.a(this, this.DT, this.DW, this.DX);
      }
    });
  }

  public static PendingResult<Status> signOut(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.b(new d(paramGoogleApiClient)
    {
      protected void a(ib paramib)
      {
        paramib.b(this);
      }
    });
  }

  public static void update(GoogleApiClient paramGoogleApiClient, int paramInt, byte[] paramArrayOfByte)
  {
    paramGoogleApiClient.b(new e(paramGoogleApiClient, paramInt, paramArrayOfByte)
    {
      protected void a(ib paramib)
      {
        paramib.a(null, this.DT, this.DU);
      }
    });
  }

  public static PendingResult<StateResult> updateImmediate(GoogleApiClient paramGoogleApiClient, int paramInt, byte[] paramArrayOfByte)
  {
    return paramGoogleApiClient.b(new e(paramGoogleApiClient, paramInt, paramArrayOfByte)
    {
      protected void a(ib paramib)
      {
        paramib.a(this, this.DT, this.DU);
      }
    });
  }

  public static abstract interface StateConflictResult extends Releasable, Result
  {
    public abstract byte[] getLocalData();

    public abstract String getResolvedVersion();

    public abstract byte[] getServerData();

    public abstract int getStateKey();
  }

  public static abstract interface StateDeletedResult extends Result
  {
    public abstract int getStateKey();
  }

  public static abstract interface StateListResult extends Result
  {
    public abstract AppStateBuffer getStateBuffer();
  }

  public static abstract interface StateLoadedResult extends Releasable, Result
  {
    public abstract byte[] getLocalData();

    public abstract int getStateKey();
  }

  public static abstract interface StateResult extends Releasable, Result
  {
    public abstract AppStateManager.StateConflictResult getConflictResult();

    public abstract AppStateManager.StateLoadedResult getLoadedResult();
  }

  public static abstract class a<R extends Result> extends BaseImplementation.a<R, ib>
  {
    public a(GoogleApiClient paramGoogleApiClient)
    {
      super(paramGoogleApiClient);
    }
  }

  private static abstract class b extends AppStateManager.a<AppStateManager.StateDeletedResult>
  {
    b(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }
  }

  private static abstract class c extends AppStateManager.a<AppStateManager.StateListResult>
  {
    public c(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public AppStateManager.StateListResult g(Status paramStatus)
    {
      return new AppStateManager.StateListResult(paramStatus)
      {
        public AppStateBuffer getStateBuffer()
        {
          return new AppStateBuffer(null);
        }

        public Status getStatus()
        {
          return this.DS;
        }
      };
    }
  }

  private static abstract class d extends AppStateManager.a<Status>
  {
    public d(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public Status b(Status paramStatus)
    {
      return paramStatus;
    }
  }

  private static abstract class e extends AppStateManager.a<AppStateManager.StateResult>
  {
    public e(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }

    public AppStateManager.StateResult h(Status paramStatus)
    {
      return AppStateManager.e(paramStatus);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.appstate.AppStateManager
 * JD-Core Version:    0.6.0
 */