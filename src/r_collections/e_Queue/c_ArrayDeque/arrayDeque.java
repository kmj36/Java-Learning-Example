package r_collections.e_Queue.c_ArrayDeque;

import java.util.ArrayDeque;
import java.util.Queue;

class Client {
    private String ip;

    Client(String ip) {
        this.ip = ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    @Override
    public String toString() {
        return "Client - " + ip;
    }
}

public class arrayDeque {
    static void main(String[] args) {
        Queue<Client> clientQueue = new ArrayDeque<>();

        clientQueue.offer(new Client("127.0.0.1"));
        clientQueue.offer(new Client("192.168.0.1"));
        clientQueue.offer(new Client("172.16.0.1"));
        clientQueue.offer(new Client("10.0.0.1"));

        System.out.println("clientQueue: " + clientQueue);
    }
}
