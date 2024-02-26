package t32;

public interface Builder {
    void appendString(String toAppend);
    void insertString(int index, String toInsert);
    String getStr();
}