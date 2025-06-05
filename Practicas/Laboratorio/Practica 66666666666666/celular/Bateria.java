public class Bateria{
	private double mAh;
	private String marca;
	
	public Bateria(double mAh, String marca){
		this.mAh = mAh;
		this.marca = marca;
	}
	
	public void setMAh(doble mAh){
		this.mAh = mAh;
	}
	
	public double getMAh(){
		return mAh;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public String getMarca(){
		return marca;
	}

}