public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle = new Triangle("red", true, 2,5,6);
        System.out.println(triangle);
        System.out.println("dien tic: "+ triangle.getArea());
        System.out.println("chu vi"+triangle.getPrimeter());
    }

}