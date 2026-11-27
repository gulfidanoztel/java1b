//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   Scanner keyboard = new Scanner(System.in);
   float exchange;
   int money;
   double dollar;

   System.out.printf("달러에 대한 원회 환율을 입력 : ");
   exchange = keyboard.nextFloat();
   System.out.printf("원회 금액 입력 : ");
   money = keyboard.nextInt();

   dollar = money / exchange;

   System.out.printf("원회(\u20a9) %,d원은 %,.2f 달러(\u0024) 입니다.\n", money, dollar);


}
