package dls;

import main.Node;

public class DepthLimitedSearch { //Membuat Class DepthLimitedSearch
    private int limit; //Deklarasi variable instance 'limit'

    public void setLimit(int limit) { //Membuat Class setLimit untuk mengatur nilai batasan kedalaman
        this.limit = limit; //Mengatur variabel limit dengan nilai yang diberikan
    }

    public int getLimit() { // Method yang digunakan untuk mendapatkan nilai batasan kedalaman limit
        return limit; //Mengembalikan nilai variabel limit
    }

    public void search(Node start, Node goal) { //Method yang digunakan untuk melakukan pencarian DLS dari node 'start' ke node 'goal'
        //Mencetak pesan yang menunjukan bahwa pencarian sedang dilakukan dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai()); 
        Node eval = start; //Menginisialisasi node 'eval' dengan node awal 'start'
        for (int i = 0; i < limit; i++) { //Inisialisasi pengulangan for yang akan berjalan sebanyak 'limit' kali
            
            //Mencetak pesan yang menunjukan tingkat(level) evaluasi saat ini dan nilai node yang dievaluasi
            System.out.println("Level "+i+" evaluasi: "+eval.getNilai()); 
            if (eval.equals(goal)) { //Jika node evaluasi adalah node tujuan
                System.out.println("Solusi ditemukan "); //Maka mencetak pesan bahwa solusi ditemukan
                break; //Menghentikan loop ketika syarat sudah terpenuhi
            }
            if (!eval.getTetangga().isEmpty()) { //Memeriksa apakah node evaluasi memiliki tetangga(suksesor)
                //Jika memiliki tetangga, maka node evaluasi diubah menjadi tetangga pertama (kedalaman tingkatnya)
                eval = eval.getTetangga().get(0); 
            } else { //Jika node evaluasi tidak memiliki tetangga(suksesor)
                break; //Mengakhiri pengulangan karena tidak ada tetangga yang dapat dievaluasi pada kedalaman saat ini
            }
        }
    }
}
