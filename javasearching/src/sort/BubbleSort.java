package sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a=new int[]{5,3,4,7,2,8,6,9,1};
		int temp=a[a.length-1];
		
		for(int i=0;i<a.length;i++){
			
			for(int j=a.length-1;j>0;j--){
			
				if(a[j]<a[j-1]){
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				}
			
			}
			
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]   "+a[i]);
		}

		
		
	}

}
