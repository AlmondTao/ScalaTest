package javaTest.innerclass;

public class OutJavaClass {
    public class InnerJava{
        private void innerMethod(){
            privateMethod();
        }

        private void useOutParameter(){
            innerJava.innerMethod();
        }
    }

    private InnerJava innerJava = new InnerJava();
    InnerJava innerJava1 = this. new InnerJava();
    InnerJava innerJava2 = new OutJavaClass.InnerJava();
    private void privateMethod(){

    }

}

class OtherClass{
    OutJavaClass outJavaClass = new OutJavaClass();
    OutJavaClass.InnerJava innerJava = new OutJavaClass().new InnerJava();



}
