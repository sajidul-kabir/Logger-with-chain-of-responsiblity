public class ConsoleLogger implements Logger{
    private Logger nextChain;
    @Override
    public void setNextChain(Logger nextChain) {
this.nextChain=nextChain;
    }

    @Override
    public void printError(Error message) {
if (message.getError()=="console"){
    System.out.println("Console Log");
}
else{
    System.out.print("Console Log + ");
    this.nextChain.printError(message);
}

    }
}
