public class Computer{
	private RAM ram;
	private Rom rom;

	public void setRam(int storage){
		this.ram = new RAM();
		ram.storage = storage;
		System.out.println("in ram");
	}

	public void setRom(Rom rom){
		this.rom = rom;
		System.out.println("in rom");
	}
}