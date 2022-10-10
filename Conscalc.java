IOException {
        System.out.println("====================================================");
        System.out.println("Console Calculator using buffered reader and methods");
        System.out.println("====================================================");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("pease enter the first number \t");
        double x=Double.parseDouble(br.readLine());
        System.out.print("please enter the second num \t");
        double y=Double.parseDouble(br.readLine());
        System.out.print("please enter the operand \t");
        char op=(char)br.read();
        double result;
        System.out.println("1st num\t"+x+"\t 2nd num\t"+y+"\tOperation \t"+op);
if(op=='+'){
    System.out.println("the result is \t"+sum(x,y));
} else if (op=='-') {
    System.out.println("the result is \t"+sub(x,y));
} else if (op=='/') {
    if (y!=0){
    System.out.println("the result is \t"+div(x,y));}
    else {
        System.out.printf("Div by ZERO is not accepted!!!");
    }
} else if (op=='*') {
    System.out.println("the result is \t"+mul(x,y));
}else {
    System.out.println("invalid operand");
}

    }
    public static double sum(double x, double y){
        return (x+y);}
    public static double sub(double x, double y){
        return (x-y);}
    public static double div(double x, double y){
         return(x/y); }
    public static double mul(double x, double y){
        return (x*y);    }
}
