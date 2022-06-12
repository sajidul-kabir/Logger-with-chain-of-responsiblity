public class Main {

    public static void main(String[] args) {


        Logger logger1 = new ConsoleLogger();
        Logger logger2 = new WarningLogger();
        Logger logger3 = new ErrorLogger();

        //Setting the Chain [ logger1->logger2->logger3 ]
        logger1.setNextChain(logger2);
        logger2.setNextChain(logger3);


        logger1.printError(new Error("console"));
        logger1.printError(new Error("warning"));
        logger1.printError(new Error("error"));
    }
}
