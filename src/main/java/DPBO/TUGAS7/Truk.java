package DPBO.TUGAS7;

public class Truk extends Kendaraan implements BisaSewa{
    private int kapasitasMuatan;
    
    public Truk(String kodeSewaan, String noPlat, int cc, int kapasitasMuatan) {
    	super(kodeSewaan, noPlat, cc, "Truk");
    	this.kapasitasMuatan = kapasitasMuatan;
    }
    
    @Override
    public void displayInfoSewa(){
        double totalHarga = baseRate + (super.getCc()/100.0 * 5000) + (kapasitasMuatan * 20000 );
        System.out.println("=====Info Motor Sewaan====="+
        				   super.detailKendaraan()+"\nKapasitas Muatan: "+kapasitasMuatan+" KG\nHarga Sewa: Rp "+totalHarga);
    }

	@Override
	public void sewa() {
		if(super.isAvailable()) {
			super.setAvailable(false);
		}else {
			System.out.println("Motor "+kodeSewaan+" sedang di Sewa.");
		}
	}

	@Override
	public void kembalikan() {
		if(!super.isAvailable()) {
			super.setAvailable(true);
		}else {
			System.out.println("Motor "+kodeSewaan+" sudah di kembalikan.");
		}
	}
}