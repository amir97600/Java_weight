package Model;
public class User {
  
  private String name;
  private int age;
  private int height;
  private float weight;

  public User(String name, int age, int height, int weight){
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }


  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public int getHeight(){
    return this.height;
  }

  public float getWeight(){
    return this.weight;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }

  public void setHeigth(int height){
    this.height = height;
  }

  public void setWeight(float weight){
    this.weight = weight;
  }
}
