
public class StateABC1000 extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		if (event.ID == "A")
			System.out.println("Seq 2");
		machine.setState(new StateStart());
	}

}
