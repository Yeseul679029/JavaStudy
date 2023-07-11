package ex12inheritance;

class ComputerP{
	
	String owner;
	
	//public ComputerP() {}
	public ComputerP(String name) {
		owner = name;
	}
	private void KeyboardTouch() {
		System.out.println("키보드를 통해서 입력한 ");
	}
	private void calculate() {
		System.out.println("요청된 내용을 계산한다.");
	}
	public void calculateFunc() {
		KeyboardTouch();
		calculate();
	}
}

class NotebookComputerP extends ComputerP{
	
	int battary;
	
	public NotebookComputerP(String name,int initCharge){
		super(name);
		battary = initCharge;
	}
	public void charging() {
		battary += 5;
	}
	public void movigCal() {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		System.out.println("이동하면서 ");
//		keyboardTouch();
//		calculate();
		calculateFunc();
		
		battary -=1;//배터리 차감
	}
	
}

class TabletNotebookP extends NotebookComputerP{
	
	String registPencil;
	public TabletNotebookP(String name, int initCharge, String pen) {
		super(name, initCharge);
		registPencil = pen;
	}
	public void write(String penInfo) {
		if(battary<1) {
			System.out.println("배터리가 방전되어 사용불가");
			return;
		}
		if(registPencil.compareTo(penInfo)!=0) {
			System.out.println("등록된 펜이 아닙니다.");
			return;
		}
		movigCal();
		System.out.println("스크린에 펜으로 그림을 그린다.");
		battary -= 1;
	}
	
}

public class E04ISAInheritanceP {

	public static void main(String[] args) {
		
		NotebookComputerP noteBook = new NotebookComputerP("공유", 5);
		TabletNotebookP tablet = 
				new TabletNotebookP("이동욱", 10, "ISE-1234");
		
		System.out.println("==노트북컴퓨터사용==");
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		noteBook.movigCal();
		System.out.println("==ISE-1234 펜으로 테블릿사용==");
		tablet.write("ISE-1234");
		System.out.println(noteBook.battary);
		System.out.println(tablet.battary);
		
		System.out.println("==XYZ-9876 펜으로 테블릿사용==");
		tablet.write("XYZ-9876");
	}

}
