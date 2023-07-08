package ex08class;
/*
시나리오] 은행계좌를 추상화 해보자.
멤버변수 : 예금주
		계좌번호
		잔고
멤버메서드 : 입금하다
		출금하다
		계좌잔고조회
조건1 : 입금은 무제한으로 가능함
조건2 : 잔고가 부족한 경우에는 출금불능 처리
 */

class AccountP{
	//멤버변수
	String name;
	String accountNum;
	int balance;
	
	void deposit(int money) {
		balance += money;
		System.out.println(money+"원이 입금됨");
	}
	
	void withdraw(int money) {
		if(balance>= money) {
			balance -=money;
			System.out.println("계좌에서 "+money+"원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	
	void showAccount() {
		System.out.println("계좌주:"+name);
		System.out.println("계좌번호:"+ accountNum);
		System.out.println("잔고:"+ balance+"원");
	}
	void init(String n, String a, int b) {
		name = n;
		accountNum = a;
		balance = b;
	}
	
}

public class E04AccountMainP {

	public static void main(String[] args) {

		AccountP account =new AccountP();
		account.init("김지현", "3333-15-49368", 50000000);
		account.deposit(2000000);
		account.withdraw(100000);
		account.showAccount();
		
		AccountP account2 = new AccountP();
		account2.name ="김렘렘";
		account2.accountNum = "124124124012934";
		account2.balance = 300;
		account2.showAccount();
		
		
	}

}
