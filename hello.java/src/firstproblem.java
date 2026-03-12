import java.util.Scanner;
public class firstproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sub1 = sc.nextFloat();
        float sub2 = sc.nextFloat();
        float sub3 = sc.nextFloat();
        float sub4 = sc.nextFloat();
        float sub5 = sc.nextFloat();
        float sum = sub1+sub2+sub3+sub4+sub5;
        float  total = 500;
        float percentage= sum/total*100;

        
        System.out.println("percentage of marks of 5 subject " + percentage + "%");
        
    }
    
}
