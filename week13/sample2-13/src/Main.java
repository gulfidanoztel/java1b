
int readData() throws IOException {   // Method 정의
    Scanner keyboard = new Scanner(System.in);
    int radius;

    while (true) {
        try {
            System.out.print("원의 반지름 입력 : ");
            radius = keyboard.nextInt();

            if (radius <= 0) {
                System.err.print("ERROR : 양수 이어야지");
                System.in.read();
            } else {
                break;
            }
        } catch (InputMismatchException e) {
            keyboard.nextLine();
            System.err.print("ERROR : 숫자가 아니네");
            System.in.read();
        }
    }
    return radius;
}


double calcArea(int r) {
    return Math.PI * r * r;
}

void display(String message, int value) {
    System.out.printf("%s = %,d Cm\n", message, value);
}

void display(String message, double value) {
    System.out.printf("%s = %,.2f \u33A0\n", message, value);
}

void main() throws IOException {
    int radius;
    double area;

    radius = readData();   // Call by Name

    area = calcArea(radius);   // Call by Value

    display("원의 반지름", radius);
    display("원의 면적", area);
}
