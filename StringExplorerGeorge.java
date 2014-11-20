/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorerGeorge
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
		
		//george's code showing how index of works
		int notFoundPsn=sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\")= "+ notFoundPsn);
		
		//George's code showing how index of with a start index works
		int notWholeSample=sample.indexOf("the", 6);
		System.out.println("The index of \"the\" after an index of 6 is: " +notWholeSample);
		
		
	}

}
