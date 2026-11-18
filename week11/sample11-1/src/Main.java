//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int[] grade1 = new int [] {41, 42, 45, 42, 46, 39};
    int[] grade2 = new int [] {41, 42, 45, 42, 46, 39};
    int[] grade3 = new int [] {41, 42, 45, 42, 46, 39};
    int[][] school = new int[][] {grade1, grade2, grade3};

    int[][] students = {
            {41, 42, 45, 42, 46, 39, 0},
            {41, 42, 45, 42, 46, 39, 0},
            {41, 42, 45, 42, 46, 39, 0}};

    int[] total = new int[students.length];
    int sum = 0;

    for(int i = 0; i < students.length; i++) {
        for (int j = 0; j < students[i].length; j++) {
            students[i][6] += students[i][j];
            total[i] += students[i][j];
        }
    }

    for (int i = 0; i < total.length; i++)
        sum += total[i];

    System.out.printf("학년 1반 2반 3반 4반 5반 6반 학년 합계\n");


    for (int i = 0; i < students.length; i++) {
        System.out.printf("%d 학년 %3d %3d %3d %3d %3d %3d %4d\n",
                i + 1, students[i][0], students[i][1], students[i][2],
                students[i][3], students[i][4], students[i][5], students[i][6]);
    }

    System.out.printf("\t\t\t\t 전교생 수 : %d\n", sum);


}
