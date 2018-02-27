package com.google.android.gms.common.api;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

public final class Batch extends BaseImplementation.AbstractPendingResult<BatchResult>
{
  private boolean JA;
  private boolean JB;
  private final PendingResult<?>[] JC;
  private int Jz;
  private final Object mH = new Object();

  private Batch(List<PendingResult<?>> paramList, Looper paramLooper)
  {
    super(new BaseImplementation.CallbackHandler(paramLooper));
    this.Jz = paramList.size();
    this.JC = new PendingResult[this.Jz];
    for (int i = 0; i < paramList.size(); i++)
    {
      PendingResult localPendingResult = (PendingResult)paramList.get(i);
      this.JC[i] = localPendingResult;
      localPendingResult.a(new PendingResult.a()
      {
        public void m(Status paramStatus)
        {
          while (true)
          {
            synchronized (Batch.a(Batch.this))
            {
              if (Batch.this.isCanceled())
                return;
              if (paramStatus.isCanceled())
              {
                Batch.a(Batch.this, true);
                Batch.b(Batch.this);
                if (Batch.c(Batch.this) != 0)
                  continue;
                if (!Batch.d(Batch.this))
                  break;
                Batch.e(Batch.this);
                return;
              }
            }
            if (paramStatus.isSuccess())
              continue;
            Batch.b(Batch.this, true);
          }
          if (Batch.f(Batch.this));
          for (Status localStatus = new Status(13); ; localStatus = Status.Kw)
          {
            Batch.this.b(new BatchResult(localStatus, Batch.g(Batch.this)));
            break;
          }
        }
      });
    }
  }

  public void cancel()
  {
    super.cancel();
    PendingResult[] arrayOfPendingResult = this.JC;
    int i = arrayOfPendingResult.length;
    for (int j = 0; j < i; j++)
      arrayOfPendingResult[j].cancel();
  }

  public BatchResult createFailedResult(Status paramStatus)
  {
    return new BatchResult(paramStatus, this.JC);
  }

  public static final class Builder
  {
    private List<PendingResult<?>> JE = new ArrayList();
    private Looper JF;

    public Builder(GoogleApiClient paramGoogleApiClient)
    {
      this.JF = paramGoogleApiClient.getLooper();
    }

    public <R extends Result> BatchResultToken<R> add(PendingResult<R> paramPendingResult)
    {
      BatchResultToken localBatchResultToken = new BatchResultToken(this.JE.size());
      this.JE.add(paramPendingResult);
      return localBatchResultToken;
    }

    public Batch build()
    {
      return new Batch(this.JE, this.JF, null);
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.Batch
 * JD-Core Version:    0.6.0
 */