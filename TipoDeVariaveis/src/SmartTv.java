
public class SmartTv {

		//Colocando Atributos
		boolean ligada=false;
		int canal=1;
		int volume = 25;

		
		public void mudarCanal (int novoCanal) {
			canal = novoCanal;		
		}
		
		
		public void aumentarCanal() {
			canal++;
			System.out.println("Aumentou para: " + volume);
			//mesmo que volume = volume +1;
		}
		
		public void diminuirCanal() {
			canal--;
			System.out.println("Aumentou para: " + volume);
			//mesmo que volume = volume +1;
		}
		
		public void aumentarVolume() {
			volume++;
			System.out.println("Aumentou para: " + volume);
			//mesmo que volume = volume +1;
		}
		
		public void diminuirVolume() {
			volume--;
			//mesmo que volume = volume -1;
			System.out.println("Diminuiu para: " + volume);
		}
		
		public void ligar() { 
			ligada=true;
		}
		
		public void desligar() { 
			ligada=false;
		
		}
}
