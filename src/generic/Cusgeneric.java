package generic;

public class Cusgeneric<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Cusgeneric<Integer> integer= new Cusgeneric<>();
        Cusgeneric<String> str= new Cusgeneric<>();
        Cusgeneric<Double> flt= new Cusgeneric<>();

        integer.setT(10);
        str.setT("daniel");
        flt.setT(2.45);

        System.out.println(integer.getT());
        System.out.println(str.getT());
        System.out.println(flt.getT());
    }
}
