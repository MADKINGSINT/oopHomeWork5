package homeWork5_2;



public class calc {
    java.util.logging.Logger log = java.util.logging.Logger.getLogger("Logger");
    public  void calculate(double num1, double num2, String Operation) {
        String errorMsg = "Простите, хозяин(((((( Что-то пошло не так(((( Заранее извиняюсь и прошу прощения(((((((((((((";
        if (Operation.equals("+")){graphic.print(num1 + num2); 
            log.info("User choosed + result = " + (num1 + num2));}
        else if (Operation.equals("-")){graphic.print(num1 - num2);
            log.info("User choosed - result = " + (num1 - num2));}
        else if (Operation.equals("*")){graphic.print(num1 * num2);
            log.info("User choosed * result = " + (num1 * num2));}
        else if (Operation.equals("/")){graphic.print(num1 / num2);
            log.info("User choosed / result = " + (num1 / num2));}
        else {graphic.print(errorMsg);
            log.warning("Error in calculating");
        }
    }

}
