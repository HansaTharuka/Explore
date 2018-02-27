package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class cy extends cx
{
  private static cy atJ;
  private static final Object yT = new Object();
  private at atA;
  private volatile ar atB;
  private int atC = 1800000;
  private boolean atD = true;
  private boolean atE = false;
  private boolean atF = true;
  private au atG = new au()
  {
    public void B(boolean paramBoolean)
    {
      cy.this.a(paramBoolean, cy.a(cy.this));
    }
  };
  private bo atH;
  private boolean atI = false;
  private Context atz;
  private boolean connected = true;
  private Handler handler;

  private void ev()
  {
    this.atH = new bo(this);
    this.atH.z(this.atz);
  }

  private void ew()
  {
    this.handler = new Handler(this.atz.getMainLooper(), new Handler.Callback()
    {
      public boolean handleMessage(Message paramMessage)
      {
        if ((1 == paramMessage.what) && (cy.ez().equals(paramMessage.obj)))
        {
          cy.this.dispatch();
          if ((cy.b(cy.this) > 0) && (!cy.c(cy.this)))
            cy.d(cy.this).sendMessageDelayed(cy.d(cy.this).obtainMessage(1, cy.ez()), cy.b(cy.this));
        }
        return true;
      }
    });
    if (this.atC > 0)
      this.handler.sendMessageDelayed(this.handler.obtainMessage(1, yT), this.atC);
  }

  public static cy qN()
  {
    if (atJ == null)
      atJ = new cy();
    return atJ;
  }

  void C(boolean paramBoolean)
  {
    monitorenter;
    try
    {
      a(this.atI, paramBoolean);
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  void a(Context paramContext, ar paramar)
  {
    monitorenter;
    try
    {
      Context localContext = this.atz;
      if (localContext != null);
      while (true)
      {
        return;
        this.atz = paramContext.getApplicationContext();
        if (this.atB != null)
          continue;
        this.atB = paramar;
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    monitorenter;
    while (true)
    {
      try
      {
        if (this.atI != paramBoolean1)
          continue;
        boolean bool = this.connected;
        if (bool == paramBoolean2)
          return;
        if (((!paramBoolean1) && (paramBoolean2)) || (this.atC <= 0))
          continue;
        this.handler.removeMessages(1, yT);
        if ((paramBoolean1) || (!paramBoolean2) || (this.atC <= 0))
          continue;
        this.handler.sendMessageDelayed(this.handler.obtainMessage(1, yT), this.atC);
        StringBuilder localStringBuilder = new StringBuilder().append("PowerSaveMode ");
        if (paramBoolean1)
          break label153;
        if (!paramBoolean2)
        {
          break label153;
          bh.V(str);
          this.atI = paramBoolean1;
          this.connected = paramBoolean2;
          continue;
        }
      }
      finally
      {
        monitorexit;
      }
      String str = "terminated.";
      continue;
      label153: str = "initiated.";
    }
  }

  public void dispatch()
  {
    monitorenter;
    try
    {
      if (!this.atE)
      {
        bh.V("Dispatch call queued. Dispatch will run once initialization is complete.");
        this.atD = true;
      }
      while (true)
      {
        return;
        this.atB.b(new Runnable()
        {
          public void run()
          {
            cy.e(cy.this).dispatch();
          }
        });
      }
    }
    finally
    {
      monitorexit;
    }
    throw localObject;
  }

  void ey()
  {
    monitorenter;
    try
    {
      if ((!this.atI) && (this.connected) && (this.atC > 0))
      {
        this.handler.removeMessages(1, yT);
        this.handler.sendMessage(this.handler.obtainMessage(1, yT));
      }
      monitorexit;
      return;
    }
    finally
    {
      localObject = finally;
      monitorexit;
    }
    throw localObject;
  }

  at qO()
  {
    monitorenter;
    try
    {
      if (this.atA != null)
        break label50;
      if (this.atz == null)
        throw new IllegalStateException("Cant get a store unless we have a context");
    }
    finally
    {
      monitorexit;
    }
    this.atA = new cb(this.atG, this.atz);
    label50: if (this.handler == null)
      ew();
    this.atE = true;
    if (this.atD)
    {
      dispatch();
      this.atD = false;
    }
    if ((this.atH == null) && (this.atF))
      ev();
    at localat = this.atA;
    monitorexit;
    return localat;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.tagmanager.cy
 * JD-Core Version:    0.6.0
 */