public class Silinder{
	double h, r;
	public Silinder(double korgus, double laius){
		if(korgus<=0){throw new RuntimeException("Sobimatu pikkus");}
		if(laius <=0){throw new RuntimeException("Sobimatu laius");}
		h = korgus;
		r = laius;
	}
	public double pindala(){
		return (2*Math.PI*Math.pow(r,2)) + (2*Math.PI*h);
	}
	public double ruumala(){
		return Math.PI*Math.pow(r,2)*h;
	}
	public String toString(){
		return "Silinder korgusega "+h+" ja laiusega "+r+" andmed:\nPindala: "+pindala()+"\nRuumala: "+ruumala()+"\n";
	}
}