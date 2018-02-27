package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DrivePreferencesApi;
import com.google.android.gms.drive.DrivePreferencesApi.FileUploadPreferencesResult;
import com.google.android.gms.drive.FileUploadPreferences;

public class x
  implements DrivePreferencesApi
{
  public PendingResult<DrivePreferencesApi.FileUploadPreferencesResult> getFileUploadPreferences(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new c(paramGoogleApiClient)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().h(new x.a(x.this, this, null));
      }
    });
  }

  public PendingResult<Status> setFileUploadPreferences(GoogleApiClient paramGoogleApiClient, FileUploadPreferences paramFileUploadPreferences)
  {
    if (!(paramFileUploadPreferences instanceof FileUploadPreferencesImpl))
      throw new IllegalArgumentException("Invalid preference value");
    return paramGoogleApiClient.b(new q.a(paramGoogleApiClient, (FileUploadPreferencesImpl)paramFileUploadPreferences)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new SetFileUploadPreferencesRequest(this.Qr), new bg(this));
      }
    });
  }

  private class a extends c
  {
    private final BaseImplementation.b<DrivePreferencesApi.FileUploadPreferencesResult> Ea;

    private a()
    {
      Object localObject;
      this.Ea = localObject;
    }

    public void a(OnDeviceUsagePreferenceResponse paramOnDeviceUsagePreferenceResponse)
      throws RemoteException
    {
      this.Ea.b(new x.b(x.this, Status.Kw, paramOnDeviceUsagePreferenceResponse.iN(), null));
    }

    public void n(Status paramStatus)
      throws RemoteException
    {
      this.Ea.b(new x.b(x.this, paramStatus, null, null));
    }
  }

  private class b
    implements DrivePreferencesApi.FileUploadPreferencesResult
  {
    private final Status Eb;
    private final FileUploadPreferences Qs;

    private b(Status paramFileUploadPreferences, FileUploadPreferences arg3)
    {
      this.Eb = paramFileUploadPreferences;
      Object localObject;
      this.Qs = localObject;
    }

    public FileUploadPreferences getFileUploadPreferences()
    {
      return this.Qs;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }

  private abstract class c extends q<DrivePreferencesApi.FileUploadPreferencesResult>
  {
    public c(GoogleApiClient arg2)
    {
      super();
    }

    protected DrivePreferencesApi.FileUploadPreferencesResult t(Status paramStatus)
    {
      return new x.b(x.this, paramStatus, null, null);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.x
 * JD-Core Version:    0.6.0
 */