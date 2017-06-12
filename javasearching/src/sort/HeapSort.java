package sort;

public class HeapSort {

	public static void main(String[] args) {
		int[] a=new int[]{5,3,4,7,2,8,6,9,1};
		
		createHeap(a);

	}

	private static void createHeap(int[] a) {
		int[] b=new int[a.length-1];
		int i=0;
		while(i<a.length-2){
			b[i]=a[i];
			int temp=a[i];
			if(b[i]<a[i+1]){
				temp=b[i];
				b[i]=a[i+1];
				b[i+1]=temp;
			}
			if(b[i]<a[i+2]){
				temp=b[i];
				b[i]=a[i+2];
				b[i+2]=temp;
				
			}
			i=i+2;
			
		}
		
		System.out.println("--"+b[0]);
		System.out.println("--"+b[1]);
		System.out.println("--"+b[2]);

		
	}

}
