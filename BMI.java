import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight:");
        double weight = sc.nextDouble();
        System.out.println("enter height:");
        double height = sc.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("Your BMI is:"+BMI);
        if(BMI < 18.5){
            System.out.println("under weight");
        }
        else if (BMI > 18.5 && BMI < 25){
            System.out.println("normal weight");
        }
        else{
            System.out.println("over weight");
        }
    }
}
