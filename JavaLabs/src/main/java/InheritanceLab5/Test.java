package InheritanceLab5;

    abstract class A {
        public void f1(){
            System.out.println("A.f1 called");
        }
        final public void f2() {
            System.out.println("A.f2 called");
        }
        public abstract void f3();
    }
    class B extends A {
        public void f1() {
            super.f1();System.out.println("B.f1 called");
        }

        public void f3() {
            System.out.println("B.f3 called");
        }

    }
    class C extends A {
        public void f1() {
            super.f1(); System.out.println("C.f1 called");
        }

        public void f3() {
            System.out.println("C.f3 called");
        }

    }
    abstract class D extends C {
        public void f3() {
            System.out.println("D.f3 called");
        }
    }
    final class E extends D {
    }

    public class Test {
        public static void main(String[] args) {
            A[] ps = new A[6];
            ps[1] = new B();
            ps[2] = new C();
            ps[4] = new E();
            for (int i = 0; i < ps.length; i++) {
                ps[i].f1();
                ps[i].f2();
                ps[i].f3();
            }
    }
}