void main() throws IOException {
    int[] score;
    int sum;

    Input input = new Input();   // Object 생성
    score = input.readData(Subject.values().length);   // Call by Value

    Compute compute = new Compute();
    sum = compute.calcTotal(score);      // Call by Reference

    Output output = new Output();
    output.display(score, sum);          // 혼합 형태
}
