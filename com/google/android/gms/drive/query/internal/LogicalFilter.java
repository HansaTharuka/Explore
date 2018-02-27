package com.google.android.gms.drive.query.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.drive.query.Filter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogicalFilter extends AbstractFilter
{
  public static final Parcelable.Creator<LogicalFilter> CREATOR = new i();
  final int CK;
  private List<Filter> Sc;
  final Operator Sh;
  final List<FilterHolder> Su;

  LogicalFilter(int paramInt, Operator paramOperator, List<FilterHolder> paramList)
  {
    this.CK = paramInt;
    this.Sh = paramOperator;
    this.Su = paramList;
  }

  public LogicalFilter(Operator paramOperator, Filter paramFilter, Filter[] paramArrayOfFilter)
  {
    this.CK = 1;
    this.Sh = paramOperator;
    this.Su = new ArrayList(1 + paramArrayOfFilter.length);
    this.Su.add(new FilterHolder(paramFilter));
    this.Sc = new ArrayList(1 + paramArrayOfFilter.length);
    this.Sc.add(paramFilter);
    int i = paramArrayOfFilter.length;
    for (int j = 0; j < i; j++)
    {
      Filter localFilter = paramArrayOfFilter[j];
      this.Su.add(new FilterHolder(localFilter));
      this.Sc.add(localFilter);
    }
  }

  public LogicalFilter(Operator paramOperator, Iterable<Filter> paramIterable)
  {
    this.CK = 1;
    this.Sh = paramOperator;
    this.Sc = new ArrayList();
    this.Su = new ArrayList();
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      Filter localFilter = (Filter)localIterator.next();
      this.Sc.add(localFilter);
      this.Su.add(new FilterHolder(localFilter));
    }
  }

  public <T> T a(f<T> paramf)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.Su.iterator();
    while (localIterator.hasNext())
      localArrayList.add(((FilterHolder)localIterator.next()).getFilter().a(paramf));
    return paramf.b(this.Sh, localArrayList);
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    i.a(this, paramParcel, paramInt);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.internal.LogicalFilter
 * JD-Core Version:    0.6.0
 */