
public class Laptop extends Computer {
	double weight;
	double battery_time;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, int price, String cpu, int ram, int hdd, int weight, int battery_time) {
		super(name, price, cpu, ram, hdd);
		this.weight = weight;
		this.battery_time = battery_time;
	}

	@Override
	public void print_info() {
		// TODO Auto-generated method stub
		super.print_info();
		System.out.printf("무게 : %.1fg\n",weight);
		System.out.printf("배터리 지속시간 : %.1f시간\n",battery_time);
	}
}
