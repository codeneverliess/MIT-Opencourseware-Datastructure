public class PeakFinderJava{
	public static int peakFinder(int arr[],int n){
		//if array length is 1 then only element will be peak
		if(n==1)
			return 0;
		//if first element greaterthan second element then first element will be peak
		if(arr[0]>=arr[1])
			return 0;
		//
		if(arr[n-1]>=arr[n-2])
			return n-1;
		
		for(int i=1;i<n;i++){
			
			if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
				return i;
		}
		return 0;
	}
	public static void main(String[] args){
		int a[]={1,2,3,4,6,5};
		int n = a.length;
		System.out.print("Index of peak is "+peakFinder(a,n));
	}
		}