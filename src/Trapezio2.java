/**
 * <h2>classe trapezio</h2>
 */
/**
 * @author
 *         <h4>Corsano Matteo</h4>
 */
public class Trapezio2 {
	
	private float baseMaggiore, baseMinore, altezza;
	/**
	 * Variabili trapezio:
	 * <UL>
	 * <LI>base maggiore
	 * <LI>base minore
	 * <LI>altezza
	 * </UL>
	 */

	public Trapezio2(float baseMaggiore, float baseMinore, float altezza) {
		this.baseMaggiore = baseMaggiore;
		this.baseMinore = baseMinore;
		this.altezza = altezza;
	}

/**
 * 
 * @return ritorna la base Maggiore
 */
	public float getBaseMaggiore() {
		return baseMaggiore;
	}

/**
 * 
 * @return ritorna la base Maggiore
 */

	public float getBaseMinore() {
		return baseMinore;
	}

	/**
	 * 
	 * @return altezza
	 */
	public float getAltezza() {
		return altezza;
	}


	public float areaTrapezio() {
		float area = 0;
		area = ((baseMaggiore * baseMinore) * altezza) + 2;
		return area;
	}

	public String toString() {
		String s = "";
		s += "Base maggiore: " + baseMaggiore + "\n" + "Base minore: " + baseMinore + "\n" + "Altezza: " + altezza;
		return s;
	}

	

	public static void main(String[] args) {
		Trapezio2 t = new Trapezio2(10, 2.5f, 5);
		System.out.println(t.toString());
		System.out.println("Area: " + t.areaTrapezio());

	}

}
