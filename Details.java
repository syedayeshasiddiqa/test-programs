import java.util.*;
public class Program{
    int rollNo;
    String studentName;
    String university;
    Program(){
        Scanner sc = new Scanner(System.in);
        rollNo = sc.nextInt();
        sc.nextLine();
        studentName = sc.nextLine();
        university = sc.nextLine();
    }
    public static void main(String[] args){
        Program pgm = new Program();
        System.out.println(pgm.rollNo);
        System.out.println(pgm.studentName);
        System.out.println(pgm.university);
    }
}


