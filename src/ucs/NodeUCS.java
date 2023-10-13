package ucs;

import main.Node;

import java.util.ArrayList;
import java.util.List;

public class NodeUCS { //Deklarasi class NodeUCS
    private String nilai; //Deklarasi variable instance nilai
    private int cost; //Deklarasi variable instance cost

    private List<NodeUCS> tetangga; //Deklarasi variabel instance tetangga

    public NodeUCS(Node node, int cost) {  //Konstruktor kelas 'NodeUCS' yang menerima dua argumen objek 'node' dan sebuah nilai cost
        this.nilai = node.getNilai(); //Nilai dari node 'Node' digunakan untuk menginisialisasi variable 'nilai' dalam objek 'NodeUCS'
        this.cost = cost; //Menginisialisasi variable 'cost' dalam objek 'NodeUCS'
        tetangga = new ArrayList<>();
    }

    public String getNilai() { //Method yang digunakan untuk mendapatkan nilai dari node
        return nilai; //Mengembalikan nilai node yang tersimpan dalam variabel 'nilai'
    }

    public void setNilai(String nilai) { //Method yang digunakan untuk mengatur nilai dari node.
        this.nilai = nilai; //Metode ini mengatur variabel' nilai' dengan nilai yang diberikan
    }

    public void setCost(int cost) { //Method yang digunakan untuk mengatur biaya (cost) dari node
        this.cost = cost; // Method ini mengatur variabel cost dengan nilai cost yang diberikan
    }

    public int getCost() { //Method yang digunakan untuk mendapatkan biaya (cost) dari node
        return cost;  //Mengembalikan biaya node yang tersimpan dalam variabel 'cost'
    }

    public void setTetangga(List<NodeUCS> tetangga) { //Method yang digunakan untuk mengatur daftar tetangga (successor) dari node
        this.tetangga = tetangga; //Mengatur variabel tetangga dengan daftar tetangga yang diberikan
    }

    public List<NodeUCS> getTetangga() { //Method untuk dapatkan daftar tetangga (successor) dari node
        return tetangga; //
    }

    public void addTetangga(NodeUCS node) { 
        tetangga.add(node); //Metode ini menambahkan node yang diberikan ke dalam Node daftar tetangga
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NodeUCS) { //Memeriksa apakah objek yang dibandingkan adalah instance dari kelas "NodeUCS"
            return ((NodeUCS) obj).nilai.equals(this.nilai); //Membandingkan nilaidari dua objek "NodeUCS" dan mengembalikan nilai 'true' jika nilai tersebut sama
        }
        return false; //Method mengembalikan nilai false jika objek yang dibandingkan bukan instance dari "NodeUCS" tidak sama
    }
}
