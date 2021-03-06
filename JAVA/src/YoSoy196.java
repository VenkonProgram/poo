import javax.swing.*;
public class YoSoy196 {
	public int nonlycherels = 0;
	public int lycherels = 0;
	public int npalindromes = 0;
	public int lb;
	public int ub;
	public YoSoy196(int x, int y){
		this.lb = x;
		this.ub = y;
	}
	
	public void range(){
		String palindrom="";
		String inverse="";
		Long pal;
		Long inv;
		Long sum;
		int lych;
		for(int c=lb;c<=ub;c++){
			palindrom= ""+c;
			inverse = new StringBuilder(palindrom).reverse().toString();
			if (palindrom.equals(inverse)){
				npalindromes++;
				continue;
			}
				for(lych = 0;lych<30; lych++){
					pal=Long.parseLong(palindrom);
					inv=Long.parseLong(inverse);
					sum=pal+inv;
					palindrom=""+sum;
					inverse = new StringBuilder(palindrom).reverse().toString();
					if (palindrom.equals(inverse)){
						nonlycherels++;
						break;
					}
				}
				if(lych==30){
					System.out.println("Lychrel candidate found: "+c);
					lycherels++;
				}
		}
		System.out.println("Range of numbers from "+ lb + " to "+ub);
		System.out.println("Natural palindromes: "+ npalindromes);
		System.out.println("non-Lycherels encountered: "+ nonlycherels);
		System.out.println("Lycherel number candidates: "+ lycherels);
	}
	
	public static void main(String[] args){
		String lb= JOptionPane.showInputDialog("Give me the lower bound");
		String ub= JOptionPane.showInputDialog("Give me the upper bound");
		YoSoy196 rango= new YoSoy196(Integer.parseInt(lb), Integer.parseInt(ub));
		rango.range();	
	}
}
