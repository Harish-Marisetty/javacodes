import java.util.Scanner;
import java.util.Arrays;
public class GradeCalci {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks of each subject");
int arr [] = new int[5];
for(int i = 0;i <5 ;i++){
arr[i] = sc.nextInt();
}
System.out.println(Arrays.toString(arr));
int sum = 0;
for(int i = 0 ; i<5;i++){
    sum +=arr[i];
}
System.out.println("Total Marks obtained :"+ sum);
int avg = sum/5;
 System.out.println(avg);

    if(avg >90){
        System.out.println("your grade is : 'A+'");
    }
    else if(avg > 80){
        System.out.println("your grade is : 'A'");
    }
    else if(avg > 70){
        System.out.println("your grade is : 'B'");
    }
    else if(avg > 60){
        System.out.println("your grade is : 'C'");
    }
    else if(avg > 50){
        System.out.println("your grade is : 'D'");
    }
    else if(avg > 40){
        System.out.println("your grade is : 'E'");
    }
    else{
        System.out.println("Fail");
    }
   

//  System.out.println("Total marks obtained :" +sum);
//  System.out.println("Average percentage :"+ avg+"%");
//  System.out.println(calculator(avg));
}
}
