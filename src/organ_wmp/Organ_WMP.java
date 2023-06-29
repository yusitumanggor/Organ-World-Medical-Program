
package organ_wmp;

import java.util.Scanner;


    //Create the Super Class
    class Organ{
        Scanner scanner = new Scanner (System.in);
        void my_data (String username, int age){
            System.out.println("Name : " + username);
            System.out.println("Age : " + age);
        }
        
        void my_organ (String organ_name, String organ_cond){
            System.out.println("Name : " + organ_name);
            System.out.println("Medical Condition : " + organ_cond);
        }
    }
    
    //Create the sub class of Organ
    class Eye_left extends Organ{
        void myEye_left (String color_leftEye){
            System.out.println("Color : " + color_leftEye);
        }
        void eyeLeft_act(){
            System.out.print("\t1. Close the Eye\n");
            int close_LeftEye = scanner.nextInt();
              if (close_LeftEye == 1) {
                    System.out.println("Left Eye Closed");
                    System.out.print("\t2. Open the Eye\n");
            int open_LeftEye = scanner.nextInt();
                if (open_LeftEye == 2) {
                    System.out.println("Left Eye Opened");
                } else if (open_LeftEye != 2) {
                    System.out.print("ERROR!! Please enter the right input.\n");
                }
              } else if(close_LeftEye != 1) {
                System.out.print("ERROR!! Please enter the right input.\n");
              }
        }
    }
   
    
    class Eye_right extends Organ{
        
        void myEye_right(String color_rightEye){
            System.out.println("Color : " + color_rightEye);
        }
        
        void eyeRight_act(){
            System.out.print("\t1. Close the Eye\n");
                int close_RightEye = scanner.nextInt();
                  if (close_RightEye == 1) {
                        System.out.println("Right Eye Closed");
                        System.out.print("\t2. Open the Eye\n");
                int open_RightEye = scanner.nextInt();
                    if (open_RightEye == 2) {
                        System.out.println("Right Eye Opened");
                    } else if (open_RightEye != 2) {
                        System.out.print("ERROR!! Please enter the right input.\n");
                    }
                 } else if(close_RightEye != 1) {
                        System.out.print("ERROR!! Please enter the right input.\n");
                 }
        }
    }
    
    class Heart extends Organ{
        
        void my_heart (int heart_rate){
            System.out.println("Heart rate : " + heart_rate);
        }
        
        void heart_act(){
            System.out.println("\t1. Change the heart rate");
                int heart_change = scanner.nextInt();
                   if (heart_change == 1) {
                        System.out.println("Enter the new heart rate: ");
                int new_HeartRate = scanner.nextInt();
                        System.out.println("Heart rate changed to: " + new_HeartRate);
                   } else if(heart_change != 1) {
                        System.out.println("Please retry the process with the right input!\n");
                   }
        }     
    }
        
    class Stomach extends Organ{
        
        void stomach_digest(){
            System.out.println("Stomach is full");
                System.out.println("\t1. Digest");
                    int digest = scanner.nextInt();
                        if (digest == 1) {
                            System.out.println("Digesting begin...");
                        } else if(digest != 1) {
                            System.out.println("ERROR!! Please enter the right input!\n");
                        }    
        }
    }
    
    class Skin extends Organ{
        
        void my_skin (String skin_color){
            System.out.println("Skin Color : " + skin_color);
        }
    }
    

    public class Organ_WMP {

    public static void main(String[] args) {
        
        //The User's Name
        Scanner scanner = new Scanner (System.in);
        Organ organ = new Organ();
        Eye_left eye_Left = new Eye_left();
        Eye_right eye_right = new Eye_right();
        Heart heart = new Heart();
        Stomach stomach = new Stomach();
        Skin skin = new Skin();
        
        organ.my_data("Piyaa", 19);
     
        int organs;
        
        //Asking The User to Start choose the organ
            do {
                System.out.println("Choose an Organ: ");
                System.out.println("\t 1. Left Eye");
                System.out.println("\t 2. Right Eye");
                System.out.println("\t 3. Heart");
                System.out.println("\t 4. Stomach");
                System.out.println("\t 5. Skin");
                System.out.println("\t 6. Quit");
                
                organs = scanner.nextInt();
                    switch (organs) {
                        case 1:
                            organ.my_organ("Left Eye", "Short sighted");
                            eye_Left.myEye_left("Blue");
                            eye_Left.eyeLeft_act();
                        break;
                        
                        case 2:
                            organ.my_organ("Right Eye", "Normal");
                            eye_right.myEye_right("Blue");
                            eye_right.eyeRight_act();
                        break;
                        
                        case 3:
                            organ.my_organ("Heart", "Normal");
                            heart.my_heart(65);
                            heart.heart_act();
                        break;
                        
                        case 4:
                            organ.my_organ("Stomach", "GERD");
                            stomach.stomach_digest();
                        break;

                        case 5:
                            organ.my_organ("Skin", "Burned");
                            skin.my_skin("White");
                        break;

                        case 6:
                            System.exit(0);
                        break;

                        default:
                            System.out.println("RESULT IS NOT DECLARED");
                        break;
                    }
            } while (organs != 7);
}
}