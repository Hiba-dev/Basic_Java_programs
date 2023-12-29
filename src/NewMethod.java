
public class NewMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NewMethod m = new NewMethod(); 
		m.getdata1();
		
		String x = m.getData2();
		System.out.println(x + " method is created successfully");
	}

	
	//Method Definition
	public void getdata1()
	{
		
	  System.out.println("Get data 1 method is created successfully!!");
	}
	
	public String getData2()
	{
		String x = "Get Data 2";
		return x;
	}
}
