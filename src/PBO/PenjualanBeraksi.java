
package PBO;

import java.util.Scanner;

public class PenjualanBeraksi {
    public static void main(String[] args) {
        
        //Penjualan jualan = new Penjualan("iqbal nurrahmad pratama","sabun muka");
        
        //System.out.println(jualan.displayinfo());
        Scanner scanner = new Scanner(System.in);
        
        PenjualanDetail[] jualan = new PenjualanDetail[2];
        System.out.println("=======================");
        System.out.print("Nama Penerima : ");
        String Nama = scanner.nextLine();
        System.out.println("No pengiriman : ");
        String barang = scanner.nextLine();
        System.out.println("========================");
        
        jualan[0] = new PenjualanDetail(Nama, barang);
        
        System.out.print(jualan[0].displayinfo());
    }
  
}
