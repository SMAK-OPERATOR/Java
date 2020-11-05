public class KelvDialog extends Dialog{
    @Override
    public BaseConverter CreateConverter() {
        return new KelvConverter();
    }
}