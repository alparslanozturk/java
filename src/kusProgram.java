public class kusProgram {
	public static void main ( String[] dizin) {
		karga kargam = new karga();
		serce sercem = new serce();
		kargam.turGoster();
		sercem.turGoster();
		// kus kusum = new kus();
		// kusum.turGoster();
		
		
		kargam.setYas(3);
		kargam.setAd("kargacikk....");
		
		karga kargago = new karga();
		
		karga kargamCopy;
		
		kargamCopy = kargam;
		
		
		

		if(  kargam == kargamCopy ) {
			System.out.println("esittir. ");
		} else {
			System.out.println("esitt degildir. ");
		}
		
		if(  kargam.equals(kargamCopy) )
			System.out.println("esittir.22222 ");
		
		
		
		
	}
}