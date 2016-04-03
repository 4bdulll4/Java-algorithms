package sorting;


public class Selection {
	
	public static long totTime;
	public void sort (int arr[], int size)
	{
		long time1 = System.currentTimeMillis();	
		int steps=0;								
		int min;
		int temp;

		for(int i = 0 ; i<size ; i++)
		{
			steps++;
			min=i;
			for (int j = i+1 ; j<size ; j++)
			{
				steps++;
				if(arr[j]<arr[min])
					min=j;
			}
			if(min!=i)
			{
				
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		long time2 = System.currentTimeMillis();
		
		for(int i = 0 ; i<arr.length ; i++)
		{
			System.out.println(arr[i]);
		}
		totTime = time2 - time1;
		double second = (double)(time2-time1)/1000;
		System.out.println("This Algorithm took " + totTime + " MilliSeconds and " + second +" seconds to sort the array.");
		System.out.println("No. of Steps: " + steps);							
	}
}
