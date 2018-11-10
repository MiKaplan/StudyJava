package phone;

public class Network {

    private String num;

    public Network(String num) {
        this.num = num;
    }

    public boolean registeredOperator() {
        String[] mobileOperator = {"0661234567", "0991111111", "0997654321", "0981122334", "0933333333", "0955555555", "0509999999" };
        for (int i = 0; i < mobileOperator.length; i++) {
            if (mobileOperator[i].equals(num)) {
                return true;
            }
        }
        return false;
    }

    public Network(){
        super();
    }


    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
