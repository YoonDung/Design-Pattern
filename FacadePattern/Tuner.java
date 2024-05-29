package FacadePattern;

public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;

	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " on");
	}

	public void off() {
		System.out.println(description + " off");
	}

	public void setFrequency(double frequency) {
		System.out.println(description + " 주파수를 " + frequency + "로 설정");
		this.frequency = frequency;
	}

	public void setAm() {
		System.out.println(description + " AM 모드 설정");
	}

	public void setFm() {
		System.out.println(description + " FM 모드 설정");
	}

	public String toString() {
		return description;
	}
}
