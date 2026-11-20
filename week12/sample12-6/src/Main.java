//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner keyboard = new Scanner(System.in);

    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int useCharge;
        int tax;

        public Customer(String waterNo, String name, char type) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
        }
    }

    Customer[] customers = new Customer[] {
            new Customer("1111", "홍길동", '1'),
            new Customer("1211", "이대한", '3'),
            new Customer("1311", "한민국", '5'),
            new Customer("1411", "정동전", '4'),
            new Customer("1511", "한겨울", '3'),
            new Customer("1611", "김이래", '2'),
            new Customer("1711", "경복대", '1'),
            new Customer("1811", "이태형", '4'),
            new Customer("1911", "이검색", '5'),
            new Customer("2111", "김부산", '4')
    };

    int count = 0;

    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량 입력(예 12.5) : ", customers[count].name);

        customers[count].usage = keyboard.nextFloat();

        if (customers[count].usage >= 0.0f) {
            count++;
        }
        else {
            System.err.println("ERROR : 사용량은 0 이상");
        }
    }

    for (int i = 0; i < customers.length; i++) {
        System.out.printf("%s %s %.1f\n",
                customers[i].waterNo,
                customers[i].name,
                customers[i].usage);
    }
}
