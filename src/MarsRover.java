
public class MarsRover {

	private int x = 0;
	private int y = 0;
	private String roverFacing = "N";

	public void setPosition(int x, int y, String roverFacingTemp) {
		synchronized (MarsRover.class) {
			this.x = x;
			this.y = y;
			this.roverFacing = roverFacingTemp;
		}
	}

	public void printRoverPosition() {
		System.out.println(x + " " + y + " " + roverFacing);
	}

	public void process(String commands) {
		for (Character command : commands.toCharArray()) {
			switch (command) {
			case 'L':
				turnRoverToLeft();
				break;
			case 'R':
				turnRoverToRight();
				break;
			case 'M':
				moveRoverForward();
				break;
			default:
				System.out.println("Invalid command...");
				break;
			}
		}
	}

	/**
	 * move the rover forward
	 */
	private void moveRoverForward() {
		if ("N".equals(roverFacing)) {
			y++;
		} else if ("S".equals(roverFacing)) {
			y--;
		} else if ("E".equals(roverFacing)) {
			x++;
		} else if ("W".equals(roverFacing)) {
			x--;
		}
	}

	/**
	 * turn the rover to the left
	 */
	private void turnRoverToLeft() {
		switch (roverFacing) {
		case "N":
			roverFacing = "W";
			break;
		case "W":
			roverFacing = "S";
			break;
		case "S":
			roverFacing = "E";
			break;
		case "E":
			roverFacing = "N";
			break;
		}
	}

	/**
	 * turn the rover to the right
	 */
	private void turnRoverToRight() {

		switch (roverFacing) {
		case "N":
			roverFacing = "E";
			break;
		case "E":
			roverFacing = "S";
			break;
		case "S":
			roverFacing = "W";
			break;
		case "W":
			roverFacing = "N";
			break;
		}
	}
}
