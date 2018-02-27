package com.google.android.gms.drive.internal;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.ExecutionOptions;
import com.google.android.gms.drive.ExecutionOptions.Builder;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.jx;
import java.io.InputStream;
import java.io.OutputStream;

public class s
  implements DriveContents
{
  private final Contents PW;
  private boolean PX = false;
  private boolean PY = false;
  private boolean mClosed = false;

  public s(Contents paramContents)
  {
    this.PW = ((Contents)jx.i(paramContents));
  }

  public PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    return commit(paramGoogleApiClient, paramMetadataChangeSet, null);
  }

  public PendingResult<Status> commit(GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, ExecutionOptions paramExecutionOptions)
  {
    if (paramExecutionOptions == null)
      paramExecutionOptions = new ExecutionOptions.Builder().build();
    if (this.PW.getMode() == 268435456)
      throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
    if ((ExecutionOptions.ba(paramExecutionOptions.ix())) && (!this.PW.ip()))
      throw new IllegalStateException("DriveContents must be valid for conflict detection.");
    ExecutionOptions.a(paramGoogleApiClient, paramExecutionOptions);
    if (it())
      throw new IllegalStateException("DriveContents already closed.");
    if (getDriveId() == null)
      throw new IllegalStateException("Only DriveContents obtained through DriveFile.open can be committed.");
    if (paramMetadataChangeSet != null);
    while (true)
    {
      is();
      return paramGoogleApiClient.b(new q.a(paramGoogleApiClient, paramMetadataChangeSet, paramExecutionOptions)
      {
        protected void a(r paramr)
          throws RemoteException
        {
          this.Qa.iz().setContext(paramr.getContext());
          paramr.iG().a(new CloseContentsAndUpdateMetadataRequest(s.a(s.this).getDriveId(), this.Qa.iz(), s.a(s.this), this.Qb), new bg(this));
        }
      });
      paramMetadataChangeSet = MetadataChangeSet.OE;
    }
  }

  public void discard(GoogleApiClient paramGoogleApiClient)
  {
    if (it())
      throw new IllegalStateException("DriveContents already closed.");
    is();
    ((4)paramGoogleApiClient.b(new q.a(paramGoogleApiClient)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new CloseContentsRequest(s.a(s.this), false), new bg(this));
      }
    })).setResultCallback(new ResultCallback()
    {
      public void j(Status paramStatus)
      {
        if (!paramStatus.isSuccess())
        {
          w.p("DriveContentsImpl", "Error discarding contents");
          return;
        }
        w.m("DriveContentsImpl", "Contents discarded");
      }
    });
  }

  public DriveId getDriveId()
  {
    return this.PW.getDriveId();
  }

  public InputStream getInputStream()
  {
    if (it())
      throw new IllegalStateException("Contents have been closed, cannot access the input stream.");
    if (this.PW.getMode() != 268435456)
      throw new IllegalStateException("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
    if (this.PX)
      throw new IllegalStateException("getInputStream() can only be called once per Contents instance.");
    this.PX = true;
    return this.PW.getInputStream();
  }

  public int getMode()
  {
    return this.PW.getMode();
  }

  public OutputStream getOutputStream()
  {
    if (it())
      throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    if (this.PW.getMode() != 536870912)
      throw new IllegalStateException("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
    if (this.PY)
      throw new IllegalStateException("getOutputStream() can only be called once per Contents instance.");
    this.PY = true;
    return this.PW.getOutputStream();
  }

  public ParcelFileDescriptor getParcelFileDescriptor()
  {
    if (it())
      throw new IllegalStateException("Contents have been closed, cannot access the output stream.");
    return this.PW.getParcelFileDescriptor();
  }

  public Contents ir()
  {
    return this.PW;
  }

  public void is()
  {
    this.mClosed = true;
  }

  public boolean it()
  {
    return this.mClosed;
  }

  public PendingResult<DriveApi.DriveContentsResult> reopenForWrite(GoogleApiClient paramGoogleApiClient)
  {
    if (it())
      throw new IllegalStateException("DriveContents already closed.");
    if (this.PW.getMode() != 268435456)
      throw new IllegalStateException("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
    is();
    return paramGoogleApiClient.a(new p.b(paramGoogleApiClient)
    {
      protected void a(r paramr)
        throws RemoteException
      {
        paramr.iG().a(new OpenContentsRequest(s.this.getDriveId(), 536870912, s.a(s.this).getRequestId()), new az(this, null));
      }
    });
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.s
 * JD-Core Version:    0.6.0
 */