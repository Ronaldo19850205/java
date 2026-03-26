package java2jump;
import java.util.ArrayList;

public class afw {
	public static void main(String[] args) {
		ArrayList<String> pocket = new ArrayList<String>();
		pocket.add("paper");
		pocket.add("cellphone");
		pocket.add("money");
	    
		if (pocket.contains("money")) {
	        System.out.println("택시를 타고 가라");
	    }else {         
	        System.out.println("걸어가라");
	    }
		
	}
}
