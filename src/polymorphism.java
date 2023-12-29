//INHERITANCE & POLYMORPHISM
//class 1
class bird {
		
			public void color() {
		
				System.out.println("This is bird class");
			}
        }
		

//class 2			
			class robin extends bird{
			
				public void color(){			
				
				System.out.println("This is robin class");
				
			}
		}

public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bird b = new bird();
		robin r = new robin();
		b.color();
		r.color();
		}

}


