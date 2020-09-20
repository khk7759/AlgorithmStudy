package Prob03;

public class Test01 {

	public static void main(String[] args) {
		
		int i, j;// 반복을 위한 변수
		int temp; // 서로 다른 위치에 존재하는 두 개의 원소를 바꾸기 위한 변수
		
		int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; // 원소 배열
		
		for(i=0; i<10; i++) { // 원소의 개수만큼 반복시키기
			for(j=0; j<9-i; j++) { // 9-i : 버블정렬은 뒤에서부터 집합의 크기를 하나씩 서서히 감소시키는 특징을 가지므로..
				if(array[j] > array[j+1]) { // j번째 배열이 당장 바로 옆에 있는 j+1번째 배열과 비교를 해서 
					                        // 왼쪽에 있는 값이 오른쪽에 있는 값보다 큰 경우
					// 그 위치를 바꿔준다.
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					// 두 개의 원소 위치를 그냥 바꿔준 것이다.
				}
			}
		}
		
		// 결과 출력하기
		for(i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
