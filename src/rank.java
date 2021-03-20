public class rank {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,4,7,56,88,99,123,232,433,555,666};
        int res = Rank(98,arr);
        System.out.println(res);
    }

    private static int Rank(int key ,int[] arr){
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
