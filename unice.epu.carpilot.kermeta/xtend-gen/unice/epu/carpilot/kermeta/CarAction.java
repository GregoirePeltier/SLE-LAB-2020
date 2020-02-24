package unice.epu.carpilot.kermeta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import unice.epu.carpilot.ecore.carpilot.Command;
import unice.epu.carpilot.ecore.carpilot.Direction;
import unice.epu.carpilot.kermeta.KernelCommand;

@SuppressWarnings("all")
public class CarAction {
  private HashMap<Direction, Boolean> abilities = new HashMap<Direction, Boolean>();
  
  public Command currentCommand;
  
  public CarAction() {
    this.abilities.put(Direction.RIGHT, Boolean.valueOf(true));
    this.abilities.put(Direction.LEFT, Boolean.valueOf(true));
    this.abilities.put(Direction.FORWARD, Boolean.valueOf(true));
    this.abilities.put(Direction.BACKWARD, Boolean.valueOf(true));
    this.abilities.put(Direction.STOP, Boolean.valueOf(true));
  }
  
  public Boolean setAbility(final Direction direction, final boolean value) {
    return this.abilities.put(direction, Boolean.valueOf(value));
  }
  
  public Command getNextPossibleCommand() {
    Boolean _get = this.abilities.get(this.currentCommand.getDirection());
    if ((_get).booleanValue()) {
      return this.currentCommand;
    }
    Direction validDirection = Direction.FORWARD;
    int i = 0;
    Set<Direction> _keySet = this.abilities.keySet();
    ArrayList<Direction> directions = new ArrayList<Direction>(_keySet);
    while ((!(this.abilities.get(validDirection)).booleanValue())) {
      validDirection = directions.get(i);
    }
    KernelCommand command = new KernelCommand();
    command.setDirection(validDirection);
    return command;
  }
}
