import java.util.Comparator;
 class BallAndNameComparator implements Comparator <Student> {
    @Override
    public int compare(Student s1, Student s2){
        int ball = Double.compare(s1.ball, s2.ball);
        if (ball != 0){
            return ball;
        }
       return s1.name.compareTo(s2.name);
    }

}
