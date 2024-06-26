package com.isaac.OOPchallenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Patient patient =new Patient("Isaac", 24,
                new Eye("Left eye","Short sighted","Blue",true),
                new Eye("Right eye","Normal","Blue",true),
                new Heart("Heart","Normal",65),
                new Stomach("stomach","PUD",false),
                new Skin("skin","Burned","white","40"));

        System.out.println("Name:"+ patient.getName());
        System.out.println("Age:"+ patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish= false;
        while (!shouldFinish){
            System.out.println("choose an organ:"+
                    " \n\t1.Left Eye" +
                    " \n\t2.Right Eye" +
                    " \n\t3.Heart" +
                    " \n\t4. Stomach" +
                    " \n\t5. Skin" +
                    " \n\t6.Quit");
            int choice =scanner.nextInt();

            switch (choice){
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()){
                        System.out.println("\n\t1. close the eye");
                        if (scanner.nextInt()==1){
                            patient.getLeftEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\n\t1. open the eye");
                        if (scanner.nextInt()==1){
                            patient.getLeftEye().open();
                        }else {
                            continue;
                        }

                    }
                    break;
                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()){
                        System.out.println("\n\t1. close the eye");
                        if (scanner.nextInt()==1){
                            patient.getRightEye().close();
                        }else {
                            continue;
                        }
                    }else {
                        System.out.println("\n\t1. open the eye");
                        if (scanner.nextInt()==1){
                            patient.getRightEye().open();
                        }else {
                            continue;
                        }

                    }
                    break;
                    case 3:
                        patient.getHeart().getDetails();
                        System.out.println("\n\t1. change the heart rate");
                        if (scanner.nextInt()==1){
                            System.out.println("Enter the new heart rate:");
                            int newHeartRate=scanner.nextInt();
                            patient.getHeart().setRate(newHeartRate);
                            System.out.println("heart rate changed to:"+ patient.getHeart().getRate());
                        }else {
                            continue;
                        }
                        break;
                case 4:
                    patient.getStomach().getDetails();
                    System.out.println("\n\t1. Digest");
                    if (scanner.nextInt()==1){
                        patient.getStomach().digest();
                    }else{
                        continue;
                    }
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default:
                    shouldFinish=true;
                    break;


            }
        }
    }
}
