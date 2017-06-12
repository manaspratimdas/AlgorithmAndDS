package search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a=new int[]{3,6,7,8,10,14,20,35,40};
		
		int search=20;
		int start=0;
		int end=a.length;
	    int middle=(end+start)/2;
	    int loc=-1;
	   
		
	    while(start!=middle && a[middle]!=search )
	    {
	    	if(search<a[middle]){
	    		end=middle;
	    
	    	}
	    	else if(search>a[middle]){
	    		start=middle;
	    	}
	    	
	    	
	    	middle=(end+start)/2;
	    	
	    	
	    }
	    if(a[middle]==search){
	    	System.out.println("found  : "+middle);
	    }
	    else{
	    	System.out.println("not found ");
	    }
	  
	  
	    processWithReccursion();
	    
	   
	}

	private static void processWithReccursion() {
		
		int[] a=new int[]{3,6,7,8,10,14,20,35,40};
		
		int search=-5;
		int start=0;
		int end=a.length;
		int middle=(end+start)/2;
		
		 if(start<middle){
			    middle=rec(a,start,end,search);
			    }
		 
		 if(a[middle]==search){
		    	System.out.println("found  : "+middle);
		    }
		    else{
		    	System.out.println("not found ");
		    }
	}

	private static int rec(int[] a, int start, int end,int search) {
		
		 int middle=(end+start)/2;
		  if(middle>start && search<a[middle]){
			middle= rec(a,start,middle,search);
		   }
		  else if(middle>start && search>a[middle]){
			middle=  rec(a,middle,end,search);
		  }
		  
		 
		return middle;
	}

	
	


}
