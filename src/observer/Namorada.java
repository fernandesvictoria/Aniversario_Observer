package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		System.out.println("Apaguem as luzes!");
		System.out.println("Façam silencio...");
		System.out.println("SURPRESA!!!");
	}
}
