package ex_09_Switch;

import java.util.Scanner;

public class Lab_087_Real_switch_automations {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enyer the browser, which you want to start !!");

        String browser = sc.next();

        browser = browser.toLowerCase();

        switch (browser){

            case "chrome":
                System.out.println("startin the chrome");
                System.out.println("..........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox" :
                System.out.println("starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }
    }
}
