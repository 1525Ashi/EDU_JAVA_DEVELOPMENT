package BasicPrograms;

public class TotalMarks {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M = 85, 
				I =80, 
				N= 85, 
				e=90 , 
				h = 97, 
				ma = 70;
	
		
		int total= M+ I+ N+ e+h+ma;
	double percentage = total * 100/600;
		//double percentage = total/((6*max)*100);
		System.out.println( "total marks is :" +total);
		System.out.println("Percentage: " +percentage +"%");
	}
	

}
