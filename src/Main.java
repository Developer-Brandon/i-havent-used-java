public class Main {

    public static void main(String[] args) {
        int num1=0, num2=0;
        boolean result, result2;

        result = (num1+=10)<0 && (num2+=10)>0;
        System.out.println("result="+result);
        System.out.println("num1="+num1+", num2="+num2);

        result2 = (num1+=10)>0 || (num2+=10)>0;
        System.out.println("result2="+result2);
        System.out.println("num1="+num1+", num2="+num2);
    }
}
