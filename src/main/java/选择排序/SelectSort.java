package 选择排序;

/**
 * 选择排序
 */
public class SelectSort {
    //方法
    public int[] Sort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            //寻找最小的数
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min]>arr[j])
                {
                    min=j;
                }
            }
            //将最小的数交换
            if (i!=min)
            {
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        return  arr;
    }


    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        int[] sort = selectSort.Sort(new int[]{2, 4, 1, 6, 9, 5, 1, 2});
        for (int num:
             sort) {
            System.out.println(num);
        }
    }
}
