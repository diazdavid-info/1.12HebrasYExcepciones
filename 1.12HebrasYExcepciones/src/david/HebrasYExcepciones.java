package david;

class MiHebra extends Thread{
	public void run(){
		throw new NullPointerException();
	}
}

public class HebrasYExcepciones {

	public static void main(String[] args) throws InterruptedException {
		MiHebra mh = new MiHebra();
		mh.start();
		
		mh.join();
		
		System.out.println("La hebra ha terminado.");

	}

}
