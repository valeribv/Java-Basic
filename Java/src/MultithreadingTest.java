public class MultithreadingTest {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            MultithreadingTask AllCourse = new MultithreadingTask();
            AllCourse.start();


        }
//        MultithreadingTask myTaskOne = new MultithreadingTask();
//        MultithreadingTask myTaskTwo = new MultithreadingTask();
//
//        myTaskOne.start();
//        myTaskTwo.start();

    }
}
