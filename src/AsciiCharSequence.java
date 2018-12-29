public class AsciiCharSequence implements CharSequence {
    private final byte[] acs;
    public AsciiCharSequence (byte[] acs) {
        this.acs = acs;
    }
    public int length() {
        return acs.length;
    }
    public char charAt(int index) {
        return (char) acs[index];
    }
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] result= new byte[end-start];
        int j=0;
        for (int i=start;i<end;i++) {
            result[j] =acs[i];
            j++;
        }
        return new AsciiCharSequence(result);
    }
    public String toString() {
        return new String(acs);
    }
}
