public class Currency_Conversion {	
		
	private float dollar;

	public Currency_Conversion(float dollar) {
		this.dollar = dollar;
	}
	public float getPeso() {
		return dollar*21.5877f;
	}
	public float getYen() {
		return dollar*106.25f;
	} 
	public float getEuro() {
		return dollar*0.85f;
	}
	
}