
public class StateAC extends State {

	@Override
	public void doAction(Machine machine, Event event) {
		System.out.println("Seq 3");
		machine.setState(new StateStart());
	}

}
