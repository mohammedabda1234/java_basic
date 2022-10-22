package ThisAndSuper;
//Print the fields/instance members of the current class
// using this and without using object
public class Parent {
   int a = 10,b = 20;
   Parent(){
       System.out.println(this.a);
       System.out.println(this.b);
   }

   //Call constructor of the current class using this()
   Parent(int a ,int b){
      this.a = a;
      this.b = b;
       System.out.println(a+b);
   }
   //Use this() and super() in methods not in constructors
    void print(){
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public static void main(String[] args) {
       new Parent();
       new Parent(23,65);
    }
}

//Print the fields/instance members of the parent class using super
class Child extends  Parent{
    String name;
    public Child() {
        super();
    }
    public static void main(String[] args) {
        new Child();
    }

}
