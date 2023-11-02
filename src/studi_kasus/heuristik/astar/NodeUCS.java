/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studi_kasus.heuristik.astar;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Shinichi
 */
// NodeUCS untuk menyimpan nilai node, cost, nilai apakah node sudah dikunjungi, dan tetangga beserta costnya.
public class NodeUCS {
    // nilai untuk menyimpan nama node
    private String nilai;
    // cost untuk menyimpan biaya dari node
    private int cost;
    // isVisited untuk menyimpan nilai apakah node sudah dikunjungi atau belum
    public boolean isVisited;

    // tetangga untuk menyimpan node tetangga dari node yang bersangkutan
    private List<NodeUCS> tetangga;
    // tetanggaCost untuk menyimpan cost dari node tetangga
    private List<Integer> tetanggaCost;

    // Constructor untuk menginisialisasi nilai dan cost dari node
    public NodeUCS(Node node, int cost) {
        // Nilai diambil dari node yang bersangkutan
        this.nilai = node.getNilai();
        // Cost diambil dari parameter cost
        this.cost = cost;

        // Inisialisasi tetangga dan tetanggaCost
        tetangga = new ArrayList<>();
        tetanggaCost = new ArrayList<>();
    }

    // Fungsi untuk mengembalikan nama node
    public String getNilai() {
        // Mengembalikan nama node
        return nilai;
    }

    // Fungsi untuk mengubah nama node
    public void setNilai(String nilai) {
        // Mengubah nama node dari parameter
        this.nilai = nilai;
    }

    // Fungsi untuk mengubah nilai biaya dari node
    public void setCost(int cost) {
        // Mengubah nilai biaya dari parameter
        this.cost = cost;
    }

    // Fungsi untuk mengembalikan nilai biaya dari node
    public int getCost() {
        // Mengembalikan nilai biaya dari node
        return cost;
    }

    // Fungsi untuk mengubah tetangga dan tetanggaCost dari node
    public void setTetangga(List<NodeUCS> tetangga, List<Integer> tetanggaCost) {
        // Mengubah tetangga dari parameter
        this.tetangga = tetangga;
        // Mengubah tetanggaCost dari parameter
        this.tetanggaCost = tetanggaCost;
    }

    // Fungsi untuk mengembalikan tetangga dari node
    public List<NodeUCS> getTetangga() {
        // Mengembalikan tetangga dari node
        return tetangga;
    }

    // Fungsi untuk mengembalikan tetanggaCost dari node
    public List<Integer> getTetanggaCost() {
        // Mengembalikan tetanggaCost dari node
        return tetanggaCost;
    }

    // Fungsi untuk menambahkan tetangga dan tetanggaCost dari node
    public void addTetangga(NodeUCS node, int cost) {
        // Menambahkan tetangga dari parameter
        tetangga.add(node);
        // Menambahkan tetanggaCost dari parameter
        tetanggaCost.add(cost);
    }

    // Fungsi untuk mengecek apakah node tersebut sama atau tidak
    @Override
    public boolean equals(Object obj) {
        // Jika objek merupakan instance dari NodeUCS
        if (obj instanceof NodeUCS) {
            // maka akan dilakukan pengecekan apakah nilai dari node tersebut sama atau tidak
            return ((NodeUCS) obj).nilai.equals(this.nilai);
        }
        // Jika bukan, maka akan mengembalikan nilai false
        return false;
    }
}
