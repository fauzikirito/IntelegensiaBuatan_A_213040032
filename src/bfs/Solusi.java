package bfs;

import main.Node;

import java.util.ArrayList;
import java.util.List;

public class Solusi { //Membuat Class Solusi
    private List<Node> nodes;  //Deklarasi variable instance 'nodes' yang merupakan sebuah List dari objek 'Node'
    private Node node; //Deklarasi variable instance node

    public Solusi() { //Konstruktor kelas 'Solusi' yang akan dipanggil ketika objek 'Solusi' baru dibuat
        nodes = new ArrayList<>(); //Sebuah objek ArrayList yang kosong dibuat dan dimasukkan ke variable 'nodes'
    }

    public void setNode(Node node) { //Method yang digunakan untuk mengatur node terkini dalam objek 'Solusi'
        this.node = node;  //Mengatur variable 'node' objek 'Solusi' dengan node yang diberikan sebagai argumen
    }

    public Node getNode() { //Method yang digunakan untuk mendapatkan node terkini dari objek 'Solusi'
        return node; //Mengembalikan nilai node yang disimpan
    }

    public void setNodes(List<Node> nodes) { //Method yang digunakan untuk mengatur daftar node(path) dalam objek 'Solusi'
        this.nodes = new ArrayList<>(nodes); //Membuat salinan yang baru dari daftar node yang diberikan sebagai argumen
    }

    public List<Node> getNodes() { //Method yang digunakan untuk mendapatkan daftar node yang membentuk path solusi dalam objek 'Solusi'
        return nodes; //Mengembalikan nilai node
    }
}
