/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesshive;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FitnessHive {

   
    public static void main(String[] args) throws IOException {
      Client client;
        Scanner input=new Scanner(System.in);
        
       
        File ClientFile=new File("client.txt");
        
        FileWriter writer=new FileWriter(ClientFile,true);
        PrintWriter pwriter=new PrintWriter(writer,true);
        // Create a new PrintWriter object with autoflush enabled
         
         
       
        System.out.println("----------------------------");
        System.out.println("Welcome to the Fitness hive!");
        System.out.println("----------------------------");
        System.out.println("Enter your Name:");
        String name=input.next();
        
           
        System.out.println("Enter your ID:");
        int id = input.nextInt();  
       
        System.out.println("Enter your Phone Number:");
        String phone = input.next();
         
         
        System.out.println("Enter your Email address:");
        String email = input.next();
       
        System.out.println("Enter your username:");
        String username = input.next();
     
        System.out.println("Enter your password:");
        String password = input.next();
       
        System.out.println("Are you Male or Female:");
        String gender=input.next();
       
        System.out.println("Enter your Age:");
        int age=input.nextInt();
         
        System.out.println("Enter your Height in cm:");
        double height=input.nextDouble();
        pwriter.println("Height:"+ height);
          
        System.out.println("Enter your Weight in kg :");
        double weight=input.nextDouble();
        
        System.out.println("Choose your Goal of subscription:");
        System.out.println("1: Lose weight");
        System.out.println("2: Gain weight");
        System.out.println("3: Enhance Physical Fitness");
        int goal = input.nextInt();
      
        // Create a new Client object with the user's input
        client = new Client (name,id, phone, email, username, password, age,
        gender, height,weight, goal,0.0);
        // Set the fitness goal on the client object
        client.setGoal(goal);
      
        // create variable to hold bmi calculation 
        double bmi=Math.round(client.setBmi(height, weight)); 
        client.makeSubscrption();
        client.choose_schedule();
       
         
        System.out.println(" " );
        System.out.println(" " );


        // Use the client object's getter methods to display the client information
        System.out.println("---------------------------");
        System.out.println("Display Client Information ");
        System.out.println("---------------------------");
    
        System.out.println("Name: " + client.getName());
        pwriter.println("Name: " + client.getName());
   
        System.out.println("Id Number: " + client.getId());
        pwriter.println("Id Number: " + client.getId());
    
        System.out.println("Phone Number: " + client.getPhone());
        pwriter.println("Phone Number: " + client.getPhone());
   
        System.out.println("Email address: " + client.getEmail());
        pwriter.println("Email address: " + client.getEmail());
   
        System.out.println("Username: " + client.getUsername());
    
        pwriter.println("Username: " + client.getUsername());
        System.out.println("Password: " + client.getPassword());
        pwriter.println("Password: " + client.getPassword());
    
        System.out.println("Sex: " + client.getGender());
        pwriter.println("Sex: " + client.getGender());
    
        System.out.println("Age: " + client.getAge());
        pwriter.println("Age: " + client.getAge());
   
        System.out.println("Height: " + client.getHeight() + " m");
        pwriter.println("Height: " + client.getHeight() + " m");
   
        System.out.println("Weight: " + client.getWeight() + " kg");
        pwriter.println("Weight: " + client.getWeight() + " kg");
    
        System.out.println("BMI: " + bmi+ client.getBMI());
        pwriter.println("BMI:"+ bmi +client.getBMI());
     
        System.out.println("Fitness Goal: " + client.getGoal(goal));
        pwriter.println("Fitness Goal: " + client.getGoal(goal));
     
        System.out.println("----------THANK YOU FOR CHOOSING FITNESS HIVE !!--------------");
         
       
        pwriter.flush();
        pwriter.close();
    }
          
     
  
    
    
    
    
    
        
}
    
   
    

