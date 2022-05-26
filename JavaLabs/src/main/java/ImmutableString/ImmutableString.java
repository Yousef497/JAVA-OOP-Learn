package ImmutableString;

public class ImmutableString {

    private char[] str;

    public ImmutableString(String s){
        this.str = new char[s.length()];
        for(int i = 0; i<s.length();i++){
            this.str[i] = s.charAt(i);
        }
    }

    public void print(){
        for(int i = 0; i<this.str.length; i++){
            System.out.print(str[i]);
        }
        System.out.println("");
    }

    public int indexOf(char c) {
        for (int i = 0; i < str.length; i++) {
            if (c == str[i]) {
                return i;
            }
        }
        return -1;
    }

    public int length() {
        return str.length;
    }

    public ImmutableString erase(int index, int length) {

        ImmutableString ms = new ImmutableString("");

        //Extra: Check that index must be >0 and < str.length
        if (!(index >= 0 && index < str.length)) {
        //this should raise an error(Exception : we will know that later)
            System.out.println("Couldn't erase index is incorrect");
        //return the empty Mystring without inserting
            return ms;
        }

        char[] str2;

        if (index + length >= str.length) {
            str2 = new char[index];
            for (int i = 0; i < index; i++) {
                str2[i] = this.str[i];
            }
        }
        else{
            str2 = new char[this.str.length - length];
            int j = 0;
            for (int i = 0; i < index; i++) {
                str2[j++] = this.str[i];
            }

            for (int i = index + length; i < str.length; i++) {
                str2[j++] = this.str[i];
            }
        }
        ms.str = str2;
        return ms;

    }

    public ImmutableString insert(int index, String str) {
        //Extra: Check that index must be >0 and < str.length
        ImmutableString ms = new ImmutableString("");

        //Extra: Check that index must be >0 and < str.length

        if(!(index >= 0 && index < this.str.length)) {
            //this should raise an error(Exception : we will know that later)
            System.out.println("Couldn't insert index is incorrect");
            //return the empty Mystring
            return ms;
        }

        char [] str2 = new char[this.str.length + str.length()];
        int j = 0;

        for (int i = 0; i < index; i++) {
            str2[j++] = this.str[i];
        }

        for (int i = 0; i < str.length(); i++) {
            str2[j++] = str.charAt(i);
        }

        for (int i = index; i < this.str.length; i++) {
            str2[j++] = this.str[i];
        }

        ms.str = str2;
        return ms;
    }

}


