package sort;

public class MergeSort {

	public static void main(String[] args) {
	
		int[] a=new int[]{4,5,3,9,10,6,7,12,1};
		
		int start=0;
		int end =a.length;
		int middle=(start+end)/2;
		
		
		a=recursion(a,start,end);
		
	}

	private static int[] recursion(int[] a,int start,int end) {
		
		int middle =(start+end)/2;
		while(start!=end){
			
			int[] b=recursion(a,start,middle);
			int[] c=recursion(a,middle+1,end);
			
		}
		
		return a;
		
		
	
		
	}

	
}
