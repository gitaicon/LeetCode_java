import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class lc_java_1431 {
    public static void main(String[] args) {
        //テストケース１を定義する
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
        //テストケース１を定義する
        candies = new int[]{4,2,1,1,2};
        extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
        //テストケース１を定義する
        candies = new int[]{12,1,12};
        extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //戻り値を定義する
        List<Boolean> results = new ArrayList<>();
        //配列candiesの最大値を取得する
        OptionalInt maxNum = Arrays.stream(candies).max();
        //
        for (int eachCandies : candies) {
            int sumNum = eachCandies + extraCandies;
            if (sumNum >= maxNum.getAsInt()) {
                results.add(true);
            } else {
                results.add(false);
            }
        }


        return results;
    }
}