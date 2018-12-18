
public class misc_code {
	public static void main(String[] args) {
		
		System.out.println("VERSION 1");
		System.out.println(choose(4,2) + "\n");
		
		System.out.println("VERSION 2");
		System.out.println(choose2(4,2));
	}
	
	public static int choose(int n, int k) {
		if (k==0) {
			return 1;
		} else {
			return choose(n, k-1) * (n-k+1)/k;
		}
	}
	
	public static int choose2(int n, int k) {
		if(k<0 || k>n) {
			return 0;
		} else if( n == 0) {
			return 1;
		} else {
			return choose2(n-1, k-1) + choose2(n-1, k);
		}
	}
}
