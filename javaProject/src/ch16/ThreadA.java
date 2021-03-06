package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized (b) { //ThreadB객체에 대해서 동기화 블럭 설정
			try {
				System.out.println("b가 완료될때까지 기다립니다.");
				b.wait(); 
				/*
				main쓰레드가 ThreadB에게 자신은 wait(일시정지)하겠다고 알림.
				즉,wait()은 잠금(모니터링 락)을 풀고, 다른 쓰레드에서 notify(All)를 호출해주기를 기다린다. 
			    notify가 도착하면 다시 잠금을 시도하여 잠기면 실행을 이어나간다.
			    */
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is : "+b.total);
		}
	}
}

class ThreadB extends Thread {
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
			notify();//wait상태인 쓰레드를 깨우는 메소드
		}//end synchronized{}
	}//end run()
}
