package com.google.android.gms.games.multiplayer;

public abstract interface Multiplayer
{
  public static final String EXTRA_EXCLUSIVE_BIT_MASK = "exclusive_bit_mask";
  public static final String EXTRA_INVITATION = "invitation";
  public static final String EXTRA_MAX_AUTOMATCH_PLAYERS = "max_automatch_players";
  public static final String EXTRA_MIN_AUTOMATCH_PLAYERS = "min_automatch_players";
  public static final String EXTRA_ROOM = "room";
  public static final String EXTRA_TURN_BASED_MATCH = "turn_based_match";
  public static final int MAX_RELIABLE_MESSAGE_LEN = 1400;
  public static final int MAX_UNRELIABLE_MESSAGE_LEN = 1168;
  public static final int SORT_ORDER_MOST_RECENT_FIRST = 0;
  public static final int SORT_ORDER_SOCIAL_AGGREGATION = 1;
}

/* Location:           D:\Testing\hacking\dex2jar-0.0.9.15\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.google.android.gms.games.multiplayer.Multiplayer
 * JD-Core Version:    0.6.0
 */