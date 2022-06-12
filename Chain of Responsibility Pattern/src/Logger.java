public interface Logger {
    public void setNextChain(Logger nextChain);
    public void printError(Error message);
}
