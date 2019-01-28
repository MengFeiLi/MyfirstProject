package lee;

public class Lee1 {
    //    private static double p = 3.15;
    private static int aa[] = {1, 2, 3};
    private static int bb[] = {1, 33, 3};

    public static void main(String[] args) {
//        System.out.println(aa);
//        System.out.println(bb);
//        System.out.println(aa==bb);

//        System.out.println(judge());

        boolean a = true;//数组元素完全相等 a=true，否则 a=false
        if (aa.length == bb.length) {
            for (int i = 0; i < aa.length; i++) {
//                if (aa[i] == bb[i]) {
//
//                } else {
//                    a = false;
//                }

                if (aa[i] != bb[i]) {
                    a = false;
                    break;
                }
            }
        } else {
            a = false;
        }
        System.out.println(a);

    }

//    private static boolean judge() {
//
//        if (p == 3.14) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
