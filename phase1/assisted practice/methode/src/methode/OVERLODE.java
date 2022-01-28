package methode;
public class OVERLODE {
	
public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

OVERLODE ob=new OVERLODE();
       ob.area(10,12);
       ob.area(5);  
   }
}

