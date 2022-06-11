package 冒泡排序;

/**
 * 冒泡排序
 */
public class BubbleSort {
    /**
     * 方法
     */

    public int[] Sort(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            //如果已经基本有序，跳过该回合
            boolean flag = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if (flag)
            {
                break;
            }
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr = new int[]{2,4,2,1,9,4,5,6,7};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sort = bubbleSort.Sort(arr);
//        for (int a:
//             sort) {
//            System.out.println(a);
//        }

        for (int i:
             bubbleSort.Sort(arr)) {
            System.out.println(i);
        }

    }
}
