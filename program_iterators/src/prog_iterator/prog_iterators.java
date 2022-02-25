package prog_iterator;


	
	    import java.io.*;  
	    import java.util.*;  
	        
	    public class prog_iterators {  
	        public static void main(String[] args)  
	        {  
	            ArrayList<String> cityNames = new ArrayList<String>();  
	        
	            cityNames.add("the ");  
	            cityNames.add("people");  
	            cityNames.add("in ");  
	            cityNames.add("india");  
	            cityNames.add("are kind");  
	        
	            // Iterator to iterate the cityNames  
	            Iterator iterator = cityNames.iterator();  
	        
	            System.out.println("CityNames elements : ");  
	        
	            while (iterator.hasNext())  
	                System.out.print(iterator.next() + " ");  
	        
	            System.out.println();  
	        }  
	      
	}


