
interface AudioPlayer{
	void play();
}
interface AudioRecorder{
	void recorder();
}
interface AudioSystem extends AudioPlayer,AudioRecorder{
	
}
interface FMplayer{
	void playFm();
}
abstract class BaseMusicSystem implements AudioSystem,FMplayer{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play audio....");
	}

	@Override
	public void recorder() {
		// TODO Auto-generated method stub
		System.out.println("record audio.......");
	}

}
class MusicSystem extends BaseMusicSystem{

	@Override
	public void playFm() {
		// TODO Auto-generated method stub
		System.out.println("play FM....");
	}
	public void switchOff() {
		System.out.println("Switch off..");
	}
}

public class Main {
	public static void main(String []args) {
		MusicSystem m=new MusicSystem();
		m.play();
		m.recorder();
		m.switchOff();
		m.playFm();
		
		AudioPlayer audioplayer=m;
		audioplayer.play();
		
		AudioRecorder audiorecorder=m;
		audiorecorder.recorder();
		
		FMplayer fmplayer=m;
		fmplayer.playFm();
		
	}
}
