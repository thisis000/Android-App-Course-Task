class T1_ArithmeticOperations {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        // System.out.println(add(a, b));
        print(add(a, b));
        print(sub(a, b));
        print(multi(a, b));
        print(div(a, b));
    }
    
    private static int add(int a, int b)
    {
        return a + b;
    }
    
    private static int sub(int a, int b)
    {
        return a - b;
    }
    
    private static int multi(int a, int b)
    {
        return a * b;
    }
    
    private static int div(int a, int b)
    {
        return a / b;
    }
    
    private static void print(int result)
    {
        System.out.println(result);
    }
}
