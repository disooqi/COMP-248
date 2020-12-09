package tutorial_12_Arrays;

public class Q1 {
	public static void main(String[] args) {
		double[] ex1 = { 1.5, 1.5, 1.5 };
		double[] ex2 = { 0.0, 1.0, 2.0, 3.0 };
		double[] ex3 = { 3.4, 5.6, 123.4, 684.93, 3.4 };
		System.out.println(standardDev(ex1, ex1.length));
		System.out.println(standardDev(ex2, ex2.length));
		System.out.println(standardDev(ex3, ex3.length));
	}
	
	public static double standardDev(double[] data, int N) {
		//Math.sqrt(a)
		
		double mu = 0;
		double sum = 0;
		
		for(int i=0; i<N; i++)
			sum += data[i];
		
		mu = sum/N;
		
		double sum2 = 0;
		for(int i=0; i<N; i++)
			sum2 += Math.pow(data[i] - mu, 2);
		
		double sigma = Math.sqrt(1.0/N * sum2);
		
		return sigma;
		
	}
	
	
}
