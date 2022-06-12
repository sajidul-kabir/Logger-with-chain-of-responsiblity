public class ErrorLogger implements Logger{
    private Logger nextChain;
    @Override
    public void setNextChain(Logger nextChain) {
        this.nextChain=nextChain;
    }

    @Override
    public void printError(Error message) {
        if (message.getError()=="error"){
            System.out.println("Error Log");
        }
        else{
            System.out.println("Only works for console , warning and error logs");
        }

    }
}
