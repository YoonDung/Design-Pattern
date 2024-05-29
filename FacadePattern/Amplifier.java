package FacadePattern;

public class Amplifier {
	String description;
	Tuner tuner;
	StreamingPlayer player;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void setStereoSound() {
		System.out.println(description + " 스테레오 모드 온!");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " 서라운드 모드 온! (5 스피커, 1 서브우퍼)");
	}
 
	public void setVolume(int level) {
		System.out.println(description + " 볼륨을 설정합니다. " + level);
	}

	public void setTuner(Tuner tuner) {
		System.out.println(description + " 튜너 설정 " + player);
		this.tuner = tuner;
	}
  
	public void setStreamingPlayer(StreamingPlayer player) {
		System.out.println(description + " 스트리밍 플레이어를 " + player + "로 설정");
		this.player = player;
	}
 
	public String toString() {
		return description;
	}
}
