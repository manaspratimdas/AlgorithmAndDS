package sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a=new int[]{5,3,4,7,2,8,6,9,1};
		int min=a[0];
		int min_i=0;
		
		for(int i=0;i<a.length;i++){
			min=a[i];
			min_i=i;
			for(int j=i;j<a.length;j++){						
				if(a[j]<min){
					min=a[j];
					min_i=j;
									
				}
				
				
			}
			a[min_i]=a[i];
			a[i]=min;
			
						
		}
		
		
		System.out.println("sorting with if");
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]   "+a[i]);
		}


	}

}
