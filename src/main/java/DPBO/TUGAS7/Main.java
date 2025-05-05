package DPBO.TUGAS7;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    	
    	Kendaraan[] vehicles = {
        		new Mobil("MO-001","D1234RZ",1200,4),
        		new Mobil("MO-002","Z5432WD",2400,2),
        		new Truk("TC-001","F6543KS",3000,4000),
        		new Truk("TC-002","K5843LW",5000,7000),
        		new Motor("MT-001","Z3875HG",150,false),
        		new Motor("MT-001","L4958BV",700,true)
        };
        menu();
        int pilihan = input.nextInt();
        switch(pilihan) {
        	case 1:
        		break;
        	case 2:
        		break;
        	case 3:
        		break;
        	case 4:
        		break;
        }
        
        System.out.println("No | Kode Sewa\t| Tipe\t| Tersedia");
        for(int i = 0; i < vehicles.length; i++) {
        	System.out.println(i+"  | "+vehicles[i].toString());
        }
    }
    
    public static void menu() {
    	System.out.print("=====SISTEM PENYEWAAN KENDARAAN====="+
    					   "\n1. Tampilkan Seluruh Kendaraan"+
    					   "\n2. Tampilkan Kendaraan Tersedia"+    			
    					   "\n3. Detail Kendaraan Sewa"+
    					   "\n4. Sewa Kendaraan"+
    					   "\n5. Pengembalian Kendaraan Sewa"+    					   
    					   "\n0. Exit"+
    					   "\nPILIHAN: "
    			);
    }
}