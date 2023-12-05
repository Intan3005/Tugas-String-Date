import java.util.*;
import java.text.SimpleDateFormat;


public class TestTanggal {
   
    public static void main(String[] args) {
        
        Date HariSekarang = new Date();
        SimpleDateFormat ft=
        new SimpleDateFormat("E yyyy.MM.dd 'pada' hh:mm:ss a zzz");

        System.out.println("tanggal dan waktu saat ini:"+ft.format(HariSekarang));
    }
    
}
