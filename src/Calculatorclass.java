
public class Calculatorclass {

	private int num1;
	private int num2;
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	
	public int getNum2() {
		return num2;
	}
	public int add() 
	{
		return num1+num2;
	}
	
	public int substraction() 
	{
		return num1-num2;
	}
	public int multiplication() 
	{
		return num1*num2;
	}
	public int division() 
	{
		return num1/num2;
	}
	public int modulus() 
	{
		return num1%num2;
	}
	
	public static void main(String[]args) 
	{
		Calculatorclass c=new Calculatorclass();
		c.setNum1(4);
		c.setNum2(2);
		System.out.println(c.add());
		
		c.setNum1(4);
		c.setNum2(2);
		System.out.println(c.substraction());
		
		c.setNum1(4);
		c.setNum2(2);
		System.out.println(c.multiplication());
		
		c.setNum1(4);
		c.setNum2(2);
		System.out.println(c.modulus());
		
		c.setNum1(4);
		c.setNum2(2);
		System.out.println(c.division());
	}
}
