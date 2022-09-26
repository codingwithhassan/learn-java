public class Main{
	public static void main(String[] args) {
		Computer c = new Computer();
		
		Rom r = new Rom();
		r.storage = 3;
		c.setRom(r);

		c.setRam(5);

	}
}