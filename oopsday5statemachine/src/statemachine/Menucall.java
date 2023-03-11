package statemachine;

public class Menucall {
	private Calculation c1 = new Calculation();
//	private Calculation c2 = new Calculation();
//	private Calculation c3 = new Calculation();
//	private Calculation c4 = new Calculation();
//	private Calculation c5 = new Calculation();
	private int count=0;
	int result=0;
	int no;
	int amount;
	
	
	public Menucall() {
		// TODO Auto-generated constructor stub
	}

	

	public Menucall(Calculation c1, int count, int result) {
		super();
		this.c1 = c1;
		
		this.count = count;
		this.result = result;
	}



	public int withdraw( int note, int n,int amount) {
		if(note==100) {
		 no =c1.getAmount1();
		if(no>=n) {
		result=note*n;
		this.amount=this.amount+result;
		c1.setAmount1(no-n );}
		
		
		
		if(this.amount==amount) 
			return this.amount ;
		
		
		else 
       return (amount- result);
	}	
		
		 
		
		if(note==50) {
			 no =c1.getAmount2();
			if(no>=n) {
			result=note*n;
			this.amount=this.amount+result;
			c1.setAmount2(no-n);}}
			
			if(this.amount==amount) 
				return this.amount ;
			
			
			else 
		       return (amount-result);
				
			
	
	//return this.amount;	
		
	}}

		
		
		
		
		
	

