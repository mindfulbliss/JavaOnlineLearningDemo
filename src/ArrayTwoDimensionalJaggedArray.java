
public class ArrayTwoDimensionalJaggedArray {
	
	public static void main(String[] args) {
		
		//here we define three arrays
		int[] aa = {1,2,3,4};
		int[] bb = {2,4,6,8};
		int[] cc = {4,8,12,16};
		
		// instead we can define one 2D array 
		//d[row][column]
		int[][] d = {
						{1,2,3,4},
						{2,4,6,8},
						{4,8,12,16}
					};
		
		System.out.println(d[2][3]);//d[row][column]
		// Outer for loop for rows
		for(int i=0;i<d.length;i++)
		{
			//inner for loop for columns
			for(int j=0;j<d[i].length;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		int[][] x = {{1,2,3},{5,6,8,9},{2,3}};
		
		for(int a=0;a<x.length;a++) {
			
			for(int b=0;b<x[a].length;b++) {
				
				System.out.print(x[a][b]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------");
		
		//Enhanced for loop for OneDimensional array
		int[] aaa = {11,22,33,44};
		
		for(int k:aaa)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		
		System.out.println("--------------");
		//Enhanced for loop for 2D /jagged arrays
		
		int[][] z = {{1,11,111,1111},{2,22},{3},{4,44,444}};
		
		for(int[] a:z) {
			
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
	}

}
