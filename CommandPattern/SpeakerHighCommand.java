package CommandPattern;

public class SpeakerHighCommand implements Command{
    Speaker speaker;
    int prevVolume;

    public SpeakerHighCommand(Speaker speaker){
        this.speaker = speaker;
    }

    public void execute(){
        prevVolume = speaker.getVolume();
        speaker.high();
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
