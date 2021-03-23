public class SelectedSort {
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
