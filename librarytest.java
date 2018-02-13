import java.util.Scanner;
public class librarytest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Library location, total books,  total Staff, and yearly expense.");
		library lib1=new library(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Enter Library location, total books,  total Staff, and yearly expense.");
		library lib2=new library(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Enter Library location, total books,  total Staff, and yearly expense.");
		library lib3=new library(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Enter Library location, total books,  total Staff, and yearly expense.");
		library lib4=new library(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
		
		System.out.println("Enter Library location, total books,  total Staff, and yearly expense.");
		library lib5=new library(scanner.nextLine(),scanner.nextInt(),scanner.nextInt(),scanner.nextDouble());
		scanner.nextLine();
			
		System.out.println(lib1.Library_Location);
		System.out.println(lib1.Library_Total_Books);
		System.out.println(lib1.Library_Staff_Total);
		System.out.println(lib1.Library_Yearly_Expense);
	
		System.out.println(lib2.Library_Location);
		System.out.println(lib2.Library_Total_Books);
		System.out.println(lib2.Library_Staff_Total);
		System.out.println(lib2.Library_Yearly_Expense);
		
		System.out.println(lib3.Library_Location);
		System.out.println(lib3.Library_Total_Books);
		System.out.println(lib3.Library_Staff_Total);
		System.out.println(lib3.Library_Yearly_Expense);
	
		System.out.println(lib4.Library_Location);
		System.out.println(lib4.Library_Total_Books);
		System.out.println(lib4.Library_Staff_Total);
		System.out.println(lib4.Library_Yearly_Expense);
	
		System.out.println(lib5.Library_Location);
		System.out.println(lib5.Library_Total_Books);
		System.out.println(lib5.Library_Staff_Total);
		System.out.println(lib5.Library_Yearly_Expense);
	
	
	
	
	}

}
