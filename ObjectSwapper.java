public class ObjectSwapper {
    public static void main(String[] args) {
        InnerClass obj1 = new InnerClass(12345);
        InnerClass obj2 = new InnerClass(11111);
        swap(obj1, obj2);
        System.out.println("Obj1 ID value : " + obj1.id + "\n" + "Obj2 ID value :  " + obj2.id);
    }
    static void swap(InnerClass x, InnerClass y) {
        InnerClass temp;
        temp = x;
        x = y;
        y = temp;
    }
    static class InnerClass {
        public int id;
        public InnerClass(int Id) {
            this.id = Id;
        }
    }
}