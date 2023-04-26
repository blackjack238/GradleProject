package org.example;

import com.google.gson.Gson;

public class Main {

        public static void main(String[] args) {
            Gson gson=new Gson();
            Name name=new Name("Oleksiy","Kaparov");
            System.out.println(gson.toJson(name));

        }

    }
