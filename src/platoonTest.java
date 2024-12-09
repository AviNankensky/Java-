import java.util.Scanner;
public class platoonTest {

	
	double	distance=0;
	public platoonTest(int leftUpX,int leftUpY,int RightDownX,int RightDownY) {
	
		
		distance= Math.sqrt((Math.pow(leftUpX-RightDownX,2)+Math.pow(leftUpY-RightDownY,2)));
		
		
	}
	public void printDistance() {
    	System.out.println("The distance is "+distance);
    }
	
	public static void main(String[] args) {
		platoonTest p1 = new platoonTest(1,1,1,5);
		p1.printDistance();
			
		    }	

}
