class Exception_handling{
    public static int divide(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println("result: "+result);
        }catch(ArithmeticException e){
            System.out.println("Error : Divide by Zero ");
        }
    }
    
}