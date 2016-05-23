
public class StateStart extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.getID() == "A")
			machine.setState(new StateA());
	}

}
