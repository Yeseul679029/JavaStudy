package ex12inheritance;

class SpeakerP {
	private int volumnRate;
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커의 볼륨크기:"+volumnRate);
	}
}
class BaseSpeakerP	extends SpeakerP{
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	@Override
	public void showState() {
		super.showState();
		System.out.println("베이스의 볼륨크기:"+baseRate);
	}
}
public class E06OverridingP {

	public static void main(String[] args) {

		BaseSpeakerP baseSpeaker = new BaseSpeakerP();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
		baseSpeaker.showState();
		
		System.out.println();
		
		SpeakerP speaker = new BaseSpeakerP();
		speaker.setVolumn(30);
//		speaker.setBase(40);
		speaker.showState();
	}

}
