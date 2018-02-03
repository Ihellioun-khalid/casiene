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
		return (n*(n+1))/2;
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

		return (int) Math.pow(((1+n)/2), 2);
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
		return (int) ((1/(double)6)*n*(n+1)*(2*n+1));
	}

	/**
	 * Fonction principale : Vous pourrez tester vos codes dans cette méthode.
	 */
	public static void main(String[] args) {
		System.out.println("Veuillez tester vos méthodes ici (^-^) !");
		
        int n = 2;
        
        // Test somme_entiers(int n) :
		System.out.println("Somme de tous les entiers de 0 a " + n + " est : " + somme_entiers(n));
		System.out.println("la somme de tous les entiers impairs de 0 a " + n + " est : " + somme_impairs(n));
		System.out.println("la somme de tous les carres des entiers de 0 a " + n + " est : " + somme_carres(n));
	}

}
