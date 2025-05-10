public class MultithreadingTask extends Thread {


    @Override
    public void run() {
        for (int index = 0; index <= 5; index++) {
            System.out.println(index);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }


        }

    }

}
