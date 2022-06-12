public class WarningLogger implements Logger{
    private Logger nextChain;
    @Override
    public void setNextChain(Logger nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void printError(Error message) {
        if (message.getError()=="warning"){
            System.out.println("Warning Log");
        }
        else{
            System.out.print("Warning Log + ");
            this.nextChain.printError(message);
        }

    }
}
