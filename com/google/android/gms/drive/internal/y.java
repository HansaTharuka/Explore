package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.DriveResource;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;
import com.google.android.gms.drive.MetadataBuffer;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.events.ChangeListener;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class y
  implements DriveResource
{
  protected final DriveId Oj;

  protected y(DriveId paramDriveId)
  {
    this.Oj = paramDriveId;
  }

  public PendingResult<Status> addChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((r)paramGoogleApiClient.a(Drive.DQ)).a(paramGoogleApiClient, this.Oj, 1, paramChangeListener);
  }

  public PendingResult<Status> addChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    return ((r)paramGoogleApiClient.a(Drive.DQ)).a(paramGoogleApiClient, this.Oj, 1);
  }

  public DriveId getDriveId()
  {
    return this.Oj;
  }

  public PendingResult<DriveResource.MetadataResult> getMetadata(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new GetMetadataRequest(y.this.Oj), new y.b(this));
      }
    });
  }

  public PendingResult<DriveApi.MetadataBufferResult> listParents(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new p.g(paramGoogleApiClient)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new ListParentsRequest(y.this.Oj), new y.a(this));
      }
    });
  }

  public PendingResult<Status> removeChangeListener(GoogleApiClient paramGoogleApiClient, ChangeListener paramChangeListener)
  {
    return ((r)paramGoogleApiClient.a(Drive.DQ)).b(paramGoogleApiClient, this.Oj, 1, paramChangeListener);
  }

  public PendingResult<Status> removeChangeSubscription(GoogleApiClient paramGoogleApiClient)
  {
    return ((r)paramGoogleApiClient.a(Drive.DQ)).b(paramGoogleApiClient, this.Oj, 1);
  }

  public PendingResult<Status> setParents(GoogleApiClient paramGoogleApiClient, Set<DriveId> paramSet)
  {
    if (paramSet == null)
      throw new IllegalArgumentException("ParentIds must be provided.");
    if (paramSet.isEmpty())
      throw new IllegalArgumentException("ParentIds must contain at least one parent.");
    return paramGoogleApiClient.b(new q.a(paramGoogleApiClient, new ArrayList(paramSet))
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new SetResourceParentsRequest(y.this.Oj, this.Qu), new bg(this));
      }
    });
  }

  public PendingResult<DriveResource.MetadataResult> updateMetadata(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    if (paramMetadataChangeSet == null)
      throw new IllegalArgumentException("ChangeSet must be provided.");
    return paramGoogleApiClient.b(new d(paramGoogleApiClient, paramMetadataChangeSet)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        this.Qi.iz().setContext(paramr.getContext());
        paramr.iG().a(new UpdateMetadataRequest(y.this.Oj, this.Qi.iz()), new y.b(this));
      }
    });
  }

  private static class a extends c
  {
    private final BaseImplementation.b<DriveApi.MetadataBufferResult> Ea;

    public a(BaseImplementation.b<DriveApi.MetadataBufferResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(OnListParentsResponse paramOnListParentsResponse)
      throws RemoteException
    {
      MetadataBuffer localMetadataBuffer = new MetadataBuffer(paramOnListParentsResponse.iT(), null);
      this.Ea.b(new p.f(Status.Kw, localMetadataBuffer, false));
    }

    public void n(Status paramStatus)
      throws RemoteException
    {
      this.Ea.b(new p.f(paramStatus, null, false));
    }
  }

  private static class b extends c
  {
    private final BaseImplementation.b<DriveResource.MetadataResult> Ea;

    public b(BaseImplementation.b<DriveResource.MetadataResult> paramb)
    {
      this.Ea = paramb;
    }

    public void a(OnMetadataResponse paramOnMetadataResponse)
      throws RemoteException
    {
      this.Ea.b(new y.c(Status.Kw, new m(paramOnMetadataResponse.iU())));
    }

    public void n(Status paramStatus)
      throws RemoteException
    {
      this.Ea.b(new y.c(paramStatus, null));
    }
  }

  private static class c
    implements DriveResource.MetadataResult
  {
    private final Status Eb;
    private final Metadata Qv;

    public c(Status paramStatus, Metadata paramMetadata)
    {
      this.Eb = paramStatus;
      this.Qv = paramMetadata;
    }

    public Metadata getMetadata()
    {
      return this.Qv;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }

  private abstract class d extends q<DriveResource.MetadataResult>
  {
    private d(GoogleApiClient arg2)
    {
      super();
    }

    public DriveResource.MetadataResult u(Status paramStatus)
    {
      return new y.c(paramStatus, null);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.y
 * JD-Core Version:    0.6.0
 */