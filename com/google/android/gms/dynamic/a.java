package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class a<T extends LifecycleDelegate>
{
  private T Tu;
  private Bundle Tv;
  private LinkedList<a> Tw;
  private final f<T> Tx = new f()
  {
    public void a(T paramT)
    {
      a.a(a.this, paramT);
      Iterator localIterator = a.a(a.this).iterator();
      while (localIterator.hasNext())
        ((a.a)localIterator.next()).b(a.b(a.this));
      a.a(a.this).clear();
      a.a(a.this, null);
    }
  };

  private void a(Bundle paramBundle, a parama)
  {
    if (this.Tu != null)
    {
      parama.b(this.Tu);
      return;
    }
    if (this.Tw == null)
      this.Tw = new LinkedList();
    this.Tw.add(parama);
    if (paramBundle != null)
    {
      if (this.Tv != null)
        break label76;
      this.Tv = ((Bundle)paramBundle.clone());
    }
    while (true)
    {
      a(this.Tx);
      return;
      label76: this.Tv.putAll(paramBundle);
    }
  }

  public static void b(FrameLayout paramFrameLayout)
  {
    Context localContext = paramFrameLayout.getContext();
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(localContext);
    String str1 = GooglePlayServicesUtil.b(localContext, i);
    String str2 = GooglePlayServicesUtil.c(localContext, i);
    LinearLayout localLinearLayout = new LinearLayout(paramFrameLayout.getContext());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    paramFrameLayout.addView(localLinearLayout);
    TextView localTextView = new TextView(paramFrameLayout.getContext());
    localTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
    localTextView.setText(str1);
    localLinearLayout.addView(localTextView);
    if (str2 != null)
    {
      Button localButton = new Button(localContext);
      localButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
      localButton.setText(str2);
      localLinearLayout.addView(localButton);
      localButton.setOnClickListener(new View.OnClickListener(localContext, i)
      {
        public void onClick(View paramView)
        {
          this.nf.startActivity(GooglePlayServicesUtil.aj(this.TF));
        }
      });
    }
  }

  private void cG(int paramInt)
  {
    while ((!this.Tw.isEmpty()) && (((a)this.Tw.getLast()).getState() >= paramInt))
      this.Tw.removeLast();
  }

  protected void a(FrameLayout paramFrameLayout)
  {
    b(paramFrameLayout);
  }

  protected abstract void a(f<T> paramf);

  public T je()
  {
    return this.Tu;
  }

  public void onCreate(Bundle paramBundle)
  {
    a(paramBundle, new a(paramBundle)
    {
      public void b(LifecycleDelegate paramLifecycleDelegate)
      {
        a.b(a.this).onCreate(this.TB);
      }

      public int getState()
      {
        return 1;
      }
    });
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    FrameLayout localFrameLayout = new FrameLayout(paramLayoutInflater.getContext());
    a(paramBundle, new a(localFrameLayout, paramLayoutInflater, paramViewGroup, paramBundle)
    {
      public void b(LifecycleDelegate paramLifecycleDelegate)
      {
        this.TC.removeAllViews();
        this.TC.addView(a.b(a.this).onCreateView(this.TD, this.TE, this.TB));
      }

      public int getState()
      {
        return 2;
      }
    });
    if (this.Tu == null)
      a(localFrameLayout);
    return localFrameLayout;
  }

  public void onDestroy()
  {
    if (this.Tu != null)
    {
      this.Tu.onDestroy();
      return;
    }
    cG(1);
  }

  public void onDestroyView()
  {
    if (this.Tu != null)
    {
      this.Tu.onDestroyView();
      return;
    }
    cG(2);
  }

  public void onInflate(Activity paramActivity, Bundle paramBundle1, Bundle paramBundle2)
  {
    a(paramBundle2, new a(paramActivity, paramBundle1, paramBundle2)
    {
      public void b(LifecycleDelegate paramLifecycleDelegate)
      {
        a.b(a.this).onInflate(this.Tz, this.TA, this.TB);
      }

      public int getState()
      {
        return 0;
      }
    });
  }

  public void onLowMemory()
  {
    if (this.Tu != null)
      this.Tu.onLowMemory();
  }

  public void onPause()
  {
    if (this.Tu != null)
    {
      this.Tu.onPause();
      return;
    }
    cG(5);
  }

  public void onResume()
  {
    a(null, new a()
    {
      public void b(LifecycleDelegate paramLifecycleDelegate)
      {
        a.b(a.this).onResume();
      }

      public int getState()
      {
        return 5;
      }
    });
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    if (this.Tu != null)
      this.Tu.onSaveInstanceState(paramBundle);
    do
      return;
    while (this.Tv == null);
    paramBundle.putAll(this.Tv);
  }

  public void onStart()
  {
    a(null, new a()
    {
      public void b(LifecycleDelegate paramLifecycleDelegate)
      {
        a.b(a.this).onStart();
      }

      public int getState()
      {
        return 4;
      }
    });
  }

  public void onStop()
  {
    if (this.Tu != null)
    {
      this.Tu.onStop();
      return;
    }
    cG(4);
  }

  private static abstract interface a
  {
    public abstract void b(LifecycleDelegate paramLifecycleDelegate);

    public abstract int getState();
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamic.a
 * JD-Core Version:    0.6.0
 */