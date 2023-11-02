/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studi_kasus.heuristik.astar;

/**
 *
 * @author Shinichi
 */
public class MainTest {
    public static void main(String[] args) {
        //Membuat/Inisialisasi objek-objek node yang mewakili kota-kota dalam peta. setiap kota memiliki nama dan beberapa memiliki tetangga
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

        // Menambahkan tetangga dari tiap-tiap Node beserta cost-nya
        bandungUCS.addTetangga(cileunyiUCS, 23);

        pangandaranUCS.addTetangga(banjarsariUCS, 27);
        pangandaranUCS.addTetangga(rancahUCS, 88);

        banjarsariUCS.addTetangga(banjarUCS, 20);
        banjarsariUCS.addTetangga(pangandaranUCS, 27);

        banjarUCS.addTetangga(ciamisUCS, 25);
        banjarUCS.addTetangga(banjarsariUCS, 20);

        ciamisUCS.addTetangga(garutUCS, 50);
        ciamisUCS.addTetangga(banjarUCS, 25);

        garutUCS.addTetangga(ciamisUCS, 50);
        garutUCS.addTetangga(nagregUCS, 33);
        garutUCS.addTetangga(sumedangUCS, 80);

        nagregUCS.addTetangga(cileunyiUCS, 18);
        nagregUCS.addTetangga(garutUCS, 33);

        cileunyiUCS.addTetangga(nagregUCS, 18);
        cileunyiUCS.addTetangga(sumedangUCS, 36);
        cileunyiUCS.addTetangga(bandungUCS, 23);

        sumedangUCS.addTetangga(garutUCS, 80);
        sumedangUCS.addTetangga(cileunyiUCS, 36);
        sumedangUCS.addTetangga(palimananUCS, 75);

        palimananUCS.addTetangga(sumedangUCS, 75);
        palimananUCS.addTetangga(majalengkaUCS, 40);

        majalengkaUCS.addTetangga(palimananUCS, 40);
        majalengkaUCS.addTetangga(rancahUCS, 63);

        rancahUCS.addTetangga(majalengkaUCS, 63);
        rancahUCS.addTetangga(pangandaranUCS, 88);

        System.out.println("A*");
        // Inisialisasi objek AStar
        AStar aStar = new AStar();
        aStar.search(bandungUCS, pangandaranUCS);
        System.out.println();
    }
}
