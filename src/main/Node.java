package main;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String nilai; //Deklarasi variabel nilai
    private List<Node> tetangga; //Deklarasi variable instance tetangga, digunakan untuk menyimpan daftar node sukseso dan diinisialisasi sebagai ArrayList kosong

    public Node(String nilai) { //Konstruktor kelas Node yang menerima nilai
        tetangga = new ArrayList<>(); //ArrayList kososng, digunakan untuk menginisialisasi variabel tetangga
        this.nilai = nilai; //Memberikan nilai sebagai argumen untuk menginisalisasi variabel nilai ke dalam objek "Node"
    }

    public void setNilai(String nilai) { //Method yang digunakan untuk mengatur nilai dari node.
        this.nilai = nilai; //Mengatur variabel nilai dengan nilai yang diberikan
    }

    public String getNilai() { //Method yang digunakan untuk mendapatkan nilai dari node.
        return nilai; //Mengembalikan nilai node pada variabel nilai
    }

    public void setTetangga(List<Node> tetangga) { //Method yang digunakan untuk mengatur daftar tetangga (successor) dari node.
        this.tetangga = tetangga; //Mengatur variabel tetangga dengan yang diberikan
    }

    public List<Node> getTetangga() { //Metode yang digunakan untuk mendapatkan daftar tetangga (successor) dari node.
        return tetangga; //Mengembalikan node daftar tetangga dalam variabel tetangga
    }

    public void addTetangga(Node node) { //mMethod yang digunakan untuk menambahkan node sebagai tetangga (successor) dari node ini.
        tetangga.add(node); //Menambahkan node yang diberikan dalam node daftar tetangga
    }

    @Override
    //Metode override dari metode 'equals' yang ada di kelas Object untuk membandingkan dua objek "Node" berdasarkan nilai atributnya
    public boolean equals(Object obj) {
        if (obj instanceof Node) { //Jiika objek instance berasal dari node 
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
