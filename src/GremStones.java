import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GremStones {
	
	public Set<Character> findIntersection(List<HashSet<Character>> list) {
		HashSet<Character> common = new HashSet<Character>();
		for(HashSet<Character> element : list){
			if(common.size() > 0) {
				common.retainAll(element);
			}else {
				common = element;
			}
		}
		return common;
	}
	
	
	public static void main(String[] args) {
		GremStones sol = new GremStones();
		int N = 0;
		HashSet<Character> commonElements = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
    	N = scanner.nextInt();
    	
    	if(N>1) {
	    	scanner.nextLine();
	    	List<HashSet<Character>> elementSet = new ArrayList<HashSet<Character>>();
	    	for(int i=0; i<N; i++) {
	    		String element$ = scanner.nextLine();
	    		HashSet<Character> element = new HashSet<Character>();
	    		for(char c : element$.toCharArray()) {
	    			element.add(c);
	    		}
	    		elementSet.add(element);
	    	}
	    	scanner.close();
	    	commonElements = (HashSet<Character>) sol.findIntersection(elementSet);
    	}
    	System.out.println(commonElements.size());
    }
}
