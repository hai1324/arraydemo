import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] arr ={1,2,3,4,58,4,3,2,5,2,7};
        //插入排序和二分查找
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        Arrays.sort(arr, (Integer o1, Integer o2)->o2-o1);//lambda极简写法
        System.out.println(Arrays.toString(arr));
        Integer[] arrtwo=Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(arrtwo));
        Integer[] arrthree=Arrays.copyOfRange(arr, 0, 5);
        System.out.println(Arrays.toString(arrthree));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 0, 5, 5));
        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 0, 5, 1);
        System.out.println(Arrays.toString(arr));
        Arrays.parallelSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//    1==1
//    2==2
    //    3==1+2=3,(111,12,21)
}
