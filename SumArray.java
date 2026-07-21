public class SumArray 
{  
    public static void main(String[] args) 
       {  
        //Initialize array  
        int [] arr = new int [] {3,8,6,1,2,7};  
        int sum = 0;
        int temp = 0;
        
        System.out.println("Elements of original array: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }  
        //Loop through the array to calculate sum of elements  
        for (int i = 0; i < arr.length; i++) 
        {
           sum = sum + arr[i];
           for (int j = i+1; j < arr.length; j++) 
          {
             if(arr[i] > arr[j])
             {
	temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;  
              }
           }    
        } 
        System.out.println("\nSum of all the elements of an array: " + sum); 
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < arr.length; i++) 
        {     
            System.out.print(arr[i] + " ");    
        }
    }  
}  