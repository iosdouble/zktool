package com.nh.zk.port;

import java.net.*;
import java.io.*;

public class TCPPort {
    public static void main(String[] args) {
			Runnable r = new SearchPort(1000, 65530);
			Thread t = new Thread(r);
			t.start();
	}
}

class SearchPort implements Runnable {
    private int portBegin = 0;
    private int portEnd = 0;

    public SearchPort(int portBegin, int portEnd) {
        this.portBegin = portBegin;
        this.portEnd = portEnd;
    }

    public void run() {
        this.searchPort();
    }

    private void searchPort() {
        int i;
        for (i = portBegin; i < portEnd; i++) {
			System.out.println(i);
            try {
                Socket socket = new Socket("118.89.222.235", i);
                socket.setSoTimeout(1);
				boolean connected = socket.isConnected();
				if (connected){
					System.out.println(i + " 号端口正在使用。");
				}else {
					socket.close();
				}


            } catch (IOException e) {
                continue;
            }
        }
    }
}






