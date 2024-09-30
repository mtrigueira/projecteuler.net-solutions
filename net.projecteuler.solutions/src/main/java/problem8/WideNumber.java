package problem8;

public class WideNumber extends DigitNumber {
    private final int width;
    public WideNumber(String number, int width) {
        super(number);
        this.width = width;
    }

    @Override
    public long next() {
        long value = 0;

        for(int i=0;i<width;i++)
            value = value * 10 + digits[index+i];
        index++;

        return value;
    }

    @Override
    public boolean hasNext() {
        return index+width<=digits.length;
    }

    public long product() {
        long value = 1;

        for(int i=0;i<width;i++)
            value = value * digits[index+i];

        return value;
    }
}
