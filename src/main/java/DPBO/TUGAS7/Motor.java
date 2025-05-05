package DPBO.TUGAS7;

public class Motor extends Kendaraan implements BisaSewa{
	private boolean isSport;
    
	public Motor(String kodeSewaan, String noPlat, int cc, boolean isSport) {
		super(kodeSewaan, noPlat, cc, "Motor");
		this.isSport = isSport;
	}
    
    @Override
    public void displayInfoSewa(){
        double totalHarga = baseRate + (super.getCc()/100.0 * 5000) + (isSport ? 50000 : 0);
        System.out.println("=====Info Motor Sewaan====="+
        				   super.detailKendaraan()+"\nMotor Sport: "+isSport+"\nHarga Sewa: Rp "+totalHarga);
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