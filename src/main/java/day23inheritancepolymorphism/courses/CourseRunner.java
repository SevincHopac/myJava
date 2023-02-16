package day23inheritancepolymorphism.courses;

public class CourseRunner {
    public static void main(String[] args) {

        Math math= new Math();
        math.liveSessions();
        math.practice();

        Math math1 = new Math(5);

    }
}
