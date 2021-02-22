package repeatJavaprogram;

public class RepeatJavaclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] [] studentsmark = {
				{ {33,34}, {43,44} },
				{ {53,54}, {63,64} },
				{ {3,4}, {5,6} } 
	    };
				
		
		
		/* int [] [] [] studentsmark = new int [3] [2] [2];
		//ARRAY NMAE
		
		studentsmark [0][0] [0] =55;
		studentsmark [0][0] [1] =65;
		
		studentsmark [0][1] [0] =53;
		studentsmark [0][1] [1] =68;
		
		System.out.println (studentsmark [0][1] [0]);
		
	}

} */

 for (int sno =0; sno < studentsmark.length; sno++ ) {
	 
	 System.out.println( "Student No" + (sno+1 ));
	 
	 for ( int exam =0 ; exam < studentsmark[sno].length; exam++) {
		 
		 System.out.println( "exam number" + (exam+1 ));
	     
		 System.out.println( "marks are");
	 
	 for (int marks =0; marks < studentsmark[sno][exam ].length; marks++) {
		 System.out.println(studentsmark [sno][exam ][marks]+"\t");
	 
		 
		 System.out.println( "Student No" + (sno+1 ));
		 }
	 System.out.println(); 
	 }
 }}}
	
 
 
