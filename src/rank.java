public class rank {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,4,7,56,88,99,123,232,433,555,666};
        int res = Rank(98,arr);
        System.out.println(res);
    }

    private static int Rank(int key ,int[] arr){
        // 二分查找其实很简单，就是每次取有序数组的中间数，如果要查找的关键字比中间数小，则在数组下标0到中间数-1的子数组中。
        // 反之，如果关键字比中间数大，则在中间数+1到最大下标中，当然，如果中间数等于要查找的值
        // 中间数怎么取的？
        // 假如说 数组是奇数长， 如 1，2，3，4，5，6，7，则0到7中间数的下标为 0+（6-0）/2,，4到7的中间数为3+（6-3）/2 =3+1.5=4.5=5
        // 偶数也是
        int lo=0;
        int hi=arr.length-1;
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(key<arr[mid]){
                hi=mid-1;
            }else if(key>arr[mid]) {
                lo=mid+1;
            }else {
                return  mid;
            }
        }
        return -1;
    }
}
