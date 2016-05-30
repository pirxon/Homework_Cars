
public class Main {

	public static void main(String[] args) {
		Truck car1 = new Truck();
		car1.setCarModel("Kamaz");
		Engine car1_engine = new Engine();
		car1_engine.setEngine_capacity(10.8);
		car1_engine.setEngine_speed(2200);
		car1.setEngine(car1_engine);
		Transmission car1_transmission = new Transmission();
		car1_transmission.setTrans_type("Manual");
		car1_transmission.setNum_of_gears(15);
		car1.setTransmision(car1_transmission);
		car1.setMax_weit_load(7000);

		Auto car2 = new Amphibia();
		car2.setCarModel("Amphibia");
		Engine car2_engine = new Engine();
		car2_engine.setEngine_capacity(2.8);
		car2_engine.setEngine_speed(6000);
		Transmission car2_transmission = new Transmission();
		car2_transmission.setTrans_type("Auto");
		car2_transmission.setNum_of_gears(5);
		Amphibia amph1 = (Amphibia) car2;  // ���������
		amph1.setPassability(20);
		amph1.setSwim_ability(true);

		Auto[] cars = { new Auto(), new Truck(), new Amphibia(), new Amphibia() };
		int count1 = 0;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] instanceof Truck) {
				count1++;			
				//Amphibia amph2 = (Amphibia) cars[i];
				//amph2.setPassability(10); // ���� �������� ������ ������������ 10
			}
		}
		System.out.println("� ������� ������� "+count1+" ��������-�����");
		
		Swim_ability[] boat = {new Amphibia(), new Amphibia(), new Amphibia()};
		int count2 = 0;
		for (int i = 0; i < boat.length; i++) {
			if (boat[i] instanceof Amphibia) {
				count2++;			
			}
		}
		System.out.println("� ������� ������� "+count2+" ���������-�����");
		
	}
}