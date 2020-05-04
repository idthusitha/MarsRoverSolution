
public class MarsRoverSolutionDemo {

	public static void main(String[] args) {
		try {
			// Expected Output: 1 3 N
			MarsRover rover = new MarsRover();
			rover.setPosition(1, 2, "N");
			rover.process("LMLMLMLMM");
			rover.printRoverPosition();

			/**Next command should run after first command is completed, I assumed it will take 1000 Ms time */
			Thread.sleep(1000);
			
			// Expected Output: 5 1 E
			rover = new MarsRover();
			rover.setPosition(3, 3, "E");
			rover.process("MMRMMRMRRM");
			rover.printRoverPosition();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
