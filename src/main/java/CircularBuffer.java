public class CircularBuffer {
    private int bufferSize = 10;
    private String[] buffer = new String[10];
    private int readPointer;
    private int writePointer;

//    public CircularBuffer() {
//        this.buffer = new String[10];
//    }

    public boolean isEmpty() {
        return bufferSize==10;
    }

    public void writeData(String input) {
        bufferSize -= 1;
        this.buffer[writePointer++]=input;
    }

    public boolean isFull() {
        return bufferSize==0;
    }

    public String readData() {
        return this.buffer[readPointer++];

    }
    public boolean isReadMorethanWrite() {
        if(readPointer > writePointer){
            return true;
        }
        return false;
    }
}
