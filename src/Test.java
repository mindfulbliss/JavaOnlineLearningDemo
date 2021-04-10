
public class Test {
	
	public static void main(String[] args) {
		
//		int[][] a = {{1,2,3},{4,5},{6,7,8,9},{10}};
//		
//		for(int i=0; i<a.length;i++) {
//			for (int j=0; j<a[i].length;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		int[][] d = new int[3][];
//		
//		d[0][0]=2;
//		d[0][1]=2;
//		d[0][2]=2;
//		d[0][3]=2;
//		d[0][4]=2;
//		d[1][0]=3;
//		d[1][1]=3;
//		d[1][2]=3;
//		d[1][3]=3;
//		d[1][4]=3;
//		d[2][0]=4;
//		d[2][1]=4;
//		d[2][2]=4;
//		d[2][3]=4;
//		d[2][4]=4;
//		d[3][0]=5;
//		d[3][1]=5;
//		d[3][2]=5;
//		d[3][3]=5;
//		d[3][4]=5;
		
		System.out.println("-----------------");
		
		int[][] d = {{2,3},{4,6},{8,12}};
		
		for(int i=0; i<d.length;i++) {
			for(int j=0; j<d[i].length;j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		for (int[] x : d) {
			for (int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		System.out.println(d[0][0]);
		System.out.println(d[0][1]);
		System.out.println(d[1][0]);
		System.out.println(d[1][1]);
		System.out.println(d[2][0]);
		System.out.println(d[2][1]);
		
	
	}

}
