package main;

import bfs.BreadthFirstSearch;
import dls.DepthLimitedSearch;
import ucs.NodeUCS;
import ucs.UniformCostSearch;

public class MainTest {
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


        bandung.addTetangga(cileunyi);

        pangandaran.addTetangga(banjarsari);
        pangandaran.addTetangga(rancah);


        banjarsari.addTetangga(banjar);
        banjarsari.addTetangga(pangandaran);

        banjar.addTetangga(ciamis);
        banjar.addTetangga(banjarsari);

        ciamis.addTetangga(garut);
        ciamis.addTetangga(banjar);

        garut.addTetangga(ciamis);
        garut.addTetangga(nagreg);
        garut.addTetangga(sumedang);

        nagreg.addTetangga(cileunyi);
        nagreg.addTetangga(garut);

        cileunyi.addTetangga(nagreg);
        cileunyi.addTetangga(sumedang);
        cileunyi.addTetangga(bandung);

        sumedang.addTetangga(garut);
        sumedang.addTetangga(cileunyi);
        sumedang.addTetangga(palimanan);

        palimanan.addTetangga(sumedang);
        palimanan.addTetangga(majalengka);

        majalengka.addTetangga(palimanan);
        majalengka.addTetangga(rancah);

        rancah.addTetangga(majalengka);
        rancah.addTetangga(pangandaran);


        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(bandung, pangandaran);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(10);
        dls.search(bandung, pangandaran);
        System.out.println(); 

        //Membuat objek-objek 'NodeUCS'
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


        System.out.println("UCS"); //Mencetak pesan yang menunjukan bahwa pencarian menggunakan algoritma 'UCS' akan dimulai
        UniformCostSearch ucs = new UniformCostSearch(); //Membuat objek 'ucs' dari kelas 'UniformCostSearch'
        ucs.search(bandungUCS, pangandaranUCS);
        System.out.println();
    }
}
