
public class MarsRoverSolutionDemo {

	public static void main(String[] args) {

		// Expected Output: 1 3 N
		MarsRover rover = new MarsRover();
		rover.setPosition(1, 2, "N");
		rover.process("LMLMLMLMM");
		rover.printRoverPosition();

		// Expected Output: 5 1 E
		rover.setPosition(3, 3, "E");
		rover.process("MMRMMRMRRM");
		rover.printRoverPosition();
	}

}
