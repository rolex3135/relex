public class uday extends DEmo {
    @Override
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    uday() {
    }

    uday(int a, int b) {
        super(a, b);
    }
    @Override
    public String toString() {
        return "" + this.a + " " + this.b;
    }


}



