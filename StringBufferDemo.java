package StringMethods;



public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ob = new StringBuffer("Ashika");
		ob.append(" Gowda");
		System.out.println(ob);
				//append()
				StringBuffer sb=new StringBuffer("Java ");
				sb.append("fullstack");
				System.out.println(sb);
			
				String st ="hello";
				String st1="hello";
				boolean st2= st==st1;    
				System.out.println(st2);
			
				//boolean rs=st.equals(st1);  //equals() 
				//System.out.println(rs);
				
				StringBuffer sb1=new StringBuffer("hemanth");
				System.out.println(sb1.insert(5, " gowda"));
				
				StringBuffer sb2=new StringBuffer("lochana gowda");
				System.out.println(sb2.delete(2,5));                        
				StringBuffer Ash =new StringBuffer("Ruchika");
				System.out.println(sb2.replace(0, 7, "hi"));   
				
				
				StringBuffer sb3=new StringBuffer("Ashika");
				System.out.println(sb3.reverse()); 
				System.out.println(sb3.capacity());
				System.out.println(sb3.toString());
				
				String firstName = "John ";
				String lastName = firstName.concat("gowda");
				System.out.println(lastName);
				
		
	}

}
