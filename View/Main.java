package View;
import Controller.Fonctions;
import Model.User;
import Model.Users;
import Controller.Fonctions;

public class Main {
  public static void main(String [] args){

    Users users = new Users();
    Fonctions fonctions = new Fonctions();
    boolean running = true;

    while (running) {
      fonctions.Menu();

      int input = fonctions.saisirEntier();

      switch (input) {
        case 0:
          running = false;
          break;
        case 1:
          fonctions.createUser(users);
          break;
        case 2:
          fonctions.displayUsers(users);
          break;
        default:
          break;
      }
    }
  }
}
