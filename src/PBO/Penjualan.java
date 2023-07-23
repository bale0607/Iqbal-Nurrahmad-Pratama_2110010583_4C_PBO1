
package PBO;


public class Penjualan {
  
    private String Barang;
    private String Nama;
   
    
    public Penjualan(String Barang, String Nama){
        this.Barang = Barang;
        this.Nama = Nama;
        
        
    
    }
   public void setharga(String Barang){
       this.Barang = Barang;
   }
   public void setbarang(String Nama){
       this.Nama = Nama;
     
   }
   public String getBarang(){
       return Barang;
   }
   public String getNama(){
       return Nama;   
   }
  
   public String displayinfo(){
       return"Nama: "+getBarang()+"\nBarang: "+getNama();
   
}           
   }
     
