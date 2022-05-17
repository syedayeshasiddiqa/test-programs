import java.util.Scanner;
public class Program{
int rollno;
String studentname;
String university;
Program(){
Scanner sc=new Scanner(System.in);
rollno rn=sc.nextInt();
sc.nestLine();
studentname std=sc.nextLine();
university un=sc.nextLine();
}
public static void main(String[] args){
Program dt=new Program();
System.out.println(dt.std);
System.out.println(dt.rn);
System.out.println(dt.un);
}
}


