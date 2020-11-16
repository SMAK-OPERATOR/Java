public interface BaseConverter {
    void convert(float c);

}

class KelvConverter implements BaseConverter{
    @Override
    public void convert(float c) {
        System.out.println(c + "°= " + (c+273.15)+" K");
    }
}

class FarConverter implements BaseConverter{

    @Override
    public void convert(float c) {System.out.println(c + "°= " + (c * 1.8 + 32.0) + " F" ); }
}
