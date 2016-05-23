
public class StateAAB extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "A")
			machine.setState(new StateA());
		else if (event.ID == "B")
			machine.setState(new StateStart());
		else if (event.ID == "C")
			machine.setState(new StateAABC());
	}

}
