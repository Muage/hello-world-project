package baekjoonProblem;

import java.util.*;

// ���� ( �⺻ ���� 1 �ܰ� )
// ����̴� ���� �������忡�� ������ ����ϰ� �ִ�.
// ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�.
// �������忡�� ����� ������ ������ ����� �ִ�.
// ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
// ����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
// ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������, 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
// ����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, ���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

// �Է�
// ù° �ٿ� N�� �־�����. (3 �� N �� 5000)

// ���
// ����̰� ����ϴ� ������ �ּ� ������ ����Ѵ�.
// ����, ��Ȯ�ϰ� Nų�α׷��� ���� �� ���ٸ� -1�� ����Ѵ�.

// ���� �Է�
// (1) 18
// (2) 4
// (3) 6
// (4) 9
// (5) 11

// ���� ���
// (1) 4
// (2) -1
// (3) 2
// (4) 3
// (5) 3

public class Problem02839 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int count = 0;
		
		while(true) {
			if(n % 5 == 0) {
				count += n / 5;
				System.out.println(count);
				break;
			} else {
				n -= 3;
				count++;
			}
			
			if(n < 0) {
				System.out.println(-1);
				break;
			}
		}
		
		scanner.close();
	}

}