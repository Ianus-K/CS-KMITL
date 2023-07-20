class Lab14_compareFixedFloating{

    static class MyFixedPoint {
        int data;
        MyFixedPoint() {
            this.data = 0;
        }
        MyFixedPoint(int data) {
            this.data = data;
        }
        float getReal() {
            return data/1000.0f;
        }
        void adds(MyFixedPoint b) {
            data = data + b.data;
        }
        void subtracts(MyFixedPoint b) {
            data = data - b.data;
        }
        void multiplies(MyFixedPoint b) {
            data = data * b.data;
        }
        void divides(MyFixedPoint b) {
            data = data / b.data;
        }
        String returnString(MyFixedPoint b){
        return String.valueOf(data);
        }
    }

    static class MyFloatingPoint {
        float data;

        float getReal() {
            return data;
        }
        void adds(MyFloatingPoint b) {
            data = data + b.data;
        }
        void subtracts(MyFloatingPoint b) {
            data = data - b.data;
        }
        void multiplies(MyFloatingPoint b) {
            data = data * b.data;
        }
        void divides(MyFloatingPoint b) {
           data = data / b.data;
        }
        String returnString(MyFloatingPoint b){
            return String.valueOf(data);
            }
    }

    public static void main(String[] args) {
        MyFixedPoint Fixed = new MyFixedPoint();
        MyFloatingPoint Floating = new MyFloatingPoint();
        long startTime = System.nanoTime();
        Fixed.getReal();
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("MyFixedPoint runtime: " + totalTime + " ns");

        startTime = System.nanoTime();
        Floating.getReal();
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("MyFloatingPoint runtime: " + totalTime + " ns");
    }
}