package 希尔排序;

public class HillSort {

    public int[] Sort(int[] arr)
    {
        int length= arr.length;
        int temp;

        for (int step = length/2;step>=1;step /=2)
        {
            for (int i = step; i < length; i++) {
                temp=arr[i];
                int j=i-step;
                while(j>=0&&arr[j]>temp)
                {
                    arr[j+temp]=arr[j];
                    j -= step;
                }
                arr[j+temp]=temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
