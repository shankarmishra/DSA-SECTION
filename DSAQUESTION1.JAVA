public class evenorodd {

    public static void main(String[] args) {

   int arr[]={2,3,6,4,6,3,9,8};
   int n=arr.length;
   int even=0;
   int odd=0;
   int i=0;

   for(i=0;i<n;i++){
    if(arr[i]%2==0){
        even++;
        
    }
    else{
        odd++;
      
    }
   }
   System.out.println("even="+even);
   
   System.out.println("odd="+odd);



    }  
}