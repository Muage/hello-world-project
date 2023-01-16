package baekjoonProblem;

import java.util.*;

// ���� ( 1���� �迭 �ܰ� )
// X���� M�������� ���α׷��� ������ �ð� �ִ�.
// ���ǿ� �л��� 30���� �ִµ�, �л� ���ο� �� �л����� 1������ 30������ �⼮��ȣ�� �پ� �ִ�.
// �������� ���� Ư�������� 28���� �����ߴµ�, �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

// �Է�
// �Է��� �� 28�ٷ� �� ������(�л�)�� �⼮��ȣ n(1 �� n �� 30)�� �� �ٿ� �ϳ��� �־�����.
// �⼮��ȣ�� �ߺ��� ����.

// ���
// ����� 2���̴�.
// 1��° �ٿ� �������� ���� �л��� �⼮��ȣ �� ���� ���� ���� ����ϰ�, 2��° �ٿ��� �� ���� �⼮��ȣ�� ����Ѵ�.

// ���� �Է�
// 3
// 1
// 4
// 5
// 7
// 9
// 6
// 10
// 11
// 12
// 13
// 14
// 15
// 16
// 17
// 18
// 19
// 20
// 21
// 22
// 23
// 24
// 25
// 26
// 27
// 28
// 29
// 30

// ���� ���
// 2
// 8

public class Problem05597 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean[] student = new boolean[31];
		
		for(int i = 1; i < 29; i++) {
			int submit = scanner.nextInt();
			student[submit] = true;
		}
		
		for(int i = 1; i < 31; i++) {
			if(student[i] == false) System.out.println(i);
		}
		
		scanner.close();
	}

}