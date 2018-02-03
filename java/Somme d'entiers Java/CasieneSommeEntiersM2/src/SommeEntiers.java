/**
 * @author Apsatou dite Doudou Maiga
 *
 * Classe permettant d'implémenter les fonctions calulant différents types de sommes pour les entiers compris entre 1 et n.
 */
public class SommeEntiers {

	/**
	 * Méthode qui calcule et renvoie la somme de tous les entiers de 1 à {@code n}
	 * Renvoie -1 si {@code n} ne remplit pas toutes les conditions.
	 * 
	 * @param n un entier positif 
	 * @return la somme de tous les entiers de 0 à {@code n}
	 */
	public static int somme_entiers(int n){
		if (n<0) return -1;
		int somme_entiers=0;
		for(int j=0;j<=n;j++) {
			somme_entiers+=j;
		}
		return somme_entiers;
	}
	
	/**
	 * Méthode qui calcule et renvoie la somme de tous les entiers impairs de 1 à {@code n}
	 * Renvoie -1 si {@code n} ne remplit pas toutes les conditions.
	 * 
	 * @param n un entier positif
	 * @return la somme de tous les entiers impairs de 0 à {@code n}
	 */
	public static int somme_impairs(int n){
		if (n<0) return -1;
		if(n==0) return 0;
		int somme_impairs=0;
		for(int j=0;j<=n;j++) {
			if(j%2!=0) {
				somme_impairs+=j;
			}	
		}
		return somme_impairs;
	}
	/**
	 * Méthode qui calcule et renvoie la somme de tous les carres des entiers de 0 à {@code n}
	 * Renvoie -1 si {@code n} ne remplit pas toutes les conditions.
	 * 
	 * @param n un entier positif
	 * @return la somme de tous les carres des entiers de 0 à {@code n}
	 */
	public static int somme_carres(int n){
		if (n<0) return -1;
		int somme_impairs=0;
		for(int j=0;j<=n;j++) {
			somme_impairs+=(int)Math.pow(j,2);	
		}
		return somme_impairs;
	}
	/**
	 * Fonction principale : Vous pourrez tester vos codes dans cette méthode.
	 */
	public static void main(String[] args) {
		System.out.println("Veuillez tester vos méthodes ici (^-^) !");
		
        int n = 3;
        
        // Test somme_entiers(int n) :
		System.out.println("Somme de tous les entiers de 0 a " + n + " est : " + somme_entiers(n));
		System.out.println("la somme de tous les entiers impairs de 0 a " + n + " est : " + somme_impairs(n));
		System.out.println("la somme de tous les carres des entiers de 0 a " + n + " est : " + somme_carres(n));
	}

}
