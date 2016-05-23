
public class StateABCMultiple extends State {
	
	final int RequestedCLoopNum = 2;
	int counter = 0;
	
	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "A")
			machine.setState(new StateA());
		else if (event.ID == "B")
			machine.setState(new StateStart());
		else if (event.ID == "C")
			if (++counter > RequestedCLoopNum)
				machine.setState(new StateABC1000());
	}

}
