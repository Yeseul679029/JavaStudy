package ex13interface;

interface PersonlNumberStorageinterP {
	void addPersonalInfo(String jumminNum,String name);
	String searchPersonalInfo(String juminNum);
}

class PersonalInfoVOP{
	private String name;
	private String juminNum;
	//멤버변수 선언 후 자동생성 하세요.
	public PersonalInfoVOP(String name, String juminNum) {
		this.name = name;
		this.juminNum = juminNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJuminNum() {
		return juminNum;
	}
	public void setJuminNum(String juminNum) {
		this.juminNum = juminNum;
	}
	
}
class PersonalNumberStorageImplP implements PersonlNumberStorageinterP{
	
	PersonalInfoDTOP[] personalArr;
	int numOfPerInfo;
	public PersonalNumberStorageImplP(int arrSize) {
		personalArr = new PersonalInfoDTOP[arrSize];
		numOfPerInfo = 0;
	}
	@Override
	public void addPersonalInfo(String jumminNum, String name) {
		personalArr[numOfPerInfo] = new PersonalInfoDTOP(name, jumminNum);
		numOfPerInfo++;
	}
	@Override
	public String searchPersonalInfo(String juminNum) {
		for(int i=0; i<numOfPerInfo; i++) {
			if(juminNum.compareTo(personalArr[i].getJuminNum())==0) {
				return personalArr[i].getName();
			}
		}
		return null;
	}
}
public class E02AbstractToInterface2P {

	public static void main(String[] args) {
		PersonalNumberStorageExtP storage = new PersonalNumberStorageExtP(10);
		
		storage.addPersonalInfo("901234-2222222", "김태희");
		storage.addPersonalInfo("901234-1111111", "정지훈");
		
		System.out.println(storage.searchPersonalInfo("901234-2222222"));
		System.out.println(storage.searchPersonalInfo("901234-1111111"));
		System.out.println(storage.searchPersonalInfo("001024-1090333"));
	}

}
