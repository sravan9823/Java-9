public class Sample {

	public static void main(String[] args) {

		MyThread m1 = new MyThread(5,5);
		//m1.setA(10);
		//m1.setB(20);
		m1.start();

	}

}

class MyThread extends Thread {

	private Integer total;
	private Integer a;
	private Integer b;
	
	public MyThread(Integer a,Integer b){
		this.a =a;
		this.b =b;
	}

	@Override
	public void run() {
		total = a * b;
		System.out.println(total);

	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

}
