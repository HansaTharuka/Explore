package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;

class n
  implements ContainerHolder
{
  private Status Eb;
  private final Looper JF;
  private boolean Pf;
  private Container aqu;
  private Container aqv;
  private b aqw;
  private a aqx;
  private TagManager aqy;

  public n(Status paramStatus)
  {
    this.Eb = paramStatus;
    this.JF = null;
  }

  public n(TagManager paramTagManager, Looper paramLooper, Container paramContainer, a parama)
  {
    this.aqy = paramTagManager;
    if (paramLooper != null);
    while (true)
    {
      this.JF = paramLooper;
      this.aqu = paramContainer;
      this.aqx = parama;
      this.Eb = Status.Kw;
      paramTagManager.a(this);
      return;
      paramLooper = Looper.getMainLooper();
    }
  }

  private void pm()
  {
    if (this.aqw != null)
      this.aqw.cu(this.aqv.pj());
  }

  public void a(Container paramContainer)
  {
    monitorenter;
    while (true)
    {
      try
      {
        boolean bool = this.Pf;
        if (bool)
          return;
        if (paramContainer == null)
        {
          bh.T("Unexpected null container.");
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      this.aqv = paramContainer;
      pm();
    }
  }

  public void cr(String paramString)
  {
    monitorenter;
    try
    {
      boolean bool = this.Pf;
      if (bool);
      while (true)
      {
        return;
        this.aqu.cr(paramString);
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void ct(String paramString)
  {
    if (this.Pf)
    {
      bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return;
    }
    this.aqx.ct(paramString);
  }

  public Container getContainer()
  {
    Container localContainer = null;
    monitorenter;
    try
    {
      if (this.Pf)
        bh.T("ContainerHolder is released.");
      while (true)
      {
        return localContainer;
        if (this.aqv != null)
        {
          this.aqu = this.aqv;
          this.aqv = null;
        }
        localContainer = this.aqu;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  String getContainerId()
  {
    if (this.Pf)
    {
      bh.T("getContainerId called on a released ContainerHolder.");
      return "";
    }
    return this.aqu.getContainerId();
  }

  public Status getStatus()
  {
    return this.Eb;
  }

  String pl()
  {
    if (this.Pf)
    {
      bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
      return "";
    }
    return this.aqx.pl();
  }

  public void refresh()
  {
    monitorenter;
    try
    {
      if (this.Pf)
        bh.T("Refreshing a released ContainerHolder.");
      while (true)
      {
        return;
        this.aqx.pn();
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void release()
  {
    monitorenter;
    try
    {
      if (this.Pf)
        bh.T("Releasing a released ContainerHolder.");
      while (true)
      {
        return;
        this.Pf = true;
        this.aqy.b(this);
        this.aqu.release();
        this.aqu = null;
        this.aqv = null;
        this.aqx = null;
        this.aqw = null;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  public void setContainerAvailableListener(ContainerHolder.ContainerAvailableListener paramContainerAvailableListener)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (!this.Pf)
          continue;
        bh.T("ContainerHolder is released.");
        return;
        if (paramContainerAvailableListener == null)
        {
          this.aqw = null;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      this.aqw = new b(paramContainerAvailableListener, this.JF);
      if (this.aqv == null)
        continue;
      pm();
    }
  }

  public static abstract interface a
  {
    public abstract void ct(String paramString);

    public abstract String pl();

    public abstract void pn();
  }

  private class b extends Handler
  {
    private final ContainerHolder.ContainerAvailableListener aqz;

    public b(ContainerHolder.ContainerAvailableListener paramLooper, Looper arg3)
    {
      super();
      this.aqz = paramLooper;
    }

    public void cu(String paramString)
    {
      sendMessage(obtainMessage(1, paramString));
    }

    protected void cv(String paramString)
    {
      this.aqz.onContainerAvailable(n.this, paramString);
    }

    public void handleMessage(Message paramMessage)
    {
      switch (paramMessage.what)
      {
      default:
        bh.T("Don't know how to handle this message.");
        return;
      case 1:
      }
      cv((String)paramMessage.obj);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.n
 * JD-Core Version:    0.6.0
 */