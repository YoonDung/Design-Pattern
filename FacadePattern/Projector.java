package FacadePattern;

public class Projector {
	String description;
	StreamingPlayer player;
	
	public Projector(String description, StreamingPlayer player) {
		this.description = description;
		this.player = player;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void wideScreenMode() {
		System.out.println(description + " 와이드 스크린 모드 (16x9 비율)");
	}

	public void tvMode() {
		System.out.println(description + " TV mode (4x3 비율)");
	}
  
        public String toString() {
                return description;
        }
}
