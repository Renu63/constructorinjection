package constructorinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class student {
	
	private List mylist;
	private Set myset;
	private Map mymap;
	
	public student(List mylist, Set myset, Map mymap) {
		super();
		this.mylist = mylist;
		this.myset = myset;
		this.mymap = mymap;
	}

	@Override
	public String toString() {
		return "student [mylist=" + mylist + ", myset=" + myset + ", mymap=" + mymap + "]";
	}
	
	
	

}
