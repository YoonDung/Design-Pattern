package FacadePattern;

public class TheaterLights {
	String description;

	public TheaterLights(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void dim(int level) {
		System.out.println(description + " 밝기를 " + level  + "%로 조절");
	}

	public String toString() {
		return description;
	}
}
