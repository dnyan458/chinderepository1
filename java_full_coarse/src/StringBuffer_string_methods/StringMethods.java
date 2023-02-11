package StringBuffer_string_methods;

public class StringMethods
{

	public static void main(String[] args)
	{
		/*
		 * String s1 = "javatpoint"; String s2 = "JAVATPOINT"; String s3 ="Python";
		 * String f= "ramesh"; System.out.println("Ramesh :"+f.length());
		 *
		 * String replacestring =s1.concat(s3); String a= s1.repeat(2);
		 * System.out.println(a);
		 *
		 * System.out.println(replacestring);
		 * System.out.println("Upparcase :"+s1.toUpperCase());
		 * System.out.println("lowerString :"+s1.toLowerCase());
		 * System.out.println(s1.equalsIgnoreCase(s2));
		 * System.out.println(s1.equalsIgnoreCase(s3));
		 * System.out.println(s1.equalsIgnoreCase(s2));
		 *
		 * String str ="Java";
		 * System.out.println("Character at o loaction :"+str.charAt(0));
		 * System.out.println("Character at 2 location :"+str.charAt(2));
		 * System.out.println("length :"+str.length());
		 *
		 * char c = str.charAt(3); System.out.println(c);
		 *
		 */

        String ss= "JAVA IS MY FAVOURITE CODING software SO I LEARNING";
        String[] WORDS =ss.split("\\ss");//string split based on whitespace
        //java using forach loop to print elements of string array
        System.out.println("after split");
        for (String element : WORDS) {
        System.out.println(element);


        }
}
}

