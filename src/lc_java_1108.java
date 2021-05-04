public class lc_java_1108 {
    public static void main(String[] args) {
        //ipAddrを定義する
        String ipAddr = "123.1.1.1";
        System.out.println(defangIPaddr(ipAddr));
        ipAddr = "255.100.50.0";
        System.out.println(defangIPaddr(ipAddr));
        ipAddr ="227.222.40.237";
        System.out.println(defangIPaddr(ipAddr));
    }

    public static String defangIPaddr(String address) {
        StringBuilder newAddr = new StringBuilder();
        //for ループで処理する
        for (int i = 0; i < address.length(); i++) {
            int spos = address.indexOf('.', i);
            if (spos > 0 && i != spos) {
                newAddr.append(address, i, spos).append("[.]");
                i = spos;
            //「.」は存在しない場合１回のみ「else if」の部分を行う
            } else if (spos < 0) {
                newAddr.append(address.substring(i));
                break;
            }
        }
        return newAddr.toString();
    }
}