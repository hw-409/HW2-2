import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        MainProgram mainProgram = new MainProgram();
        mainProgram.printBanner();
        while (true) {
            int studentID = mainProgram.receiveStudentID();
            mainProgram.runModule(studentID);
        }
    }

    public void printBanner() {
        System.out.println("[2020-Fall Software Engineering]");
        System.out.println("Simple Software Development Project");
        System.out.println();
    }

    public int receiveStudentID() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a student ID: ");
        return input.nextInt();
    }

    public void runModule(int studentID) {
        if (studentID == 11530)
            System.out.println("No. It is the professor ID.\n");
        else if (studentID == 1710344)
        {
        	System.out.println("[Student ID: 1710344]");
        	hw02_1710344();
        }
        else
            System.out.println("To be developed...\n");
    }
    
    public void hw02_1710344() {
    	int num1;
    	int num2;
    	int menu;
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("1. Calculate the min of two integers");
    	System.out.println("2. Calculate the max of two integers");
    	System.out.print("Enter menu numbers: ");
    	menu = scan.nextInt();
    	System.out.print("Input first number: ");
    	num1 = scan.nextInt();
    	System.out.print("Input second number: ");
    	num2 = scan.nextInt();
    	
    	if(menu == 1) {
    		System.out.println("min : " + min_1710344(num1, num2));
    	}
    	else {
    		System.out.println("max : " + max_1710344(num1, num2));
    	}
    	
    	System.out.println();
    }
    
    private int min_1710344(int a, int b) {
    	if(a > b) return b;
    	else return a;
    }
    
    private int max_1710344(int a, int b) {
    	if(a > b) return a;
    	else return b;
    }
    
    
}
