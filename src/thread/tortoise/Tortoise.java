/*   Created by IntelliJ IDEA.
 *   Author: Hemant Mudgal
 *   Date: 29-10-2020
 *   Time: 16:32
 *   File: Tortoise.java
 */
package thread.tortoise;

import javax.swing.*;

public class Tortoise extends Thread {
    private final int MILESTONE = 5;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        System.out.println("The thread Tortoise has started");
        for (int index = 0; index < MILESTONE; index++) {
            switch (index) {
                case 0:
                    System.out.println("The Tortoise has started form the start line!");
                    break;
                case 1:
                    System.out.println("The Tortoise has reached the Cool River!");
                    break;
                case 2:
                    System.out.println("The Tortoise has reached the Mountain Hill!");
                    break;
                case 3:
                    System.out.println("The Tortoise has reached the Big Oak Tree!");
                case 4:
                    System.out.println("The Tortoise has reached the finish line!");
                    break;
            }
        }
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            System.err.println("The Tortoise has lost the Path!");
        }

        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed tha race! and has won",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}
