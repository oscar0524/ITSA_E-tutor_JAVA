package TH63;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int n=Integer.parseInt(sc.nextLine());n>0;n--) {
			String[] date=sc.nextLine().split(" ");
			int m=Integer.parseInt(date[0]);
			int d=Integer.parseInt(date[1]);
			if(m==1) {
				if(d<21) {
					System.out.println("Capricorn");
				}
				else {
					System.out.println("Aquarius");
				}
			}
			else if(m==2) {
				if(d<19) {
					System.out.println("Aquarius");
				}
				else {
					System.out.println("Pisces");
				}
			}
			else if(m==3) {
				if(d<21) {
					System.out.println("Pisces");
				}
				else {
					System.out.println("Aries");
				}
			}
			else if(m==4) {
				if(d<21) {
					System.out.println("Aries");
				}
				else {
					System.out.println("Taurus");
				}
			}
			else if(m==5) {
				if(d<22) {
					System.out.println("Taurus");
				}
				else {
					System.out.println("Gemini");
				}
			}
			else if(m==6) {
				if(d<22) {
					System.out.println("Gemini");
				}
				else {
					System.out.println("Cancer");
				}
			}
			else if(m==7) {
				if(d<23) {
					System.out.println("Cancer");
				}
				else {
					System.out.println("Leo");
				}
			}
			else if(m==8) {
				if(d<24) {
					System.out.println("Leo");
				}
				else {
					System.out.println("Virgo");
				}
			}
			else if(m==9) {
				if(d<24) {
					System.out.println("Virgo");
				}
				else {
					System.out.println("Libra");
				}
			}
			else if(m==10) {
				if(d<24) {
					System.out.println("Libra");
				}
				else {
					System.out.println("Scorpio");
				}
			}
			else if(m==11) {
				if(d<23) {
					System.out.println("Scorpio");
				}
				else {
					System.out.println("Sagittarius");
				}
			}
			else if(m==12) {
				if(d<22) {
					System.out.println("Sagittarius");
				}
				else {
					System.out.println("Capricorn");
				}
			}
		
		}
	}

}
