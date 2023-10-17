public class Idengeli {
    private String name;
    private int age;
    private  String food;
    private int netWorth;


    Idengeli(String name, int age, String food, int netWorth){
          this.name = name;
          this.age = age;
          this.food = food;
          this.netWorth = netWorth;        
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getFood(){
        return food;
    }

    public int getNetworth(){
        return netWorth;
    }

    public String toString(){
        return (name + " " + age + " " + food + " " + netWorth);
    }
}
