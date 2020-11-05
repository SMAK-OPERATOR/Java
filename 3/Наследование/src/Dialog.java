public abstract class Dialog {
    public abstract BaseConverter CreateConverter();
    public void Output(float c){
        BaseConverter converter = CreateConverter();
        converter.convert(c);
    }
}