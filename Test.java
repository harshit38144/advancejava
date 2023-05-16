public class Test {
    //Instance variable
    int a=5;
    String name="Harshit";
    public static void main(String[] args) {
        //Local variable always inside the method
        int num=9;
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj1.name="Raj";

        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);
    }
}
