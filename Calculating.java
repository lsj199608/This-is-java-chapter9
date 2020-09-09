public class Calculating {
    private int field;

    public void method(final int arg1, int arg2){
        final int var1 = 0;
        int var2 = 0;

        field = 10;

        //arg1 = 20;
        //arg2 = 20;
        //var1 = 30;
        //var2 = 30;

        Calculatable calc = new Calculatable() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + var1 + var2;//익명객체에서 사용된 매개변수와 로컬변수는 모두 final 특성을 가짐.
                return result;
            }
        };
        System.out.println(calc.sum());
    }
}
