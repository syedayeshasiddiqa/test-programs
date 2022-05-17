import java.util.Scanner;
public class Program{
int rollno;
String studentname;
Program(){
Scanner sc=new Scanner(System.in);
rollno=sc.nextInt();
sc.nextLine();
studentname=sc.nextLine();
}
public static void main(String[] args){
Program s1=new Program();
System.out.println(s1.rollno);
System.out.println(s1.studentname);
}
}


