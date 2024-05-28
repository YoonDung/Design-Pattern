package CommandPattern;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        // Light 설정
        Light frontRoomLight = new Light("앞쪽");
        LightOnCommand frontRoomLightOn = new LightOnCommand(frontRoomLight);
        LightOffCommand frontRoomLightOff = new LightOffCommand(frontRoomLight);
        remoteControl.setCommand(0, frontRoomLightOn, frontRoomLightOff);

        // Speaker 설정
        Speaker speaker = new Speaker("메인");
        SpeakerHighCommand speakerHigh = new SpeakerHighCommand(speaker);
        SpeakerMediumCommand speakerMedium = new SpeakerMediumCommand(speaker);
        SpeakerOffCommand speakerOff = new SpeakerOffCommand(speaker);
        remoteControl.setCommand(1, speakerHigh, speakerOff);
        remoteControl.setCommand(2, speakerMedium, speakerOff);

        // Vim 설정
        Vim mainVim = new Vim("메인");
        VimOnCommand mainVimOn = new VimOnCommand(mainVim);
        VimOffCommand mainVimOff = new VimOffCommand(mainVim);
        remoteControl.setCommand(3, mainVimOn, mainVimOff);

        // 리모컨 조작 테스트
        System.out.println(remoteControl);

        // Light 테스트
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        // Speaker 테스트
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
        remoteControl.onButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();

        // Vim 테스트
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.undoButtonWasPushed();
    }
}
