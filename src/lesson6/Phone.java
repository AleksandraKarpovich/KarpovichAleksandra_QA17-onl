package lesson6;

public class Phone {
    private int number;
    private String model;
    private int weight;
    private String name;

  public Phone (int number, String model, int weight) {
      this(number, model);
      this.weight = weight;
  }
  public Phone (int number, String model){
      this.number = number;
      this.model = model;
  }

  public Phone (){

  }

    public void receiveCall(String name) {
        System.out.println("\nЗвонит: " + name);
    }

    // перегруженный метод
    public void receiveCall(String name, int number) {
        System.out.println("\nИмя звонящего: " + name + "\nНомер телефона: " + number);
    }

    public void sendMessage(int...number){
        int result = 0;
        System.out.println("\nОтправить сообщения на следующие номера: ");
        for(int i : number) {
            result = i;
        System.out.println(result);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

