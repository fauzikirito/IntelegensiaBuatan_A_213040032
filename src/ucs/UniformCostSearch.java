package ucs;

import java.util.ArrayList;
import java.util.List;

//Deklarasi sebuah kelas dengan nama UniformCostSearch
public class UniformCostSearch {

    //Method search dengan parameter start dan goal yang digunakan untuk menjalankan algoritma UCS untuk mencari solusi dari node 'start' ke node 'goal'
    public void search(NodeUCS start, NodeUCS goal) { 
        //Mencetak pesan yang menunjukan bahwa pencarian solusi sedang dilakukan dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai()); 
        NodeUCS eval = start;//Menginisialisasi node 'eval' dengan node awal 'start' untuk memulai evaluasi
        boolean done = false;//Menginisialisasi variable 'done' sebagai 'false'
        List<NodeUCS> solusi = new ArrayList<>(); //Membuat sebuah ArrayList kosong yang digunakan untuk menyimpan urutan Node
        while (!done) { //Pengulangan While yang akan terus berjalan selama variabel belum selesai (done)
            //Mencetak pesan yang menunjukan evaluasi saat ini, mencakup nilai node 'getNilai()' dan biaya 'getCost()'
            System.out.println("Evaluasi: "+eval.getNilai()+" dengan cost "+eval.getCost());  
            solusi.add(eval); //Node yang dievaluasi ditambahkan ke daftar solusi
            if (eval.equals(goal)) { //Jika node evaluasi adalah node tujuan,
                System.out.println("Solusi ditemukan "); //Mencetak pesan "Solusi ditemukan"
                done = true; //Mengubah done menjadi true
            }
            //Memeriksa apakah node evaluasi memiliki suksesor
            if (!eval.getTetangga().isEmpty()) {
                NodeUCS best = null; // Inisialisai node terbaik 'best' sebagai 'null'
                int min = Integer.MAX_VALUE; //Inisialisasi variable 'min' dengan nilai maksumuM
                System.out.println(); //Mencetak baris kosong untuk memisahkan output
                for (NodeUCS node: eval.getTetangga()) { //Loop for untuk mengintegrasi melalui suksesor-suksesor node evaluasi
                    System.out.print(node.getNilai() + " ("+ node.getCost() + "), "); //Mencetak nilai dan biaya dari masing-masing suksesor
                    if (min > node.getCost()) {  //Memeriksa apakah biaya suksesor saat ini lebih kecil dari nilai minimum 'min'
                        min = node.getCost(); //Jika ya, maka nilai minimum 'min' diperbarui dengan biaya suksesor saat ini
                        best = node; //Node terbaik 'best' diperbarui menjadi node suksesor dengan biaya terendah
                    } 
                }
                System.out.println(); //Mencetak baris untuk memisahkan output
                System.out.println("Node terpilih: "+best.getNilai()+" ("+min+")");  //mencetak pesan yang menunjukan node terpilih (suksesor terbaik) beserta biayanya
                eval = best; //Node evaluasi saat ini diubah menjadi node terbaik yang dipilih
            } else { //Jika node evaluasi tidak memiliki suksesor
                done = true; //Mengatur 'done' menjadi 'true' untuk menandai bahwa pencarian sudah selesai
            }
        }

        System.out.println();
        System.out.println("Solusi ditemukan: "); //Mencetak pesan yang menunjukan bahwa solusi ditemukan dan mencetak semua node dalam path solusi
        for (NodeUCS node: solusi) { //Loop for untuk mengiterasi melalui semua node dalam daftar solusi
            System.out.println(node.getNilai()+" ("+node.getCost()+")");//Mencetak nilai dan biaya setiap node dalam path solusi
        }
    }
}
