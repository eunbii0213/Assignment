package Assignment10;

public class Test {

	public static void main(String[] args) {
		int[] arr = {3,9,4,7,0,5,1,6,8,2};
		
		quickSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	
	public static void quickSort(int[] arr, int start, int end) {
		
		//배열의 시작과 끝사이에서 파티션을 나누고 오른쪽방 첫번째 값을 가져옴 
		int rightPart = partition(arr,start,end);
		
		if(start < rightPart-1) {
			quickSort(arr, start, rightPart-1);
		}
		
		if(rightPart < end) {
			quickSort(arr, rightPart,end);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		
		//pivot은 물리적 중간값으로 설정 
		int pivot = arr[(start+end)/2];
		
		//start와 end가 서로 엇갈릴 때까지 반복 
		while(start <= end) {
			
			while(arr[start] < pivot) {
				start++;
			}
			
			while(arr[end] > pivot) {
				end--;
			}
			
			//왜 start가 end랑 같을 때도 swap을 해야하는거지??
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;
			}
			
		}
		
		return start;
	}
	
	public static void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end]= temp;
	}

}
