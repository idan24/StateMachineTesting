
public class StateAABC extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "A") {
			System.out.println("Seq 1");
			machine.setState(new StateStart());
		}
		else if (event.ID == "B")
			machine.setState(new StateStart());
		else if (event.ID == "C")
			machine.setState(new StateABCMultiple());
	}

}
