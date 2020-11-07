public class Calculator {
    public double result=0.0;

    public void cancel(){
        result=0.0;
    }

    public void add(double inputNumber){
        result += inputNumber;
    }

    public void subtract(double inputNumber){
        result -= inputNumber;
    }

    @Override
    public String toString(){
        return String.format("%.1f",result);
    }
}
