public class AnonymousExample {
    public static void main(String[] args){
        Anonymous anony = new Anonymous();
        /*anony.field.wake();
        anony.method1();
        anony.method2(
                new Person(){
                    void study(){
                        System.out.println("공부");
                    }
                    void wake(){
                        System.out.println("8시에 인남");
                        study();
                    }
                }
        );*/ //Person 컴파일 할떄 사용
        anony.field.turnOn();
        anony.method1();
        anony.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("스마트티비 켬");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("스마트 티비 끔");
                    }
                }
        );
    }
}
