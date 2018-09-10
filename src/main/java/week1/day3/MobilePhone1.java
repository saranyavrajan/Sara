package week1.day3;
import week1.day3.MobilePhone;

public class MobilePhone1 {

	public static void main(String[] args) 
	{		
		MobilePhone cls = new MobilePhone();
		/*System.out.println(cls.Ver);
		cls.Version();*/
		
		//1
		cls.sendSMS(9000812341L, "Good morning!Happy Sunday!");
		cls.sendSMS(9000812342L, "Good morning!Happy Sunday!");
		cls.sendSMS(9000812343L, "Good morning!Happy Sunday!");
		cls.sendSMS(9000812344L, "Good morning!Happy Sunday!");
		cls.sendSMS(9000812345L, "Good morning!Happy Sunday!");
		cls.sendSMS(9000812346L, "Good morning!Happy Sunday!");
	}

}
