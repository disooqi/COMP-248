package tutorial_03_Java_Fundamentals;

public class questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1
		// a 
//		int k = 5;
//		System.out.println(k++);
//		System.out.println(k);
//		
//		int k = 5;
//		System.out.println(++k);
		
		/*
		Question 2
		 */
		
//		System.out.println( (5 + 6) * 2 - 1);
//		
//		int i = 5, j = 3; j-=1;
//		int k = ++i/j--;
//		System.out.println(k);
//		System.out.println(j);
		
//		int k = 5;
//		k = -k * --k;
//		System.out.println(k);
		
//		System.out.println(10 * 3 < 300 / 10 || 13 > 12);
//		System.out.println(true ^ true);
		
		
//		System.out.println(true || false && true);
		
		
//		int x=10, y =12;
//		int iResult;
//		float w = (float)4.5;
//		float z = (float)8.2;
//		float fResult;
//		
//		iResult = (int)(z/w);
//		fResult = y * x;
//		System.out.println("iResult now is: " + iResult + " and fResult is : " + fResult);
////		
//		x = 2;
//		fResult = z/x;
//		System.out.println("fResult now is: " + fResult);
//		
//		x = 10;
//		y = 4;
		
		//Notice that the following casting will be useless (too late)
//		fResult = (float) (x/y);
//		System.out.println("fResult now is: " + fResult);
//		//The proper way to do so would be as follows
//		fResult = (float) x/y;
//		System.out.println("fResult now is: " + fResult);
		
		final String sentence = "I hate programming.";
		int position = sentence.indexOf("hate");
		String firstPart = sentence.substring(0, position);
		String afterHate = sentence.substring(position + 4);
		String newString = firstPart + "love" + afterHate; 
		System.out.println("The line of text to be hanged is: "); 
		System.out.println(sentence);
		System.out.println("I have rephrased the line to read:"); 
		System.out.println(newString);
		
		
//		String s1, s2, s3;
//		s1 = "Quest for the holy Grail";
//		s2 = s1.toLowerCase();
//		s3 = s1 + " " + s2;
//		System.out.println(s3.replace('h', 'z'));
//		
//		System.out.print(s3);
		
//		System.out.println("miss  issipi".length());
//		
//		System.out.println("mississipi".length()-1);
//		
//		System.out.println("mississipi".indexOf('i', 2));
		

	}

}
