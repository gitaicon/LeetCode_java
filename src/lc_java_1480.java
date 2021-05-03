public class lc_java_1480 {
    public static void main(String[] args){
        //numを定義する
        int[] num = new int[]{1, 2, 3, 4};
        runningSum(num);

        //numを２番目のテストケースで再設定する
        num = new int[]{1, 1, 1, 1, 1};
        runningSum(num);

        //numを３番目のテストケースで再設定する
        num = new int[]{3, 1, 2, 10, 1};
        runningSum(num);
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];

        //初期設定
        result[0] = nums[0];

        //「i-1」が有効するためiの初期値は１からカウントアップする
        for (int i = 1; i < nums.length; i++){
            result[i] = result[i-1] + nums[i];
        }
        return result;
    }
}