package Listt;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<ArrayClass> obj=new ArrayList<ArrayClass>();
	    obj.add(new ArrayClass(1));
	    obj.add(new ArrayClass(2));
	    obj.add(new ArrayClass(3));
    for(ArrayClass i:obj) {
    	System.out.println(i);
    }
	}

}
