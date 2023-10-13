package bfs;

import main.Node;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BreadthFirstSearch { //Deklarasi class BreadthFirstSearch

    public void search(Node start, Node goal) { // Deklarasi dari sebuah method yang menerima dua parameter yaitu 'Start' dan 'goal dan keduanya objek node
        //Deklarasi dan menginisialisasi sebuah queue yang berisi objek dari kelas 'Solusi'
        Queue<Solusi> queue = new LinkedBlockingQueue<>();
        //Membuat objek solusiStart dari kelas 'Solusi'
        Solusi solusiStart = new Solusi();
        //Mengatur node 'start' ke dalam objek 'solusiStart'
        solusiStart.setNode(start);
        //Memasukan 'solusiStart' ke dalam queue
        queue.add(solusiStart);
         //Mencetak pesan yang menunjukan bahwa pencarian sedang dilakukan dari node 'start' ke node 'goal'
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());

        while (!queue.isEmpty()) { //Inisialisasi sebuah pengulangan while yang akan berjalan selama queue tidak kosong
            Solusi eval = queue.poll(); //Mengambil dan menghapus element pertama dari queue untuk dievaluasi dan disimpan dalam objek 'eval'
            System.out.println("Evaluasi: "+eval.getNode().getNilai()); //Mencetak nilai node yang dievaluasi saat ini

            if (eval.getNode().equals(goal)) { //Jika node evaluasi adalah node tujuan,
                System.out.println("Solusi ditemukan: "); //Maka mencetak pesan "Solusi ditemukan"
                for(Node node: eval.getNodes()) { //Memulai Pengulangan For  untuk mencetak path solusi
                    System.out.print(node.getNilai()+" -> "); //Mencetak nilai node dalam path solusi
                }
                System.out.println(eval.getNode().getNilai()); //Mencetak nilai node tujuan sebagai bagian dari path solusi
                break; //Mengakhiri pengulangan apabila solusi sudah ditemukan
            } else {
                System.out.println("Suksesor "+eval.getNode().getNilai()); //Mencetak pesan menunjukan node yang dievaluasi adalah suksesor
                for (Node successor: eval.getNode().getTetangga()) { //Memulai Pengulangan untuk mengiterasi melalui suksesor dari node yang dievaluasi
                    System.out.print(successor.getNilai()+" "); //Mencetak nilai Suksessor
                    Solusi solusiSuksesor = new Solusi(); //Membuat objek 'solusiSusksesor' untuk suksesor yang dievaluasi
                    solusiSuksesor.setNode(successor); //Mengatur suksesor sebagai node dalam 'solusiSuksesor'
                    solusiSuksesor.setNodes(eval.getNodes()); //Mengatur path node dari evaluasi sebelumnya ke 'solusiSuksesor'
                    solusiSuksesor.getNodes().add(eval.getNode()); //Menambahkan Node evaluasi saat ini ke path 'solusiSuksesor'

                    queue.offer(solusiSuksesor); //Menambahkan 'solusiSuksesor' ke dalam queue untuk evaluasi lebih lanjut
                }
                System.out.println();
                System.out.println();
            }
        }

    }
}
