class Try_Catch {
    public static void main(String args[]) {
        try {
            int div = 20 / 0;
            System.out.println("div = " + div);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught = " + e);
        } finally {
            System.out.println("finally block always executed");
        }
    }
}