package Practice;

public class p1 {
	public static void main(String[] args) {

		String target = "liveonwildlifehjbd lifee";
		String filter = "lifee";
		int times = 0;
		int j;
		for(int i = 0;i<(target.length()-3);i++) {
			j=i+4;
			if(filter.equals(target.substring(i,j))) {
				times++;
			}
		}
		System.out.println(filter+" times: "+times);
	}

}
