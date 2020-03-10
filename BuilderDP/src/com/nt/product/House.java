//House.java (Product class)
package com.nt.product;

public class House {
	private  Basement basement;
	private  Roof  roof;
	private Structure structure;
	private Interior  interior;
	public Basement getBasement() {
		return basement;
	}
	public void setBasement(Basement basement) {
		this.basement = basement;
	}
	public Roof getRoof() {
		return roof;
	}
	public void setRoof(Roof roof) {
		this.roof = roof;
	}
	public Structure getStructure() {
		return structure;
	}
	public void setStructure(Structure structure) {
		this.structure = structure;
	}
	public Interior getInterior() {
		return interior;
	}
	public void setInterior(Interior interior) {
		this.interior = interior;
	}
	@Override
	public String toString() {
		return "House [basement=" + basement + ", roof=" + roof + ", structure=" + structure + ", interior=" + interior
				+ "]";
	}
	
	

}
