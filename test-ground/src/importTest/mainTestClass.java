package importTest;

public class mainTestClass {
    private String name;

    public mainTestClass (String name){
        this.name = name;
    }

    public void printName(){
        System.out.println("mainTest의 이름은  : " +name +" 입니다 ");
    }

//    public void bPackage(){
//        SubPackageClass subPackageClass = new SubPackageClass("subpackage의 클래스");
//        subPackageClass.printName();
//    }

}
