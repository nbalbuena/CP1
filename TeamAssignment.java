public class TeamAssignment {
    public static void main(String[] args) {
	System.out.println(in1To10(5, true));
	System.out.println(in1To10(11, false));
	System.out.println(in1To10(11, true));
  
	}

  public static boolean in1To10(int n, boolean outsideMode) {
   if (outsideMode && n > 10) {
  	return true;
}
   if (outsideMode && n < 1) {
	return false;
	
   }
   return false;
}
}