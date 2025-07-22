public class AsciiCharSequence implements CharSequence {
    private byte[] Asciicharsequence;

    public AsciiCharSequence(byte[] array) {
        this.Asciicharsequence = array;
    }

    public AsciiCharSequence() {
        byte[] array = {};
        this.Asciicharsequence = array;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer("");
        for(byte ascii:this.Asciicharsequence){
            buffer.append((char)ascii);
        }
        return buffer.toString();
    };

    public int length() {
        return this.Asciicharsequence.length;
    }

    public AsciiCharSequence subSequence(int start, int end) {
        if (start == end) {
            return (new AsciiCharSequence());
        } else {
            byte[] buffer = new byte[end - start];
            int k = 0;
            for (int i = start; i < end; i++) {
                buffer[k++] = this.Asciicharsequence[i];

            }
            return new AsciiCharSequence(buffer);
        }
    }

    public char charAt(int index) {
        return (char) this.Asciicharsequence[index];
    }

}