
public class uygulama1 {
	
	public void method1(int...listem){
		System.out.println("Gönderilen parametre sayisi:" + listem.length );
		
		for(int x : listem) {
			System.out.println("listem:" + x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Uygulama1 baþalamýþtýr. ");
		
		uygulama1 u = new uygulama1();
		u.method1(50,3,4,5);

		
		/* stringbuilder */
		StringBuilder sb = new StringBuilder();
		sb.append("Ali")
		.append(" ")
		.append("topa")
		.append(" ")
		.append("bak.");
		System.out.println(sb);
				
/*
		public StringBuilder append(String str) {
			super.append(str);
			return this;
		}
*/
		
		
	

	}

}
