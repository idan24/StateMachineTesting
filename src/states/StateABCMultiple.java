package states;

import framework.*;

public class StateABCMultiple extends State {
	
	private static final int REQUIRED_C_COUNT = 997;
	private int cCounter = 0;
	
	@Override
	public State doAction(Event event) {
		switch (event.getID()) {
			case "A": return new StateA();
			case "B": return new StateStart();
			case "C": 
				if (++cCounter > REQUIRED_C_COUNT) {
					return new StateABC1000();
				}
				else {
					return this;
				}
			default:  return this;
		}
	}

}
