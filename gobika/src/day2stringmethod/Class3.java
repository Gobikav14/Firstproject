package day2stringmethod;

public class Class3 {
public static void main(String[]args) {
String x = "one soft technologies";
String []y= x.split("soft");
 System.out.println(y[0]);
 
 String a = "one soft technologies";
  String[]  b = a.split("one");
  System.out.println(b[1]);
  
  String c ="one soft technologies";
  String[] d = c.split("o"); 
System.out.println(d[1]);
 
 
 
}
}