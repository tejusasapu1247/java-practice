import java.util.Scanner;

interface VideoPlayer{
	void play(String file);
}
class MP4player implements VideoPlayer{

	@Override
	public void play(String file) {
		// TODO Auto-generated method stub
		System.out.println("play MP4 file..."+file);
	}
}
class AviPlayer implements VideoPlayer{

	@Override
	public void play(String file) {
		// TODO Auto-generated method stub
		System.out.println("play AVI file..."+file);
	}
  }
class PlayerFactory{
	public VideoPlayer getVideoPlayer(String file) {
		if(file.endsWith(".mp4")) {
			return new MP4player();
		}
		if(file.endsWith(".avi")) {
			return new AviPlayer();
		}
		else		return null;
	}
}
public class Main {
		public static void main(String []args) {
			String file;
			//AviPlayer aviplayer=new AviPlayer();
			//aviplayer.play(file);
			//MP4player mp=new MP4player();
			//mp.play(file);
			Scanner ip=new Scanner(System.in);
			System.out.println("enter the song name that you want to play:");
			file=ip.nextLine();
			PlayerFactory factory=new PlayerFactory();
			VideoPlayer player=factory.getVideoPlayer(file);
			if(player!=null)	player.play(file);
		
		}
}