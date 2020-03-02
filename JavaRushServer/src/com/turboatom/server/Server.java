package com.turboatom.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private static Socket clientSocket; //сокет дл€ общени€
    private static ServerSocket server; // серверсокет
    private static BufferedReader in; // поток чтени€ из сокета
    private static BufferedWriter out; // поток записи в сокет

    public static void main(String[] args) {
        try {
            try  {
                server = new ServerSocket( 4004); // серверсокет прослушивает порт 4004
                System.out.println("—ервер запущен!"); // хорошо бы серверу
                									   // объ€вить о своем запуске
                clientSocket = server.accept(); // accept() будет ждать пока
                								//кто-нибудь не захочет подключитьс€
                try { // установив св€зь и воссоздав сокет дл€ общени€ с клиентом можно перейти
                    // к созданию потоков ввода/вывода.
                    // теперь мы можем принимать сообщени€
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    // и отправл€ть
                    out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

                    String word = in.readLine(); // ждЄм пока клиент что-нибудь нам напишет
                    System.out.println(word);
                    // не долго дума€ отвечает клиенту
                    out.write("ѕривет, это —ервер! ѕодтверждаю, вы написали : " + word + "\n");
                    out.flush(); // выталкиваем все из буфера

                } finally { // в любом случае сокет будет закрыт
                    System.out.println("Quet");
                    clientSocket.close();
                    // потоки тоже хорошо бы закрыть
                    in.close();
                    out.close();
                }
            } finally {
                System.out.println("—ервер закрыт!");
                    server.close();
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}
    