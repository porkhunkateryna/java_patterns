package t32;

public class StringBuilder implements Builder{
    private String str;

    public StringBuilder(String str) {
        this.str = str;
    }

    @Override
    public void appendString(String toAppend) {
        str += toAppend;
    }

    @Override
    public void insertString(int index, String toInsert) {
        char[] chars = str.toCharArray();
        str = "";
        for(int i=0;i< chars.length;i++){
            if(i==index){
                str +=toInsert;
            }
            str+=chars[i];
        }
    }

    @Override
    public String getStr() {
        return str;
    }
}