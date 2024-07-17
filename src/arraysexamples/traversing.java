package arraysexamples;

public class traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[6];
		a[0]=23;
		a[1]=63;
		a[2]=46;
		a[3]=20;
		a[4]=83;
		a[5]=74;
		
		/*
		 * for(int i=0; i<a.length;i++) { System.out.println(a[i]); }
		 */
		for(int i:a)
		{
			System.out.println(i);
		}
		
	}

}
