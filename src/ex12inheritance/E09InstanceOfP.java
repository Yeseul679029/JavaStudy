package ex12inheritance;

class BoxP{
	public void boxWrap() {
		System.out.println("Box로 포장합니다");
	}
}
class PaperBoxP extends BoxP{
	public void paperWrap() {
		System.out.println("PaperBox로 포장합니다");
	}
}
class GoldPaperBoxP extends PaperBoxP{
	public void goldWrap() {
		System.out.println("GoldPaperBox로 포장합니다");
	}
}
public class E09InstanceOfP {
	
	static void wrapBox(BoxP b) {
		if(b instanceof GoldPaperBoxP) {
			((GoldPaperBoxP) b).goldWrap();
		}
		else if(b instanceof PaperBoxP) {
			((PaperBoxP) b).paperWrap();
		}
		else if(b instanceof BoxP) {
			((BoxP)b).boxWrap();
		}
	}
	public static void main(String[] args) {

		BoxP box1 = new BoxP();
		PaperBoxP box2 = new PaperBoxP();
		GoldPaperBoxP box3 = new GoldPaperBoxP();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}

}
