package Java_Codes;
public class overload {
    int marks;
    String name;

    overload(int marks,String name){
       this.marks=marks;
        this.name=name;
    }
    public static void main(String args[])
    {
        overload ob1=new overload(45,"prathap");
        overload ob2=new overload(90,"Saravanan");

        System.out.println("mark is "+ob1.marks+'\n'+ob1.name);
        System.out.println(ob2.marks+ob2.name);
    }
    
}
