public class lc_java_1844 {
    public static void main(String[] args) {
        String results = "";
        String testStr = "a1c1e1";
        results = replaceDigits(testStr);
        testStr = "a1b2c3d4e";
        results = replaceDigits(testStr);
    }

    public static String replaceDigits(String s) {
        StringBuilder rtnString = new StringBuilder();
        int charNum = 0;
        //文字列をchar型の配列に転換する
        char[] charStr = s.toCharArray();
        //char型配列の要素数よりforループで処理する
        for (int i = 0; i < charStr.length; i++) {
            //偶数の場合
            if (i % 2 == 0) {
                charNum = charStr[i];
            }
            //奇数の場合
            else {
                //char型の数字は数字タイプに転換する方法はどちらいいですか。
//               charNum += (int) charStr[i] - 48;
                charNum += Integer.parseInt(String.valueOf(charStr[i]));
            }
            rtnString.append((char) charNum);
        }
        return rtnString.toString();
    }
}