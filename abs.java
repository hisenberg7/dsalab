class MyClass {
    public int abs(int x) {
        return (x < 0) ? -x : x;
    }

    public float abs(float x) {
        return (x < 0) ? -x : x;
    }

    public double abs(double x) {
        return (x < 0) ? -x : x;
    }
}

class abs {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.abs(-5));
        System.out.println(obj.abs(-3.5f));
        System.out.println(obj.abs(-9.8));
    }
}