
public class AbstractionParent extends AbstractionChild{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractionParent absObj = new AbstractionParent();
		absObj.parentMethod();
		absObj.abstractMethod1();
		absObj.abstractMethod2();

	}

	@Override
	public void abstractMethod1() {
		System.out.println("This is method overriding");
	}
	
	public void abstractMethod2() {
		System.out.println("This is again method overrinding");
	}


}
