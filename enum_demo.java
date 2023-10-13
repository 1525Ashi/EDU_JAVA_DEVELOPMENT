package Special_class;

public class enum_demo {
//	  enum Level {
//		    LOW,
//		    MEDIUM,
//		    HIGH
//		  }
	
	enum week {
		sun,
		mon,
		tues,
		wednes,
		thurs,
		fri,
		satur;
	}
	
	public enum Month {
		jan,
		feb,
		march,
		April,
		may,
		jun,
		july,
		aug,
		sept,
		oct,
		nov,
		dec;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			 Level myVar = Level.MEDIUM; 
//			 System.out.println("The level is: " +myVar);\
	
		Month month = Month.july;
		System.out.println("month is : "+month);
		
		week days = week.fri;
		System.out.println("today is : "+days+"day");
	}

}
