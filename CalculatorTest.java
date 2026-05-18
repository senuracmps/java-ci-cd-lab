public class CalculatorTest {
    public static void main(String[] args) {
        Calculator cal1=new Calculator();
        if(cal1.add(2,3)==5){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        Calculator cal2=new Calculator();
        if(cal2.sub(3,2)==1){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        Calculator cal3=new Calculator();
        if(cal3.mul(2,3)==6){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        Calculator cal4=new Calculator();
        if(cal4.div(6,3)==2){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
