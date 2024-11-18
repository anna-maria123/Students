

class Student {
    String name;
    double ball;

    public Student(String name, double ball) {
        this.name = name;
        this.ball = ball;
    }

    @Override
    public String toString() {
        return "Stuudent{" +
                "name='" + name + '\'' +
                ", ball=" + ball +
                '}';
    }
}