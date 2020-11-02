public enum SchoolTypeEnum {
    HIGH("Старшая школа"),
    MEDIUM("Средняя школа"),
    PRIMARY("Младшая школа");

    private final String translate;

    SchoolTypeEnum(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public String toString() {
        return this.translate;
    }
}
