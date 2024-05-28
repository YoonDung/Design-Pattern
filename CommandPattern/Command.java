package CommandPattern;

public interface Command {
    public void execute();
    public void undo();
}
// 조작하는 방법을 알고 있는 유일한 사람 (주방장) => 커맨드 객체
// 메소드를 전달하는 사람 (종업원) => 인보커 객체
// 어떤 메소드를 써야할지 (주문서) => 리시버 객체
// orderUp => execute()
// => 요청을 큐에 저장하거나 로그로 기록하거나 작업 취소 기능을 사용할 수 있음

// 리시버 객체 : Light, Speaker, Vim
// 커맨드 객체 : LightOnCommand, LightOffCommand, SpeakerHighCommand, SpeakerMediumCommand, SpeakerOffCommand, VimOnCommand, VimOffCommand
// 인보커 객체 : RemoteControl
// 클라이언트 : RemoteLoader
