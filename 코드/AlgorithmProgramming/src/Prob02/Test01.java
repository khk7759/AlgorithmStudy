/*==========================================
	    선택 정렬(Selection Sort)
	  : 가장 작은 것을 선택해서 제일 앞으로 보내기
==========================================*/
package Prob02;

public class Test01 {

	public static void main(String[] args) {
		
		int i, j; // 배열에 있는 원소들을 반복적으로 탐색하기 위해 사용
		int min; // 가장 작은 수를 선택하기 위함
		int index = 0; // 가장 작은 수가 존재하는 위치를 나타내기 위한 변수
		int temp; // 특정한 두 숫자를 바꾸기 위해 사용되는 변수
		
		int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; // 원소 배열
		
		for(i=0; i<10; i++) { // 10개의 원소가 있기 때문에 10번 반복을 통해 탐색한다.
			min = 9999; // 배열 속 원소들보다 기본적으로 아주 큰 값을 무작위로 넣어주기.. min은 최소값이므로 그냥 처음에는 큰 값을 넣어줌
			
			// 가장 작은 값 선택하기 시작
			for(j=i; j<10; j++) { // 10번째 배열까지 돌아야 함... 
				if(min>array[j]) { // min 변수가 j번째 배열보다 크다면
					min = array[j]; // min은 j번째 배열 변수로 바뀌고
					index = j; // index도 j로 바뀐다.
				}
			}
			
			// 스와핑해주기
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
		
		for(i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
/*

*/
