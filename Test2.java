import java.util.Scanner;
public class Test2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=m;j>=i;j--){
if (i==1 && j==1 || i==1 && j==9 || i==2 && j==2 || i==3 && j==3 || i==4 &&j==4 
    || i==5 && j==5 || i==4 && j==6 || i==3 && j==7 || i==2 && j==8)
System.out.print(i);
else
System.out.print(" ");
}
System.out.println();
}
for(int i=1;i<=n;i++){
for(int j=m;j>=1;j--){
if(i==1 && j==4 || i==2 && j==3  || i==1 && j==6||i==2 && j==7 || i==3 && j==8|| i==4 && j==9 || i==3 && j==2 || i==4 && j==1)
System.out.print(n-i);
else
System.out.print(" ");
}
System.out.println();
}
}
}