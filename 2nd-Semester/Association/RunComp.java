public class RunComp {

	public static void main(String[] args) {
		Computer c1 = new Computer();
//		c1.state();
		
		Ram a1 = new Ram(5600,8);
		HardDisk h2 = new HardDisk(12000,"SSD",213);
		Computer c2 = new Computer(250000,"HP",h2,a1);
		c2.state();
	}

}