public class SelectedSort {
    /*
     * 从第一个数据开始，假设有数组【7,6,9,3，1,5,2,4】
     * 从无序的数组中，将一个数据插入到已经排好顺序的有序列表
     * 从而产生一个新的数组
     * 其实现原理是，嵌套双循环，第一个外层的循环,循环除了第一个数据的所有数据，内层循环循环，数组下标从0 到外层循环的的当前位置的所有数据，并对数组进行移动
     * 第一轮：(i 外层循坏下标，j 内次循环下标)
     *   i=0 j=1 min=i=0;
     *   比较a[j]和a[0](a[j]和a[min]),也就是7和6,交换位置，min= 1
     *   i=0 j=2
     *   比较a[2]和a[1](a[j]和a[min]),也就是9和6,交换位置，min= 1
     *   i=0 j=3
     *   比较a[3]和a[1](a[j]和a[min]),也就是3和6,交换位置，min= 3
     *   i=0 j=4
     *  比较a[4]和a[3](a[j]和a[min]),也就是1和3,交换位置，min= 4
     *   i=0 j=5
     *  比较a[5]和a[4](a[j]和a[min]),也就是5和1,交换位置，min= 4
     *   ...
     *
     * 最后结果 【1,6,9,3,7,5,2,4】
     * 第二轮
     *   i=1 j=2 min=i=1;
     *   比较a[2]和a[1](a[j]和a[min]),也就是9和6,min= 1
     *   i=1 j=3
     *   比较a[3]和a[1](a[j]和a[min]),也就是3和6,min= 3
     *   i=0 j=4
     *   比较a[3]和a[4](a[j]和a[min]),也就是7和3,min= 3
     *   i=0 j=5
     *  比较a[5]和a[3](a[j]和a[min]),也就是5和3,min= 4
     *   i=0 j=6
     *  比较a[6]和a[4](a[j]和a[min]),也就是2和3,min= 6
     *   i=0 j=7
     * 比较a[6]和a[4](a[j]和a[min]),也就是2和3,min= 6
     * 比较a[7]和a[4](a[j]和a[min]),也就是4和2,min=6
     *
     * 最后结果 【1,2,9,3,7,5,6,4】
     * 第三轮
     * min =3
     * 最后结果 【1,2,3,9,7,5,6,4】
     * 其余类似
    * */
    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{1,3,6,2,7,90,123,44,5,45};
        sort(a);
        for (Comparable ai:a) {
            System.out.println(ai);
        }
    }
    private static  void sort(Comparable[] a) {
        // 选择排序是最简单的一种排序，其原理就是先假定第一个是最小的数，在剩下的数组中，依次和第一个数字比较，
        // 每次比较，如果比当前的最小数小，就交换最小数
        // 利用双层排序。最后要遍历的数据，逐步减少
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exach(a, i, min);
        }
    }

    private static void exach(Comparable[] a, int i, int min) {
        Comparable temp =a[min];
        a[min]=a[i];
        a[i]=temp;
    }

    private static boolean less(Comparable j, Comparable min) {
        //public static int compare(int x, int y) {
        //        return (x < y) ? -1 : ((x == y) ? 0 : 1);
        //    }
        if(j.compareTo(min)<0){
            return  true;
        }else {
            return  false;
        }
    }
}
