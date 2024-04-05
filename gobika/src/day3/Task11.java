package day3;

public class Task11 {
public static void main(String[]args) {;
Employee e1 = new Employee();
String a = args[0];
String[] b = a.split("'");

e1.name=b[0];
e1.age=Integer.parseInt(b[1]);
e1.gender=b[2];
e1.salary=Integer.parseInt(b[3]);

System.out.println("name="+e1.name+"age="+e1.age+"gender="+e1);



}
}
