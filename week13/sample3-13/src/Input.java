import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    public static int readData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        int radius;

        while (true) {
            try {
                System.out.print("원의 반지름 입력 : ");
                radius = keyboard.nextInt();

                if (radius <= 0) {
                    System.err.print("ERROR : 양수 이어야지");
                    keyboard.nextLine();
                } else {
                    break;
                }

            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.err.print("ERROR : 숫자가 아니네");
            }
        }

        return radius;
    }
}