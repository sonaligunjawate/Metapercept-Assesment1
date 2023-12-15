import java.util.scanner;
class classA{
    private int num1;
    private int num2;
    public void acceptNumbers(){
        scanner scanner = new scanner(system.in);
        system.out.print(s:"Enter The First Number: ");
        num1 = scanner.nextInt();
        system.out.print(s:"Enter The Second Number: ");
        num2 = scanner.nextInt();
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
}
class classB{
    private int lastDigitNum1;
    private int lastDigitNum2;
    public void fetchlastDigits(classA classA){
        lastDigitNum1 = classA.getNum1()% 10;
        lastDigitNum2 = classA.getNum1()% 10;
    }
    public int getLastDigitNum1() {
        return lastDigitNum1;
    }
    public int getLastDigitNum2() {
        return lastDigitNum2;
    }
}
    class classc{
        public int multiplyLastDigits(classB classB){
        return classB.getLastDigitNum1() *classB.getLastDigitNum2();
    } 
    }
    public class classes{
        public static void main(string[]args){
            classA classA = new classA();
            classB classB = new classB();
            classc classc = new classc();
            classA.acceptNumbers();
            classB.fetchastDigits(classA);
            system.out.println("Result of multiplying Last Digits: "+result);

        }
    }
