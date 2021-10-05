import javax.sound.midi.*;
import static java.lang.System.out;
import static java.lang.Math.*;


public class MusicTest1 {

 public void play() {
    try {
        Sequencer sequencer = MidiSystem.getSequencer(); 
        out.println("Successfully We got a sequencer");
        // out.println(sequencer.getDeviceInfo());
        sequencer.open();
        Sequence seq = new Sequence(Sequence.PPQ , 4);
        Track t = seq.createTrack();
        ShortMessage a = new ShortMessage();
        a.setMessage(144, 1, 44, 100);
        MidiEvent noteOn = new MidiEvent(a,1);
        t.add(noteOn);
        ShortMessage b = new ShortMessage();
        a.setMessage(128, 1, 44, 100);
        MidiEvent noteOff = new MidiEvent(b,16);
        t.add(noteOff);
        sequencer.setSequence(seq);
        sequencer.start();
    } catch(Exception ex) {
        out.println("Bummer");
        ex.printStackTrace();
    }finally{
        out.println("sqrt from math. " + sqrt(2.0));
    }
    
}

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}