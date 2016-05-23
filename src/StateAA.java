
public class StateAA extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "B")
			machine.setState(new StateAAB());
		else if (event.ID == "C")
			machine.setState(new StateAC());
	}

}
