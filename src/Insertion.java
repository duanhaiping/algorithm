public class Insertion {
    /*
    * 从第二个数据开始，加入有数组【7,6,9,3，1,5,2,4】
    * 从无序的数组中，讲一个数据插入到已经排好顺序的有序列表
    * 从而产生一个新的数组
    * 其实现原理是，嵌套双循环，第一个外层的循环,循环除了第一个数据的所有数据，内层循环循环，数组下标从0 到外层循环的的当前位置的所有数据，并对数组进行移动
    * 第一轮：(i 外层循坏下标，j 内次循环下标)
    *   i=1 j=1
    *   比较a[1]和a[0](a[j]和a[j-1]),也就是7和6,交换位置
    *
    * 最后结果 【6,7,9,3，1,5,2,4】
    * 第二轮
    *   i=2  j=2
    * 比较a[2]和a[1](a[j]和a[j-1]),也就是9和6,不交换位置
    *   i=2  j=1
    * 比较a[1]和a[0](a[j]和a[j-1]),也就是6和7(第一轮已经排好讯),不交换位置
    * 最后结果 【6,7,9,3，1,5,2,4】
    * 第三轮
    *   i=3 j=3
    * 比较a[3]和a[2](a[j]和a[j-1]),也就是3和9,交换位置 【6,7,3,9，1,5,2,4】
    *   i=3 j=2
    * 比较a[2]和a[1](a[j]和a[j-1]),也就是3和7(第一轮已经排好讯),交换位置 【6,3,7,9，1,5,2,4】
    *  i=3 j=1
    * 比较a[1]和a[0](a[j]和a[j-1]),也就是3和7(第一轮已经排好讯),交换位置 【3,6,7,9，1,5,2,4】
    *
    * 最终结果 【3,6,7,9，1,5,2,4】
    *  第四轮
    *   i=4 j=4
    * 比较a[4]和a[3](a[j]和a[j-1]),也就是1和9,交换位置 【3,6,7,1,9，5,2,4】
    *   i=3 j=3
    * 比较a[3]和a[2](a[j]和a[j-1]),也就是3和7(第一轮已经排好讯),交换位置 【3,6,1,7,9，5,2,4】
    *  i=3 j=2
    * 比较a[2]和a[1](a[j]和a[j-1]),也就是3和7(第一轮已经排好讯),交换位置 【3,1,6,7,9,5,2,4】
    * i=3 j=1
    * 比较a[1]和a[0](a[j]和a[j-1]),也就是3和7(第一轮已经排好讯),交换位置 【1,3,6,7,9,5,2,4】
    *
    * 【1,3,6,7,9,5,2,4】
    * .
    * .
    * .
    * 其余类似
    * */
    public static void main(String[] args) {
        Comparable[] a = new Comparable[]{1,3,6,2,7,90,123,44,5,45};
        sort(a);
        for (Comparable item: a) {
            System.out.println(item);
        }
        System.out.println(a.toString());
    }
    private static  void  sort(Comparable[] a){
        int N=a.length;
        for (int i=1;i<N;i++){

            for (int j=i;j>0;j--){
                if(less(a[j],a[j-1])){
                 exch(a,j,j-1);
                }
            }
        }
    }
    private static void exch(Comparable[] a, int i, int min) {
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
