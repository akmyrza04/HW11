public class Phone {
    static String madeIn;
    String number ;
    String model ;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(){
    }

    public void receiveCallName(String name){
        receiveCallPhone(name, "");
    }

    public void receiveCallPhone(String name, String number){
        System.out.println(name + (number == "" ? "" : " есімді абонент сізге қоңырау шалуда, қоңырау шалушының нөмірі " + number));
    }
}
