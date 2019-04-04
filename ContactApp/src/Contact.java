import java.util.ArrayList;
import java.util.Scanner;



public class Contact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Information> al = new ArrayList<Information>();
		
		Scanner scr = new Scanner(System.in);
		
		for(;;) {
			
			System.out.println("please press the correct number ");
			System.out.println("if you want exit this app, press 0");
			System.out.println("1. add      2. show      3.delete");
			
			int num =scr.nextInt();
			
			String name;
			String email;
			String phone;
			String delName;
			
			if(num==1) {//add
				System.out.println("name:");
				name=scr.next();
				
				System.out.println("email:");
				email=scr.next();
				
				System.out.println("phone:");
				phone=scr.next();
				
				al.add(new Information(name,email,phone));
				
			}else if(num==2) {
				for(int i=0; i<al.size(); i++) {
					System.out.println("Name:"+al.get(i).getName());
					System.out.println("E-mail:"+al.get(i).getEmail());
					System.out.println("Phone:"+al.get(i).getPhone());
					System.out.println("\n");
				}
			}else if(num==3) {
				System.out.println("please input the name that you want to delete\n");
				delName=scr.next();
				int search=0;
				for(int i=0; i<al.size(); i++) {
					if(al.get(i).getName().equals(delName)) {
						search=i;//전부 0번째임
						break;
					}
				}
				
				al.remove(search);
			}else if(num==-1){
				scr.close();
				System.out.println("연락처 어플을 종료합니다.");
				break;
			}
			
		}
		

	}

}
