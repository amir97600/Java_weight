package Model;
import java.util.*;

public class Users {
  
private ArrayList<User> userList = new ArrayList<User>();

public ArrayList<User> getUserList(){
  return this.userList;
}

public void addUser(User user){
  userList.add(user);
}

public void deleteUser(User user){
  userList.remove(user);
}

public User getUser(String name){
  if(!userList.isEmpty()){
    for(User user:userList){
      if(user.getName().equals(name)){
        return user;
      }
    }
  }
  
  return null;
}
}
