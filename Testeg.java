import java.util.*;
public class Details{
    String studentName;
    int rollNo;
    String university;
    public void details(){
        Scanner sc = new Scanner(System.in);
        studentName = sc.nextLine();
        rollNo = sc.nextInt();
        sc.nextLine();
        university = sc.nextLine();
        System.out.println(studentName);
        System.out.println(rollNo );
        System.out.println(university);
   }
    public static void main(String[] args){
       Details dt=new Details();
       dt.details();
    }
}
