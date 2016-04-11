import java.util.Scanner;
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of a month.eg: for feb-2; for march-3");
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        switch(input){
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
        	System.out.println("This month has 31 days.");
        	break;
        case 4:
        case 6:
        case 9:
        case 11:
        	System.out.println("This month has 30 days");
        	break;
        case 2:
        	System.out.println("Pls enter the year");
        	int year = sc.nextInt();
        	if (year % 4 == 0){
        		System.out.println("This month has 29 days");
                break;
        	}
        	else{
        		System.out.println("This month has 28");
        		break;
        	}
        }
        
	}

}
