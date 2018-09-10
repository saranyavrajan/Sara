package practice;

public class StringMethods 
{
	public static void main(String[] args) 
	{
		String txt1 = "This is a lovely day";
		String txt2 = "Sun is shining bright";
		
		//charAt(index)
		//starts from 0, char at index position
		System.out.println(txt1.charAt(3));
				
		//equals
		//returns boolean
		boolean res = txt1.equals(txt2);
		System.out.println("equals method: "+res);
		
		//indexOf(string)
		//Returns the index within this string of the first occurrence of the specified substring
		System.out.println(txt1.indexOf("is"));
		
		//length
		//starts from 1
		System.out.println("Length is: "+txt1.length());
		
		//substring(begin)
		//starts from 0, starts from begin, L to R
		System.out.println("Substring(b): "+txt1.substring(3));
		
		//substring(begin, end)
		//starts from 0, starts from begin and ends with end-1, L to R
		System.out.println("Substring(b,e): "+txt1.substring(3, 8));
		
		//System.out.println(txt1.chars());
		
		//codePointAt
		//a code point or code position is any of the numerical values that make up the code space.
		System.out.println(txt1.codePointAt(1));
		System.out.println(txt1.codePointBefore(1));
		System.out.println(txt1.codePointCount(1, 4));//
		
		System.out.println(txt1.compareTo(txt2));
	}
}
