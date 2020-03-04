import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
	@Override
	public int compare(Product a, Product b) {
		int result=0;
		if(a.id<b.id)
			result=-1;
		else
			if(a.id<b.id)
			result=+1;
			else
			result=0;
		return result;

		
	}



	
		
	}
