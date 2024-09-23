package Java_Codes;
public class method {

    void display(int n,int m){
        System.out.println(n+m);

    }
    void display(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public static void main(String args[])
    {
        method ob1=new method();
        ob1.display(20,30);
        ob1.display(1,1,1);
    }
    
}