package studi_kasus.heuristik.greedybfs;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Shinichi
 */
// Main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
        //Membuat objek-objek node yang mewakili kota-kota dalam peta. setiap kota memiliki nama dan beberapa memiliki tetangga
        Node bandung = new Node("Bandung");
        Node pangandaran = new Node("Pangandaran");
        Node banjarsari = new Node("Banjarsari");
        Node banjar = new Node("Banjar");
        Node ciamis = new Node("Ciamis");
        Node garut = new Node("Garut");
        Node nagreg = new Node("Nagreg");
        Node cileunyi = new Node("Cileunyi");
        Node sumedang = new Node("Sumedang");
        Node palimanan = new Node("Palimanan");
        Node majalengka = new Node("Majalengka");
        Node rancah = new Node("Rancah");

        //Membuat objek-objek 'NodeUCS' bserta costnya
        NodeUCS bandungUCS = new NodeUCS(bandung, 196);
        NodeUCS pangandaranUCS = new NodeUCS(pangandaran, 0);
        NodeUCS banjarsariUCS = new NodeUCS(banjarsari, 27);
        NodeUCS banjarUCS = new NodeUCS(banjar, 47);
        NodeUCS ciamisUCS = new NodeUCS(ciamis, 72);
        NodeUCS garutUCS = new NodeUCS(garut, 122);
        NodeUCS nagregUCS = new NodeUCS(nagreg, 155);
        NodeUCS cileunyiUCS = new NodeUCS(cileunyi, 170);
        NodeUCS sumedangUCS = new NodeUCS(sumedang, 202);
        NodeUCS palimananUCS = new NodeUCS(palimanan, 191);
        NodeUCS majalengkaUCS = new NodeUCS(majalengka, 151);
        NodeUCS rancahUCS = new NodeUCS(rancah, 88);

        // Menambahkan tetangga dari masing-masing node
        bandungUCS.addTetangga(cileunyiUCS);

        pangandaranUCS.addTetangga(banjarsariUCS);
        pangandaranUCS.addTetangga(rancahUCS);

        banjarsariUCS.addTetangga(banjarUCS);
        banjarsariUCS.addTetangga(pangandaranUCS);

        banjarUCS.addTetangga(ciamisUCS);
        banjarUCS.addTetangga(banjarsariUCS);

        ciamisUCS.addTetangga(garutUCS);
        ciamisUCS.addTetangga(banjarUCS);

        garutUCS.addTetangga(ciamisUCS);
        garutUCS.addTetangga(nagregUCS);
        garutUCS.addTetangga(sumedangUCS);

        nagregUCS.addTetangga(cileunyiUCS);
        nagregUCS.addTetangga(garutUCS);

        cileunyiUCS.addTetangga(nagregUCS);
        cileunyiUCS.addTetangga(sumedangUCS);
        cileunyiUCS.addTetangga(bandungUCS);

        sumedangUCS.addTetangga(garutUCS);
        sumedangUCS.addTetangga(cileunyiUCS);
        sumedangUCS.addTetangga(palimananUCS);

        palimananUCS.addTetangga(sumedangUCS);
        palimananUCS.addTetangga(majalengkaUCS);

        majalengkaUCS.addTetangga(palimananUCS);
        majalengkaUCS.addTetangga(rancahUCS);

        rancahUCS.addTetangga(majalengkaUCS);
        rancahUCS.addTetangga(pangandaranUCS);

        System.out.println("Greedy BFS");
        // Inisialisasi objek GreedyBestFirstSearch
        GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
        // Memanggil fungsi search dari objek GreedyBestFirstSearch dari node bandungUCS ke pangandaranUCS
        bfs.search(bandungUCS, pangandaranUCS);
        System.out.println();
    }
}
