package phone;

public class Phone {
    private String firm;
    private String model;
    private String number;

    public Phone(String firm, String model, String number) {
        this.firm = firm;
        this.model = model;
        this.number = number;
    }

    public Phone(){
        super();
    }
    public static void call(){
        Network network = new Network("0661234567");
        boolean isRegister = network.registeredOperator();
        if (isRegister==true){
            System.out.println("Calling " + network.getNum());
        } else {
            System.out.println("Invalid number");
        }
    }
    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "firm='" + firm + '\'' +
                ", model='" + model + '\'' +
                ", number=" + number +
                '}';
    }
}
