class Demo{
        int age;
        String name;

      void show(){
        System.out.println(age+ " "+name);
      }
}
public class student{
    public static void main(String[] args){
       Demo obj = new Demo();
       obj.show();
    }
}