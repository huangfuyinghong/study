package java.class01;


//Ŭ����(Class) 
//������� �ϴ� ����� ����(�Ӽ�) �������� "��� ����"�� �����ϰ�
//����� ������ �� ��ɵ��� "�޼ҵ�"�� �����ϴ� ���� ����� "������ Ÿ��" 

public class BasicTv { 
	// TV�� ������ �� ����(�Ӽ�, ����) => ��� ����(�ʵ�, ������Ƽ) 
	boolean powerOn; // TV�� ���� ����(true : on, false : off) 
	int channel; // TV�� ä�� ���� 
	int volume; // TV�� �Ҹ� ���� 
	
	// TV�� ������ �� ��� => �޼ҵ� 
	
	// TV�� �Ѱų� ���� ����� �޼ҵ�  
	
	public void trunOnOff() { 
		if(powerOn) { // ���� tv�� ���� ������
			powerOn = false; 
			System.out.println("Tv�� �������ϴ�.");
		} else { // ���� tv�� ���� ������
			powerOn = true; 
			System.out.println("TV�� �������ϴ�.");
		}
	} // end returnOnOff
	
	// ä�� ���� ����� �޼ҵ� 
	public void channelUp() { 
		if(powerOn) { 
			if(channel == 5) { 
				channel = 1;
			} else { 
				channel++;
			}
			System.out.println("channel up: " + channel);
		}
	}// end channelUp()
	
	// ä�� ���� ����� �޼ҵ�  
	public void channelDown() { 
		if(powerOn) { 
			if(channel == 1) { 
				channel = 5;
			} else { 
				channel--;
			}
			System.out.println("channel down: " + channel);
		}
	} // end channelDown
	
	// �Ҹ� ���� ����� �޼ҵ�  
		public void volumeUp() { 
			if (powerOn) { 
				if (volume !=4) { 
					volume++;
				}
				System.out.println("volumeUp : " + volume);
			}
		} // end volumeUp()
	
	// �Ҹ� ���� ����� �޼ҵ� 
	public void volumDown() { 
		if(powerOn) { // TV�� ���� �ִ� ��쿡�� 
			if(volume != 0) { 
				volume--;
			}
			System.out.println("volume down: " + volume);	
		}
	} // end volumDown
	
	// TV ���� ���¸� ��� 
	public void displayInfo() { 
		System.out.println("--- ���� ���� ---");
		System.out.println("����: " + powerOn);
		System.out.println("ä��: " + channel);
		System.out.println("����: " + volume);
	}
	
	
} // end BasicTv
