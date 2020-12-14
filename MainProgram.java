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
        else if (studentID == 1711905) {
    			int num;
    			do {
    				num = calBanner_1711905();
    				if(num == 1) {
    					int arr[] = makeArray_1711905();
    					System.out.println("Max number is " + max_1711905(arr));
    					System.out.println();
    					break;
    				}
    				else if(num ==2){
    					int arr[] = makeArray_1711905();
    					System.out.println("Min number is " + min_1711905(arr));
    					System.out.println();
    					break;
    				}
    				else {
    					System.out.println("Please enter 1 or 2");
    				}
    			} while((num != 1) || (num != 2));
    	}
        else if (studentID == 1712293)
        {
        	System.out.println("[Student ID: 1712293]");
        	chooseMenu_1712293();
        	System.out.println();
        }
        else if (studentID == 1710904) {
        	System.out.println("[Student ID: 1710904]");
        	calculate_1710904();
        }
        else if (studentID == 1711625){ 
            	System.out.println("[Student ID: 1711625]");
	    	hw_1711625();
	}
	else if ( student ID == 1616409 ){
		System.out.println("[Student ID: 1616409]");
	HW_1616409();
	}	
    }

    public void calculate_1710904() {
    	int menu = getCalcMenu();
    	while(menu == -1) {
    		System.out.println("Choose menu number 1 or 2");
    		menu = getCalcMenu();
    	}
    	
    	int key_number = getKeyNumber();
    	int result = calc_sum(menu, key_number);
    	System.out.println("[RESULT] " + result);
    	return;
    }
    
    public int getCalcMenu() {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("1. Calculate even sum");
    	System.out.println("2. Calculate odd sum");
    	System.out.print("Enter menu number: ");
    	int input = scan.nextInt();
    	
    	if(checkMenuInput(input)) {	return input; }
    	else return -1;
    }
    
    public boolean checkMenuInput(int input) {
    	if(input == 1 || input == 2) return true;
    	else return false;
    }
    
    public int getKeyNumber() {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Enter Number less than 100 : ");
    	int num = scan.nextInt();
	while(num > 100) {
		System.out.print("Enter Number LESS than 100 : ");
		num = scan.nextInt();
	}
    	
    	return num;
    }
    
    public int calc_sum(int menu, int key_number) {
	if(key_number > 100 || key_number < 0) key_number = 0;
    	int result = 0;
    	int sp = 0;
    	if(menu == 2) { sp = 1; }
    	
    	for (int i=sp; i<=key_number; i+=2) {
    		result += i;
    	}
    	
    	return result;
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
    
    
    public int calBanner_1711905() {
		int number;
		System.out.println("[Student ID: 1711905]");
		System.out.println("1. Calculate the Max value");
		System.out.println("2. Calculate the Min value");
		System.out.print("Enter menu number : ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		return number;
	}
    
    public int[] makeArray_1711905() {
		int[] arr = new int[5];
		System.out.println("Enter the number 5 times : ");
		for(int i =0; i<5; i++) {
			Scanner input = new Scanner(System.in);
			arr[i] = input.nextInt();
		}
		return arr;
	}
    
    public int max_1711905(int[] arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i])
				max = arr[i];
		}
		return max;	
	}
	
	public int min_1711905(int[] arr) {
		int min = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(min > arr[i])
				min = arr[i];
		}
		return min;	
	}   
	
	
	public void chooseMenu_1712293() {
		Scanner scanner = new Scanner(System.in);
		int menuNum, num1, num2, result;
		
		System.out.println("1. Calculate Min value(int)");
		System.out.println("2. Calculate Max value(int)");
		System.out.print("Enter menu numbers: ");
    		menuNum = scanner.nextInt();
		
		if(menuNum == 1) {
			System.out.print("Enter first number : ");
			num1 = scanner.nextInt();
			
			System.out.print("Enter second number : ");
			num2 = scanner.nextInt();
			
			System.out.println("minValue is "+calMin_1712293(num1, num2)+".");
			
		}else {
			System.out.print("Enter first number : ");
			num1 = scanner.nextInt();
			
			System.out.print("Enter second number : ");
			num2 = scanner.nextInt();

			System.out.println("maxValue is "+calMax_1712293(num1, num2)+".");
		}
	}
	
	private int calMin_1712293(int a, int b) {
		return (a < b)? a : b;
	}
	
	private int calMax_1712293(int a, int b)
	{
		return (a >= b)? a : b;
	}
    
	
	public void hw_1711625(){
		int num;
		int menu;
		Scanner scan = new Scanner(System.in);

		System.out.println("1. Calculate the Reciprocal (integer) ");
		System.out.println("2. Calculate the Absolute number (integer) ");
		System.out.print("Enter menu numbers: ");
		menu = scan.nextInt();
		System.out.print("Enter the number that you want to calculate: ");
		num = scan.nextInt();

		if(menu == 1){
			System.out.println("Reciprocal: " + calcReciprocal_1711625(num));
		}
		else 
			System.out.println("Absolute number: " + calcAbsolute_1711625(num));
		System.out.println();
	}

	private double calcReciprocal_1711625(double a){
		if (a == 0)
			return 0;
		else if (a<0){
			a = a * -1;
			return (-1) * 1/a;
		}
		else 
			return 1/a;
	}

	private int calcAbsolute_1711625(int a){
		if (a < 0)
			return a * -1;
		return a;
	}
	
	public void HW_1616409(){
	   Scanner scan = new Scanner(System.in);
		System.out.println("1. Factorial");
		System.out.println("2. Sum");
		int num=scan.nextInt();
		int count,i;
		if (num==1) {
		  System.out.println("Put your number under 32!");	
		  int cal=scan.nextInt();
		  count=1;
		  for(i=1;i<=cal;i++) 
			count *= i;
		  System.out.println("The result is "+count);
		 }
		 else if(num==2) {
		   System.out.println("Put your number!");
		   int cal=scan.nextInt();
		   count=0;
		   for(i=0;i<=cal;i++)
			   count += i;
		   System.out.println("The result is "+count);
		}
	}



}
