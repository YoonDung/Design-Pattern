package FacadePattern;

public class StreamingPlayer {
	String description;
	int currentChapter;
	Amplifier amplifier;
	String movie;
	
	public StreamingPlayer(String description, Amplifier amplifier) {
		this.description = description;
		this.amplifier = amplifier;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
 
	public void play(String movie) {
		this.movie = movie;
		currentChapter = 0;
		System.out.println(description + " \"" + movie + "\" 재생 중");	}

	public void play(int chapter) {
		if (movie == null) {
			System.out.println(description + " 챕터 " + chapter + "을(를) 재생할 수 없음. 선택된 영화가 없음");
		} else {
			currentChapter = chapter;
			System.out.println(description + " \"" + movie + "\"의 챕터 " + currentChapter + " 재생 중");
		}
	}

	public void stop() {
		currentChapter = 0;
		System.out.println(description + " \"" + movie + "\" 정지");	}
 
	public void pause() {
		System.out.println(description + " \"" + movie + "\" 일시 정지");	}

	public void setTwoChannelAudio() {
		System.out.println(description + " 2채널 오디오 설정");	}

	public void setSurroundAudio() {
		System.out.println(description + " 서라운드 오디오 설정");	}

	public String toString() {
		return description;
	}
}
