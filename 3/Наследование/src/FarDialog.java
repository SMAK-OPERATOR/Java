public class FarDialog extends Dialog{
    @Override
    public BaseConverter CreateConverter() {
        return new FarConverter();
    }
}