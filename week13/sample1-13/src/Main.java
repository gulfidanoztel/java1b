//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

void main(String[] args) throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    double area;

    while (true) {
        System.out.print("원의 반지름 입력 : ");
        radius = keyboard.nextInt();
        if (radius <= 0) {
            System.err.print("ERROR : ");
            System.in.read();
        } else {
            break;
        }
    }

    area = Math.PI * radius * radius;

    System.out.printf("원의 반지름 = %,d Cm\n", radius);
    System.out.printf("원의 면적 = %,.2f \u33A0\n", area);

}