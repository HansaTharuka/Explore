package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.BaseImplementation.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.DriveContentsResult;
import com.google.android.gms.drive.DriveFile.DownloadProgressListener;

class az extends c
{
  private final BaseImplementation.b<DriveApi.DriveContentsResult> Ea;
  private final DriveFile.DownloadProgressListener QU;

  az(BaseImplementation.b<DriveApi.DriveContentsResult> paramb, DriveFile.DownloadProgressListener paramDownloadProgressListener)
  {
    this.Ea = paramb;
    this.QU = paramDownloadProgressListener;
  }

  public void a(OnContentsResponse paramOnContentsResponse)
    throws RemoteException
  {
    if (paramOnContentsResponse.iM());
    for (Status localStatus = new Status(-1); ; localStatus = Status.Kw)
    {
      this.Ea.b(new p.a(localStatus, new s(paramOnContentsResponse.iL())));
      return;
    }
  }

  public void a(OnDownloadProgressResponse paramOnDownloadProgressResponse)
    throws RemoteException
  {
    if (this.QU != null)
      this.QU.onProgress(paramOnDownloadProgressResponse.iO(), paramOnDownloadProgressResponse.iP());
  }

  public void n(Status paramStatus)
    throws RemoteException
  {
    this.Ea.b(new p.a(paramStatus, null));
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.az
 * JD-Core Version:    0.6.0
 */