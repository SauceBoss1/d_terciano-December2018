
public class misc_code {
	public static int a = 0;
	public static void main(String[] args) {
		
		System.out.println("VERSION 1");
		System.out.println(choose(4,2));
		System.out.println("I ran through the method " + a + " times!\n");
		a=0;
		
		System.out.println("VERSION 2");
		System.out.println(choose_v2(4,2));
		System.out.println("I ran through the method " + a + " times!\n");
		a=0;
	}
	
	public static int choose(int n, int k) {
		if (k==0) {
			a+=1;
			return 1;
		} else {
			a+=1;
			return choose(n, k-1) * (n-k+1)/k;
		}
	}
	
	public static int choose_v2(int n, int k) {
		if(k<0 || k>n) {
			
			return 0;
		} else if( n == 0) {
			a+=1;
			return 1;
		} else {
			a+=1;
			return choose_v2(n-1, k-1) + choose_v2(n-1, k);
		}
	}
}
