void main() {
    int[] step11 = new int[]{3, 3, 3, 0};
    int[] step12 = new int[]{3, 3, 3, 0};
    int[] step13 = new int[]{3, 3, 3, 0};
    int[] step14 = new int[]{3, 3, 3, 0};
    int[] step15 = new int[]{3, 3, 3, 0};

    int[] step21 = new int[]{3, 3, 3, 0};
    int[] step22 = new int[]{3, 3, 3, 0};
    int[] step23 = new int[]{3, 3, 3, 0};
    int[] step24 = new int[]{3, 3, 3, 0};
    int[] step25 = new int[]{3, 3, 3, 0};

    int[] step31 = new int[]{3, 3, 3, 0};
    int[] step32 = new int[]{3, 3, 3, 0};
    int[] step33 = new int[]{3, 3, 3, 0};
    int[] step34 = new int[]{3, 3, 3, 0};
    int[] step35 = new int[]{3, 3, 3, 0};

    int[][] villA = {step11, step12, step13, step14, step15};
    int[][] villB = {step21, step22, step23, step24, step25};
    int[][] villC = {step31, step32, step33, step34, step35};

    int[][][] somangVilla = {
            villA, villB, villC
    };

    int[][] stepTotal = new int[somangVilla.length][somangVilla[0].length];

    stepTotal[0] = new int[villA.length];
    stepTotal[1] = new int[villB.length];
    stepTotal[2] = new int[villC.length];

    int[] dongTotal = new int[somangVilla.length];
    int total = 0;

    for (int i = 0; i < somangVilla.length; i++) {
        for (int j = 0; j < somangVilla[i].length; j++) {
            for (int k = 0; k < somangVilla[i][j].length - 1; k++) {
                somangVilla[i][j][3] += somangVilla[i][j][k];
            }

            stepTotal[i][j] = somangVilla[i][j][3];
            dongTotal[i] += stepTotal[i][j];
        }
    }

    for (int i = 0; i < dongTotal.length; i++)
        total += dongTotal[i];

    for (int i = 0; i < somangVilla.length; i++) {
        System.out.printf(">>>>> %d동 주민수 <<<<<<<<<\n", i + 1);

        for (int j = 0; j < somangVilla[i].length; j++) {
            System.out.printf("%d층 ", j + 1);

            for (int k = 0; k < somangVilla[i][j].length - 1; k++) {
                System.out.printf("%d호 ", k + 1);
            }

            System.out.printf("층별 합계 : %d\n", stepTotal[i][j]);
        }

        System.out.printf("%d동 주민 합계 : %d\n", i + 1, dongTotal[i]);
    }

    System.out.printf("전체 주민 합계 : %d\n", total);
}