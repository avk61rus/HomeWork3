package ru.avk.lesson5;

import java.util.concurrent.CountDownLatch;

public class FinishNotifier {
        private final CountDownLatch countDownLatch;

        public FinishNotifier(int carsCount) {
            this.countDownLatch = new CountDownLatch(carsCount);
        }

        public void waitWileAllCarsFinished() {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        public void  notifyAboutFinished() {
            countDownLatch.countDown();
        }
}
