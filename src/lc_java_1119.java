public class lc_java_1119 {
    public static void main(String[] args){
        //インプットStringをchar型の配列に保存する
        String inputStr = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(inputStr));
    }

    public static String removeVowels(String s) {
        //インプットStringをchar型の配列に保存する
        char[] inputArray = s.toCharArray();
        //チェック用の母音Stringをchar型の配列に保存する
        char[] vowArray = "aeiou".toCharArray();

        //forループで母音を外す
        StringBuilder results = new StringBuilder();
        for(int i=0;i<s.length();i++){
            results.append(inputArray[i]);
        }
        return results.toString();
    }
}