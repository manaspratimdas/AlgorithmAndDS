package sort;

public class InsertionSort {

	public static void main(String[] args) {
	
		int x=1;
		int y=x;
		int temp=0;
		int[] a=new int[]{5,3,4,7,2,8,6,9,1};
		
			
		while(x<a.length+1){
			while(y-1>=0){
				if(a[y-1]>a[y]){
					temp=a[y-1];
					a[y-1]=a[y];
					a[y]=temp;
							
				}
				temp=0;
				y=y-1;
			}
			y=x;
			x=x+1;
		}
		
		System.out.println("sorting with while");
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]   "+a[i]);
		}
		
		
		for(int i=1;i<a.length;i++){
			for(int j=i;j>0;j--){			
				
				if(a[j-1]>a[j] ){
				
					temp=0;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					
				}
			}
			
			
		}
	
		System.out.println("sorting with if");
		for(int i=0;i<a.length;i++){
			System.out.println("a["+i+"]   "+a[i]);
		}

	}

}
