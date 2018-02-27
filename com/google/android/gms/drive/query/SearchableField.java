package com.google.android.gms.drive.query;

import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.metadata.SearchableCollectionMetadataField;
import com.google.android.gms.drive.metadata.SearchableMetadataField;
import com.google.android.gms.drive.metadata.SearchableOrderedMetadataField;
import com.google.android.gms.drive.metadata.internal.AppVisibleCustomProperties;
import com.google.android.gms.internal.ln;
import com.google.android.gms.internal.lp;
import java.util.Date;

public class SearchableField
{
  public static final SearchableMetadataField<Boolean> IS_PINNED;
  public static final SearchableOrderedMetadataField<Date> LAST_VIEWED_BY_ME;
  public static final SearchableMetadataField<String> MIME_TYPE;
  public static final SearchableOrderedMetadataField<Date> MODIFIED_DATE;
  public static final SearchableCollectionMetadataField<DriveId> PARENTS;
  public static final SearchableMetadataField<Boolean> STARRED;
  public static final SearchableOrderedMetadataField<Date> Sd;
  public static final SearchableMetadataField<AppVisibleCustomProperties> Se;
  public static final SearchableMetadataField<String> TITLE = ln.RJ;
  public static final SearchableMetadataField<Boolean> TRASHED;

  static
  {
    MIME_TYPE = ln.RA;
    TRASHED = ln.RK;
    PARENTS = ln.RF;
    Sd = lp.RU;
    STARRED = ln.RH;
    MODIFIED_DATE = lp.RS;
    LAST_VIEWED_BY_ME = lp.RR;
    IS_PINNED = ln.Rv;
    Se = ln.Rl;
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.query.SearchableField
 * JD-Core Version:    0.6.0
 */