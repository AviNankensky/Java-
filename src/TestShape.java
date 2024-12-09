
public class TestShape {

	public static void main(String[] args) {
		Shape c1 =new Rectangle("red" ,4, 5);
		System.out.println(c1);
		System.out.println("The arre is ;"+c1.getArre());
	
		Shape c2 =new Triangle("blue", 4, 5);
		System.out.println(c2);
		System.out.println("The arre is ;"+c2.getArre()+"\n");
	
		Shape[] shapearr =new Shape[6];
	
		shapearr[0]= new Rectangle("red", 4, 5);
		shapearr[1]= new Triangle("black", 4, 5);
		shapearr[2]= new Rectangle("green", 4 ,4);
		shapearr[3]= new Rectangle("purple", 5, 7);
		shapearr[4]= new Triangle("yellow", 2, 7);
		shapearr[5]= new Rectangle("orange", 2 ,10);
		for(int i =0;i<shapearr.length;i++) {
			System.out.println("Area of shape in index "+i+" is :"+shapearr[i].getArre());
			if(shapearr[i] instanceof Rectangle ) {
			System.out.println("and it is square? :"+shapearr[i].isSquare());
			}
			}
	}

}
