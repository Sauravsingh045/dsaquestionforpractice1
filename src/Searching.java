public class Searching {
    static int searchings(int arr[],int n,int key){
        int start=0;
        int end=n-1;

        int mid=start+(end-start)/2;
        while(start<=end){
          if(arr[mid] == key){
              return mid;
          }
          if (key<arr[mid]){
              end=mid-1;
          }
          else{
              start=mid+1;
          }
             mid=start+(end-start)/2;




        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={12,22,33,45,56,65,89};

       int index=searchings(arr,7,87);
        System.out.println("index of "+"is :" +index );
    }
}
