package oopsdays2.atm;

public class Account {
	private int actno;
	private String name;
	private String actType;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(int actno, String name, String actType, double balance) {
		
		this.actno = actno;
		this.name = name;
		this.actType = actType;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [actno=" + actno + ", name=" + name + ", actType=" + actType + ", balance=" + balance
				+ ", getActno()=" + getActno() + ", getName()=" + getName() + ", getActType()=" + getActType()
				+ ", getBalance()=" + getBalance() + "]";
	}
	public int getActno() {
		return actno;
	}
	public void setActno(int actno) {
		this.actno = actno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActType() {
		return actType;
	}
	public void setActType(String actType) {
		this.actType = actType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
