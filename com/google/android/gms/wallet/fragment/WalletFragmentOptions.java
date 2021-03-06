package com.google.android.gms.wallet.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.R.styleable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class WalletFragmentOptions
  implements SafeParcelable
{
  public static final Parcelable.Creator<WalletFragmentOptions> CREATOR = new b();
  final int CK;
  private int Oi;
  private int avV;
  private WalletFragmentStyle aww;
  private int mTheme;

  private WalletFragmentOptions()
  {
    this.CK = 1;
  }

  WalletFragmentOptions(int paramInt1, int paramInt2, int paramInt3, WalletFragmentStyle paramWalletFragmentStyle, int paramInt4)
  {
    this.CK = paramInt1;
    this.avV = paramInt2;
    this.mTheme = paramInt3;
    this.aww = paramWalletFragmentStyle;
    this.Oi = paramInt4;
  }

  public static WalletFragmentOptions a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.WalletFragmentOptions);
    int i = localTypedArray.getInt(R.styleable.WalletFragmentOptions_appTheme, 0);
    int j = localTypedArray.getInt(R.styleable.WalletFragmentOptions_environment, 1);
    int k = localTypedArray.getResourceId(R.styleable.WalletFragmentOptions_fragmentStyle, 0);
    int m = localTypedArray.getInt(R.styleable.WalletFragmentOptions_fragmentMode, 1);
    localTypedArray.recycle();
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.mTheme = i;
    localWalletFragmentOptions.avV = j;
    localWalletFragmentOptions.aww = new WalletFragmentStyle().setStyleResourceId(k);
    localWalletFragmentOptions.aww.ab(paramContext);
    localWalletFragmentOptions.Oi = m;
    return localWalletFragmentOptions;
  }

  public static Builder newBuilder()
  {
    WalletFragmentOptions localWalletFragmentOptions = new WalletFragmentOptions();
    localWalletFragmentOptions.getClass();
    return new Builder(null);
  }

  public void ab(Context paramContext)
  {
    if (this.aww != null)
      this.aww.ab(paramContext);
  }

  public int describeContents()
  {
    return 0;
  }

  public int getEnvironment()
  {
    return this.avV;
  }

  public WalletFragmentStyle getFragmentStyle()
  {
    return this.aww;
  }

  public int getMode()
  {
    return this.Oi;
  }

  public int getTheme()
  {
    return this.mTheme;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel, paramInt);
  }

  public final class Builder
  {
    private Builder()
    {
    }

    public WalletFragmentOptions build()
    {
      return WalletFragmentOptions.this;
    }

    public Builder setEnvironment(int paramInt)
    {
      WalletFragmentOptions.a(WalletFragmentOptions.this, paramInt);
      return this;
    }

    public Builder setFragmentStyle(int paramInt)
    {
      WalletFragmentOptions.a(WalletFragmentOptions.this, new WalletFragmentStyle().setStyleResourceId(paramInt));
      return this;
    }

    public Builder setFragmentStyle(WalletFragmentStyle paramWalletFragmentStyle)
    {
      WalletFragmentOptions.a(WalletFragmentOptions.this, paramWalletFragmentStyle);
      return this;
    }

    public Builder setMode(int paramInt)
    {
      WalletFragmentOptions.c(WalletFragmentOptions.this, paramInt);
      return this;
    }

    public Builder setTheme(int paramInt)
    {
      WalletFragmentOptions.b(WalletFragmentOptions.this, paramInt);
      return this;
    }
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.fragment.WalletFragmentOptions
 * JD-Core Version:    0.6.0
 */