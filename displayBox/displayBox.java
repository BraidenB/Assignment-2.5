class displayBox {
    public static void main (String[] args) {
        display(6,3);
    }

    public static void display(int width, int height) {
        for(int i = 0; i < height; i++) {
            for(int f = 0; f < width; f++) {
                System.out.print("$");
            }
            System.out.println(" ");
        }
    }
}
 