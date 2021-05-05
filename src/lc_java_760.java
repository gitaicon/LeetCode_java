import java.util.Arrays;

public class lc_java_760 {
    public static void main(String[] args) {
        int[] results;
        // Your input1
        int[] testArr1 = {12, 28, 46, 32, 50};
        int[] testArr2 = {50, 12, 32, 46, 28};
        // Expected1：[1,4,3,2,0]
        results = anagramMappings(testArr1, testArr2);
        System.out.println(Arrays.toString(results));
        // Your input2
        testArr1 = new int[]{84,46};
        testArr2 = new int[]{84,46};
        // Expected2：[0,1]
        results = anagramMappings(testArr1, testArr2);
        System.out.println(Arrays.toString(results));
    }

    public static int[] anagramMappings(int[] A, int[] B) {
        int[] rtnArr = new int[A.length];
        //配列Ａを検索する
        for (int i = 0; i < A.length; i++) {
            //配列Ｂを検索する
            for (int j = 0; j < B.length; j++) {
                if(A[i] == B[j]){
                    rtnArr[i] = j;
                    break;
                }
            }
        }
        return rtnArr;
    }
}