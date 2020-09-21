/*==========================================
	    삽입 정렬(Insertion Sort)
	  : 각 숫자를 적절한 위치에 삽입하기
==========================================*/
package Prob04;

public class Test01 {
	public static void main(String[] args) {
		
		int i, j; // 반복을 위한 변수
		int temp; // 서로 다른 위치에 존재하는 두 개의 원소를 바꾸기 위한 변수
		
		int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; // 원소 배열
		
		for(i=0; i<9; i++) { // 기본적으로 i는 0 ~ 9까지 반복
			j = i; // 현재 정렬할 원소를 선택하여 적절한 위치에 삽입할 수 있도록 해줌.
			
			while(j>=0 && array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		// 결과 출력하기
		for(i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}


	}
}
