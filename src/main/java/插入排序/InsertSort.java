package 插入排序;
//插入排序
public class InsertSort {

    //方法
    public int[] Sort(int[] arr)
    {

        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];

            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j=i;

            while(j>0&&temp<arr[j-1])
            {
                //如果没找到，则比较数往后移
                arr[j]=arr[j-1];
                j--;
            }

            // 存在比其小的数，插入
            if (j!=i)
            {
                arr[j]=temp;
            }
        }
        return arr;
    }




    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        int[] sort = insertSort.Sort(new int[]{2, 4, 1, 6, 9, 5, 1, 2});
        for (int num:
             sort) {
            System.out.println(num);
        }
    }
}
