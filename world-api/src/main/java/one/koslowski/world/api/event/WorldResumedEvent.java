package one.koslowski.world.api.event;

import one.koslowski.world.api.World;

public class WorldResumedEvent extends WorldStateEvent
{
  private static final long serialVersionUID = 1L;

  public WorldResumedEvent(World source)
  {
    super(source);
  }

}