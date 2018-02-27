package com.google.android.gms.games.quest;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.g;

public final class QuestBuffer extends g<Quest>
{
  public QuestBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }

  protected String ha()
  {
    return "external_quest_id";
  }

  protected Quest n(int paramInt1, int paramInt2)
  {
    return new QuestRef(this.JG, paramInt1, paramInt2);
  }
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.quest.QuestBuffer
 * JD-Core Version:    0.6.0
 */