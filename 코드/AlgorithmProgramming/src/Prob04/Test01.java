/*==========================================
	    ���� ����(Insertion Sort)
	  : �� ���ڸ� ������ ��ġ�� �����ϱ�
==========================================*/
package Prob04;

public class Test01 {
	public static void main(String[] args) {
		
		int i, j; // �ݺ��� ���� ����
		int temp; // ���� �ٸ� ��ġ�� �����ϴ� �� ���� ���Ҹ� �ٲٱ� ���� ����
		
		int[] array = new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; // ���� �迭
		
		for(i=0; i<9; i++) { // �⺻������ i�� 0 ~ 9���� �ݺ�
			j = i; // ���� ������ ���Ҹ� �����Ͽ� ������ ��ġ�� ������ �� �ֵ��� ����.
			
			while(j>=0 && array[j] > array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
		}
		
		// ��� ����ϱ�
		for(i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}


	}
}
