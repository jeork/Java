
public class Computer {

	String cpu;
	int ram;
	int hdd;
	Company brand;

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	public Computer(String cpu, int ram, int hdd, Company brand) {
		super();
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
		this.brand = brand;
	}

	public void print_info() {
		System.out.printf("CPU : %s\n", cpu);
		System.out.printf("RAM : %dGB\n", ram);
		System.out.printf("HDD : %dGB\n", hdd);
//		System.out.println(brand.name);
//		System.out.println(brand.location);
//		System.out.println(brand.employee);
		brand.print_info();
	}
}
