package arrays;

public class ArraysClasss {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for(int i=0;i< arr.length;i++){
            arr[i]=i;
        }
        for(int num:arr){
            System.out.println(num);
        }
        int[] arr2={25,15,30};
        System.out.println(arr2.length);
        System.arraycopy(arr2,0,arr,0,3);
        for (int num:arr){
            System.out.println(num);
        }
        arr2=new int[5];
        System.out.println(arr2.length);
    }
}
