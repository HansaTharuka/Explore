package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;
import com.google.android.gms.wearable.NodeApi.NodeListener;
import java.util.List;

public final class ak
  implements NodeApi
{
  public PendingResult<Status> addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    return paramGoogleApiClient.a(new a(paramGoogleApiClient, paramNodeListener, null));
  }

  public PendingResult<NodeApi.GetConnectedNodesResult> getConnectedNodes(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.p(this);
      }

      protected NodeApi.GetConnectedNodesResult aK(Status paramStatus)
      {
        return new ak.b(paramStatus, null);
      }
    });
  }

  public PendingResult<NodeApi.GetLocalNodeResult> getLocalNode(GoogleApiClient paramGoogleApiClient)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.o(this);
      }

      protected NodeApi.GetLocalNodeResult aJ(Status paramStatus)
      {
        return new ak.c(paramStatus, null);
      }
    });
  }

  public PendingResult<Status> removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
  {
    return paramGoogleApiClient.a(new d(paramGoogleApiClient, paramNodeListener)
    {
      protected void a(ba paramba)
        throws RemoteException
      {
        paramba.b(this, this.axY);
      }

      public Status b(Status paramStatus)
      {
        return paramStatus;
      }
    });
  }

  private static final class a extends d<Status>
  {
    private NodeApi.NodeListener axZ;

    private a(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener)
    {
      super();
      this.axZ = paramNodeListener;
    }

    protected void a(ba paramba)
      throws RemoteException
    {
      paramba.a(this, this.axZ);
      this.axZ = null;
    }

    public Status b(Status paramStatus)
    {
      this.axZ = null;
      return paramStatus;
    }
  }

  public static class b
    implements NodeApi.GetConnectedNodesResult
  {
    private final Status Eb;
    private final List<Node> aya;

    public b(Status paramStatus, List<Node> paramList)
    {
      this.Eb = paramStatus;
      this.aya = paramList;
    }

    public List<Node> getNodes()
    {
      return this.aya;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }

  public static class c
    implements NodeApi.GetLocalNodeResult
  {
    private final Status Eb;
    private final Node ayb;

    public c(Status paramStatus, Node paramNode)
    {
      this.Eb = paramStatus;
      this.ayb = paramNode;
    }

    public Node getNode()
    {
      return this.ayb;
    }

    public Status getStatus()
    {
      return this.Eb;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.ak
 * JD-Core Version:    0.6.0
 */