package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.jx;
import java.util.List;

public class AccountChangeEventsResponse
  implements SafeParcelable
{
  public static final AccountChangeEventsResponseCreator CREATOR = new AccountChangeEventsResponseCreator();
  final int Ef;
  final List<AccountChangeEvent> mp;

  AccountChangeEventsResponse(int paramInt, List<AccountChangeEvent> paramList)
  {
    this.Ef = paramInt;
    this.mp = ((List)jx.i(paramList));
  }

  public AccountChangeEventsResponse(List<AccountChangeEvent> paramList)
  {
    this.Ef = 1;
    this.mp = ((List)jx.i(paramList));
  }

  public int describeContents()
  {
    return 0;
  }

  public List<AccountChangeEvent> getEvents()
  {
    return this.mp;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AccountChangeEventsResponseCreator.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.AccountChangeEventsResponse
 * JD-Core Version:    0.6.0
 */