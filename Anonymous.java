public class Anonymous {
    /*Person field = new Person(){
        void work(){
            System.out.println("출근");
        }

        @Override
        void wake() {
            System.out.println("6시 인남");
            work();
        }
    };
    void method1(){
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책");
            }

            void wake() {
                System.out.println("7시 인남");
                walk();
            }
        };
        localVar.wake();
    }
    void method2(Person person){
        person.wake();
    }*///Person과 컴파일 할 때 사용.
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Tv 킴");
        }

        @Override
        public void turnOff() {
            System.out.println("Tv 끔");
        }
    };
    void method1(){
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오 킴");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오 끔");
            }
        };
        localVar.turnOn();
    }
    void method2(RemoteControl rc){
        rc.turnOn();
    }
}
