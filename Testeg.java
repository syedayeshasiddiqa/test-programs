import java.util.*;
public class Details{
String Studentname;
int rollno;
String university;
Details(){
Scanner sc=new Scanner(System.in);
Studentname std=sc.nextLine();
rollno rn=sc.nextInt();
university un=sc.nextLine();
}
public static void main(String[] args){
Details dt=new Details;
dt.Details();
}
}


