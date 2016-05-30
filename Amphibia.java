public class Amphibia extends Auto implements Swim_ability {  // Реализация интерфейса умение плавать
	
	private int passability; // проходимость
	private boolean swim_ability; // умеет плавать или нет 

	public int getPassability() {
		return passability;
	}
	public void setPassability(int passability) {
		this.passability = passability;
	}

	public boolean isSwim_ability() {
		return swim_ability;
	}
	public void setSwim_ability(boolean swim_ability) {
		this.swim_ability = swim_ability;
	}
	
}
