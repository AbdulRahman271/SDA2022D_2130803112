public class SelectionSort {
    void sort( int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n-1; i++)
        {
            int min_idx=1;
            for(int j=1+1; j<n; j++)
            if (arr[j]<arr [min_idx])
            min_idx=j;
            int temp= arr[min_idx];
            arr[min_idx]=arr[i];
            arr[i]=temp;
        } }
   void printArray( int arr[])
   {
    int n =arr.length;
    for(int i=0; i<n; ++i)
    System.out.println(arr[i]+" ");
    System.out.println();
 }
    public static void main(String[] args) {
        SelectionSort ob= new SelectionSort();
        int arr[]={45, 12, 30, 54, 22, 89, 21, 15, 67, 77};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }    
}

    
    

