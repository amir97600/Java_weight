package Controller;
import java.io.*;
import Model.User;
import Model.Users;

public class Fonctions {
  
    public static void Menu()
    {
        System.out.println("Bienvenue menu :\n");
        System.out.println("0 - pour quitter\n");
        System.out.println("1 - créer un utilisateur :\n");
        System.out.println("2 - choisir un utilisateur :\n");
        System.out.println("3 - supprimer un utilisateur :\n");
        System.out.println("4 - modifier un utilisateur :\n");
    }

    public static void userMenu(String name){
        System.out.println("Bienvenue "+name+" :\n");
        System.out.println("0 - pour revenir en arrière\n");
        System.out.println("1 - modifier le nom :\n");
        System.out.println("2 - modifier le poids :\n");
        System.out.println("3 - modifier la taille :\n");
        System.out.println("4 - modifier l'âge :\n");
        System.out.println("5 - voir le poids le plus élevé que vous avez eu :\n");
        System.out.println("6 - voir le poids le plus petit que vous avez eu :\n");
        System.out.println("7 - Calculer votre IMC :\n");
        System.out.println("8 - Calculer votre métabolisme basal :\n");
        System.out.println("9 - Suivre la progression du poids :\n");
    }

    public static void modifyName(String name, User user){
      user.setName(name);
    }

    public static void modifyAge(int age, User user){
      user.setAge(age);
    }

    public static void modifyHeight(int height, User user){
      user.setHeigth(height);
    }

    public static void modifyWeight(float weight, User user){
      user.setWeight(weight);
    }


    public static int saisirEntier()
    {
        try{
            BufferedReader buff = new BufferedReader 
            (new InputStreamReader(System.in));
            String chaine=buff.readLine();
            int num = Integer.parseInt(chaine);
            return num;
        }
        catch(IOException e)
        {
            System.out.println("impossible de travailler : " + e);
            return 0;
        }
    }
    
    public static String saisirChaine()
    {
        try{
            BufferedReader buff = new BufferedReader 
            (new InputStreamReader(System.in));
            String chaine=buff.readLine();
            return chaine;
        }
        catch(IOException e)
        {
            System.out.println("impossible de travailler : " + e);
            return null;
        }
    }
}
