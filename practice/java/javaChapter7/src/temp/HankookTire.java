package temp;

public class HankookTire extends Tire {
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼���
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {	// �ִ�ȸ���� = ����ȸ����
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false;
		}
	}
}