package homeWork5_2;

public class menu {
    java.util.logging.Logger log = java.util.logging.Logger.getLogger("Logger");
    calc calc = new calc();
    public void start() {
        log.info("menu started");
        graphic gr = new graphic();
        double FirstNum = Double.parseDouble(gr.ask("Введите первое число"));
        log.info("first number entered");
        double SecondNum = Double.parseDouble(gr.ask("Введите второе число"));
        log.info("second number entered");
        String Operations = gr.ask("Введите знак операции");
        log.info("operations entered");
        calc.calculate(FirstNum, SecondNum, Operations);
    }





    
}



