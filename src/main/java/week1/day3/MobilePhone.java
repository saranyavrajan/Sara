package week1.day3;

import java.util.Scanner;

public class MobilePhone 
{
    /*public int Ver = 4;
    String CanTakePic = "Yes I can take Pic";*/
	
	/* public void Version()
    {
    	//System.out.println("Hello");
		System.out.println(CanTakePic);
		System.out.println(Ver);
    }*/
	public static String SMS = "Good morning! Happy Sunday!";
    public void sendSMS(long mobileNumber, String SMS)
    {
    	System.out.println(mobileNumber+","+SMS);
    }
    public void callContact(long MobileNumber)
	{
	
	}
    
    public void PrintPrice(int Price)
    {
    	if(Price>20000)
    	{
    		System.out.println("The costliest Phone is "+Price+" Rs");
    	}
    	else 
    	{
    		System.out.println("The cheapest Phone is "+Price+" Rs");
    	}    		
    }  
    
    public void PrintMobSerProvider(int MobNo)
    {
    	Scanner scan = new Scanner(System.in);
		MobNo = scan.nextInt();
    	if(MobNo == 944)
    	{
    		System.out.println("The Service Provider is BSNL");
    	}		
    }
       
	public static void main(String[] args) 
	{
		MobilePhone cls = new MobilePhone();
		//cls.Version();
		
		//2
		//cls.PrintPrice(45000);
		//cls.PrintPrice(6000);
		
		//3		
		cls.PrintMobSerProvider(944);
	}
}
