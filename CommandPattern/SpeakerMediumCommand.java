package CommandPattern;

public class SpeakerMediumCommand implements Command{
    Speaker speaker;
    int prevVolume;

    public SpeakerMediumCommand(Speaker speaker){
        this.speaker = speaker;
    }

    public void execute(){
        prevVolume = speaker.getVolume();
        speaker.medium();
    }

    public void undo() {
        if(prevVolume == Speaker.HIGH){
            speaker.high();
        } else if (prevVolume == Speaker.MEDIUM){
            speaker.medium();
        } else if (prevVolume == Speaker.LOW){
            speaker.low();
        } else if (prevVolume == Speaker.OFF){
            speaker.off();
        }
    }
}
