
package PBO;


public class PenjualanDetail extends Penjualan {

    public PenjualanDetail(String Barang, String Nama) {
        super(Barang, Nama);
    }
    
    public int getkodebarang(){
        return Integer.parseInt(getNama().substring(0, 2))+ 200;
        
    }
   


public String gettempatpengiriman(){
  
    String kodebarang = getNama().substring(0, 3);
     
     switch (kodebarang){
         case "020":
             return "tanjung";
         case "025":
             return "berabai";
             default:
             return "banjarmasin";
     }
     }
 public String getjenisbarang(){
        String kodenama = getBarang().substring(2,4);
        if(kodenama.equals("10")){
            return "Material";
        } else {
            return "Material ";
        }
 }

     
     @Override
     public String displayinfo(){
         return super.displayinfo()+
                 "\njumlah barang: "+getkodebarang()+
                 "\ntempat pengirim: "+gettempatpengiriman()+
         "\njenis barang: "+getjenisbarang();
         
     }
} 
       
         
             
         
           
         
               
 

         
    
  
