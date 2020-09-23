package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Message {
    @Id
    private String id;
    private String text;
    private String number;

    public Message(String id, String text, String number) {
        this.id = id;
        this.text = text;
        this.number = number;
    }

    public Message(String text, String number) {
        this.id = "PmIXrQ96v0+LZ5FYmuPCjGJlbmphbWluY2FzdGlsbG85N19hdF9ob3RtYWlsX2RvdF9jb20=";
        this.text = text;
        this.number = number;
    }
    public void sendMessage(){
        HttpURLConnection connection = null;

        try{
            URL link = new URL("https://NiceApi.net/API");
            connection = (HttpURLConnection) link.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("X-APIId",this.id);
            connection.setRequestProperty("X-APIMobile",this.number);
            connection.setRequestProperty("Content-Type","application/x-www-form-urlencoded");
            connection.setUseCaches(false);
            connection.setDoOutput(true);

            DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
            outputStream.writeBytes(this.text);
            outputStream.close();

            InputStream streamIn = connection.getInputStream();
            BufferedReader readerIn = new BufferedReader(new InputStreamReader(streamIn));
            System.out.println(readerIn.readLine());
            readerIn.close();
            System.out.println("cerra3");
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        finally {
            if(connection != null){
                connection.disconnect();
            }
        }
    }

}
