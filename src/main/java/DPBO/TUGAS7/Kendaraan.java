package DPBO.TUGAS7;

public abstract class Kendaraan{
	protected String kodeSewaan;
    private String noPlat;
    private int cc;
    protected String tipeKendaraan;
    protected double jarakTempuh = 0.0;
    protected boolean isOn = false;
    private boolean isAvailable = true;

	public Kendaraan(String kodeSewaan, String noPlat, int cc, String tipeKendaraan){
		this.kodeSewaan = kodeSewaan;
        this.noPlat = noPlat;
        this.cc = cc;
        this.tipeKendaraan = tipeKendaraan;
    }   

	public int getCc() {
		return cc;
	}
    
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public void startEngine(){
        if(!isOn){
            System.out.println("Mesin "+tipeKendaraan+" Menyala!!");
            isOn = true;
        }else{
            System.out.println("Mesin "+tipeKendaraan+" Sudah Menyala!!");
        }
    }
    
    public void jalan(double jarak){
        if(isOn){
            jarakTempuh+=jarak;
            System.out.println(tipeKendaraan+" Melaju Sepanjang "+jarak+" KM");
        }else{
            System.out.println("Mesin "+tipeKendaraan+" Belum Menyala!!");
        }
    }
    
    public void stopEngine(){
        if(isOn){
            System.out.println("Mesin "+tipeKendaraan+" Mati!!");
            isOn = false;
        }else{
            System.out.println("Mesin "+tipeKendaraan+" Sudah Mati!!");
        }
    }
    
    public String detailKendaraan() {
    	return "Kode Sewa: " + kodeSewaan + "\nPlat Nomor: " + noPlat + "\nCC: " + cc
    			+ "\nTipe Kendaraan: " + tipeKendaraan;
    }
    
    public String toString() {
    	// TODO Auto-generated method stub
    	return kodeSewaan+"\t| "+tipeKendaraan +"\t| "+isAvailable() ;
    }
}