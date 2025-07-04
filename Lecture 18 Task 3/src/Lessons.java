public class Lessons {
    private final int lessonsNumber;
    private final boolean isDone;

    private final String[] Lessons = {"English", "Math", "Chemistry", "Biology", "Geography"};

    public Lessons(int lessonsNumber, boolean isDone) {
        this.lessonsNumber = lessonsNumber;
        this.isDone = isDone;

    }

    public void showLessonsStatus() {
      if(lessonsNumber < 1 || lessonsNumber > Lessons.length){
          System.out.println("Choose a lesson number between 1 and " + Lessons.length + "!");
          return;
      }

      String lessonName = Lessons[lessonsNumber - 1];
        System.out.println("Lesson: " + lessonName);

        if(!isDone){
            System.out.println("The homework isn't done!");
        }else if(isDone){
            System.out.println("The homework is done!");
        }
    }
}
