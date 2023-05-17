import java.util.Scanner;
public class Stud{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.insert(123,"Bhavitha","G",1,9);
        Student s2 = new Student();
        s2.insert(142,"Sri","U",1,12);
        Student s3 = new Student();
        s3.insert(223,"Sneha","G",2,9);
        Student s4 = new Student();
        s4.insert(353,"Rao","U",2,12);
        Student s5 = new Student();
        s5.insert(466,"Mittu","G",2,9);
        int output;
        Scanner choo = new Scanner(System.in);
        System.out.println("Choose a number ( 1to 4):");
        output = choo.nextInt();
        if(output==1){
            s1.displayInf();
            s2.displayInf();
            s3.displayInf();
            s4.displayInf();
            s5.displayInf();
        }
        else if(output == 2){
            s1.option2();
            s2.option2();
            s3.option2();
            s4.option2();
            s5.option2();
        }
        else if (output ==3){
            s1.option3();
            s2.option3();
            s3.option3();
            s4.option3();
            s5.option3();
        }
    else if (output==4){
        s1.tuition();
        s2.tuition();
        s3.tuition();
        s4.tuition();
        s5.tuition();
    }
    }
}