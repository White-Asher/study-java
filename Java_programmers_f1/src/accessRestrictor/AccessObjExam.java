package accessRestrictor;
//public class AccessObjExam {
//    public static void main(String[] args) {
//        AccessObj obj = new AccessObj();
//        System.out.println(obj.p);
//        System.out.println(obj.p2);
//        System.out.println(obj.k);
////        System.out.println(obj.i);
//    }
//}

public class AccessObjExam extends AccessObj{
    public static void main (String[] args) {
        AccessObjExam obj2 = new AccessObjExam();
        System.out.println(obj2.p);
        System.out.println(obj2.p2);
        System.out.println(obj2.k);
//        System.out.println(obj.i);



    }
}