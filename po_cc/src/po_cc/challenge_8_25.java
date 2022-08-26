package po_cc;

public class challenge_8_25 {

	public static void main(String[] args) {
		int num1[] = {1,2};
		int num2[] = {3,4};
		
		int n1 = num1.length;
		int n2 = num2.length;
		
		System.out.println(med(num1,num2,n1,n2));

	}
	
	
	public static float med(int arr1[], int arr2[], int n, int m) {
		//current indexes
		int ar1 = 0;
		int ar2 = 0;
		
		int count;
		float m1 =-1, m2 =-1;
		
		// odd
		if((m + n) % 2 == 1) {
			for(count = 0; count <= (n + m)/2; count ++) {
				if(ar1 != n && ar2 != m) {
					m1 = (arr1[ar1] > arr2[ar2] ? arr2[ar2++]: arr1[ar1++]);
				}
				else if (ar1 < n) {
					m1 = arr1[ar1++];
				}
				else {
					m1 = arr2[ar2++];
				}
				
			}
			return m1;
		}
		
		//even
		else {
			for(count = 0; count <= (n + m)/2; count++) {
				m2 = m1;
				
				if(ar1 != n && ar2 != m) {
					m1 = (arr1[ar1] > arr2[ar2] ? arr2[ar2++]: arr1[ar1++]);
				}
				
				else if (ar1 < n) {
					m1 = arr1[ar1++];
				}
				else {
					m1 = arr2[ar2++];
				}
				
			}
			return(m1+m2)/2;
		}
		
		 
		
	}

}
