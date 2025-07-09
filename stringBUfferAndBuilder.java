public class stringBUfferAndBuilder {
    public static void main(String[] args) {
        // Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", World!");
        System.out.println("StringBuffer: " + stringBuffer.toString());

        // Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}
