package Task;
public class examQues{
	public static void main(String[] args) {
    
    
    String S1 = "NAABXXAN";
    System.out.println("Example 1: " + solution(S1)); // Output: 1
    
 
    String S2 = "NΑΑΝΑΑΧΝΑΒΑBYNNBZ";
    System.out.println("Example 2: " + solution(S2)); 
}
	public static int solution(String S) {
	
		int countB = 0, countA = 0, countN = 0;
		for (char c : S.toCharArray()) {
		    if (c == 'B') countB++;
		    else if (c == 'A') countA++;
		    else if (c == 'N') countN++;
		}
		int maxMoves = Math.min(Math.min(countB, countA / 3), countN / 2);
		return maxMoves;
	}
}