package sub1;

import javax.servlet.jsp.JspWriter;

public class Account {
	
	
	// 필드 선언(내부에서만 불러올수있다.)
	
	
	private String bank;
	private String id;
	private String name;
	private int    money;
	
	
	//생성자
	
	public Account(String bank, String id, String name, int money) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
	//메소드
	
	
	public void deposit(int money) {
		this.money += money;
	}
	
	
	public void withdraw(int money) {
		this.money -= money;
	}
	
	public void show(JspWriter out) throws Exception {
		out.println("<h4>현재잔액</h4>");
		out.println("<p>");
		out.println("은 행 명 : "+bank+"<br/>");
		out.println("계좌번호 : "+id+"<br/>");
		out.println("입 금 주 : "+name+"<br/>");
		out.println("현재잔액 : "+money+"<br/>");
		out.println("</p>");
	}


	public String getBank() {
		return bank;
	}


	public void setBank(String bank) {
		this.bank = bank;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	//SET의 기능 검사
	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
