package DPBO.TUGAS7;

public class Mobil extends Kendaraan implements BisaSewa{
    private int jumKursi;
    private String kodeSewaan;

    public Mobil(String kodeSewaan, String noPlat, int cc, int jumKursi){
            super(kodeSewaan, noPlat, cc,"Mobil");
            this.jumKursi = jumKursi;
    }

    @Override
    public void displayInfoSewa(){
        double totalHarga = baseRate + (super.getCc()/100.0 * 15000) + (jumKursi * 10000);
        System.out.println("=====Info Mobil Sewaan====="+
        				   super.detailKendaraan()+"\nJumlah Kursi: "+jumKursi+"\nHarga Sewa: Rp "+totalHarga);
    }

	@Override
	public void sewa() {
		if(super.isAvailable()) {
			super.setAvailable(false);
		}else {
			System.out.println("Mobil "+kodeSewaan+" sedang di Sewa.");
		}
	}

	@Override
	public void kembalikan() {
		if(!super.isAvailable()) {
			super.setAvailable(true);
		}else {
			System.out.println("Mobil "+kodeSewaan+" sudah di kembalikan.");
		}
	}

    
}