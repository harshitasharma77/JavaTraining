package Array;

public class D2Arr {
	 public static void main(String[] args) {
	        int[][] ma = new int[2][2];
	        ma[0][0] = 1;
	        ma[0][1] = ma[1][1] = 33;
	        ma[1][0] = 23;
	        
	        for (int i=0;i<ma.length;i++){
	            for(int j=0;j<ma[i].length;j++){
	                System.out.println(ma[i][j]);
	            }
	        }
	    }
}
