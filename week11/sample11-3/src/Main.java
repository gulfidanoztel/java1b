//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    final int ID = 0;
    final int NAME = 1;
    final int BASE = 0;
    final int SUDANG = 1;
    final int SALARY = 2;
    final int TAX = 3;
    final int PAYMENT = 4;

    String[][] employess = {
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}, {"1111", "홍길동"}, {"1111", "홍길동"},
            {"1111", "홍길동"}
    };

    char[] grade = {'1', '3', '2', '4', '5', '1', '3', '2', '4', '5'};

    int[][] salary = {
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0},
            {0, 780000, 0, 0, 0}, {0, 780000, 0, 0, 0}
    };

    int[] MONEY = {1650000, 1600000, 1700000, 1720000, 1750000};

    for (int i = 0; i < employess.length; i++) {
        if (grade[i] == '1') {
            salary[i][BASE] = MONEY[0];
        } else if (grade[i] == '2') {
            salary[i][BASE] = MONEY[1];
        } else if (grade[i] == '3') {
            salary[i][BASE] = MONEY[2];
        } else if (grade[i] == '4') {
            salary[i][BASE] = MONEY[3];
        } else if (grade[i] == '5') {
            salary[i][BASE] = MONEY[4];
        }

        salary[i][SALARY] = salary[i][BASE] + salary[i][SUDANG];

        salary[i][TAX] = (int)(salary[i][SALARY] * 0.06375 / 100) * 100;

        salary[i][PAYMENT] = salary[i][SALARY] - salary[i][TAX];
    }

    System.out.println("***************************************************************");
    System.out.println("사번 이름 호봉 기본급 업무수당 급여 세금 지급액");
    System.out.println("***************************************************************");

    for (int i = 0; i < employess.length; i++) {
        System.out.printf("%4s %4s %c %,10d %,10d %,10d %,10d %,10d\n",
                employess[i][ID], employess[i][NAME], grade[i],
                salary[i][BASE], salary[i][SUDANG],
                salary[i][SALARY], salary[i][TAX], salary[i][PAYMENT]);
    }

    System.out.println("***************************************************************");
    System.out.println("종료 코드 0(으)로 완료된 프로세스");
}