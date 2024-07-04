package methodReffConst;

public class Const {
    public static void main(String[] args) {
        SUM ref = AClass::new;
        ref.sum (5,6);
    }
}
