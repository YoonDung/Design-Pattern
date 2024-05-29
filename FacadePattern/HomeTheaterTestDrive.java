package FacadePattern;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier("앰프");
		Tuner tuner = new Tuner("AM/FM 튜너", amp);
		StreamingPlayer player = new StreamingPlayer("스트리밍 플레이어", amp);
		CdPlayer cd = new CdPlayer("CD 플레이어", amp);
		Projector projector = new Projector("프로젝터", player);
		TheaterLights lights = new TheaterLights("극장 천장 조명");
		Screen screen = new Screen("극장 스크린");
		PopcornPopper popper = new PopcornPopper("팝콘 기계");

		HomeTheaterFacade homeTheater =
				new HomeTheaterFacade(amp, tuner, player,
						projector, screen, lights, popper);

		homeTheater.watchMovie("나의 소녀시대");
		homeTheater.endMovie();
	}
}
