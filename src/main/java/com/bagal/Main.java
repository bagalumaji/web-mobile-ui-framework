package com.bagal;

import com.bagal.configs.ConfigReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String browser = ConfigReader.getConfig().browser();
        System.out.println("browser = " + browser);
    }
}