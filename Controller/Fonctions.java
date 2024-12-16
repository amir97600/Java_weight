package Controller;
import java.io.*;
import Model.User;
import Model.Users;


public class Fonctions {
  
    public  void Menu()
    {
        System.out.println("Bienvenue menu :\n");
        System.out.println("0 - pour quitter\n");
        System.out.println("1 - créer un utilisateur :\n");
        System.out.println("2 - choisir un utilisateur :\n");
        System.out.println("3 - supprimer un utilisateur :\n");
    }

    public  void userMenu(String name){
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

    public void createUser(Users users){
        System.out.println("Entrez le nom : ");
        String name = saisirChaine();

        if(users.getUser(name)==null){

            System.out.println("Entrez l'âge : ");
            int age = saisirEntier();
            System.out.println("Entrez la taille : ");
            int height = saisirEntier();
            System.out.println("Entrez le poids : ");
            float weight = saisirDecimal();

            User user = new User(name, age, height, weight);
            users.addUser(user);
        }
        else{
            System.err.println("Cet utilisateur existe déjà");
        }
        
    }

    public  void modifyName(String name, User user){
      user.setName(name);
    }

    public  void modifyAge(int age, User user){
      user.setAge(age);
    }

    public  void modifyHeight(int height, User user){
      user.setHeigth(height);
    }

    public  void modifyWeight(float weight, User user){
      user.setWeight(weight);
    }


    public  int saisirEntier()
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

    public  float saisirDecimal()
    {
        try{
            BufferedReader buff = new BufferedReader 
            (new InputStreamReader(System.in));
            String chaine=buff.readLine();
            float num = Float.parseFloat(chaine);
            return num;
        }
        catch(IOException e)
        {
            System.out.println("impossible de travailler : " + e);
            return 0;
        }
    }
    
    public  String saisirChaine()
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
