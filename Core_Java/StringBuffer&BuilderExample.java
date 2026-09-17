class StringBufferAndBuilderExample {
    public static void main(String[] args) {
        // Using StringBuffer
        // 1. StringBuffer (Thread-Safe, thoda slow)
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" World");
        stringBuffer.insert(5, ",");
        stringBuffer.replace(0, 5, "Hi");
        stringBuffer.delete(2, 3);  
        stringBuffer.reverse(); // Reverses the string
        System.out.println("StringBuffer: " + stringBuffer.toString());

        // Using StringBuilder
        // 2. StringBuilder (Non-Thread-Safe, bohot fast)
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World");
        stringBuilder.insert(5, ",");
        stringBuilder.replace(0, 5, "Hi");
        stringBuilder.delete(2, 3);
        stringBuilder.reverse(); // Reverses the string 
        System.out.println("StringBuilder: " + stringBuilder.toString());
    }
}