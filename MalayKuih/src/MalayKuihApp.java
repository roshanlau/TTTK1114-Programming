
public class MalayKuihApp {
	public static void main(String[] args) {
		MalayKuih[] kuih = {new KuihBakar("Kuih bakar", "baking"), new MurtabakSardin("Murtabak sardin", "frying", "sardin"), 
				new MurtabakAyam("Murtabak ayam", "frying", "chicken"), new LepatPisang("Lepat pisang", "steaming")};
		
		for(int i = 0; i < kuih.length; i++) {
			kuih[i].displayHowToCook();
			if(kuih[i] instanceof Murtabak) {
				((Murtabak) kuih[i]).displayFilling();
			}
		}
	}
}
