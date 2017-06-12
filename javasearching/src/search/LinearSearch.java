package search;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		
		int[] a=new int[]{10,3,5,0,7,8,6,3,1};
		
		int s=7;
		
		for(int i=0;i<a.length;i++){
			
			if(s==a[i]){
				System.out.println("found at"+i);
				break;
			}
			
		}
		
		
	}

}
