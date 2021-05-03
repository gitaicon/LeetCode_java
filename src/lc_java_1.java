public class lc_java_1 {
    public static void main(String[] args) {
        //numを定義する
        int[] num = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(num, target);

        //numを２番目のテストケースで再設定する
        num = new int[]{3, 2, 4};
        target = 6;
        twoSum(num, target);

        //numを３番目のテストケースで再設定する
        num = new int[]{3, 3};
        target = 6;
        twoSum(num, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        //結果を保存する２次元配列を定義する
        int[][] indexSum = new int[nums.length][2];
        //リターン値に使うため「i」はローカル変数として定義する
        int i = 0;
        //二重ループから抜けるため標識を定義する
        loop_i:
        //１回目はnumsの要素の数までループする
        for (i = 0; i < nums.length; i++) {
            //２回目は各要素の和を「target」と比較して、一致する場合リターンする
            for (int j = i + 1; j < nums.length; j++) {
                indexSum[i][0] = i;
                indexSum[i][1] = j;
                if (target == nums[i] + nums[j]) {
                    break loop_i;
                }
            }
        }
        return indexSum[i];
    }
}