// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class IF_statements {
    public static void main(String[] args) {
        
        int salary = 10000;
        
        if(salary > 30000){
            
            salary = salary + 3000;
            System.out.println("total salary with bonus" + salary);
        }else if (salary > 20000){
            salary = salary +2000;
            System.out.println("total salary with bonus" + salary);
        }else {
            salary = salary+1000;
            System.out.println("total salary with bonus" + salary);
        }
        
        
    }
}
