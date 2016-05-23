import java.util.Scanner;

public class StateMachineProgram {
	
	static final String machineConfigFilePath = System.getenv("APPDATA") + "\\lastSavedState.ser";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Machine machine;
		
		machine = new Machine(new MachineConfig(machineConfigFilePath), new StateStart());
		
		while (true) {
			Event newEvent;
			System.out.println("Enter new event:");
			String input = scanner.nextLine();
			
			if (input.equals("A"))
				newEvent = new EventA();
			else if (input.equals("B"))
				newEvent = new EventB();
			else if (input.equals("C"))
				newEvent = new EventC();
			else {
				System.out.println("Invalid event type - ignoring input.");
				continue;
			}
			
			machine.handleEvent(newEvent);
		}
	}

}
