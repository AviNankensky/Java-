public class Point { 

	private final int DEFAULT_VAL= 0;
	private int _x;
	private int _y;
	
	public Point (int x,int y) {
		_x=(x>DEFAULT_VAL)?x:DEFAULT_VAL;
	//	if(x>= DEFAULT_VAL)
	//	_x=x;
	//else
	//	_x=DEFAULT_VAL;
		_y=(y>DEFAULT_VAL)?y:DEFAULT_VAL;
	//	if(y>=DEFAULT_VAL)
	// 	_y= y;
	//	else
	//		_y=DEFAULT_VAL;
	}	
	
	public Point(Point other) {
		_x=other._x;
		_y=other._y;  
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public void setX(int x) {
		if(x>=DEFAULT_VAL)
			_x=x;
	}
	
	public void setY(int y) {
		if(y>=DEFAULT_VAL)
			_y=y;
	}
	 
	public String toString() {
		   return "("+_x+","+_y+")";
	 }
	 
	public boolean equals(Point other) {
		 return (_x==other._x)&&(_y==other._y);	
	 }
	 
	 public boolean isAbove(Point other) {
	    	
  		 return(_y>other._y);		 	
    }
  	 
	 public boolean isUnder(Point other) {
     	
  		 return other.isAbove(this);		 	
    } 
	 
	 public boolean isEquals(Point other) {
		  	return (_y==other._y);
	} 

	 
//  public boolean isLeft(Point other) {
// return(_x<other._x);
//} //
	 public boolean isLeft(Point other) {
		    return (_x<other._x);	  
	}
	
	 public boolean isRight(Point other) {
	        return other.isLeft(this); 
	}
	
	 
	 
	 
	 
	 
	 
	  public boolean isEquals_x(Point other) {
		    return(_x==other._x);
	}
	 
	public double distance(Point p) {
	return Math.sqrt(Math.pow((_x-p._x),2)+	
		 Math.pow((_y-p._y),2));
	}
	  
	  public void move (int dX,int dY) {
	if((_x+dX>=DEFAULT_VAL)&&(_y+dY>=DEFAULT_VAL))
	setX(_x+=dX);
	setY(_y+=dY); 
	}
   
	
  public static void main(String[] args) {
Point p1 = new Point(1,2);
Point p2 = new Point(2,1);
System.out.println(p1);

if (p1.isUnder(p2)) 
	System.out.println(" is under");
else if (p1.isEquals(p2))
	System.out.println("Y are equals ");
else
	System.out.println(" is above");
if (p1.isLeft(p2))
	System.out.println(" is left");
else if (p1.isEquals_x(p2))
	System.out.println("X are equals");
else
	System.out.println(" is right");


    }	
 

}    