
public class StateA extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "A")
			machine.setState(new StateAA());
		else if (event.ID == "B")
			machine.setState(new StateAB());
		else if (event.ID == "C")
			machine.setState(new StateAC());
	}
}
