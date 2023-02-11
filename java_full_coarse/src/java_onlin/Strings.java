package java_onlin;

public class Strings
{
	public static void main(String[] args)
	{
		String a="Ankit"; //String litral
		String b="Ankit"; //String litral
		System.out.println(a);
		a=a.concat(" kumar");
		System.out.println(a);


		String w= new String("Ankit "); //new keyword
		String r= new String("Ankit"); //new keyword
		System.out.println(r);
		w=w.concat("kumar");
		System.out.println(w);



	}

	}


/*          Q. What is String ? With example.
 *     Ans: Java String are object that allows us to store sequence of chracter
 *          which may contain alpha numeric values enclosed in double quotes ("Ram2").
 *
 *             Notes :
 *      1] Strings are immutable in java.
 *      2] It contains methods that can be perform certain operations on Strings
 *         (concat(),equals(),length()..etc.
 *
 *        Types :
 *               1. String literal.
 *               2. new keyword .
 */
